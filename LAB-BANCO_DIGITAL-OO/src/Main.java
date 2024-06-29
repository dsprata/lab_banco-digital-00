
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setIdade(18);
		venilton.setLimite(50);
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.pedirImprestimo(150);
		cc.sacar(210);
		
		cc.imprimirExtrato();
		poupanca.sacar(100);
		poupanca.imprimirExtrato();
		poupanca.pedirImprestimo(100);

		cc.encerrarConta();

	}

}
