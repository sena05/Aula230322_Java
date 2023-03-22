package br.com.fiap;

import javax.swing.JOptionPane;

public class ArCondicionado {

	// atributos
	public int temperatura;
	public String modo;

	// metodos
	public void aumentarTemperatura() {

		this.temperatura++;
	}
	
	public void diminuirTemperatura() {
		
		this.temperatura--;
	}

	public void trocarModo(String modo) {
		
		this.modo = modo;
	}
	
	public void mostrar() {
		JOptionPane.showMessageDialog(null, "Temperatura atual: " + temperatura + "\nModo atual: " + modo);
	}
	
	public void mostrar2() {
		
		System.out.println("Temperatura atual: " + temperatura + "\nModo atual: " + modo);
		
	}
}
