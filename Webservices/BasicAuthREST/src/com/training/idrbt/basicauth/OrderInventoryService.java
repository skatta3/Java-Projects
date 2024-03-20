package com.training.idrbt.basicauth;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.glassfish.jersey.model.internal.RankedComparator.Order;

import sun.misc.BASE64Decoder;

@Path("/order-inventory")
public class OrderInventoryService {
 
    @GET
    @Path("/order/{orderId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Object getUserById(@PathParam("orderId") Integer orderId, 
                            @HeaderParam("authorization") String authString){
         
        if(!isUserAuthenticated(authString)){
            return "{\"error\":\"User not authenticated\"}";
        }
        Order ord = new Order();
        ord.setCustmer("Java2Novice");
        ord.setAddress("Bangalore");
        ord.setAmount("$2000");
        return ord;
    }
     
    private boolean isUserAuthenticated(String authString){
         
        String decodedAuth = "";
        // Header is in the format "Basic 5tyc0uiDat4"
        // We need to extract data before decoding it back to original string
        String[] authParts = authString.split("\\s+");
        String authInfo = authParts[1];
        // Decode the data back to original string
        byte[] bytes = null;
        try {
            bytes = new BASE64Decoder().decodeBuffer(authInfo);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        decodedAuth = new String(bytes);
        System.out.println(decodedAuth);
         
        /**
         * here you include your logic to validate user authentication.
         * it can be using ldap, or token exchange mechanism or your 
         * custom authentication mechanism.
         */
        // your validation code goes here....
         
        return true;
    }
}