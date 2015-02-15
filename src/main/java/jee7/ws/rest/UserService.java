package jee7.ws.rest;

import java.io.IOException;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;


@Stateless
@Path("/integration")
public class UserService {
    
    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());

    @POST
    public Response get(@Context UriInfo uriInfo) throws IOException {
        LOGGER.info("POST-ing, request path: " + uriInfo.getAbsolutePath().toASCIIString());
        return Response.ok().build();
    }

    @GET
    @Path("/user/{id:[0-9]*}")
    public Response get(@PathParam("id") Long id, @Context UriInfo uriInfo){
        LOGGER.info("GET-ing, request path: " + uriInfo.getAbsolutePath().toASCIIString());
        LOGGER.info("user id: " + id);
        return Response.status(Status.NOT_FOUND).build();
    }
    
}
