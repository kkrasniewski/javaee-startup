package eu.k2dev.message.boundary;

import eu.k2dev.message.control.MessageProducer;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("message")
public class MessageResource {

    @Inject
    private MessageProducer messageProducer;

    @GET
    public String message() {
        return messageProducer.getMessage();
    }

}
