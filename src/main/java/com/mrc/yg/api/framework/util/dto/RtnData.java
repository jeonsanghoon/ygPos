package com.mrc.yg.api.framework.util.dto;

import lombok.*;
@Getter
@Setter
public class RtnData <T>{
    private RtnType rtnType = RtnType.SUCCESS;
    private ErrorInfo errorInfo = new ErrorInfo();
    private T data;

}

