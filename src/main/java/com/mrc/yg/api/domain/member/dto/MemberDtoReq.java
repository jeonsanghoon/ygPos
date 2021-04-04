package com.mrc.yg.api.domain.member.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDtoReq {
    private Integer memberCode;
    private String memberId;
    private String memberName;
    private String memberPw;
}
