package es.pedrogalan.time.ui;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface TimePriceSource {

    @Output("time-price-channel")
    MessageChannel price();
}
