package Atividade2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TesteRobo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> Robos = new ArrayList<Object>();
		int quantidadeRobos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de robos"));
		int i = 1;
		int qualrobo = 1;
		int comando = 0;
		do{
			int limitedepo = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite de pó do robo:" + i));
			robos robos = new robos(limitedepo);
			robos.setIdentificacao(i);
			Robos.add(robos);
			i++;
		}while(i <= quantidadeRobos);
		do {
			qualrobo = Integer.parseInt(JOptionPane.showInputDialog("Escolha o robo até: " + quantidadeRobos));
			if(qualrobo <= quantidadeRobos){
				comando = Integer.parseInt(JOptionPane.showInputDialog("Comande o robo: " + qualrobo + " Digite 1 para ligar, 2 para andar, 3 para aspirar, 4 para parar, 5 para desligar ou 6 para sair"));
			}else {
				JOptionPane.showMessageDialog(null, "Escolha um robo até : "+ quantidadeRobos);
				break;
			}
			Object robodavez = Robos.get(qualrobo - 1);
			if (comando == 1) {
				((robos) robodavez).ligar();
			}else if (comando == 5) {
					((robos) robodavez).desligar();
			}else if (comando == 2) {
				int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o x:"));
				int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o y"));
						((robos) robodavez).andar(x,y);
			}else if (comando == 3) {
				int po = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pó a aspirar:"));
				((robos) robodavez).aspirar(po);
			}else if (comando == 4) {
				((robos) robodavez).parar();
			}else if (comando > 6 || comando < 1){
				JOptionPane.showMessageDialog(null, "Escolha outro comando");
			}
		}while(comando != 6);
		JOptionPane.showMessageDialog(null, "Voce terminou");
	}
}

