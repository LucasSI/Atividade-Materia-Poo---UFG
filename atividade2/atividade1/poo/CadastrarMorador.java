package atividade1.poo;
import java.util.Scanner;

public class CadastrarMorador {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Morador morador = new Morador();
		
		System.out.println("Entre com o nome do morador");
		morador.nome = sc.nextLine();
		System.out.println("Entre com o cpf do morador");
		morador.cpf = sc.nextLine();
		System.out.println("Entre com o celular do morador");
		morador.celular = sc.nextLine();
		System.out.println("Entre com a data de nascimento do morador");
		morador.dataNasc = sc.nextLine();
		System.out.println("Entre com o sexo do morador");
		morador.sexo = sc.nextLine();
		System.out.println("Entre com o bloco do morador");
		morador.bloco = sc.nextLine();
		System.out.println("Entre com o apartamento do morador");
		morador.apartamento = sc.nextLine();
		System.out.println("Entre com o codigo de acesso do morador");
		morador.codigoAcesso = sc.nextLine();
		sc.close();
		System.out.println("O nome do morador é:" + morador.nome);
		System.out.println("O cpf do morador é:" + morador.cpf);
		System.out.println("O numero de celular do morador é:" + morador.celular);
		System.out.println("A data de nascimento do morador é:" + morador.dataNasc);
		System.out.println("O sexo do morador é:" + morador.sexo);
		System.out.println("O bloco do morador é:" + morador.bloco);
		System.out.println("O apartamento do morador é:" + morador.apartamento);
		System.out.println("O codigo de acesso do morador é:" + morador.codigoAcesso);
	}
	
}
