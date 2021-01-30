package tn.home.spring.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public int nbrPonctuation(String texte) {
	
		int nbr=0;
		
	     for (int x=0; x<texte.length(); x++)
	     {
	         if((texte.charAt(x)==','||texte.charAt(x)=='.'||texte.charAt(x)==';'||texte.charAt(x)==':'||texte.charAt(x)=='!'||texte.charAt(x)=='?')) {
	        	 nbr++;
	       
	         }
	        
	}
	     return nbr;
		
		
	}
	
}
