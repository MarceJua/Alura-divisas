import java.text.DecimalFormat;

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
			DecimalFormat divisasDecimal = new DecimalFormat();
			double monto = 0;
			//monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir"));
			//String valor = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");
			//System.out.println(monto);
			
			//try catch
			try {
				monto =Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir"));
			}
			catch (NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Error" );
				convertirDinero();
			}

			//opciones convertirDInero
			
			Object[] opciones = {"De Quetzal a Dólar",
					"De Quetzal a Euros",
					"De Quetzal a Libras Esterlinas",
					"De Quetzal a Yen Japonés",
					"De Quetzal a Won sul-coreano",
					"De Dólar a Quetzal",
					"De Euros a Quetzal ",
					"De Libras Esterlinas a Quetzal",
					"De Yen Japonés a Quetzal",
					"De Won sul-coreano a Quetzal"};
			
			String seleccion = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", 
					"Monedas",JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
			
			//Logica opciones de moneda
			if (seleccion.equals("De Quetzal a Dólar")) {
				double dólar = monto / 7.77;
				JOptionPane.showMessageDialog(null, 
						monto + " Quetzales son: " + divisasDecimal.format(dólar)+ " Dolares ");
			} else if (seleccion.equals("De Quetzal a Euros")) {
				double euros = monto / 8.28;
				JOptionPane.showMessageDialog(null, 
						monto + " Quetzales son: " + divisasDecimal.format(euros)+ " Euros ");
			} else if (seleccion.equals("De Quetzal a Libras Esterlinas")) {
				double libras = monto / 9.35;
				JOptionPane.showMessageDialog(null, 
						monto + " Quetzales son: " + divisasDecimal.format(libras)+ " Libras Esterlinas ");
			} else if (seleccion.equals("De Quetzal a Yen Japonés")) {
				double yen = monto / 17.38;
				JOptionPane.showMessageDialog(null, 
						monto + " Quetzales son: " + divisasDecimal.format(yen)+ " Yen Japonés ");
			} else if (seleccion.equals("De Quetzal a Won sul-coreano")) {
				double won = monto / 0.0059;
				JOptionPane.showMessageDialog(null, 
						monto + " Quetzales son: " + divisasDecimal.format(won)+ " Won sul-coreano ");
			   } else if (seleccion.equals("De Dólar a Quetzal")) {
				double dólarQ = monto / 0.13;
				JOptionPane.showMessageDialog(null, 
						monto + " Dolares son: " + divisasDecimal.format(dólarQ)+ " Quetzales ");
			} else if (seleccion.equals("De Euro a Quetzal")) {
				double eurosQ = monto / 0.12;
				JOptionPane.showMessageDialog(null, 
						monto + " Euros son: " + divisasDecimal.format(eurosQ)+ " Quetzales ");
			} else if (seleccion.equals("De Libras Esterlinas a Quetzal")) {
				double librasQ = monto / 0.11;
				JOptionPane.showMessageDialog(null, 
						monto + " Libras Esterlinas son: " + divisasDecimal.format(librasQ)+ " Quetzales ");
			} else if (seleccion.equals("De Yen Japonés a Quetzal")) {
				double yenQ = monto / 0.058;
				JOptionPane.showMessageDialog(null, 
						monto + " Yen Japonés son: " + divisasDecimal.format(yenQ)+ " Quetzales ");
			} else if (seleccion.equals("De Won sul-coreano a Quetzal")) {
				double wonQ = monto / 170.03;
				JOptionPane.showMessageDialog(null, 
						monto + " Won sul-coreanos son: " + divisasDecimal.format(wonQ)+ " Quetzales ");
			}
			
			deseaContinuar();
		}

		//Convertir Temperatura
		public static void convertirTemperatura() {
			double monto;
			monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir"));
			//String temp = JOptionPane.showInputDialog("Ingrese el valor a convertir");
			System.out.println(monto);
			
			Object[] opciones = {"Grados Celsius a Grados Farenheit",
					"Grados Celsius a Grados Kelvin",
					"Grados Farenheit a Grados Celsius",
					"Kelvin a Grados Celsius",
					"Kelvin a Grados Farenheit"};
			
			String seleccion = (String) JOptionPane.showInputDialog(null, "Elije el valor de la temperatura a la que deseas convertir", 
					"Temperatura",JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
			
			//logica conversion Temperatura
			
			
			//finalizar programa 
			deseaContinuar();
			
	}
		
		public static void deseaContinuar() {
			int response = JOptionPane.showConfirmDialog(null, 
					"¿Desea Continuar?", "Select an option", JOptionPane.YES_NO_CANCEL_OPTION);
			if(response == JOptionPane.YES_OPTION) {
				main(null);
			} else {
				JOptionPane.showMessageDialog(null, "Programa finalizado", "End", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		
		

}
