package com.channel.exceptions;

public class ChannelNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChannelNotFoundException() {
		super();
	}

	public ChannelNotFoundException(String message) {
		super(message);
	}

}
