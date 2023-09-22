package com.khadri.spring.rest.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

	@Autowired
	private RestTemplate restTemplate;

	public void getAllStudentInformation() {

		// call producer service ???
		// http://localhost:8080/A2022_Spring_REST_Basic2/register/view

		
		ResponseEntity<HashMap> responseEntity = restTemplate
				.getForEntity("http://localhost:8080/A2022_Spring_REST_Basic2/register/view", HashMap.class);

		HashMap<String, String> hashMap = responseEntity.getBody();
		System.out.println(hashMap);

	}
}
