package com.mrc.yg.api.domain.device.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DeviceDto implements Serializable {
    private	long	deviceCode;
    private	String	deviceSn;
    private	String	deviceName;
    private	String	Address;
    private	String	addressDetail;
    private	Boolean	isActive;

    private	String remark;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime login_time = LocalDateTime.now();
    private	int insertCode = 1;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private	LocalDateTime insertDate = LocalDateTime.now();
    private	int updateCode = 1;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateDate = LocalDateTime.now();
}
