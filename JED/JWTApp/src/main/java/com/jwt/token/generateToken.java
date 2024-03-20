package com.jwt.token;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class generateToken {
	public static void main(String[] args) {
		String key = "YAKRUTINFORMATIONTECHNOLOGIES";
		//Token Generation
		String token = 
		Jwts.builder()
		.setId("A5266")
		.setSubject("Srinivas")
		.setIssuer("Yakrut")
		.setIssuedAt(new Date(System.currentTimeMillis()))
		.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10)))
		.signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encode(key.getBytes()))
		.compact();
		System.out.println(token);
		
		//Reading Token OR Parsing Token OR Claiming
		Claims c = Jwts.parser()
		.setSigningKey(Base64.getEncoder().encode(key.getBytes()))
		.parseClaimsJws(token)
		.getBody();
		
		System.out.println(c.getSubject());
		System.out.println(c.getId());
		System.out.println(c.getIssuer());
		System.out.println(c.getExpiration());
	}
}
