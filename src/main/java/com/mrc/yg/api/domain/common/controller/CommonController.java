package com.mrc.yg.api.domain.common.controller;


import com.mrc.yg.api.base.BaseController;
import com.mrc.yg.api.domain.common.dto.CommonDto;
import com.mrc.yg.api.domain.common.dto.CommonDtoReq;
import com.mrc.yg.api.util.dto.RtnData;

import java.util.List;

public class CommonController implements BaseController<CommonDtoReq, CommonDto> {

    @Override
    public RtnData<List<CommonDto>> getList(CommonDtoReq commonDtoReq) {
        return null;
    }

    @Override
    public RtnData<String> update(CommonDto data) {
        return null;
    }

    @Override
    public RtnData<String> delete(CommonDto data) {
        return null;
    }

    @Override
    public RtnData<String> save(CommonDto data) {
        return null;
    }
}
