package com.technoelevate.functional_interface_lambda_expression;

public class LambdaExpression implements FunctionalInterface {
	
	//static FunctionalInterface fi = ()->{return "King";};
	public static void main(String[] args) {
		 FunctionalInterface fi = ()->{return "King";};
	//f1.getTime();
	FunctionalInterface f1 =  new  LambdaExpression();
	System.out.println(f1.getTime());
	}
	@Override
	public String getTime() {
		
		return "the King";
	}

	

}
