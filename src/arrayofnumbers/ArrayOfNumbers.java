/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofnumbers;

import java.util.Scanner;

/**
 *
 * @author fergi
 */
public class ArrayOfNumbers {
    
private int[] intArray; 
  

public ArrayOfNumbers() {

Scanner myInput = new Scanner(System.in);
    
int size = myInput.nextInt();

intArray = new int[size];    

} 

public ArrayOfNumbers(int newArray[]) {
    
   // for (int i=0; i<newArray.length;i++) {
      // System.out.println(newArray[i]);
  //  }
     
   intArray = new int[newArray.length];
   
   for (int i = 0; i < newArray.length; i++) {
       
       intArray[i] = newArray[i];
   }
   
    //for (int x=0; x<newArray.length;x++) {
      // System.out.println(intArray[x]);
   //}
       
    
}

  public void setItem() {
      
      Scanner s = new Scanner(System.in);       
              
      int selection = s.nextInt();
      
      int option = s.nextInt();
      
      for(int i=intArray.length-1; i > selection; i--){
    intArray[i] = intArray[i-1];
   }
      
   intArray[selection] = option;
   
    for (int i=0; i<intArray.length;i++) {
       System.out.println(intArray[i]);
    }
  }   
    
    public void max() {
     
      
                int max1 = intArray[0];
               
                for(int i=1; i< intArray.length; i++)
                {
                        if(intArray[i] > max1)
                                max1 = intArray[i];                                             
                }    
        System.out.println("This is the largest number is " + max1);
               
    }
    
    public void equal() {
        
        Scanner s = new Scanner(System.in);
        
        int choice1 = s.nextInt();
        int choice2 = s.nextInt();
        
        if(intArray[choice1] == intArray[choice2])
        {
        System.out.println("The Numbers are Equal");
        }
        else {
        System.out.println("The Numbers are not Equal");
        }
        
    }
    
    public void gcd() {
        
        Scanner s = new Scanner(System.in);
        
        int choice1 = s.nextInt();
        int choice2 = s.nextInt();
        
        int num1 = intArray[choice1];
        int num2 = intArray[choice2];
        
         while (num2 != 0) {
            int num = num2;
            num2 = num1 % num2;
            num1 = num;
        }
        System.out.println("The GCD is " + num1);
    }
    
    public void count() {
        
        int total = 0;
        
        for(int i=0; i < intArray.length; i++) {
            
          total = total + intArray[i];  
        }
        
        System.out.println("The total is: " + total);
        
    }
    
     public void average() {
        
        int total = 0;
              
        for(int i=0; i < intArray.length; i++) {
            
          total = total + intArray[i];  
        }
        
        int average = total/intArray.length;
        
        System.out.println("The Average is: " + average);
        
        
        
    }
    
    
    
    

     
      
       
    }


    
    

