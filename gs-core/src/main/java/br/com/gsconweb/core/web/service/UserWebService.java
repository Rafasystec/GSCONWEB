package br.com.gsconweb.core.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gsconweb.core.exception.ValidationException;
import br.com.gsconweb.core.model.User;
import br.com.gsconweb.core.rules.RuleUser;

@RestController
@RequestMapping(produces={MediaType.APPLICATION_JSON_VALUE},path=User.ROOT)
public class UserWebService {

	@Autowired
	private RuleUser ruleUser;
	/**
     * Get all products
     * @return a list as json
     */
    @GetMapping
    public Iterable<User> findAll(){
        return null;
    }

    /**
     * Get product by id
     * @param id of product
     * @return a product as json
     */
    @GetMapping("{id}")
    public User findById(@PathVariable Long id){
        return null;
    }
    
    @PostMapping
    public User save(User user) {
		try {
			return ruleUser.save(user);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
