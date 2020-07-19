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
	    String sql="insert into pagos (idpago, fechapago, fechavencimiento, montoregular, montoadicional, rut_id) values "
	    		+ "('"+p.getIDPago()+" ' , '" + p.getFechaPago()+ "', '"+p.getFechaVencimiento()+ "', ' "+p.getMontoRegular() + " ' , ' " 
	    		+p.getMontoAdicional()+ " ' , ' " +p.getRut_ID()+ " ' )";
	    return template.update(sql);
	}
	
	public List<Pagos> ListaPagos(){    
	    return template.query("select * from pagos",new RowMapper<Pagos>(){    
	        public Pagos mapRow(ResultSet rs, int row) throws SQLException {    
	            Pagos p=new Pagos();
	            p.setIDPago(rs.getInt(1));
	            p.setFechaPago(rs.getString(2));
	            p.setMontoRegular(rs.getInt(3));    
	            p.setMontoAdicional(rs.getInt(4));
	            p.setRut_ID(rs.getInt(5));
	            p.setFechaVencimiento(rs.getString(6));   
	            
	            return p;
   
	        }    
	    });    
	}
	
	
	
}	    
	