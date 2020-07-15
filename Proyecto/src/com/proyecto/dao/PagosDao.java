package com.proyecto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyecto.beans.Pagos;

public class PagosDao {

	JdbcTemplate template;	
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int Agregar (Pagos p){    
	    String sql="insert into Pagos (fechapago, montoregular, montoadicional, rut_id) values ('"+p.getFechaPago()+"','"+p.getMontoRegular()+"','"+p.getMontoAdicional()+"','"+p.getRut_ID()+"')";
	    return template.update(sql);
	}
	
	public List<Pagos> ListaPagos(){    
	    return template.query("select * from Pagos",new RowMapper<Pagos>(){    
	        public Pagos mapRow(ResultSet rs, int row) throws SQLException {    
	            Pagos p=new Pagos();
	            p.setIDPago(rs.getInt(1));
	            p.setFechaPago(rs.getString(2));    
	            p.setMontoRegular(rs.getInt(3));    
	            p.setMontoAdicional(rs.getInt(4));
	            p.setRut_ID(rs.getInt(5));
	            
	            return p;
   
	        }    
	    });    
	}

	public void Agregar() {
		// TODO Auto-generated method stub
		
	}    	     
	    
	
	
	
}	    
	