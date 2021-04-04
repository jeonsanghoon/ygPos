package com.mrc.yg.api.domain.device.service;

import com.mrc.yg.api.domain.device.dto.DeviceDto;
import com.mrc.yg.api.domain.device.dto.DeviceDtoReq;
import com.mrc.yg.api.domain.device.mapper.DeviceMapper;
import com.mrc.yg.api.framework.util.Global;
import com.mrc.yg.api.framework.util.dto.RtnData;
import com.mrc.yg.api.framework.util.dto.RtnType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService<DeviceDtoReq, DeviceDto> {

    private final DeviceMapper deviceMapper;

    public DeviceServiceImpl(DeviceMapper deviceMapper) {
        this.deviceMapper = deviceMapper;
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public RtnData<List<DeviceDto>> getList(DeviceDtoReq deviceDtoReq) {
        RtnData<List<DeviceDto>> rtn = new RtnData<>();
        try {
            rtn.setData(deviceMapper.getList(deviceDtoReq));
        }catch(Exception e){
            Global.getDataInfo().makeException(rtn,e);
        }
        return rtn;
    }

    @Transactional
    @Override
    public RtnData<String> insert(DeviceDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            deviceMapper.insert(data);
            rtn.setData("저장에 성공하였습니다.");

        }catch(Exception e){
            Global.getDataInfo().makeException(rtn,e);
        }
        return rtn;
    }

    @Transactional
    @Override
    public RtnData<String> update(DeviceDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            deviceMapper.update(data);
            rtn.setData("수정에 성공하였습니다.");
        }catch(Exception e){
            Global.getDataInfo().makeException(rtn,e);
        }
        return rtn;
    }


    @Transactional
    @Override
    public RtnData<String> delete(DeviceDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            deviceMapper.delete(data);
            rtn.setData("삭제에 성공하였습니다.");
        }catch(Exception e){
            Global.getDataInfo().makeException(rtn,e);
        }
        return rtn;
    }
}
