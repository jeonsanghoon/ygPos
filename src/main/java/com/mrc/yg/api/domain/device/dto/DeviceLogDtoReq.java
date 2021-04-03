package com.mrc.yg.api.domain.device.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DeviceLogDtoReq {
    private	Long logCode;
    private	String deviceCode;
    private	String deviceSn;
}
