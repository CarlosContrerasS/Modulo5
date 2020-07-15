package com.proyecto.dao;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;

import com.proyecto.beans.Cliente;


public class ClienteDao {
	
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int Agregar(Cliente c){    
	    String sql="insert into Cliente (rut, nombre, telefono, mail, rubro, direccion) values('"+c.getRut()+"', '"+c.getNombre()+"','"+c.getTelefono()+"','"+c.getMail()+"','"+c.getRubro()+"','"+c.getDireccion()+"')";
	    return template.update(sql);
	}
	
	public int Editar(Cliente c){    
	    String sql="update Cliente set nombre='"+c.getNombre()+"', telefono="+c.getTelefono()+",correoelectronico='"+c.getMail()+"', rubro='"+c.getRubro()+"', direccion='"+c.getDireccion()+"' where rut="+c.getRut()+"";
	    return template.update(sql);    
	}   
	
	public int Eliminar(int rut){    
	    String sql="delete from Cliente where rut="+rut;
	    return template.update(sql);
	}    

	public Cliente Buscar(int rut){    
	    String sql="select * from Cliente where rut = "+rut;
	    return template.queryForObject(sql, new Object[]{rut},new BeanPropertyRowMapper<Cliente>(Cliente.class));    
	}
	
	
	public List<Cliente> ListaClientes(){    
	    return template.query("select * from Cliente",new RowMapper<Cliente>(){    
	        public Cliente mapRow(ResultSet rs, int row) throws SQLException {    
	            Cliente c=new Cliente();    
	            c.setRut(rs.getInt(1));    
	            c.setNombre(rs.getString(2));    
	            c.setTelefono(rs.getInt(3));
	            c.setMail(rs.getString(4));
	            c.setRubro(rs.getString(5));
	            c.setDireccion(rs.getString(6));
	            return c;
	        }    
	    });    
	}    	
	
	
}