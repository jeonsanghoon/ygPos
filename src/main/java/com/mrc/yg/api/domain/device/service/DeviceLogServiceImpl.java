package com.mrc.yg.api.domain.device.service;

import com.mrc.yg.api.domain.device.dto.DeviceLogDto;
import com.mrc.yg.api.domain.device.dto.DeviceLogDtoReq;
import com.mrc.yg.api.domain.device.mapper.DeviceLogMapper;
import com.mrc.yg.api.util.dto.RtnData;
import com.mrc.yg.api.util.dto.RtnType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceLogServiceImpl implements DeviceLogService<DeviceLogDtoReq, DeviceLogDto> {

    private final DeviceLogMapper mapper;

    public DeviceLogServiceImpl(DeviceLogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public RtnData<List<DeviceLogDto>> getList(DeviceLogDtoReq req) {
        RtnData<List<DeviceLogDto>> rtn = new RtnData<>();
        try {
            List<DeviceLogDto> list = mapper.getList(req);
            rtn.setData(list);
        }catch(Exception e){
            rtn.setRtnType(RtnType.ERROR);
            rtn.getErrorInfo().setErrorCode(-1);
            rtn.getErrorInfo().setErrorMessage(e.getMessage());
        }
        return rtn;
    }


    @Override
    public RtnData<String> insert(DeviceLogDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            mapper.insert(data);
        }catch(Exception e){
            rtn.setRtnType(RtnType.ERROR);
            rtn.getErrorInfo().setErrorCode(-1);
            rtn.getErrorInfo().setErrorMessage(e.getMessage());
        }
        return rtn;
    }

    @Override
    public RtnData<String> update(DeviceLogDto data) {
        return null;
    }

    @Override
    public RtnData<String> delete(DeviceLogDto data) {
        return null;
    }

}
