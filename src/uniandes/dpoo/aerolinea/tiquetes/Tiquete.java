package uniandes.dpoo.aerolinea.tiquetes;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	
	public Tiquete (String codigo,Vuelo vuelo,Cliente clienteComprador,int tarifa)
	{
		this.codigo = codigo;
		this.tarifa = tarifa;
    }
    
	public Cliente getCliente()
	{
    	return null;
    }
    
	public Vuelo getVuelo()
	{
    	return null;
    }
    
	public String getCodigo()
	{
    	return null;
    }
    
	public int getTarifa()
	{
    	return 0;
    }
	public void marcaComoUsado ()
	{
    	return ;
    }
    
	public boolean esUsado()
	{
    	return ;
    }
    
    
}
