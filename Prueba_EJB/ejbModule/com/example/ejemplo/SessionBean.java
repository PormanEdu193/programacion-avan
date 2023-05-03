package com.example.ejemplo;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;


@Stateless
@LocalBean
public class SessionBean {
	
        public String Ejemplo(String name) {
        	return "Hola "+ name + " tu nombre paso por EJB";
        }
}
