package com.mrc.yg.api.base;

import com.mrc.yg.api.util.dto.RtnData;

import java.util.List;

public interface BaseService <TReq,T>{
    RtnData<List<T>> getList(TReq req);
    RtnData<String> insert(T data);
    RtnData<String> update(T data);
    RtnData<String> delete(T data);

}
