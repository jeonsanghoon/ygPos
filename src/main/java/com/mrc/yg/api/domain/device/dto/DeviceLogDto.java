package com.mrc.yg.api.domain.device.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DeviceLogDto implements Serializable {
    private	Long logCode;
    private	String deviceCode;
    private	String deviceSn;
    private	int deviceStatus;
    private	String swName;
    private	String swVersion;
    private	String remark;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private	LocalDateTime loginTime = LocalDateTime.now();
    private	int insertCode = 1;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private	LocalDateTime insertDate = LocalDateTime.now();
    private	int updateCode = 1;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateDate = LocalDateTime.now();
}
