package net.chrisrichardson.ftgo.cqrs.orderhistory.main;

import io.eventuate.messaging.kafka.consumer.MessageConsumerKafkaConfiguration;
import io.eventuate.tram.consumer.common.TramConsumerCommonConfiguration;
import io.eventuate.tram.consumer.kafka.EventuateTramKafkaMessageConsumerConfiguration;
import net.chrisrichardson.eventstore.examples.customersandorders.commonswagger.CommonSwaggerConfiguration;
import net.chrisrichardson.ftgo.cqrs.orderhistory.messaging.OrderHistoryServiceMessagingConfiguration;
import net.chrisrichardson.ftgo.cqrs.orderhistory.web.OrderHistoryWebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({OrderHistoryWebConfiguration.class,
        OrderHistoryServiceMessagingConfiguration.class,
        TramConsumerCommonConfiguration.class,
        CommonSwaggerConfiguration.class,
        MessageConsumerKafkaConfiguration.class,
        TramConsumerCommonConfiguration.class,
        EventuateTramKafkaMessageConsumerConfiguration.class})
public class OrderHistoryServiceMain {

  public static void main(String[] args) {
    SpringApplication.run(OrderHistoryServiceMain.class, args);
  }
}
