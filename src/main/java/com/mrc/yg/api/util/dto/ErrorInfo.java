package com.mrc.yg.api.util.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorInfo {
    private int errorCode;
    private String errorMessage;
}
