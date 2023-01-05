public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
    	total++;
    	//System.out.println("O total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    public void saca(double valor){
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException(
                "Saldo: " + this.saldo + ", Valor: "+ valor);
        }
        
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino){
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int novoNumero){
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente  titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return titular;
    }
    
    public static int getTotal() {
    	return Conta.total;
    }
}