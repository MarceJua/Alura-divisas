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
			double monto;
			monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir"));
			//String valor = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");
			System.out.println(monto);
			opcionesDeMoneda();
	}
		
		private static void opcionesDeMoneda() {
			
			Object[] opciones = {"De Quetzal a Dólar",
					"De Quetzal a Euros",
					"De Quetzal a Libras Esterlinas",
					"De Quetzal a Yen Japonés",
					"De Quetzal a Won sul-coreano",
					"De Dólar a Quetzal",
					"De Euros a Quetzal ",
					"De Libras Esterlinas a Quetzal",
					"De Yen Japonés a Quetzal"};
			
			String seleccion = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", 
					"Monedas",JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		}

		//Convertir Temperatura
		public static void convertirTemperatura() {
			double monto;
			monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir"));
			//String temp = JOptionPane.showInputDialog("Ingrese el valor a convertir");
			System.out.println(monto);
	}
		

}
