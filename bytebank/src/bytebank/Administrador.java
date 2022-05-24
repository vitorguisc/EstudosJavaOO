package bytebank;

public class Administrador extends Funcionario implements Autenticavel {

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	@Override
	public boolean autentica(int senha) {
		boolean autentica = this.autenticador.autentica(senha);
	}

}
