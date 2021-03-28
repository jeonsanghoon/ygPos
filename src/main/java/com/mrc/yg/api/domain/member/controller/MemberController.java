package com.mrc.yg.api.domain.member.controller;

import com.mrc.yg.api.base.BaseController;

import com.mrc.yg.api.util.dto.RtnData;
import com.mrc.yg.api.domain.member.dto.MemberDto;
import com.mrc.yg.api.domain.member.dto.MemberDtoReq;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/member")
@RestController
public class MemberController implements BaseController<MemberDtoReq,MemberDto> {
    @Override
    public RtnData<List<MemberDto>> getList(MemberDtoReq memberDtoReq) {
        return null;
    }

    @Override
    public RtnData<String> update(MemberDto data) {
        return null;
    }

    @Override
    public RtnData<String> delete(MemberDto data) {
        RtnData<String> rtn = new RtnData<>();

        return rtn;
    }

    public RtnData<String> save(MemberDto data) {
        return null;
    }
}
