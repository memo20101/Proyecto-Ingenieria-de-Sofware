package modelo;

import java.util.Objects;

public class Vehiculo {
	/**
	 * @param
	 */
	  private String Placa;
	    private String Fecha;
	  
// Constructor de la Clase vehiculo
	    public Vehiculo( String Placa, String Fecha) {
	        this.Placa= Placa;
	        this.Fecha= Fecha;
	    }
                  // Obtiene el dato de la placa                  
	    public String getPlaca() {
	        return Placa;
	    }
	    // Envia  el dato de la placa  
	    public void setPlaca(String Placa) {
	        this.Placa = Placa;
	    }
	    // Obtiene el dato de la fecha     
	    public String getFecha() {
	        return Fecha;
	    }
	    // Envia  el dato de la fecha  
	    public void setFecha(String Fecha) {
	        this.Fecha = "21/10/2022";
	    }
	
		}
