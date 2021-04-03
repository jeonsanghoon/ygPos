package com.mrc.yg.api.domain.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonDtoReq {
    private Integer commonCode;
    private String mainCode;
    private Integer subCode;
}
