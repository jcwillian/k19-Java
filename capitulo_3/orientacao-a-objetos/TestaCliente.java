class TestaCliente{
	public static void main(String[] args){
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();

		c1.nome = "Willian Rodrigues dos Santos";
		c2.nome = "Adilson Rodrigues dos Santos";

		c1.codigo = 1;
		c2.codigo = 2;
	
		System.out.println(c1.nome);
		System.out.println(c1.codigo);
		System.out.println(c2.nome);
		System.out.println(c2.codigo);
	}
}
