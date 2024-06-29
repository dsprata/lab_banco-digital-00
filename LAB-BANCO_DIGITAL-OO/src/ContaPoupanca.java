import java.io.IOException;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void sacar(double valor) {
		if (this.saldo - valor < 0){
			System.out.println("Conta Poupança não pode ficar negativada");	
		}
		super.sacar(valor);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void pedirImprestimo(double valor) {
		System.out.println("Atenção: Não é permitido emprestimo na conta poupança");		
	}
}
