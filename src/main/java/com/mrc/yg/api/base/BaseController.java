package com.mrc.yg.api.base;

import com.mrc.yg.api.util.dto.RtnData;

import java.util.List;

public interface BaseController <TReq,T>{
    RtnData<List<T>> getList(TReq req);
    RtnData<String> update(T data);
    RtnData<String> delete(T data);
    RtnData<String> save(T data);
}
