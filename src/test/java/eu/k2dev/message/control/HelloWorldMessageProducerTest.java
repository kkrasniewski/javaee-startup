package eu.k2dev.message.control;

import eu.k2dev.CDIExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(CDIExtension.class)
class HelloWorldMessageProducerTest {

    @Inject
    MessageProducer messageProducer;

    @Test
    void shouldReturnHelloWorld() {
        //given + when
        final String message = messageProducer.getMessage();

        //then
        assertThat(message).isEqualTo("Hello World");
    }

}