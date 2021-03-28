package com.mrc.yg.api.domain.device.mapper;

import com.mrc.yg.api.domain.device.dto.DeviceLoginLogDto;
import com.mrc.yg.api.domain.device.dto.DeviceLoginLogDtoReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeviceLoginLogMapper {
    List<DeviceLoginLogDto> getDeviceLogList(DeviceLoginLogDtoReq req);
    void insert(DeviceLoginLogDto data);
}
