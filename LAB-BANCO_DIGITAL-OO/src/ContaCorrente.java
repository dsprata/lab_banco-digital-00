
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void pedirImprestimo(double valor) {
		// TODO Auto-generated method stub
		if (cliente.getIdade() < 18){
			System.out.println("Menor de idade não é permitido pedir imprestimo");	
		} else {
			super.depositar(valor);
			this.setEmprestimo(valor);
		}
		
	}

	@Override
	public void sacar(double valor) {
		if (this.saldo - valor < 0) {
			if (Math.abs(this.saldo - valor) > cliente.limite ) {
				System.out.println("Saque maior que o limite");	
			} else {
				super.sacar(valor);					
			}	
		} else {
			super.sacar(valor);		
		}	
	}
	
}
