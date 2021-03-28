package com.mrc.yg.api.domain.device.controller;

import com.mrc.yg.api.base.BaseController;
import com.mrc.yg.api.domain.device.dto.DeviceLoginLogDto;
import com.mrc.yg.api.domain.device.dto.DeviceLoginLogDtoReq;
import com.mrc.yg.api.domain.device.service.DeviceLoginLogService;
import com.mrc.yg.api.util.dto.RtnData;
import io.swagger.annotations.Api;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Device Login Log")
@RequestMapping("/v1/device/loginLog")
@RestController
public class DeviceLoginLogController implements BaseController<DeviceLoginLogDtoReq, DeviceLoginLogDto> {

    private final DeviceLoginLogService<DeviceLoginLogDtoReq, DeviceLoginLogDto> service;
    private final Log log;
    public DeviceLoginLogController(DeviceLoginLogService<DeviceLoginLogDtoReq, DeviceLoginLogDto> deviceService) {
        this.service = deviceService;
        log = LogFactory.getLog(getClass());
    }

    @PostMapping("/getList")
    @ResponseBody
    @Override
    public RtnData<List<DeviceLoginLogDto>> getList(@RequestBody DeviceLoginLogDtoReq req) {
        log.info(req.toString());
        return service.getList(req);
    }

    @PostMapping("/save")
    @Override
    public RtnData<String> save(DeviceLoginLogDto data) {
        return service.save(data);
    }

    @PostMapping("/update")
    @Override
    public RtnData<String> update(DeviceLoginLogDto data) {
        return service.update(data);
    }

    @PostMapping("/delete")
    @Override
    public RtnData<String> delete(DeviceLoginLogDto data) {
        return service.delete(data);
    }
}
