package org.author.rest;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriBuilder;

import org.author.model.Author;

/**
 * 
 */
@Stateless
@Path("/authors")
public class AuthorEndpoint {
    
    private static final Logger LOGGER = Logger.getLogger(AuthorEndpoint.class.getName());
    
    @POST
    @Consumes("application/json")
    public Response create(Author entity) {
	LOGGER.info("Create athor: " + entity);
	return Response.created(
		UriBuilder.fromResource(AuthorEndpoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
    }

    @DELETE
    @Path("/{id:[0-9][0-9]*}")
    public Response deleteById(@PathParam("id") Long id) {
	LOGGER.info("Delete author by id: " + id);
	return Response.noContent().build();
    }

    @GET
    @Path("/{id:[0-9][0-9]*}")
    @Produces("application/json")
    public Response findById(@PathParam("id") Long id) {
	LOGGER.info("Find by author id: " + id);
	return Response.ok(new Author()).build();
    }

    @PUT
    @Path("/{id:[0-9][0-9]*}")
    @Consumes("application/json")
    public Response update(@PathParam("id") Long id, Author entity) {
	if (entity == null) {
	    return Response.status(Status.BAD_REQUEST).build();
	}
	if (!id.equals(entity.getId())) {
	    return Response.status(Status.CONFLICT).entity(entity).build();
	}
	LOGGER.info("Update athor: " + entity);
	return Response.noContent().build();
    }
}
