package fintechEncapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(121231);
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(4321, 14660);
		
		System.out.println(Conta.getTotal());


	}

}
