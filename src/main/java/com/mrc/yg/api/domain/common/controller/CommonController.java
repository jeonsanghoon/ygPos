package com.mrc.yg.api.domain.common.controller;


import com.mrc.yg.api.domain.common.service.CommonService;
import com.mrc.yg.api.framework.base.BaseController;
import com.mrc.yg.api.domain.common.dto.CommonDto;
import com.mrc.yg.api.domain.common.dto.CommonDtoReq;
import com.mrc.yg.api.framework.util.dto.RtnData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Api(tags = "공통코드")
@RequestMapping("/v1/common")
@RestController
public class CommonController implements BaseController<CommonDtoReq, CommonDto> {

    private final CommonService<CommonDtoReq, CommonDto> service;

    public CommonController(CommonService<CommonDtoReq, CommonDto> service) {
        this.service = service;
    }

    @ApiOperation(value = "공통코드 조회", notes = "공통코드 조회입니다.")
    @PostMapping("/getList")
    @Override
    public RtnData<List<CommonDto>> getList(@RequestBody CommonDtoReq commonDtoReq) {
        return service.getList(commonDtoReq);
    }

    @ApiOperation(value = "공통코드 저장", notes = "공통코드 저장입니다.")
    @PostMapping("/save")
    @Override
    public RtnData<String> save(@RequestBody CommonDto data) {
        return service.insert(data);
    }

    @ApiOperation(value = "공통코드 수정", notes = "공통코드 수정입니다.")
    @PostMapping("/update")
    @Override
    public RtnData<String> update(@RequestBody CommonDto data) {
        return service.insert(data);
    }

    @ApiOperation(value = "공통코드 삭제", notes = "공통코드 삭제입니다.")
    @PostMapping("/delete")
    @Override
    public RtnData<String> delete(@RequestBody CommonDto data) {
        return service.delete(data);
    }
}
