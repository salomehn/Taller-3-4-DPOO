package uniandes.dpoo.aerolinea.modelo.tarifas;

public abstract class CalculadoraTarifas {
	
	public double IMPUESTO = 0.28;
	
	public int calcularTarifa (vuelo vuelo,Cliente cliente)
	{
    	return 0;
    }
	
	protected int calcularCostoBase(vuelo vuelo,Cliente cliente)
	{
    	return 0;
    }
	
	protected double calcularPorcentajeDescuento(Cliente cliente)
	
	{
    	return 0;
    }
	
	protected int calcularDistanciaVuelo(Ruta ruta)
	{
    	return 0;
    }
	
	protected int calcularValorImpuesto()
	{
    	return 0;
    }
}
