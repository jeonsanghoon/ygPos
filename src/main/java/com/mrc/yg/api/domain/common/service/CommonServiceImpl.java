package com.mrc.yg.api.domain.common.service;

import com.mrc.yg.api.domain.common.dto.CommonDto;
import com.mrc.yg.api.domain.common.dto.CommonDtoReq;
import com.mrc.yg.api.domain.common.mapper.CommonMapper;

import com.mrc.yg.api.framework.util.dto.RtnData;
import com.mrc.yg.api.framework.util.dto.RtnType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CommonServiceImpl implements CommonService<CommonDtoReq, CommonDto> {
    private final CommonMapper mapper;

    public CommonServiceImpl(CommonMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public RtnData<List<CommonDto>> getList(CommonDtoReq commonDtoReq) {
        RtnData<List<CommonDto>> rtn = new RtnData<>();
        try {
            rtn.setData( mapper.getList(commonDtoReq));
        }catch(Exception e){
            rtn.setRtnType(RtnType.ERROR);
            rtn.getErrorInfo().setErrorCode(-1);
            rtn.getErrorInfo().setErrorMessage(e.getMessage());
        }
        return rtn;
    }

    @Transactional
    @Override
    public RtnData<String> insert(CommonDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            mapper.insert(data);
            rtn.setData("저장에 성공하였습니다.");
        }catch(Exception e){
            rtn.setRtnType(RtnType.ERROR);
            rtn.getErrorInfo().setErrorCode(-1);
            rtn.getErrorInfo().setErrorMessage(e.getMessage());
        }
        return rtn;
    }


    @Transactional
    @Override
    public RtnData<String> update(CommonDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            mapper.update(data);
            rtn.setData("수정에 성공하였습니다.");
        }catch(Exception e){
            rtn.setRtnType(RtnType.ERROR);
            rtn.getErrorInfo().setErrorCode(-1);
            rtn.getErrorInfo().setErrorMessage(e.getMessage());
        }
        return rtn;
    }

    @Transactional
    @Override
    public RtnData<String> delete(CommonDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            mapper.delete(data);
            rtn.setData("삭제에 성공하였습니다.");
        }catch(Exception e){
            rtn.setRtnType(RtnType.ERROR);
            rtn.getErrorInfo().setErrorCode(-1);
            rtn.getErrorInfo().setErrorMessage(e.getMessage());
        }
        return rtn;
    }
}
