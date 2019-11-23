package com.test.jacoco;

import javax.imageio.event.IIOReadWarningListener;


public class HelloWorld {
    public HelloWorld() {

    }

    public String Method1() {
        return "Hello World";
    }

    public int Method2(int a, int b) {
        return a + b;
    }
    
    public int Method3(int a, int b, int c){
    	if((a>5&&b<0)||c>0) {
    		System.out.println("Condition 1");
    	}
    	else if(a<5 && c<-2 ) {
    		System.out.println("Condition 2");
    	}
    	else {
    		System.out.println("Condition 3");
    	}
    	return 0;
    }
    public int Method4(int a, int b, int c, int d, float e) {
    	if(a == 0) {
    		return 0;
    	}
    	int x = 0;
    	if((a == b) || ((c == d) && (bug(a)))) {
    		 x = 1; 
    	}
    	e = 1/x;
    	return 0;
    }
    public boolean bug(int a) {
    	if(a == 5) return true;
    	return false;
    }
    
    
    public boolean isTriangle(int a, int b, int c) {
    	/**
    	 * TODO: You need to complete this method to determine whether  a
    	 * triangle is formed or not when given the input edge a, b and c.
    	 */
    	if ( a<=0 || b<=0 || c<=0){
    		return false;
		}
    	if(a>b){
    		int t = a;
    		a = b;
    		b = t;
		}
    	if(b>c){
    		int t = b;
    		b = c;
    		c = t;
		}
    	long sum = (long)a + (long)b;
    	long cc = (long)c;
    	if(sum <= cc){
    		return false;
		}
    	return true;
    }
    public boolean isBirthday(int year, int month, int day) {
    	/**
    	 * TODO: You need to complete this method to determine whether a 
    	 * legitimate date of birth between 1990/01/01 and 2019/10/01 is 
    	 * formed or not when given the input year, month and day.
    	 */
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		if(year < 1990 || year > 2019 || (year==2019 && (month > 10 || (month ==10 && day > 1)))){
			return false;
		}
    	if(month <1 || month>12 ){
    		return false;
		}
    	if(year % 4 == 0 ){ //由于1990到2019没有特殊的 year % 100 == 0 && year % 400 == 0 所以膜4就可以
    		days[1] = 29;
		}
    	if(day<1 || day>days[month-1]){
    		return false;
    	}
//
    	return true;
    }
    public Double miniCalculator(double a, double b, char op) {
    	/**
    	 * TODO: You need to complete this method to form a small calculator which 
    	 * can calculate the formula: "a op b", the op here can be four basic  
    	 * operation: "+","-","*","/". 
    	 */
    	double result = 0.0;
    	if(op == '+'){
			result = a + b;
		}else if(op == '-'){
			result = a - b;
		}else if(op == '*'){
			result = a * b;
		}else if(op == '/'){
			double b_abs = b;
    		if(b<0){
    			b_abs = -1.0 * b;
			}
    		if(b_abs<0.000001){
    			return 100000000000000.0;
			}else {
				result = a / b;
			}
		}else{
			throw new ArithmeticException();
		}
    	return result;
    }
    
}
