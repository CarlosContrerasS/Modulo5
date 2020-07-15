package com.proyecto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.proyecto.beans.Empleado;


public class EmpleadoDao {


	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int Agregar(Empleado e){    
	    String sql="insert into Empleado (RUT_EMPLEADO, NOMBREEMPLEADO, ESPECIALIDAD) values('"+e.getRutEmpleado()+"', '"+e.getNombreEmpleado()+"','"+e.getEspecialidad()+"')";
	    return template.update(sql);
	}	
	
	
	
	public List<Empleado> ListaEmpleados(){    
	    return template.query("select * from Empleado",new RowMapper<Empleado>(){    
	        public Empleado mapRow(ResultSet rs, int row) throws SQLException {    
	            Empleado e = new Empleado();    
	            e.setRutEmpleado(rs.getInt(1));  
	            e.setNombreEmpleado(rs.getString(2));    
	            e.setEspecialidad(rs.getString(3));
	            return e;
	        }    
	    });    
	}    	
	
	public int Eliminar(int Rut_Empleado){  
		System.out.println(Rut_Empleado);
		 String sql="delete from Empleado where rut_empleado="+Rut_Empleado+"";
		 System.out.println(sql);
	    return template.update(sql);
	}   
	
	public Empleado getEmpById(int Rut_Empleado){   
		
	    String sql="select * from Empleado where rut_empleado=?";
	    return template.queryForObject(sql, new Object[]{Rut_Empleado},new BeanPropertyRowMapper<Empleado>(Empleado.class));    
	}
	
	public int update(Empleado e){    
	    String sql="update Empleado set NOMBREEMPLEADO='"+e.getNombreEmpleado()+"', especialidad='"+e.getEspecialidad()+"' where rut_empleado='"+e.getRutEmpleado()+"'";
	    return template.update(sql);    
	}  

}
