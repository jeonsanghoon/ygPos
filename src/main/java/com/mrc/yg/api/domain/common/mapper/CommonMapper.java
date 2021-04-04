package com.mrc.yg.api.domain.common.mapper;

import com.mrc.yg.api.domain.common.dto.CommonDto;
import com.mrc.yg.api.domain.common.dto.CommonDtoReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommonMapper {
    List<CommonDto> getList(CommonDtoReq req);
    void insert(CommonDto data);
    void update(CommonDto data);
    void delete(CommonDto data);
}
