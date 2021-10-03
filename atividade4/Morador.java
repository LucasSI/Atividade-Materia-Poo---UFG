package Atividade3;

public class Morador {

		private String nome;
		private String cpf;
		private int celular;
		private String dataNasc;
		private String sexo;
		private String bloco;
		private int apartamento;
		private int codigoAcesso;
		static int codigo_sequencial = 0;
		
		
		
		public static int getCodigo_sequencial() {
			return codigo_sequencial;
		}
		public static void setCodigo_sequencial(int codigo_sequencial) {
			Morador.codigo_sequencial = codigo_sequencial;
		}
		public String getNome() {
			return this.nome;
		}
		public String getCpf() {
			return this.cpf;
		}
		public int getCelular() {
			return this.celular;
		}
		public String getDataNasc() {
			return this.dataNasc;
		}
		public String getSexo() {
			return this.sexo;
		}
		public String getBloco() {
			return this.bloco;
		}
		public int getApartamento() {
			return this.apartamento;
		}
		public int getCodigoAcesso() {
			return this.codigoAcesso;
		}

		public void setNome(String nome){
			this.nome = nome;
		}
		public void setCpf(String cpf){
			this.cpf = cpf;
		}
		public void setCelular(int celular){
			this.celular = celular;
		}
		public void setDataNasc(int dia,int mes,int ano){
			this.dataNasc = dia + "/" + mes + "/" + ano;
		}
		public void setSexo(String sexo){
			this.sexo = sexo;
		}
		public void setBloco(String bloco){
			this.bloco = bloco;
		}
		public void setApartamento(int apartamento){
			this.apartamento = apartamento;
		}
		public void setCodigoAcesso(int codigoAcesso){
			this.codigoAcesso = codigoAcesso;
		}
		@Override
		public String toString() {
			return "Nome :" + getNome() + "CPF :" + getCpf() + "Celular :" + getCelular() + "Data de nascimento :" + getDataNasc() + "Sexo :" + getSexo() + "Bloco :" + getBloco() + "Apartamento :" + getApartamento() + "Codigo de acesso :" + getCodigoAcesso();
		}
}

