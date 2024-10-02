package modelos;

public class Bicicleta extends Vehiculo{

	private String tipoBicicleta;

	public Bicicleta() {
		super();
		tipoBicicleta = "";
	}

	public String getTipoBicicleta() {
		return tipoBicicleta;
	}

	public void setTipoBicicleta() {
		System.out.println("Ingrese el tipo de Bicicleta: ");
		 tipoBicicleta = leer.nextLine();
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bicicleta son:");
		builder.append("\n Tipo Bicicleta = ");
		builder.append(tipoBicicleta);
		builder.append("\n Numero Ruedas = ");
		builder.append(numeroRuedas);
		return builder.toString();
	}

	@Override
	public void encender() {
		System.out.println("las bicicletas no necesitan ser encendidas ");
	}
	
	@Override
	public void apagar() {
		System.out.println("las bicicleta no necesitan ser apagadas");
	}
	
	
}
