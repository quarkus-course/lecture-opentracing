package tech.donau.opentracing;

import org.jboss.logmanager.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class TracedResource {
    public static final Logger LOGGER = Logger.getLogger(TracedResource.class.getSimpleName());

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOGGER.info("Hello");
        LOGGER.info("How");
        LOGGER.info("Are");
        LOGGER.info("YOU?");
        return "hello";
    }
}