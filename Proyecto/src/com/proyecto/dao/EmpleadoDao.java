package com.proyecto.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpleadoDao {


	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}

}
