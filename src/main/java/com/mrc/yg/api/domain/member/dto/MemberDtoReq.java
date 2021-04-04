package com.mrc.yg.api.domain.member.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MemberDtoReq implements Serializable {
    private Integer memberCode;
    private String memberId;
    private String memberName;
    private String memberPw;
}
