package com.proyecto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyecto.beans.Mejoras;

public class MejorasDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}

	
	
	public int Agregar(Mejoras mej){    
	    String sql="insert into mejoras (idmejora, fecha, motivo, actividades, estado, rut_id)  values ('"+mej.getIDMejora()+"', '"+mej.getFecha()+"','"+mej.getMotivo()+"','"+mej.getActividades()+"','"+ mej.getEstado()+"','"+mej.getRut_ID()+"')";
	    return template.update(sql);
	}
	
	
	public int Eliminar(int idmejora){    
	    String sql="delete from mejoras where idmejora="+idmejora;
	    return template.update(sql);
	}    

	
	
	public List<Mejoras> ListaMejoras(){    
	    return template.query("select * from mejoras",new RowMapper<Mejoras>(){    
	        public Mejoras mapRow(ResultSet rs, int row) throws SQLException {    
	            Mejoras mej = new Mejoras();
	            
	            mej.setIDMejora(rs.getInt(1));
	            mej.setFecha(rs.getString(2));
	            mej.setMotivo(rs.getString(3));
	            mej.setActividades(rs.getString(4));
	            mej.setEstado(rs.getString(5));
	            mej.setRut_ID(rs.getInt(6));
	            
	            return mej;
	        }    
	    });    
	}    	
	
	public Mejoras getEmpById(int idmejora){   
		
	    String sql="select * from mejoras where idmejora = ?";
	    return template.queryForObject(sql, new Object[]{idmejora}, new BeanPropertyRowMapper<Mejoras>(Mejoras.class));
	}
	
	public int update(Mejoras mej){ 
		String sql="update mejoras set fecha='"+mej.getFecha()+"', motivo= ' "+mej.getMotivo()+" ', actividades = ' " + mej.getActividades()+" ', estado = ' " + mej.getEstado() + "  where rut_id= '"+mej.getRut_ID() +" '";
	    return template.update(sql);     
	}  

}
