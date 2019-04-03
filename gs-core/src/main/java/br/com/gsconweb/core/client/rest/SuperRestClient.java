package br.com.gsconweb.core.client.rest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.classmate.GenericType;
import com.fasterxml.classmate.TypeResolver;

import br.com.gsconweb.core.model.SuperEntity;

public abstract class SuperRestClient<T extends SuperEntity> {
	
	//define a RestTemplate object
    private final RestTemplate restTemplate;

    //web service resources root url endpoint
    private final String ROOT_URL = "http://localhost:8086/";

    @Autowired
    public SuperRestClient(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
   
     /**
     * Get all products
     * @return a list
     */
    public List<SuperEntity> findAll(SuperEntity entity){
        return Arrays.stream(restTemplate.getForObject(ROOT_URL+entity.getRootURL(),SuperEntity[].class)).collect(Collectors.toList());
    }

    /**
     * Get a product by id
     * @param id of product
     * @return a product
     */
    public SuperEntity findById(String id, SuperEntity entity){
        return restTemplate.getForObject(ROOT_URL + entity.getRootURL()+"/" + id, SuperEntity.class);
    }
    
    public SuperEntity save(T entidade,SuperEntity entity) {
		return restTemplate.postForEntity(ROOT_URL+entity.getRootURL(), entidade,SuperEntity.class).getBody();
	}

    @SuppressWarnings("unchecked")
	public T save(SuperEntity entity) {
		return (T)restTemplate.postForEntity(ROOT_URL+entity.getRootURL(), entity,SuperEntity.class).getBody();
	}
}
