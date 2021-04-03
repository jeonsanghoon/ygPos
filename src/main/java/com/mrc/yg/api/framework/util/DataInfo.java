package com.mrc.yg.api.framework.util;

import com.mrc.yg.api.framework.common.exception.UserException;
import com.mrc.yg.api.framework.util.dto.RtnData;
import com.mrc.yg.api.framework.util.dto.RtnType;


public class DataInfo {
    public void makeException(RtnData rtn, Exception e)
    {
        rtn.setRtnType(RtnType.ERROR);
        rtn.getErrorInfo().setErrorCode(-1);
        rtn.getErrorInfo().setErrorMessage(e.getMessage());
    }

    public void makeUserException(RtnData rtn, UserException e)
    {
        rtn.setRtnType(RtnType.ERROR);
        rtn.getErrorInfo().setErrorCode(e.getCode());
        rtn.getErrorInfo().setErrorMessage(e.getMessage());
    }
}
