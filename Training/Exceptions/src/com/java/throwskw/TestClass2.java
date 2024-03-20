package com.java.throwskw;

import java.io.IOException;

public class TestClass2 {
	public void TestMethod2() throws IOException {
		int result = 12/0;
		throw new IOException("device error");
	}
}
