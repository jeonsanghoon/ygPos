package com.mrc.yg.api.domain.device.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DeviceDtoReq implements Serializable {
    private	Long deviceCode;
    private	String deviceName;
    private	String deviceSn;
    private	Boolean isActive;
}
