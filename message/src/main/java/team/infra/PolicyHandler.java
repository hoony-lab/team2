package team.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import team.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import team.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired MessageRepository messageRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Reserved'")
    public void wheneverReserved_SendReservationMessage(@Payload Reserved reserved){

        Reserved event = reserved;
        System.out.println("\n\n##### listener SendReservationMessage : " + reserved + "\n\n");


        

        // Sample Logic //
        Message.sendReservationMessage(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Canceled'")
    public void wheneverCanceled_SendCancelReservationMessage(@Payload Canceled canceled){

        Canceled event = canceled;
        System.out.println("\n\n##### listener SendCancelReservationMessage : " + canceled + "\n\n");


        

        // Sample Logic //
        Message.sendCancelReservationMessage(event);
        

        

    }

    // keep

}


