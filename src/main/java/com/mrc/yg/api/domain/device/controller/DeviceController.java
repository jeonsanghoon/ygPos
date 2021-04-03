package com.mrc.yg.api.domain.device.controller;

import com.mrc.yg.api.domain.device.dto.DeviceDto;
import com.mrc.yg.api.domain.device.dto.DeviceDtoReq;
import com.mrc.yg.api.domain.device.service.DeviceService;
import com.mrc.yg.api.framework.base.BaseController;
import com.mrc.yg.api.framework.util.dto.RtnData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "기기")
@RequestMapping("/v1/device")
@RestController
public class DeviceController implements BaseController<DeviceDtoReq, DeviceDto> {

    private final DeviceService<DeviceDtoReq, DeviceDto> service;
    private final Log log;
    public DeviceController(DeviceService<DeviceDtoReq, DeviceDto> deviceService) {
        this.service = deviceService;
        log = LogFactory.getLog(getClass());
    }

    @ApiOperation(value = "기기 조회", notes = "기기 조회입니다.")
    @PostMapping("/getList")
    @ResponseBody
    @Override
    public RtnData<List<DeviceDto>> getList(@RequestBody DeviceDtoReq req) {
        log.info(req.toString());
        return service.getList(req);
    }

    @ApiOperation(value = "기기 저장", notes = "기기 저장입니다.")
    @PostMapping("/save")
    @Override
    public RtnData<String> save(@RequestBody DeviceDto data) {
        return service.insert(data);
    }

    @ApiOperation(value = "기기 수정", notes = "기기 저장입니다.")
    @PostMapping("/update")
    @Override
    public RtnData<String> update(@RequestBody DeviceDto data) {
        return service.update(data);
    }

    @ApiOperation(value = "기기 삭제", notes = "기기 삭제입니다.")
    @PostMapping("/delete")
    @Override
    public RtnData<String> delete(@RequestBody DeviceDto data) {
        return service.delete(data);
    }
}
