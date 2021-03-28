package com.mrc.yg.api.domain.device.mapper;

import com.mrc.yg.api.domain.device.dto.DeviceDto;
import com.mrc.yg.api.domain.device.dto.DeviceDtoReq;

import java.util.List;


public interface DeviceMapper {

    List<DeviceDto> getList(DeviceDtoReq req);
  //  void insert(DeviceDto data);
//    void update(DeviceDto data);
//    void delete(DeviceDto data);
}
