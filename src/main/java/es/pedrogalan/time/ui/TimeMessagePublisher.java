package es.pedrogalan.time.ui;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(TimePriceSource.class)
public class TimeMessagePublisher {

    @Bean
    @InboundChannelAdapter(channel = "time-price-channel", poller = @Poller(fixedDelay = "2000"))
    public MessageSource<TimePrice> sendCurrentPrice() {
        return () -> MessageBuilder.withPayload(new TimePrice("0,00 EUR")).build();
    }
}
