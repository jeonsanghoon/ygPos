package com.mrc.yg.api.domain.device.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DeviceLoginLogDtoReq implements Serializable {
    private	Long logCode;
    private	String deviceCode;
    private	String device_sn;
}
