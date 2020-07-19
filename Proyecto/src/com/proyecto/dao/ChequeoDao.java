package com.proyecto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyecto.beans.Chequeo;

public class ChequeoDao {

		JdbcTemplate template;

		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}
		
		
		public int Agregar(Chequeo ch){    
		    String sql="insert into chequeo (idchequeo, detalle, estado, visitas_idvisita) values ('"+ch.getIDChequeo()+"', '"+ch.getDetalle()+"','"+ch.getEstado()+"','"+ch.getVisitas_IDVisita()+"')";
		    return template.update(sql);
		}
		
		
		public int Eliminar(int idchequeo){    
		    String sql="delete from chequeo where idchequeo="+idchequeo;
		    return template.update(sql);
		}    

		
		
		public List<Chequeo> ListaChequeo(){    
		    return template.query("select * from chequeo",new RowMapper<Chequeo>(){    
		        public Chequeo mapRow(ResultSet rs, int row) throws SQLException {    
		            Chequeo ch=new Chequeo();    
		            ch.setIDChequeo(rs.getInt(1));    
		            ch.setDetalle(rs.getString(2));    
		            ch.setEstado(rs.getString(3));
		            ch.setVisitas_IDVisita(rs.getInt(4));
		            
		            return ch;
		        }    
		    });    
		}    	
		
		public Chequeo getEmpById(int idchequeo){   
			
		    String sql="select * from Chequeo where idchequeo = ?";
		    return template.queryForObject(sql, new Object[]{idchequeo}, new BeanPropertyRowMapper<Chequeo>(Chequeo.class));
		}
		
		public int update(Chequeo ch){ 
			String sql="update Chequeo set detalle='"+ch.getDetalle()+"', estado= ' "+ch.getEstado()+" ' where visitas_idvisita = ' "+ch.getVisitas_IDVisita()+" '";
		    return template.update(sql);     
		}  
}

