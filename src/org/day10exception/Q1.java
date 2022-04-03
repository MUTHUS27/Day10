package org.day10exception;

public class Q1 {
      
        public static void main(String[] args)
        
        
          {
        	System.out.println(9/0);
        	
        try
        {
              System.out.printf("1");
            int sum = 9 / 0;
              System.out.printf("2");
        }
        catch(ArithmeticException e)
        {
              System.out.printf("3");
        }
         catch(Exception e)
        {
              System.out.printf("4");
        }
        finally
        {
           System.out.printf("5");
        }
           }
       }


