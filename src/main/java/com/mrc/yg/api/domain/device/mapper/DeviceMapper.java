package com.mrc.yg.api.domain.device.mapper;

import com.mrc.yg.api.domain.device.dto.DeviceDto;
import com.mrc.yg.api.domain.device.dto.DeviceDtoReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeviceMapper {
    List<DeviceDto> getList(DeviceDtoReq req);
}
