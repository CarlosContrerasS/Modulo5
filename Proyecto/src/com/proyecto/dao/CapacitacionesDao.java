package com.proyecto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyecto.beans.Capacitaciones;

public class CapacitacionesDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}

	
	public int Agregar(Capacitaciones cap){    
	    String sql="insert into capacitaciones (idcapacitacion, fecha, hora, numasistentes, visitas_idvisita) values ('"+cap.getIDCapacitacion()+"', '"
	+cap.getFecha()+"','"+cap.getHora()+"','"+cap.getNumAsistentes()+"','"+ cap.getVisitas_IDVisita()+" ' )";
	    return template.update(sql);
	}
	
	
	public int Eliminar(int idcapacitacion){    
	    String sql="delete from capacitaciones where idcapacitacion="+idcapacitacion;
	    return template.update(sql);
	}    

	
	
	public List<Capacitaciones> ListaCapacitaciones(){    
	    return template.query("select * from capacitaciones",new RowMapper<Capacitaciones>(){    
	        public Capacitaciones mapRow(ResultSet rs, int row) throws SQLException {    
	            Capacitaciones cap = new Capacitaciones();  
	            cap.setIDCapacitacion(rs.getInt(1));
	            cap.setFecha(rs.getString(2));
	            cap.setHora(rs.getString(3));
	            cap.setNumAsistentes(rs.getInt(4));
	            cap.setVisitas_IDVisita(rs.getInt(5));
	            
	            return cap;
	        }    
	    });    
	}    	
	
	public Capacitaciones getEmpById(int idcapacitacion){   
		
	    String sql="select * from capacitaciones where idcapacitacion = ?";
	    return template.queryForObject(sql, new Object[]{idcapacitacion}, new BeanPropertyRowMapper<Capacitaciones>(Capacitaciones.class));
	}
	
	public int update(Capacitaciones cap){ 
		String sql="update capacitaciones set fecha='"+cap.getFecha()+"', hora= ' "+cap.getHora()+" ', numasistentes = ' " + cap.getNumAsistentes()+" ' where visitas_idvisita='"+cap.getVisitas_IDVisita()+ " '";
	    return template.update(sql);     
	}  

}
