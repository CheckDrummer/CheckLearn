package com.tutorialspoint;

public class HelloIndia {
	   private String message;
	   private String message2;

	   public void setMessage(String message){
	      this.message = message;
	   }
	   public void setMessage2(String message){
	      this.message2 = message;
	   }
	  
	
	   public void getMessage(){
	      System.out.println("India Message1 : " + message);
	   }
	   public void getMessage2(){
	      System.out.println("India Message2 : " + message2);
	   }

	   public void init(){
		  System.out.println("India bean is going through init.");
	   }
	   public void destroy() {
		  System.out.println("India bean will destroy now.");
	   }
	   
}
