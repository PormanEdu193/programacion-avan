package com.example.ejemplo;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;


@Stateless
@LocalBean
public class SessionBean {
	
        public String Ejemplo() {
        	return "Metodo de ejemplo de bean";
        }
}
