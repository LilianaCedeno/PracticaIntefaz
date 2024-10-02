package modelos;
import java.util.*;

public abstract class Vehiculo  {
	Scanner leer;
	protected Integer numeroRuedas, cantidadVentana;

	public Vehiculo() {
		super();
		leer = new Scanner(System.in);
		numeroRuedas = 0;
		cantidadVentana = 0;
	}

	public Integer getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas() {
		System.out.println("Ingrese la cantidad de Ruedas que tiene el Vehiculo: ");
        numeroRuedas = leer.nextInt();
        leer.nextLine();
        }

	public Integer getCantidadVentana() {
		return cantidadVentana;
	}

	public void setCantidadVentana() {
		System.out.println("Ingrese la cantidad de Ventanas que tiene el Vehiculo: ");
        cantidadVentana = leer.nextInt();
        leer.nextLine();
	}
		
	public abstract void encender();
	public abstract void apagar();
}
