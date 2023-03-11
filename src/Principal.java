import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		//Menu Principal
		Object[] opciones = { "Conversor de monedas", "Conversor de temperatura"};
		String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione", "menu",
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		if (seleccion == "Conversor de monedas") {
			convertirDinero();
		}else {
			convertirTemperatura();
		}
		
	}
		
		
		//Convertir Dinero
		
		public static void convertirDinero() {
			String valor = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");
			System.out.println(valor);
			opcionesDeMoneda();
	}
		
		private static void opcionesDeMoneda() {
			
			Object[] opciones = {"De Quetzales a Dolares", "De Dolares a Quetzales"};
			String seleccion = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", 
					"Monedas",JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		}

		//Convertir Temperatura
		public static void convertirTemperatura() {
			String temp = JOptionPane.showInputDialog("Ingrese el valor a convertir");
			System.out.println(temp);
	}
		

}
