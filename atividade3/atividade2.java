package Atividade2;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class atividade2 {
	public static void main(String[] args) {
		ArrayList<Object> Moradores = new ArrayList<Object>();
		int outromorador = 1;
		do{
			morador morador = new morador();
			morador.setNome(JOptionPane.showInputDialog("Entre com o nome do morador"));
			morador.setCpf(JOptionPane.showInputDialog("Entre com o cpf do morador")); 
			morador.setCelular(JOptionPane.showInputDialog("Entre com o celular do morador")); 
			morador.setDataNasc(JOptionPane.showInputDialog("Entre com a data de nascimento do morador")); 
			morador.setSexo(JOptionPane.showInputDialog("Entre com o sexo do morador")); 
			morador.setBloco(JOptionPane.showInputDialog("Entre com o bloco do morador"));
			morador.setApartamento(JOptionPane.showInputDialog("Entre com o apartamento do morador"));
			morador.setCodigoAcesso(JOptionPane.showInputDialog("Entre com o codigo de acesso do morador"));
			Moradores.add(morador);
			outromorador = Integer.parseInt(JOptionPane.showInputDialog("Para cadastrar outro morador, digite 1, para finalizar digite 2"));
		}while(outromorador == 1);
		int i = 0;
		for(Object morador : Moradores){
			Atividade2.morador.setCodigo_sequencial(i);
			JOptionPane.showMessageDialog(null,"Nome: " + ((Atividade2.morador) morador).getNome() + "\n" + "CPF: " + ((Atividade2.morador) morador).getCpf() + "\n" + "Celular: " +  ((Atividade2.morador) morador).getCelular() + "\n" + "Data de Nascimento: " +  ((Atividade2.morador) morador).getDataNasc() + "\n" + "Sexo: " +  ((Atividade2.morador) morador).getSexo() + "\n" + "Bloco: " +  ((Atividade2.morador) morador).getBloco() + "\n" + "Apartamento: " +  ((Atividade2.morador) morador).getApartamento() + "\n" + "Codigo de acesso: " +  ((Atividade2.morador) morador).getCodigoAcesso() + "\n" + "CODIGO SEQUENCIAL: " +  Atividade2.morador.getCodigo_sequencial() + "\n");
			i++;
		}
	}
}
