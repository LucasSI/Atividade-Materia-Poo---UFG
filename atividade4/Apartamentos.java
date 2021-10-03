package Atividade3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Apartamentos {
	private int numero;
	private int andar;
	private int metragem;
	private String situacao;
	private ArrayList<Object> Morador = new ArrayList<Object>();

	public Apartamentos(){
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do apartamento")));
		setAndar(Integer.parseInt(JOptionPane.showInputDialog("Digite o andar do apartamento")));
		setMetragem(Integer.parseInt(JOptionPane.showInputDialog("Digite a metragem do apartamento")));
		setSituacao(JOptionPane.showInputDialog("Digite a situação do apartamento"));
		int outromorador = 0;
		int i = 1;
		outromorador = Integer.parseInt(JOptionPane.showInputDialog("Para cadastrar 1 morador, digite 1, para finalizar digite 2"));
		do{
			if(outromorador == 1) {
				Morador morador = new Morador();
				morador.setNome(JOptionPane.showInputDialog("Entre com o nome do morador"));
				morador.setCpf(JOptionPane.showInputDialog("Entre com o cpf do morador")); 
				morador.setCelular(Integer.parseInt(JOptionPane.showInputDialog("Entre com o celular do morador"))); 
				morador.setDataNasc(Integer.parseInt(JOptionPane.showInputDialog("Entre com o dia do nascimento do morador")),Integer.parseInt(JOptionPane.showInputDialog("Entre com o mes do nascimento do morador")),Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano do nascimento do morador"))); 
				morador.setSexo(JOptionPane.showInputDialog("Entre com o sexo do morador")); 
				morador.setBloco(JOptionPane.showInputDialog("Entre com o bloco do morador"));
				morador.setApartamento(Integer.parseInt(JOptionPane.showInputDialog("Entre com o apartamento do morador")));
				morador.setCodigoAcesso(Integer.parseInt(JOptionPane.showInputDialog("Entre com o codigo de acesso do morador")));
				Atividade3.Morador.setCodigo_sequencial(i);
				i++;
				getMorador().add(morador);
				outromorador = Integer.parseInt(JOptionPane.showInputDialog("Para cadastrar outro morador, digite 1, para finalizar digite 2"));
			}else if(outromorador != 1 && outromorador != 2) {
				outromorador = Integer.parseInt(JOptionPane.showInputDialog("Para cadastrar outro morador, digite 1, para finalizar digite 2"));
			}
			
		}while(outromorador == 1);
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public int getMetragem() {
		return metragem;
	}
	public void setMetragem(int metragem) {
		this.metragem = metragem;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public ArrayList<Object> getMorador() {
		return Morador;
	}
	public void setMorador(ArrayList<Object> morador) {
		Morador = morador;
	}
	
	@Override
	public String toString() {
		return "Apartamentos [numero=" + numero + ", andar=" + andar + ", metragem=" + metragem + ", situacao="
				+ situacao + ", morador" + getMorador() + "]";
	}


	


}
