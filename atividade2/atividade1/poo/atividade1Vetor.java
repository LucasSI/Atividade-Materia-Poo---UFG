package atividade1.poo;

import javax.swing.JOptionPane;

public class atividade1Vetor {
	public static void main(String[] args) {
		Morador[] morador = new Morador[1001];
		int outromorador = 1;
		int i = 0;
		do{
			morador[i] = new Morador();
			morador[i].nome = JOptionPane.showInputDialog("Entre com o nome do morador");
			morador[i].cpf = JOptionPane.showInputDialog("Entre com o cpf do morador");
			morador[i].celular = JOptionPane.showInputDialog("Entre com o celular do morador");
			morador[i].dataNasc = JOptionPane.showInputDialog("Entre com a data de nascimento do morador");
			morador[i].sexo = JOptionPane.showInputDialog("Entre com o sexo do morador");
			morador[i].bloco = JOptionPane.showInputDialog("Entre com o bloco do morador");
			morador[i].apartamento = JOptionPane.showInputDialog("Entre com o apartamento do morador");
			morador[i].codigoAcesso = JOptionPane.showInputDialog("Entre com o codigo de acesso do morador");
			outromorador = Integer.parseInt(JOptionPane.showInputDialog("Para cadastrar outro morador, digite 1, para finalizar digite 2"));
			i++;
		}while(outromorador == 1);
		for(int j=0;j<i;j++) {
			JOptionPane.showMessageDialog(null,morador[j].nome + "\n" + morador[j].cpf + "\n" + morador[j].celular + "\n" + morador[j].dataNasc + "\n" + morador[j].sexo + "\n" + morador[j].bloco + "\n" + morador[j].apartamento + "\n" + morador[j].codigoAcesso + "\n");
		}
	}

}
