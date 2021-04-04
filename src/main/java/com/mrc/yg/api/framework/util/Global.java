package com.mrc.yg.api.framework.util;

import com.mrc.yg.api.framework.util.dto.SecurityInfo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public final class Global {
    @Getter
    private static DataInfo dataInfo;

    @Getter
    private static SecurityInfo securityInfo;

    @PostConstruct
    private void initialize() {
        dataInfo = new DataInfo();
        securityInfo = new SecurityInfo();
    }
}
