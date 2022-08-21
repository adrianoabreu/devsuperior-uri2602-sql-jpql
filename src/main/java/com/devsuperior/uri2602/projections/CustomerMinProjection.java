package com.devsuperior.uri2602.projections;

//As Interfaces Projections definem as consultas customizadas de bancos de dados, ou seja, que retornam campos específicos.
public interface CustomerMinProjection {

	String getName();
	
	// O metodo acima representa a consulta SQL: SELECT name FROM customers;
	
}
