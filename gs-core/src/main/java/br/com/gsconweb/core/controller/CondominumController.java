package br.com.gsconweb.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CondominumController {

	@RequestMapping(path="registercondominum", method=RequestMethod.GET)
    public String goToCondominumRegister(Model model) {
       
        return "registercondominum";
	}
}
