package com.java.controlswitch;

public class ByteSwitch {
	public static void main(String[] args) {
		byte b = 127;  // -128 to + 127
		switch(b)
		{
			case 127: System.out.println("Fred");
			case 128: System.out.println("Chris");
		}
	}
}
