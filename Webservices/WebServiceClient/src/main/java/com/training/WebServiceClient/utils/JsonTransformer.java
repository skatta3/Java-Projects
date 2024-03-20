package com.training.WebServiceClient.utils;

import com.google.gson.Gson;
import com.training.WebServiceClient.schemaObjs.User;

public class JsonTransformer {
	
	public String ObjectToJson(User obj) {
		return new Gson().toJson(obj);
	}
	
	public User StringtoJsonObject(String req) {
		return new Gson().fromJson(req, User.class);
	}

}
