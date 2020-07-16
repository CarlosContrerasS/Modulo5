package com.proyecto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyecto.beans.Visitas;

public class VisitasDao {

		JdbcTemplate template;

		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}
	
	public int AgregarVisita(Visitas v){    
	    String sql="insert into Visitas (idvisita, direccion, ciudad, fecha, resumen, observaciones, rut_id, empleado_rutempleado) values   ( 'null' , ' "+v.getDireccion()+"','"+v.getCiudad()+"','"+v.getResumen()+"','"+v.getObservaciones()+"','"+v.getRut_Id()+"','"+v.getEmpleado_RutEmpleado()+"')";
	    return template.update(sql);
	    }
	
	public List<Visitas> ListarVisitas(){    
	    return template.query("select * from Visitas",new RowMapper<Visitas>(){    
	        public Visitas mapRow(ResultSet rs, int row) throws SQLException {    
	            Visitas v = new Visitas();    
	            v.setIDVisita(rs.getInt(1)); 
	            v.setDireccion(rs.getString(2));
	            v.setCiudad(rs.getString(3));
	            v.setFecha(rs.getString(4));
	            v.setResumen(rs.getNString(5));
	            v.setObservaciones(rs.getString(6));
	            v.setRut_Id(rs.getInt(7));
	            v.setEmpleado_RutEmpleado(rs.getInt(8));
	            return v;
	        }    
	    });    
	}    	
}