package com.proyecto.dao;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;

import com.proyecto.beans.Accidentes;

public class AccidentesDao {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int AgregarAccidenteM(Accidentes acc){    
	    String sql="insert into Accidentes (IdAccidente, Fecha, Hora, Suceso, Lugar, Rut_Id, "
	    		+ "Dias_Perdidos, Num_Trab ) values( 'null' , ' "+acc.getIdAccidente()+"', '"+ acc.getFecha() +"', '"+acc.getHora()+"','"+acc.getSuceso()+"', '"+acc.getLugar()+"', '"+acc.getRut_Id()+"', '"+acc.getDias_Perdidos()+"', '"+acc.getNum_Trab()+"')";
	    return template.update(sql);
	}

	
	public Accidentes Buscar(int IdAccidente){    
		 String sql="select * from Accidentes where IdAccidente = "+IdAccidente;
		    return template.queryForObject(sql, new Object[]{IdAccidente},new BeanPropertyRowMapper<Accidentes>(Accidentes.class));    
	}
	
	public List<Accidentes> ListarAccidenteM(){    
	    return template.query("select * from Accidentes",new RowMapper<Accidentes>(){    
	        public Accidentes mapRow(ResultSet rs, int row) throws SQLException {    
	            Accidentes acc=new Accidentes();    
	            acc.setIdAccidente(rs.getInt(1));    
	            acc.setFecha(rs.getString(2));    
	            acc.setHora(rs.getString(3));
	            acc.setSuceso(rs.getString(4));
	            acc.setLugar(rs.getString(5));
	            acc.setRut_Id(rs.getInt(6));
	            acc.setDias_Perdidos(rs.getInt(7));
	            acc.setNum_Trab(rs.getInt(8));
	            return acc;
	        }    
	    });    
	
	}
}
	
