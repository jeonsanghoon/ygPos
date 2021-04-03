package com.mrc.yg.api.domain.member.mapper;

import com.mrc.yg.api.domain.common.dto.CommonDto;
import com.mrc.yg.api.domain.common.dto.CommonDtoReq;
import com.mrc.yg.api.domain.member.dto.MemberDto;
import com.mrc.yg.api.domain.member.dto.MemberDtoReq;

import java.util.List;

public interface MemberMapper {

    List<MemberDto> getList(MemberDtoReq req);
    void insert(MemberDto data);
    void update(MemberDto data);
    void delete(MemberDto data);
}
