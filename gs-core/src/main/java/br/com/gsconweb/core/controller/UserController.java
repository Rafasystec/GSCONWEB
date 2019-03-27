package br.com.gsconweb.core.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.gsconweb.core.model.User;
import br.com.gsconweb.core.rules.RuleUser;

@Controller
public class UserController {

	@Autowired
	private RuleUser ruleUser;
	
	@PostMapping("user/add")
    public String addUser(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }
        User saved = ruleUser.getRepoUser().save(user);
        model.addAttribute("user", saved);
        return "/index";
    }
	
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	String register(Model model){
		 model.addAttribute("user", new User()); 
		return "/register";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	String login(Model model){
		model.addAttribute("user", new User()); 
		return "/login";
	}
	
	@RequestMapping(value="/forgot/password",method=RequestMethod.GET)
	String forgotPassword(Model model){
		 //model.addAttribute("user", new User()); 
		return "/forgot-password";
	}
}
