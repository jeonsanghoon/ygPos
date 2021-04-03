package com.mrc.yg.api.domain.member.service;

import com.mrc.yg.api.domain.member.dto.MemberDto;
import com.mrc.yg.api.domain.member.dto.MemberDtoReq;
import com.mrc.yg.api.framework.util.dto.RtnData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService<MemberDtoReq, MemberDto> {
    @Override
    public RtnData<List<MemberDto>> getList(MemberDtoReq memberDtoReq) {
        return null;
    }

    @Override
    public RtnData<String> insert(MemberDto data) {
        return null;
    }

    @Override
    public RtnData<String> update(MemberDto data) {
        return null;
    }

    @Override
    public RtnData<String> delete(MemberDto data) {
        return null;
    }
}
