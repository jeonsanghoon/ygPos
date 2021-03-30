package com.mrc.yg.api.domain.device.controller;

import com.mrc.yg.api.base.BaseController;
import com.mrc.yg.api.domain.device.dto.DeviceDto;
import com.mrc.yg.api.domain.device.dto.DeviceDtoReq;
import com.mrc.yg.api.domain.device.service.DeviceService;
import com.mrc.yg.api.util.dto.RtnData;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeviceController implements BaseController<DeviceDtoReq, DeviceDto> {
    private final DeviceService<DeviceDtoReq, DeviceDto> service;
    private final Log log;
    public DeviceController(DeviceService<DeviceDtoReq, DeviceDto> service) {
        this.service = service;
        log = LogFactory.getLog(getClass());
    }

    @PostMapping("/getList")
    @ResponseBody
    @Override
    public RtnData<List<DeviceDto>> getList(@RequestBody DeviceDtoReq deviceDtoReq) {
        return service.getList(deviceDtoReq);
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
