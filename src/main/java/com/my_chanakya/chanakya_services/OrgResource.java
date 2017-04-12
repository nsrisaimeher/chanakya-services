/**
 * 
 */
package com.my_chanakya.chanakya_services;

import java.io.Console;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

/**
 * @author nssmeher
 *
 */

@Path("organization")
public class OrgResource {
	
	

		@GET
		@Path("/getAllProblems")
		public Response getMsg() {
			
			MongoClient mongo = new MongoClient();
			MongoDatabase db = mongo.getDatabase("chanakya");
			MongoCollection<Document> collection = db.getCollection("problemCollection");
//			
//			
//			DBObject query = new BasicDBObject("Name", "NGO");
//			MongoIterable<Document> cursor = collection.find((Bson) query);
//			

			return Response.status(200).entity(collection.find()).build();

		}

	
}
