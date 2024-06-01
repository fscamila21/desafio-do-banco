public class Main {

	public static void main(String[] args) {	
		
		Cliente camila = new Cliente();
		camila.setNome("Camila");
		
		Conta cc = new ContaCorrente(camila);
		Conta poupanca = new ContaPoupanca(camila);

		cc.depositar(1000);
		cc.imprimirExtrato();
		cc.transferir(100, poupanca);
		poupanca.imprimirExtrato();
		cc.imprimirExtrato();
		cc.sacar(550);
		cc.imprimirExtrato();
	

	}

}