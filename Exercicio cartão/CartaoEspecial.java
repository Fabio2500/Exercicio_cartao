class CartaoEspecial extends Cartao{
   private float ValorMinimoCompra; 


   public float getValorMinimoCompra(){
      return this.ValorMinimoCompra;
   }

   public void setValorMinimoCompra(float numero){
      this.ValorMinimoCompra = numero;
   }

   CartaoEspecial(String numero,String nome,float limite, float valor_minimo){
   	super(numero,nome,limite);
      setValorMinimoCompra(valor_minimo);
   }
   
   public void Comprar(float valor_compra){
   	if(valor_compra >= this.ValorMinimoCompra){
   		super.Comprar(valor_compra);
   	}else{
   		System.out.println("WARNING!: com este cartao apenas aceitamos apenas compras a partir de " + this.ValorMinimoCompra);
   	}
 } 
  
  public void PagarTudo(float tudo){
  	  super.Pagar(tudo);
  }

  public void MostrarDados(){
  	System.out.println("valor minimo para efetuar transações: " + this.ValorMinimoCompra);
  	super.MostrarDados();
  }

}