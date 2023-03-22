package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaAr {

	public static void main(String[] args) {
		
		int temperatura;
		ArCondicionado ar1 = new ArCondicionado();
		String modo, aux;
		
		try {
			
			aux = JOptionPane.showInputDialog("Digite a temperatura desejada: ");
			temperatura = Integer.parseInt(aux);
			
			modo = JOptionPane.showInputDialog("Digite o modo desejado: ");
			
			ar1.temperatura = temperatura;
			ar1.modo = modo;
			
			ar1.mostrar();
			
			ar1.aumentarTemperatura();
			
			
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto :p");
		}

	}

}
