package com.mrc.yg.api.domain.common.mapper;

import com.mrc.yg.api.domain.common.dto.CommonDto;
import com.mrc.yg.api.domain.common.dto.CommonDtoReq;

import java.util.List;

public interface CommonMapper {
    List<CommonDto> getList(CommonDtoReq req);
    void insert(CommonDto data);
    void update(CommonDto data);
    void delete(CommonDto data);
}
