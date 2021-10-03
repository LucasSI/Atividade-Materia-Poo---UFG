package Atividade2;

public class morador {

		private String nome;
		private String cpf;
		private String celular;
		private String dataNasc;
		private String sexo;
		private String bloco;
		private String apartamento;
		private String codigoAcesso;
		static int codigo_sequencial = 0;
		
		
		
		public static int getCodigo_sequencial() {
			return codigo_sequencial;
		}
		public static void setCodigo_sequencial(int codigo_sequencial) {
			morador.codigo_sequencial = codigo_sequencial;
		}
		public String getNome() {
			return this.nome;
		}
		public String getCpf() {
			return this.cpf;
		}
		public String getCelular() {
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
		public String getApartamento() {
			return this.apartamento;
		}
		public String getCodigoAcesso() {
			return this.codigoAcesso;
		}

		public void setNome(String nome){
			this.nome = nome;
		}
		public void setCpf(String cpf){
			this.cpf = cpf;
		}
		public void setCelular(String celular){
			this.celular = celular;
		}
		public void setDataNasc(String dataNasc){
			this.dataNasc = dataNasc;
		}
		public void setSexo(String sexo){
			this.sexo = sexo;
		}
		public void setBloco(String bloco){
			this.bloco = bloco;
		}
		public void setApartamento(String apartamento){
			this.apartamento = apartamento;
		}
		public void setCodigoAcesso(String codigoAcesso){
			this.codigoAcesso = codigoAcesso;
		}
		@Override
		public String toString() {
			return "Nome :" + getNome() + "CPF :" + getCpf() + "Celular :" + getCelular() + "Data de nascimento :" + getDataNasc() + "Sexo :" + getSexo() + "Bloco :" + getBloco() + "Apartamento :" + getApartamento() + "Codigo de acesso :" + getCodigoAcesso();
		}
}

