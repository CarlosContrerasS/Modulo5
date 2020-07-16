package com.proyecto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyecto.beans.ReporteGlobal;



public class ReporteGlobalDao {


		JdbcTemplate template;

		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}
		

		
		
		public List<ReporteGlobal> ListaGlobal(){   
			
			//String sql= "SELECT cli.rut , cli.nombre , vis.Fecha , vis.IDVisita , cap.Fecha , cap.NumAsistentes , ase.Fecha , ase.Gestion , pag.IDPago , pag.FechaPago , pag.MontoRegular , pag.MontoAdicional , sum(acc.dias_perdidos) /sum(acc.NUM_TRAB) as 'accidentabilidad' from cliente 'cli' inner join accidentes 'acc' on (cli.rut = acc.rut_id) inner join visitas 'vis' on ( cli.rut = vis.rut_id) inner join pagos 'pag' on (cli.rut =pag.rut_id) inner join capacitaciones 'cap' on (cap.visitas_idvisita = vis.IDvisita) inner join asesorias 'ase' on (ase.visitas_idvisita = vis.IDvisita) group by cli.rut , cli.nombre , vis.Fecha , vis.IDVisita , cap.Fecha , cap.NumAsistentes , ase.Fecha , ase.Gestion , pag.IDPago , pag.FechaPago , pag.MontoRegular , pag.MontoAdicional";
		    
			String sql = "SELECT cli.rut , cli.nombre , vis.Fecha , vis.IDVisita , cap.Fecha , cap.NumAsistentes , ase.Fecha , ase.Gestion , pag.IDPago , pag.FechaPago , pag.MontoRegular , pag.MontoAdicional  from cliente 'cli' inner join accidentes 'acc' on (cli.rut = acc.rut_id) inner join visitas 'vis' on ( cli.rut = vis.rut_id) inner join pagos 'pag' on (cli.rut =pag.rut_id) inner join capacitaciones 'cap' on (cap.visitas_idvisita = vis.IDvisita) inner join asesorias 'ase' on (ase.visitas_idvisita = vis.IDvisita)";
					
			return template.query(sql, new RowMapper<ReporteGlobal>(){    
		        public ReporteGlobal mapRow(ResultSet rs, int row) throws SQLException {    
		            ReporteGlobal rg = new ReporteGlobal();    
		           
		            rg.setRut(rs.getInt(1));
		            rg.setNombre(rs.getString(2));
		            rg.setIDPago(rs.getInt(3));
		            rg.setFechaPago(rs.getInt(4));
		            rg.setMontoRegular(rs.getInt(5));
		            rg.setMontoAdicional(rs.getInt(6));
		            rg.setAccidentabilidad(rs.getFloat(7));
		            rg.setFechaVisita(rs.getString(8));
		            rg.setIDVisitas(rs.getInt(9));
		            rg.setFechaCapacitacion(rs.getString(10));
		            rg.setNumAsistentes(rs.getInt(11));
		            rg.setFechaAsesorias(rs.getString(12));
		            rg.setGestion(rs.getString(13));
		            
		            return rg;
		        	

		        }
		    }); 
		}
		

	}