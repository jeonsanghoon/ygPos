package com.mrc.yg.api.framework.util;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public final class Global {
    @Getter
    private static DataInfo dataInfo;

    @PostConstruct
    private void initialize() {
        dataInfo = new DataInfo();
    }
}
