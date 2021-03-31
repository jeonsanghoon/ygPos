package com.mrc.yg.api.rabitmq;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Receiver {
    // 이 부분에 @RabbitListener을 붙여도 된다. (이번 예제에서는 Config로 직접 설정해서 처리함.)
    //@RabbitListener
    public void receive(EventPayload eventPayload) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("Subscriber - Received '" + objectMapper.writeValueAsString(eventPayload) + "'");
    }
//
//    @RabbitListener(queues = RabbitMqConstants.QUEUE_NAME)
//    public void receiveMessage(final Message message) {
//        System.out.println(message);
//    }
}
