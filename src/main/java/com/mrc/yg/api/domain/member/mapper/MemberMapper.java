package com.mrc.yg.api.domain.member.mapper;

import com.mrc.yg.api.domain.member.dto.MemberDto;
import com.mrc.yg.api.domain.member.dto.MemberDtoReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<MemberDto> getList(MemberDtoReq req);
    void insert(MemberDto data);
    void update(MemberDto data);
    void delete(MemberDto data);
}
