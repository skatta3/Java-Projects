package com.training.idrbt;

	import java.io.BufferedReader;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	 
	import javax.print.attribute.standard.Media;
	import javax.ws.rs.Consumes;
	import javax.ws.rs.GET;
	import javax.ws.rs.POST;
	import javax.ws.rs.Path;
	import javax.ws.rs.Produces;
	import javax.ws.rs.core.MediaType;
	import javax.ws.rs.core.Response;
	 
	@Path("/")
	public class JSONRestService {
		@POST
		@Path("/jsonRestService")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response jsonREST(InputStream incomingData) {
			StringBuilder jsonBuilder = new StringBuilder();
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
				String line = null;
				while ((line = in.readLine()) != null) {
					jsonBuilder.append(line);
				}
			} catch (Exception e) {
				System.out.println("Error Parsing: - ");
			}
			System.out.println("Data Received: " + jsonBuilder.toString());
	 
			// return HTTP response 200 in case of success
			return Response.status(200).entity(jsonBuilder.toString()).build();
		}
	 
		@GET
		@Path("/verify")
		@Produces(MediaType.TEXT_PLAIN)
		public Response verifyRESTService(InputStream incomingData) {
			String result = "jsonRESTService Successfully started..";
	 
			// return HTTP response 200 in case of success
			return Response.status(200).entity(result).build();
		}
	 
	}
