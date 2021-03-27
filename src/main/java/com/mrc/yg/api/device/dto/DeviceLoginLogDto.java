package com.mrc.yg.api.device.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DeviceLoginLogDto {
    private	Long logCode;
    private	String deviceCode;
    private	String device_sn;
    private	String device_status;
    private	String sw_name;
    private	String sw_version;
    private	String remark;
    private	int insert_code = 1;
    private	LocalDateTime insert_date = LocalDateTime.now();
    private	int update_code = 1;
    private LocalDateTime update_date = LocalDateTime.now();
}
