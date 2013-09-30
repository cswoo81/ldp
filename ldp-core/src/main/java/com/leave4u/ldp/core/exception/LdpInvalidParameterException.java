package com.leave4u.ldp.core.exception;

public class LdpInvalidParameterException extends LdpRunTimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LdpInvalidParameterException(String msg) {
		super(msg); 
	}
	
	public LdpInvalidParameterException(String msg, Object extraInformation) {
		super(msg + extraInformation);
	}
	
	public LdpInvalidParameterException(String msg, Throwable t) {
		super(msg, t); 
	}

}
