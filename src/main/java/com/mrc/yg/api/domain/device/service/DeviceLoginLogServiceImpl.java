package com.mrc.yg.api.domain.device.service;

import com.mrc.yg.api.domain.device.dto.DeviceLoginLogDto;
import com.mrc.yg.api.domain.device.dto.DeviceLoginLogDtoReq;
import com.mrc.yg.api.domain.device.mapper.DeviceLoginLogMapper;
import com.mrc.yg.api.util.dto.RtnData;
import com.mrc.yg.api.util.dto.RtnType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceLoginLogServiceImpl implements DeviceLoginLogService<DeviceLoginLogDtoReq, DeviceLoginLogDto> {

    private final DeviceLoginLogMapper mapper;

    public DeviceLoginLogServiceImpl(DeviceLoginLogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public RtnData<List<DeviceLoginLogDto>> getList(DeviceLoginLogDtoReq req) {
        RtnData<List<DeviceLoginLogDto>> rtn = new RtnData<>();
        try {
            List<DeviceLoginLogDto> list = mapper.getList(req);
            rtn.setData(list);
        }catch(Exception e){
            rtn.setRtnType(RtnType.ERROR);
            rtn.getErrorInfo().setErrorCode(-1);
            rtn.getErrorInfo().setErrorMessage(e.getMessage());
        }
        return rtn;
    }

    @Override
    public RtnData<String> update(DeviceLoginLogDto data) {
        return null;
    }

    @Override
    public RtnData<String> delete(DeviceLoginLogDto data) {
        return null;
    }

    @Override
    public RtnData<String> save(DeviceLoginLogDto data) {
        return null;
    }
}
