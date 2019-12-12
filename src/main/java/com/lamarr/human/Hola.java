package com.lamarr.human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hola")
public class Hola {
	
	@RequestMapping("")
	public String index(@RequestParam(value="first", required=false) String queryFirst,
    		@RequestParam(value="last", required=false) String queryLast) {
        String name;
        if (queryFirst==null & queryLast==null){
        	name = "Human";
        }
        else {
        	name=queryFirst + " " +queryLast;
        }
        return "Hello "+ name+"!\r\n\n Welcome to Spring Boot!";
    }
	

}
