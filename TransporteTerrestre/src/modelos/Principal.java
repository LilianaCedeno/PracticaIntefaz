package modelos;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		ArrayList<Auto> auto = new ArrayList<Auto>();
		ArrayList<Bicicleta> bici = new ArrayList<Bicicleta>();
		
		int op =0;
		
		do {
			
			 System.out.println("------------ MENÚ  -----------------");
	            System.out.println("1) Ingresar Auto");
	            System.out.println("2) Ingresar Bicicleta.");
	            System.out.println("3) Mostrar Datos.");
	            System.out.println("4) Salir.");
	            System.out.println("---------DIGITE SU OPCIÓN: ");
	            op = leer.nextInt();
	            leer.nextLine();
	            
	            
	            
	            switch (op) {
	            case 1:
	            	Auto a = new Auto();
	            	
	            	a.setModelo();
	            	a.setColor();
	            	a.setCantidadVentana();
	            	a.setNumeroRuedas();
	            	a.tipoBencina();
	
	            	auto.add(a);
	            	
	            	break;
	            case 2:
	            	Bicicleta b = new Bicicleta();
	            	
	            	b.setTipoBicicleta();
	            	b.setNumeroRuedas();
	            	
	            	bici.add(b);
	            	break;
	            case 3:
	            	
	            	for (Auto aux : auto) {
	                	System.out.println("-------------------------------------------");
	                	System.out.println("Los Datos de los " + aux.toString());
                	}
	            	for (Bicicleta aux : bici) {
	                	System.out.println("-------------------------------------------");
	                	System.out.println("Los Datos de las  " + aux.toString());
                	}
	            	break;
	            case 4:
	            	 System.out.println("HASTA LUEGO, SALIENDO DEL MENÚ.");
	            	break;
	            default:
                    System.out.println("Opción invalida.");
                    Principal.main(args);
                break;
	            }
	    }while (op !=4);
		
		leer.close();
	}

}
