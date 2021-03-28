package com.mrc.yg.api.domain.device.service;

import com.mrc.yg.api.domain.device.dto.DeviceDto;
import com.mrc.yg.api.domain.device.dto.DeviceDtoReq;
import com.mrc.yg.api.util.dto.RtnData;
import com.mrc.yg.api.util.dto.RtnType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService<DeviceDtoReq, DeviceDto> {

   // private final DeviceMapper deviceMapper;

   // public DeviceServiceImpl(DeviceMapper deviceMapper) {
//        this.deviceMapper = deviceMapper;
//    }

    @Transactional
    @Override
    public RtnData<String> insert(DeviceDto data) {
        RtnData<String> rtn = new RtnData<>();
        try {
            //deviceMapper.save(data);
            rtn.setData("저장에 성공하였습니다.");
            //throw new UserException("");
        }catch(Exception e){
            rtn.setRtnType(RtnType.ERROR);
            rtn.getErrorInfo().setErrorCode(-1);
            rtn.getErrorInfo().setErrorMessage(e.getMessage());
        }
        return rtn;
    }

    @Override
    public RtnData<List<DeviceDto>> getList(DeviceDtoReq deviceDtoReq) {
        RtnData<List<DeviceDto>> rtn = new RtnData<>();
        try {
           // rtn.setData(deviceMapper.getList(deviceDtoReq));

        }catch(Exception e){
            rtn.setRtnType(RtnType.ERROR);
            rtn.getErrorInfo().setErrorCode(-1);
            rtn.getErrorInfo().setErrorMessage(e.getMessage());
        }
        return rtn;
    }

    @Transactional
    @Override
    public RtnData<String> update(DeviceDto data) {
        return null;
    }

    @Transactional
    @Override
    public RtnData<String> delete(DeviceDto data) {
        return null;
    }


}
