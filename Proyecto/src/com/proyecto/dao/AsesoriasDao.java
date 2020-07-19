package com.proyecto.dao;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;

import com.proyecto.beans.Asesorias;

public class AsesoriasDao {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
																		
	public int AgregarAsesorias(Asesorias ase){    

	    String sql="insert into asesorias (IDAsesoria, Detalle, Gestion, Propuestas, Fecha, Pagada, Visitas_IDVisita )  values  (' "+ ase.getIDAsesoria()+"', '"+ ase.getDetalle() +"', '"+ ase.getGestion() + "','" + ase.getPropuestas() + "', '" + ase.getFecha()+ "',' " + ase.getPagada() + "', '" + ase.getVisitas_IDVisita() + "')";
	    return template.update(sql);
	}

	
	public Asesorias Buscar(int IDAsesoria){    
		 String sql="select * from asesorias where idAsesoria = "+IDAsesoria;
		    return template.queryForObject(sql, new Object[]{IDAsesoria},new BeanPropertyRowMapper<Asesorias>(Asesorias.class));    
	}
	
	public List<Asesorias> ListarAsesorias(){    
	    return template.query("select * from asesorias",new RowMapper<Asesorias>(){    
	        public Asesorias mapRow(ResultSet rs, int row) throws SQLException {    
	            Asesorias ase=new Asesorias();    
	            ase.setIDAsesoria(rs.getInt(1));    
	            ase.setDetalle(rs.getString(2));    
	            ase.setGestion(rs.getString(3));
	            ase.setPropuestas(rs.getString(4));
	            ase.setFecha(rs.getString(5));
	            ase.setPagada(rs.getString(6));
	            ase.setVisitas_IDVisita(rs.getInt(7));
	            return ase;
	        }    
	    });    
	
	}
}
	