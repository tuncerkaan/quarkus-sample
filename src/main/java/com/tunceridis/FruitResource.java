package com.tunceridis;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

@Path("/fruit")
public class FruitResource {

    Logger logger = Logger.getLogger(FruitResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        logger.debug("hello method triggered");
        return "apple";
    }
}