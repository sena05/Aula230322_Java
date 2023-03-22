package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaTelevisor {

	public static void main(String[] args) {
		int volume, canal;
		Televisor tv1 = new Televisor();
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite o nível do volume");
			
			volume =  Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o canal desejado");
			canal = Integer.parseInt(aux);
			
			tv1.volume =  volume;
			tv1.canal =  canal;
			tv1.mostrar();
			tv1.aumentarVolume(4);
			tv1.mostrar();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto");
		}

	}

}
