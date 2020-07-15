package com.proyecto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyecto.beans.ReporteActividades;



public class ReporteDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public ReporteActividades Buscar(int rut){    
	    String sql= "select vis.rut_id as \"rut cliente\", vis.fecha as \"fecha visita\", vis.idvisita as \"id visita\" , cap.fecha as \"fecha capacitacion\", cap.numasistentes as \"N° asistentes capacitacion\", ase.fecha as \"fecha de asesorias\", ase.gestion as \"gestion realizada\"  from visitas vis inner join capacitaciones cap on ( vis.idvisita = cap.visitas_idvisita)  inner join asesorias ase on (vis.idvisita = ase.visitas_idvisita) order by vis.rut_id asc";
	    return template.queryForObject(sql, new Object[]{rut},new BeanPropertyRowMapper<ReporteActividades>(ReporteActividades.class));    
	}
	
	
	public List<ReporteActividades> ListaActividades(){    
	    return template.query("select vis.rut_id as \"rut cliente\", vis.fecha as \"fecha visita\", vis.idvisita as \"id visita\", cap.fecha as \"fecha capacitacion\", cap.numasistentes as \"N° asistentes capacitacion\", ase.fecha as \"fecha de asesorias\", ase.gestion as \"gestion realizada\"  from visitas vis inner join capacitaciones cap on ( vis.idvisita = cap.visitas_idvisita)  inner join asesorias ase on (vis.idvisita = ase.visitas_idvisita) order by vis.rut_id asc",new RowMapper<ReporteActividades>(){    
	        public ReporteActividades mapRow(ResultSet rs, int row) throws SQLException {    
	            ReporteActividades r=new ReporteActividades();    
	            r.setRut(rs.getInt(1));    
	            r.setFechaVisita(rs.getString(2));    
	            r.setIDVisitas(rs.getInt(3));
	            r.setFechaCapacitacion(rs.getString(4));
	            r.setNumAsistentes(rs.getInt(5));
	            r.setFechaAsesoria(rs.getString(6));
	            r.setGestion(rs.getString(7));
	            return r;
	        }
	    }); 
	}
	

}