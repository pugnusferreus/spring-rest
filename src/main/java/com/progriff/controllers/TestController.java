package com.progriff.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController
{
	private final Logger LOG = LogManager.getLogger(TestController.class);

	@RequestMapping(value = "/someEndPoint", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, String> testEndpoint()
	{
		LOG.info("Calling testEndpoint");
		Map<String, String> map = new HashMap<String, String>();
		map.put("key", "value");
		return map;
	}
}
