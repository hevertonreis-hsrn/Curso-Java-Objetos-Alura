package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -5330150834049221586L;

	public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}