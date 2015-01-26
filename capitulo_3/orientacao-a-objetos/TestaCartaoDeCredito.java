class TestaCartaoDeCredito{
	public static void main(String[] args){
		CartaoDeCredito cdc1 = new CartaoDeCredito();
		cdc1.numero = 11111;
		cdc1.dataDeValidade = "01/01/2013";

		System.out.println(cdc1.numero);
		System.out.println(cdc1.dataDeValidade);

		CartaoDeCredito cdc2 = new CartaoDeCredito();
		cdc2.numero = 22222;
		cdc2.dataDeValidade = "20/02/2015";

		System.out.println(cdc2.numero);
		System.out.println(cdc2.dataDeValidade);
	}
}
