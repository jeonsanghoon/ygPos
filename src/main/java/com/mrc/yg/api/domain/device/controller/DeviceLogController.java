package com.mrc.yg.api.domain.device.controller;

import com.mrc.yg.api.base.BaseController;
import com.mrc.yg.api.domain.device.dto.DeviceLogDto;
import com.mrc.yg.api.domain.device.dto.DeviceLogDtoReq;
import com.mrc.yg.api.domain.device.service.DeviceLogService;
import com.mrc.yg.api.util.dto.RtnData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "기기로그인")
@RequestMapping("/v1/device/loginLog")
@RestController
public class DeviceLogController implements BaseController<DeviceLogDtoReq, DeviceLogDto> {

    private final DeviceLogService<DeviceLogDtoReq, DeviceLogDto> service;
    private final Log log;
    public DeviceLogController(DeviceLogService<DeviceLogDtoReq, DeviceLogDto> deviceService) {
        this.service = deviceService;
        log = LogFactory.getLog(getClass());
    }

    @ApiOperation(value = "기기로그인 조회", notes = "기기로그인 조회입니다.")
    @PostMapping("/getList")
    @ResponseBody
    @Override
    public RtnData<List<DeviceLogDto>> getList(@RequestBody DeviceLogDtoReq req) {
        log.info(req.toString());
        return service.getList(req);
    }

    @ApiOperation(value = "기기로그인 저장", notes = "기기로그인 저장입니다.")
    @PostMapping("/save")
    @Override
    public RtnData<String> save(@RequestBody DeviceLogDto data) {
        return service.insert(data);
    }

    @PostMapping("/update")
    @Override
    public RtnData<String> update(@RequestBody DeviceLogDto data) {
        return service.update(data);
    }

    @PostMapping("/delete")
    @Override
    public RtnData<String> delete(@RequestBody DeviceLogDto data) {
        return service.delete(data);
    }
}
