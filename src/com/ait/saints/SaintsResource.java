package com.ait.saints;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ait.validation.ErrorMessages;
import com.ait.validation.SaintValidationException;
import com.ait.validation.SaintsValidator;
import com.ait.validation.*;


@Path("/saints")
public class SaintsResource {
	
	SaintsValidator saintsValidator = new SaintsValidator();
	SaintsDAO saintsDAO = new SaintsDAO();
	CheckSaintExists checkSaintExists = new CheckSaintExists();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Response findAll() {
		List<Saints> list = saintsDAO.findAll();
		return Response.status(200).entity(list).build();
	}
	
	@GET @Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON})
	//http://localhost:8080/Saints/rest/saints/{id}
	public Response findById(@PathParam("id") int id) {
		Saints saint = SaintsDAO.findById(id);
		return Response.status(200).entity(saint).build();
	}
	
	@GET @Path("search/{query}")
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8080/wines/search/{query}
	public Response findByName(@PathParam("query") String name) {
		List<Saints> saint = saintsDAO.findByName(name);
		return Response.status(200).entity(saint).build();
	}
	
	@GET @Path("/query")
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8080/Saints/rest/query?country=Turkey&century=1
	public Response findByCountryAndCentury(
			@QueryParam("country") String country,
			@QueryParam("century") int century){
		List<Saints> saints = saintsDAO.findByCountryAndCentury(country, century);
		return Response.status(200).entity(saints).build();
		}
	
	@POST
	@Consumes({ MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8080/Saints/rest/saints
	public Response create(Saints saint) {
		Response response;
		try {
			List<Saints> saints = SaintsDAO.findAll();
			saintsValidator.checkEmptyFields(saint);
			saintsValidator.checkInvalidCentury(saint);
			checkSaintExists.checkSaintExists(saint, saints);
			SaintsDAO.create(saint);
			response = Response.status(200).entity(saint).build();
		} catch (SaintValidationException e) {
			ErrorMessage errorMessage = new ErrorMessage(e.getMessage());
			response = Response.status(403).entity(errorMessage).build();
		}
		
		return response;
	}
	
	@PUT @Path("{id}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8080/Saints/rest/{id}
	public Response update(Saints saint) {
		saintsDAO.update(saint);
		return Response.status(201).entity(saint).build();
	}
	
	@DELETE @Path("{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Response remove(@PathParam("id") int id) {
		saintsDAO.remove(id);
		return Response.status(204).build();
	}
}
