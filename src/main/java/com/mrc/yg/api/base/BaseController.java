package com.mrc.yg.api.base;

import java.util.List;

public interface BaseController<T,TCond> {
    List<T> getList(TCond param);
    RtnData save(T data);
    RtnData update(T data);
    RtnData delete(T data);
}
