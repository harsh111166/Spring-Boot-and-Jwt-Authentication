package com.jwt.model;

public class JwtResponse {

	String token;

	public JwtResponse() {
	}

	/**
	 * @param token
	 */
	public JwtResponse(String token) {
		super();
		this.token = token;
	}

	// getters and setters
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
