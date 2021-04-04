package com.mrc.yg.api.domain.member.controller;

import com.mrc.yg.api.domain.member.dto.MemberDto;
import com.mrc.yg.api.domain.member.dto.MemberDtoReq;
import com.mrc.yg.api.domain.member.service.MemberService;
import com.mrc.yg.api.framework.base.BaseController;
import com.mrc.yg.api.framework.util.dto.RtnData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "회원")
@RequestMapping("/v1/member")
@RestController
public class MemberController implements BaseController<MemberDtoReq,MemberDto> {

    private final MemberService<MemberDtoReq, MemberDto> service;
    private final Log log;
    public MemberController(MemberService<MemberDtoReq, MemberDto> service) {
        this.service = service;
        log = LogFactory.getLog(getClass());
    }

    @ApiOperation(value = "회원 조회", notes = "회원 조회입니다.")
    @PostMapping("/getList")
    @Override
    public RtnData<List<MemberDto>> getList(@RequestBody MemberDtoReq req) {
        log.info("/v1/member/getList Request >>> " + req.toString());
        return service.getList(req);
    }




    @ApiOperation(value = "회원 저장", notes = "회원 저장입니다.")
    @PostMapping("/save")
    @Override
    public RtnData<String> save(@RequestBody MemberDto data) {
        log.info("/v1/member/save Request >>> " + data.toString());
        return service.insert(data);
    }
    
    @ApiOperation(value = "회원 수정", notes = "회원 저장입니다.")
    @PostMapping("/update")
    @Override
    public RtnData<String> update(@RequestBody MemberDto data) {
        log.info("/v1/member/update Request >>> " + data.toString());
        return service.update(data);
    }

    @ApiOperation(value = "회원 삭제", notes = "회원 삭제입니다.")
    @PostMapping("/delete")
    @Override
    public RtnData<String> delete(@RequestBody MemberDto data) {
        log.info("/v1/member/delete Request >>> " + data.toString());
        return service.delete(data);
    }


    @ApiOperation(value = "회원 로그인", notes = "회원 로그인입니다.")
    @ResponseBody
    @PostMapping("/login")
    public RtnData<String> login(@RequestBody MemberDtoReq req) {
        log.info("/v1/member/login Request >>> " + req.toString());
        return service.login(req);
    }
}
