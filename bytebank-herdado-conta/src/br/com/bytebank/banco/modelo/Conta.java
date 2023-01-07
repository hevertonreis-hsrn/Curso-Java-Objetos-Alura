package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta
 * 
 * @author Heverton Reis
 * @version 0.1
 */

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero.
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
    	total++;
    	//System.out.println("O total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior que o saldo.
     * 
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException{
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException(
                "Saldo: " + this.saldo + ", Valor: "+ valor);
        }
        
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
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

    @Override
    public String toString() {
        return "Número: " + this.numero + ", Agencia: " + this.agencia;
    }
}