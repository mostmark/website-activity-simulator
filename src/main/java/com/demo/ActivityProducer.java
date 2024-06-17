package com.demo;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ActivityProducer {

    @Inject
    @Channel("activity-producer")
    Emitter<String> emitter;
    
    @Scheduled(cron = "{activity.producer.cron.expr:0/1 * * ? * * *}")
    public void sayHello(){

        Activity message = ActivityGenerator.generateActivity();
        String messageJsonString = null;

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        try {
            messageJsonString = ow.writeValueAsString(message);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        if(messageJsonString == null){
            messageJsonString = message.toString();
        }

        emitter.send(messageJsonString).toCompletableFuture().join();
    }

}
