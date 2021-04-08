package com.mrc.yg.api.domain.member.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto implements Serializable {
    private Integer memberCode;
    private String memberId;
    private String memberName;
    private String nickname;
    @JsonIgnore
    private String memberPw;
    @Builder.Default
    private Integer authType = 30;
    private String authTypeName;
    private String birthDate;
    private String phone;
    private String token;

    @Builder.Default
    private Boolean hide = false;
    private int insertCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp insertDate;
    private int updateCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp updateDate;
    private int companyUpdateCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp companyUpdateDate;

}
