package br.com.renatour.exception;

public class ClienteNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ClienteNotFoundException() {
		super();
	}

	public ClienteNotFoundException(String customMessage) {
		super(customMessage);
	}

}
