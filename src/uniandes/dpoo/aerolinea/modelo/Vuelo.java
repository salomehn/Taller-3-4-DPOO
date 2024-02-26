package uniandes.dpoo.aerolinea.modelo;

import java.util.List;
import java.util.Map;




public class Vuelo {
	
	 private List<Avion> avion;
	 private Map<String, Ruta> ruta;
	 private Collection <Tiquete> etiqueta; 
	 
	 private static String fecha;
	 
	 public Vuelo (Ruta ruta,String fecha,Avion avion)
	 {
		 
		 this.fecha = fecha;
	 }
	 
	 public static String getFecha()
	 
	 {
	    	return null;
	    }
	 
	 public static Avion getAvion ()
	 {
	    	return null;
	    }
	 public static Collection <Tiquete> getTiquetes()
	 {
	    	return null;
	    }
	 
	 public static int venderTiquetes (Cliente cliente,CalculadoraTarifas calculadora,int cantidad)
	 {
	    	return null;
	    }
	 public static boolean equals (Object obj)
	 {
	    	return null;
	    }
	 
}

