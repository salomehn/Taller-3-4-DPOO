package uniandes.dpoo.aerolinea.modelo.cliente;

public abstract class Cliente {
	
	public Cliente ()
	{
    }
	
	public String getTipoCliente()
	
	{
    	return null;
    }
	
	public String getIdentificador ()
	{
    	return null;
    }
	
	public void agregarTiquete(Tiquete tiquete)
	{
    	return ;
    	
    }
	
	public int calcularValorTotalTiquetes()
	{
    	return 0;
    }
	
	public void usarTiquetes (Vuelo vuelo)
	{
    	return ;
    }
}
