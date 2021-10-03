package Atividade2;

import javax.swing.JOptionPane;

public class robos {
	private int identificacao = 0;
	private String status;
	private int posicaoX;
	private int posicaoY;
	private int quantidadePo;
	private int limitePo;
	
	public robos(int quantidadePo) {
		this.setStatus("desligado");
		this.setPosicaoX(0);
		this.setPosicaoY(0);
		this.setQuantidadePo(0);
		this.setLimitePo(quantidadePo);
	}
	
	public int getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPosicaoX() {
		return posicaoX;
	}
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	public int getPosicaoY() {
		return posicaoY;
	}
	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	public int getQuantidadePo() {
		return quantidadePo;
	}
	public void setQuantidadePo(int quantidadePo) {
		this.quantidadePo = quantidadePo;
	}
	public int getLimitePo() {
		return limitePo;
	}
	public void setLimitePo(int limitePo) {
		this.limitePo = limitePo;
	}
	
	
	public void ligar() {
		if(this.status == "desligado") {
			this.setStatus("ligado");
			JOptionPane.showMessageDialog(null,"Robo ligou");
		}else {
			JOptionPane.showMessageDialog(null,"Robo ja está ligado");
		}
	}
	public void desligar() {
		if(this.status == "desligado") {
			JOptionPane.showMessageDialog(null,"Robo ja está desligado");
		}else {
			this.setStatus("desligado");
			JOptionPane.showMessageDialog(null,"Robo desligou");
		}
	}
	public void andar(int x, int y) {
		if(this.status == "desligado") {
			JOptionPane.showMessageDialog(null,"Primeiro ligue o robo");
		}else {
			int posicaox = this.getPosicaoX();
			int posicaoy = this.getPosicaoY();
			this.setPosicaoX( posicaox + x);
			this.setPosicaoY( posicaoy + y);
			this.setStatus("andando");
			JOptionPane.showMessageDialog(null,"Andando até: X: " + this.getPosicaoX() + " Y: " + this.getPosicaoY());
		}
	}
	public void parar() {
		if(this.status == "desligado") {
			JOptionPane.showMessageDialog(null,"Primeiro ligue o robo");
		}else {
			this.setStatus("parado");
			JOptionPane.showMessageDialog(null,"Robo parou");
		}
	}
	public void aspirar(int Po) {
		if(this.status == "desligado") {
			JOptionPane.showMessageDialog(null,"Primeiro ligue o robo");
		}else {
			if(quantidadePo + Po <= limitePo) {
				this.setQuantidadePo(quantidadePo + Po);
				JOptionPane.showMessageDialog(null,"Aspirando: " + this.getQuantidadePo());
			}else {
				JOptionPane.showMessageDialog(null,"Pó excede o limite de: " + this.limitePo);
				this.setStatus("desligado");
				JOptionPane.showMessageDialog(null,"Robo foi desligado");
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "identificacao :" + getIdentificacao() + "\n" + "Status :" + getStatus() + "\n" + "PosicaoX :" + getPosicaoX() + "\n" + "PosicaoY :" + getPosicaoY() + "\n" + "Quantidade de pó :" + getQuantidadePo() + "\n" + "Limite de pó :" + getLimitePo() + "\n";
	}
	
}
