package br.com.gsconweb.core.client.rest;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.gsconweb.core.model.User;

@Service
public class RestClientUser extends SuperRestClient<User>{

	public RestClientUser(RestTemplate restTemplate) {
		super(restTemplate);
	}

}
