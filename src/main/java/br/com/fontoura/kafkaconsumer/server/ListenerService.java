package br.com.fontoura.kafkaconsumer.server;

import org.springframework.kafka.annotation.KafkaListener;

public class ListenerService {

    @KafkaListener(topics = "t_test_one", groupId = "group_one")
    public void listener(String message) {
        System.out.println("consumer -> " + message);
    }

}
