package com.mrc.yg.api.domain.member.service;

import com.mrc.yg.api.domain.member.dto.MemberDto;
import com.mrc.yg.api.domain.member.dto.MemberDtoReq;
import com.mrc.yg.api.domain.member.mapper.MemberMapper;
import com.mrc.yg.api.framework.common.exception.UserException;
import com.mrc.yg.api.framework.jwt.JwtTokenProvider;
import com.mrc.yg.api.framework.util.Global;
import com.mrc.yg.api.framework.util.dto.RtnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService<MemberDtoReq, MemberDto> {

    @Autowired
    MemberMapper mapper;

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Transactional
    @Override
    public RtnData<String> insert(MemberDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            mapper.insert(data);
            rtn.setData("저장에 성공하였습니다.");

        }catch(Exception e){
            Global.getDataInfo().makeException(rtn,e);
        }
        return rtn;
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public RtnData<List<MemberDto>> getList(MemberDtoReq deviceDtoReq) {
        RtnData<List<MemberDto>> rtn = new RtnData<>();
        try {
            rtn.setData(mapper.getList(deviceDtoReq));
        }catch(Exception e){
            Global.getDataInfo().makeException(rtn,e);
        }
        return rtn;
    }

    @Transactional
    @Override
    public RtnData<String> update(MemberDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            mapper.update(data);
            rtn.setData("수정에 성공하였습니다.");

        }catch(Exception e){
            Global.getDataInfo().makeException(rtn,e);
        }
        return rtn;
    }

    @Transactional
    @Override
    public RtnData<String> delete(MemberDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            mapper.delete(data);
            rtn.setData("삭제에 성공하였습니다.");

        }catch(Exception e){
            Global.getDataInfo().makeException(rtn,e);
        }
        return rtn;
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public RtnData<String> login(MemberDtoReq req) {
        RtnData<String> rtn = new RtnData<>();
        try {
            List<MemberDto> list = mapper.getList(req);
            this.checkLogin(req, list, rtn);

        }catch(UserException e) {
            Global.getDataInfo().makeUserException(rtn,e);
        }catch(Exception e)
        {
            Global.getDataInfo().makeException(rtn,e);
        }
        return rtn;
    }

    private void checkLogin(MemberDtoReq req, List<MemberDto> list, RtnData<String> rtn) throws UserException {
        boolean bRtn = true;
        MemberDto member = new MemberDto();
        if(list.size() != 1) throw new UserException(-1, "아이디가 잘못되었습니다.");
        member = list.get(0);
        if(!StringUtils.hasText(req.getMemberPw()))  throw new UserException(-2, "암호가 입력되지 않았습니다.");
        if(!member.getMemberPw().toUpperCase().equals(Global.getSecurityInfo().encryptSHA256(req.getMemberPw()).toUpperCase())) throw new UserException(-3, "암호가 잘못 입력되었습니다.");
        rtn.setData(jwtTokenProvider.createToken(member.getMemberId(),"USER"));
    }
}
