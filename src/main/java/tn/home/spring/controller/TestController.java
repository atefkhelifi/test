package tn.home.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import tn.home.spring.service.TestService;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/api/ponctuation")
public class TestController {
	@Autowired
    private TestService testService;
	@GetMapping(value="/allponctuations")
	public int getAllPonctuations(@RequestBody String texte){
		return testService.nbrPonctuation(texte);
				}

}
