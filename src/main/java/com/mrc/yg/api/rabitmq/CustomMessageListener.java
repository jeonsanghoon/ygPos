package com.mrc.yg.api.rabitmq;

import com.mrc.yg.api.domain.member.dto.MemberDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class CustomMessageListener {
    @RabbitListener(queues = "spring-boot")
    public void receiveMessage(final MemberDto message)
    {
        System.out.println(message);
    }
}
