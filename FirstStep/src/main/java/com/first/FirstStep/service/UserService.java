package com.first.FirstStep.service;

import org.hibernate.boot.model.internal.CreateKeySecondPass;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.first.FirstStep.model.UserDetails;

@Service
public class UserService {

	ObjectMapper mapper = new ObjectMapper();

	public JsonNode saveUser(JsonNode jsonObject) {

		ObjectNode response = mapper.createObjectNode();
		if (!jsonObject.has("id") || jsonObject.get("id").isEmpty() || jsonObject.get("id").isNull()) {

			response.put("status", "error")
				.put("result", "id is missing");

		}

		ObjectNode response1 = mapper.createObjectNode();
		ArrayNode array = mapper.createArrayNode();

		response1.set("id", jsonObject.get("id"));
		response1.set("userName", jsonObject.get("userName"));
		response1.set("address", jsonObject.get("address"));
		response1.set("phoneNumber", jsonObject.get("phoneNumber"));
		array.add(response1);
		response.set("datas", array);
		return response;
	}

}
