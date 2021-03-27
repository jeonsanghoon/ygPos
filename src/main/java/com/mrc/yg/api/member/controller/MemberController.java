package com.mrc.yg.api.member.controller;

import com.mrc.yg.api.base.BaseController;
import com.mrc.yg.api.base.RtnData;
import com.mrc.yg.api.member.dto.MemberDto;
import com.mrc.yg.api.member.dto.MemberDtoReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/member")
@RestController
public class MemberController implements BaseController<MemberDtoReq,MemberDto> {

    @PostMapping("/getList")
    @Override
    public List<MemberDtoReq> getList(MemberDto param) {
        return null;
    }

    @PostMapping("/save")
    @Override
    public RtnData save(MemberDtoReq data) {
        return null;
    }

    @PostMapping("/update")
    @Override
    public RtnData update(MemberDtoReq data) {
        return null;
    }

    @PostMapping("/delete")
    @Override
    public RtnData delete(MemberDtoReq data) {
        return null;
    }
}
