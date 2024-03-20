package com.jwt.token;

import com.jwt.util.JwtUtil;

import io.jsonwebtoken.Claims;

public class generateTokenUtil {
	public static void main(String[] args) {
		JwtUtil util = new JwtUtil();
		String token = util.generateToken("A5266", "Srinivas", "YAKRUTINFORMATIONTECHNOLOGIES");
		System.out.println(token);
		
		Claims c = util.getClaims("YAKRUTINFORMATIONTECHNOLOGIES", token);
		System.out.println(c.getSubject());
		System.out.println(c.getId());
		System.out.println(c.getIssuer());
		System.out.println(c.getExpiration());
		
		System.out.println(c.getSubject());
	}
}
