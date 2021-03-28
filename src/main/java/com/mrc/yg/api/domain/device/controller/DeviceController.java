package com.mrc.yg.api.domain.device.controller;

import com.mrc.yg.api.base.BaseController;
import com.mrc.yg.api.domain.device.dto.DeviceDto;
import com.mrc.yg.api.domain.device.dto.DeviceDtoReq;
import com.mrc.yg.api.util.dto.RtnData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeviceController implements BaseController<DeviceDtoReq, DeviceDto> {
    @Override
    public RtnData<List<DeviceDto>> getList(DeviceDtoReq deviceDtoReq) {
        return null;
    }

    @Override
    public RtnData<String> update(DeviceDto data) {
        return null;
    }

    @Override
    public RtnData<String> delete(DeviceDto data) {
        return null;
    }

    @Override
    public RtnData<String> save(DeviceDto data) {
        return null;
    }
}
