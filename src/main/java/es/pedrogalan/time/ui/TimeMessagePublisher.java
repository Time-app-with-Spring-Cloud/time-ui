package es.pedrogalan.time.ui;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

@EnableBinding(Source.class)
public class TimeMessagePublisher {

    @InboundChannelAdapter(channel = Source.OUTPUT)
    public String sendCurrentPrice() {
        return "Current price for using time service: 0,00 EUR";
    }
}
