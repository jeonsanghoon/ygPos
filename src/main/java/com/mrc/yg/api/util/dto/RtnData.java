package com.mrc.yg.api.util.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RtnData <T>{
    private RtnType rtnType = RtnType.SUCCESS;
    private ErrorInfo errorInfo = new ErrorInfo();
    private T data;

}

