package eu.k2dev.message.boundary;

import eu.k2dev.message.control.MessageProducer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MessageResourceTest {

    @Mock
    private MessageProducer messageProducer;

    @InjectMocks
    private MessageResource messageResource;

    @Test
    void shouldReturnMessageFromProducer() {
        //given
        String expectedMessage = "Hello Mars";
        when(messageProducer.getMessage()).thenReturn(expectedMessage);

        //when
        final String message = messageResource.message();

        //then
        assertThat(message).isEqualTo(expectedMessage);
    }

}