/**
 * 
 */
package com.my_chanakya.chanakya_services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * @author nssmeher
 *
 */

@Path("/hello")
public class StudentResource {
	
	

		@GET
		@Path("/{param}")
		public Response getMsg(@PathParam("param") String msg) {
			
			MongoClient mongo = new MongoClient();
			MongoDatabase db = mongo.getDatabase("chanakya");
			db.createCollection("problemCollection");
//			MongoCollection<Document> collection = 

			String output = "Jersey say : " + msg;

			return Response.status(200).entity(output).build();

		}

	
}
