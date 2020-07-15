package com.proyecto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyecto.beans.Atrasos;

public class AtrasosDao {
	
	
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	
	public List<Atrasos> ListaAtrasos(){    
	    return template.query("SELECT Cliente.RUT, Cliente.nombre, Pagos.IDPago, Pagos.fechapago , pagos.montoregular , pagos.montoadicional from Cliente inner join Pagos on (Pagos.RUT_ID = Cliente.RUT) where TO_DATE(Pagos.fechapago, 'dd/mm/yyyy') <= TRUNC(sysdate)",new RowMapper<Atrasos>(){    
	        public Atrasos mapRow(ResultSet rs, int row) throws SQLException {    
	        	Atrasos a=new Atrasos();    
	            a.setRut(rs.getInt(1));    
	            a.setNombre(rs.getString(2));    
	            a.setIDPago(rs.getInt(3));
	            a.setFechaPago(rs.getString(4));
	            a.setMontoRegular(rs.getInt(5));
	            a.setMontoAdicional(rs.getInt(6));
	            return a;
	        }
	    }); 
	}

}
