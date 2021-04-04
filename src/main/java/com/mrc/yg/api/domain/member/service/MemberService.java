package com.mrc.yg.api.domain.member.service;

import com.mrc.yg.api.framework.base.BaseService;
import com.mrc.yg.api.framework.util.dto.RtnData;


public interface MemberService<TReq,T> extends BaseService<TReq, T> {
    RtnData<String> login(TReq req);
}
