package uniandes.dpoo.taller0.modificacion;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
	System.out.println("Hola, mundo!");
	CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
	System.out.println("\n" + "País con más medallistas" + "\n");
	Map<String, Integer> paises = calc.paisConMasMedallistas();
	for (String nombre : paises.keySet())
		{
		System.out.println(nombre + " ha tenido " + paises.get(nombre) + " medallistas");
		}

	}
}