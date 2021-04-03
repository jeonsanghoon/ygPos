package com.mrc.yg.api.domain.device.mapper;

import com.mrc.yg.api.domain.device.dto.DeviceLogDto;
import com.mrc.yg.api.domain.device.dto.DeviceLogDtoReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeviceLogMapper {
    List<DeviceLogDto> getList(DeviceLogDtoReq req);
    void insert(DeviceLogDto data);
    void update(DeviceLogDto data);
    void delete(DeviceLogDto data);
}