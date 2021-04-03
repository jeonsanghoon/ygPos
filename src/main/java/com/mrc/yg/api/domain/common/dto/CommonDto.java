package com.mrc.yg.api.domain.common.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommonDto implements Serializable {
    @Builder.Default
    private Integer commonCode= -1;
    private String mainCode;
    private Integer subCode;
    private String name;
    private int orderSeq;
    private String refData1;
    private String refData2;
    private String refData3;
    private String refData4;
    private Boolean hide;
    private int insertCode;
    private String insertName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime insertDate;
    private int updateCode;
    private String updateName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateDate;
}