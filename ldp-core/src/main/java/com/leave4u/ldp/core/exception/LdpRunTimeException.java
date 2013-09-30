package com.leave4u.ldp.core.exception;

public class LdpRunTimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LdpRunTimeException() {
		super();
	}
	
	public LdpRunTimeException(String msg) {
		super(msg);
	}
	
	public LdpRunTimeException(Throwable t) {
		super(t);
	}
	
	public LdpRunTimeException(String msg, Throwable t) {
		super(msg, t);
	}

}
