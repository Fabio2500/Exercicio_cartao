class MovimentoCartao{
	public static void main(String[]args){
		Cartao c;
		c = new CartaoEspecial("1","joao",500f,50f);
        System.out.println("\n");

        System.out.println("comprando 50 R$");
		
		System.out.println("\n");
		
		((CartaoEspecial)c).Comprar(50f);

		c.MostrarDados();

		System.out.println("\n");
           
		System.out.println("comprando 49 R$");

		System.out.println("\n");

		((CartaoEspecial)c).Comprar(49f);

		System.out.println("\n");

		System.out.println("comprando 450 R$");

		((CartaoEspecial)c).Comprar(450f);
         
        System.out.println("\n");

        c.MostrarDados(); 

        System.out.println("\n");
		
		System.out.println("comprando 50 R$ novamente");

        ((CartaoEspecial)c).Comprar(50f);

        System.out.println("\n");
        
        System.out.println("pagando 50 R$");
        
        System.out.println("\n");
        
        ((CartaoEspecial)c).Pagar(50f);
         
        c.MostrarDados();

        System.out.println("\n");

        System.out.println("comprando 50 R$ pela terceira vez");
        
        ((CartaoEspecial)c).Comprar(50f);

        System.out.println("\n");
        
        c.MostrarDados();  

        System.out.println("\n");

        System.out.println("situação da conta após pagar tudo:");

        ((CartaoEspecial)c).PagarTudo(c.getLimite());

        System.out.println("\n");

        c.MostrarDados();

	}
}