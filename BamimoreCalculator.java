/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bamimorecalculator;




import javax.swing.JOptionPane;

/**
 *
 * @author Muizz
 */
public class BamimoreCalculator{
    
    public static double[] Input(int num){
        
        double  inputData[] = new double[num];
        
        for(int i = 0; i <= num-1; i++){
            
            int n = i+1;
            
            String val = "Enter The " + n + " Number to Add";
            
            String input =  JOptionPane.showInputDialog(val);
            
            double number =  Double.parseDouble(input);
            
          inputData[i] += number;
            
            
        }
        return inputData;
        
    }
    
    public double Addition(double[] num){
        
        double ans = 0;
        
        for (int i = 0; i <num.length ; i++) {
            
            ans += num[i];
            
        }
        
        return ans;
        
    }
    
    
    public double Subtraction(double[] num){
        
           double ans = 0;
           
        for (int i = 0; i <num.length ; i++) {
            
            if(i == 0) ans += num[i];
            
            else ans -= num[i];
            
        }
        
        return ans;
    }
    
    
     public double Multiplication(double[] num){
         
         double ans = 1;
         
        for (int i = 0; i <num.length ; i++) {
            
            ans *= num[i];
            
        }
        
        return ans;
       
    }
     
     
      public double Division(double[] num){
          
        double ans = 1;
        
        for (int i = 0; i <num.length ; i++) {
            
             if(i == 0) 
                 
                 ans *= num[i];
             
            else 
                 
                ans /= num[i];
             
        }
        
        return ans;
        
    }
      
}
