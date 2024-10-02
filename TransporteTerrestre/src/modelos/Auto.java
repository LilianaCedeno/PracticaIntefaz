package modelos;
import interfaces.InterfazVehículo;

public class Auto extends Vehiculo implements InterfazVehículo {

	private String color, modelo, tipoBencina;

	public Auto() {
		super();
		color = "";
		modelo = "";
		tipoBencina ="";
	}

	public String getColor() {
		return color;
	}

	public void setColor() {
		System.out.println("Ingrese el Color del Vehiculo: ");
        color = leer.nextLine();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo() {
		System.out.println("Ingrese el modelo del Vehiculo: ");
        modelo = leer.nextLine();
	}
	
	@Override
	public String tipoBencina()
	{	
		System.out.println("Ingresa el tipo de bencina ");
		tipoBencina = leer.nextLine();
		System.out.println("Gracias por preferirnos bencina de "+ tipoBencina + "  octanos, Cargada!");
		return tipoBencina;
		
		
	}
	
	@Override
	public void encender() {
		System.out.println("Recuerda encender tu auto para comenzar a conducir ");
	}
	
	@Override
	public void apagar() {
		System.out.println("Recuerda apagar tu auto al llegar al destino");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Auto son: ");
		builder.append("\n Color = ");
		builder.append(color);
		builder.append("\n modelo = ");
		builder.append(modelo);
		builder.append("\n numeroRuedas = ");
		builder.append(numeroRuedas);
		builder.append("\n cantidadVentana = ");
		builder.append(cantidadVentana);
		builder.append("\n tipo de Bencina = ");
		builder.append(tipoBencina);
		return builder.toString();
	}
		
	

		
}
