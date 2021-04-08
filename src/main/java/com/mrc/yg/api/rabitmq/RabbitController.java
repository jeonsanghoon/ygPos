package com.mrc.yg.api.rabitmq;

import com.mrc.yg.api.domain.member.dto.MemberDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "RabbitMQ")
@RequestMapping("/mqtt")
@RestController
public class RabbitController {
    private static final String topicExchange = "spring-boot-exchange";
    private final RabbitTemplate rabbitTemplate;

    public RabbitController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @ApiOperation(value = "메세지보내기", notes = "메세지 보내기 입니다.")
    @PostMapping("/center")
    public String sender(){
        System.out.println("Sending message...");
        MemberDto dto = new MemberDto();
        dto.setMemberName("전상훈");
        rabbitTemplate.convertAndSend(topicExchange,"foo.bar.baz", dto);
        return "보내기 완료";
    }
}
