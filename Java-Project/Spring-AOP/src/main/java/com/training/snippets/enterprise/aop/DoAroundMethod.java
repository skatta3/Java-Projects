package com.training.snippets.enterprise.aop;

	import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DoAroundMethod implements MethodInterceptor {
		public Object invoke(MethodInvocation methodInvocation) throws Throwable {
	 
			System.out.println("****SPRING AOP**** DoAroundMethod: Method name : "
					+ methodInvocation.getMethod().getName());
//			System.out.println("****SPRING AOP**** DoAroundMethod: Method arguments : "
//					+ Arrays.toString(methodInvocation.getArguments()));
//			// same with MethodBeforeAdvice
//			System.out.println("****SPRING AOP**** DoAroundMethod: Before method executing!");
	 
			try {
				// proceed to original method call
				Object result = methodInvocation.proceed();
				// same with AfterReturningAdvice
				System.out.println("****SPRING AOP**** DoAroundMethod: After method executing!");
				return result;
	 
			} catch (IllegalArgumentException e) {
				// same with ThrowsAdvice
				System.out.println("****SPRING AOP**** DoAroundMethod: When method throws Exception!");
				throw e;
			}
		}

}
