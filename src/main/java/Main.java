/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *

/**
 *
 * @author nesas-15
 */

import java.util.Scanner;

   public class Main {
    
    public static void main (String [] args){
    
    
        
        
        double m,n;
    
         Scanner  value = new Scanner (System.in);
         System.out.println("Ingrese un numero: ");
         factorial(value.nextInt());
                         
         Scanner value1 = new Scanner (System.in);
         System.out.println("Ingrese un numero para un lado del cateto: ");
         m = value1.nextDouble();
         
         Scanner value2 = new Scanner (System.in);
         n = value2.nextDouble();
         hypotenuse(m , n);
         
         Scanner deposit = new Scanner (System.in);
         System.out.println("Ingresar el texto");
         vowels (deposit.nextLine()); 
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Escribe una oracion: ");
        cadena (lector.nextLine());
          
    
    
    
    }
    
    
    public static void factorial(int arg){
    
    int factorial = 1;
    int number;
    

    
        number = arg;
    
        for (int i = number ; i > 0; i--) {
            
            factorial = factorial * i; 
        }
        
        System.out.println("El factorial del numero: " + number+ " es "+ factorial);
        
    }
    
    public static void hypotenuse(double arg1, double arg2){
    
    
    
    double legsa,legsb, sum1,sum2 ;
    double hypotenuse;
    
    
    legsa =  arg1;
    
   
    legsb = arg2;
    
    
    sum1= legsa * legsa;
    sum2= legsb * legsb;
    
    hypotenuse = sum1 + sum2;
    
    
    System.out.println(Math.sqrt(hypotenuse ));
    
    
    }
    
    public static void vowels(String arg){
    
     
        
        String text = arg;
        
        int vowels = 0;
        int  vowelsquantity= 0;
        
        
        
        vowels = text.length();
        
        
        for(int i = 0; i < text.length(); i++ ){
    
      //filtramos las letras que queremos contar
    
     if ((text.charAt(i)=='a')||(text.charAt(i)=='A')||
        (text.charAt(i)=='e')||(text.charAt(i)=='E')||
        (text.charAt(i)=='i')||(text.charAt(i)=='I')||
        (text.charAt(i)=='o')||(text.charAt(i)=='O')||
        (text.charAt(i)=='u')||(text.charAt(i)=='U')){
         
           vowelsquantity++;
       }
   }
        
        System.out.println("La cantidad de caracteres son: "+ vowels);
        System.out.println("La cantidad de vocales son: "+  vowelsquantity);
       
    
   
        
    }
    public static void cadena (String arg) {
    
        String cadena ="";
        char [] Arraycadena; 
        char caracter;
        int contador = 0;
        Arraycadena = arg.toCharArray();
        
        for (int i = 0; i < Arraycadena.length; i++) {
            
            caracter = Arraycadena[i];
            
            for (int j = 0; j < Arraycadena.length; j++) {
                     
                
                
                if (Arraycadena[j] == caracter) {
                    
                    contador ++ ;
                    
                }
                
            }
            
            System.out.println(Arraycadena[i] + " " + contador );
            contador = 0 ;
            
        }
    
    }

        

}
