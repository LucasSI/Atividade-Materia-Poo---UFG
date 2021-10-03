package Atividade3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Predio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> Predio = new ArrayList<Object>();
		int outroapartamento = 1;
		do{
			Apartamentos apartamentos = new Apartamentos();
			Predio.add(apartamentos);
			outroapartamento = Integer.parseInt(JOptionPane.showInputDialog("Para cadastrar outro apartamento digite 1, para finalizar digite 2"));
		}while(outroapartamento == 1);
		
		for(Object apartamento : Predio){
			JOptionPane.showMessageDialog(null,apartamento);
		}
		
	}
	
}
