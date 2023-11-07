abstract class Cartao{
	private String numero_cartao;
	private String nome_titular;
	private float limite_credito;
	private float devedor_saldo;

	public void setNumero(String numero){
		this.numero_cartao = numero;
    }

	public void setNome(String nome){
		this.nome_titular = nome;
	}

	public void setLimite(float valor){
		this.limite_credito = valor;
	}

	public float getLimite(){
		return this.limite_credito;
	}
    
    public String getNumero(){
    	return this.numero_cartao;
    }   
 
    public String getNome(){
        return this.nome_titular;
    }
     
	public float getSaldo(){
		return this.devedor_saldo;
	}

	Cartao(String numero , String nome ,float limite){
		float saldo = 0;
		this.devedor_saldo = saldo;
		this.numero_cartao = numero;
		this.nome_titular = nome;
		this.limite_credito = limite;
    }

    public boolean Autorizado(float valor_compra){
    	return(valor_compra + this.devedor_saldo <= this.limite_credito);
    }

    public void Comprar(float valor_compra){
    	if(Autorizado(valor_compra)){
    	this.devedor_saldo = this.devedor_saldo + valor_compra;
    	}else{
    		System.out.println("WARNING!: não foi possivel efetuar a compra, devido a ela exceder o limite");
    	}
    }
    public void Pagar(float pagamento_valor){
    	this.devedor_saldo = this.devedor_saldo - pagamento_valor;
    }

    public void MostrarDados(){
    	System.out.println("numero do cartão: " + this.numero_cartao);
    	System.out.println("nome do titular: " + this.nome_titular);
    	System.out.println("limite Atual: " + this.limite_credito);
    	System.out.println("saldo: " + this.devedor_saldo);
    }
}