package com.tutorialspoint.Student;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

   /** Following is the definition for a pointcut to select
    *  all the methods available. So advice will be called
    *  for all the methods.
    */
   @Pointcut("execution(* com.tutorialspoint.*.*.*(..))")
   private void selectAll(){}

   /** 
    * This is the method which I would like to execute
    * before a selected method execution.
    */
   @Before("selectAll()")
   public void beforeAdvice(){
      System.out.println("Going to setup student profile.");
   }  
   
//   
//   
//   
//   
//   @Pointcut("execution(* com.tutorialspoint.Student.getName(..))")
//   private void selectGetName(){}
//
//   /** 
//    * This is the method which I would like to execute
//    * before a selected method execution.
//    */
//   @Before("selectGetName()")
//   public void beforeAdvice(){
//      System.out.println("Going to setup student profile.");
//   }  
//   
//   
//  
//   /** Following is the definition for a pointcut to select
//    *  all the methods available. So advice will be called
//    *  for all the methods.
//    */
//   @Pointcut("execution(* com.tutorialspoint.Student.getAge(..))")
//   private void selectGetAge(){}
//
//   /** 
//    * This is the method which I would like to execute
//    * after a selected method execution.
//    */
//   @After("selectGetAge()")
//   public void afterAdvice(){
//      System.out.println("Student profile setup completed.");
//   }  
//   
//   
//   
//   /** 
//    * This is the method which I would like to execute
//    * after a selected method execution.
//    */
//   @AfterReturning(pointcut="execution(* com.tutorialspoint.Student.*(..))", returning="retVal")
//   public void afterReturningAdvice(JoinPoint jp, Object retVal){
//      System.out.println("Method Signature: "  + jp.getSignature());  
//      System.out.println("Returning:" + retVal.toString() );
//   }
//   
//   
//   /** 
//    * This is the method which I would like to execute
//    * after a selected method execution throws exception.
//    */
//   @AfterThrowing(pointcut="execution(* com.tutorialspoint.Student.*(..))", throwing= "error")
//   public void afterThrowingAdvice(JoinPoint jp, Throwable error){
//      System.out.println("Method Signature: "  + jp.getSignature());  
//      System.out.println("Exception: "+error);  
//   }
//   
//   
//   
//   /** Following is the definition for a pointcut to select
//    *  all the methods available. So advice will be called
//    *  for all the methods.
//    */
//   @Pointcut("execution(* com.tutorialspoint.Student.getAge(..))")
//   private void selectGetAge(){}
//
//   /** 
//    * This is the method which I would like to execute
//    * around a selected method execution.
//    */
//   @Around("selectGetAge()")
//   public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//      System.out.println("Around advice");
//      Object[] args=proceedingJoinPoint.getArgs();
//      if(args.length>0){
//         System.out.print("Arguments passed: " );
//         for (int i = 0; i < args.length; i++) {
//            System.out.print("arg "+(i+1)+": "+args[i]);
//         }
//      }
//
//      Object result=proceedingJoinPoint.proceed(args);
//      System.out.println("Returning " + result);
//   }  
}