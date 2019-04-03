package br.com.gsconweb.core.client.rest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClientService {
	
	//define a RestTemplate object
    private final RestTemplate restTemplate;

    //web service resources endpoints
    private final String GET_ALL_URL = "http://localhost:8086/users";
    private final String GET_URL_BY_ID = "http://localhost:8086/users/";

    //define an argument constructor, pass in the RestTemplate object
    //and Autowire it
    @Autowired
    public RestClientService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
     /**
     * Get all products
     * @return a list
     */
    public List<Object> findAllProducts(){
        return Arrays.stream(restTemplate.getForObject(GET_ALL_URL,Object[].class)).collect(Collectors.toList());
    }

    /**
     * Get a product by id
     * @param id of product
     * @return a product
     */
    public Object findProductById(String id){
        return restTemplate.getForObject(GET_URL_BY_ID +id, Object.class);
    }

}
