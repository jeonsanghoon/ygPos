package com.mrc.yg.api.domain.device.service;

import com.mrc.yg.api.domain.device.dto.DeviceLogDto;
import com.mrc.yg.api.domain.device.dto.DeviceLogDtoReq;
import com.mrc.yg.api.domain.device.mapper.DeviceLogMapper;

import com.mrc.yg.api.framework.util.Global;
import com.mrc.yg.api.framework.util.dto.RtnData;
import com.mrc.yg.api.framework.util.dto.RtnType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeviceLogServiceImpl implements DeviceLogService<DeviceLogDtoReq, DeviceLogDto> {

    private final DeviceLogMapper mapper;

    public DeviceLogServiceImpl(DeviceLogMapper mapper) {
        this.mapper = mapper;
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public RtnData<List<DeviceLogDto>> getList(DeviceLogDtoReq req) {
        RtnData<List<DeviceLogDto>> rtn = new RtnData<>();
        try {
            List<DeviceLogDto> list = mapper.getList(req);
            rtn.setData(list);
        }catch(Exception e){
            Global.getDataInfo().makeException( rtn,e);
        }
        return rtn;
    }

    @Transactional
    @Override
    public RtnData<String> insert(DeviceLogDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            mapper.insert(data);
            rtn.setData("저장에 성공하였습니다.");
        }catch(Exception e){
            Global.getDataInfo().makeException(rtn,e);
        }
        return rtn;
    }

    @Transactional
    @Override
    public RtnData<String> update(DeviceLogDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            mapper.update(data);
            rtn.setData("수정에 성공하였습니다.");
        }catch(Exception e){
            Global.getDataInfo().makeException(rtn,e);
        }
        return rtn;
    }

    @Transactional
    @Override
    public RtnData<String> delete(DeviceLogDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            mapper.delete(data);
            rtn.setData("삭제에 성공하였습니다.");
        }catch(Exception e){
            Global.getDataInfo().makeException(rtn, e);
        }
        return rtn;
    }
}
