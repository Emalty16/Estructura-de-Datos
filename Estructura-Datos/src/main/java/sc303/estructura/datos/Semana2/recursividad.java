/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc303.estructura.datos.Semana2;

/**
 *
 * @author usuario
 */
public class recursividad {
    
    static int arr [] = {12,34,64,2,3,90};
    
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        
        else{
            return n * factorial(n-1);
        }
    }
    
    public static int findMax(int[] numeros,int max, int indice){
        if(indice!= numeros.length){
            if(numeros[indice]> max){
                max = findMax(numeros, indice+1, numeros[indice]);
                System.out.println("\n");
                System.out.print(max);
                System.out.print(numeros[indice]);
                max = findMax(numeros, indice+ 1 , max);
                
            } else{
                System.out.println("\n");
                System.out.print("max");
                System.out.println(" ");
                System.out.print(numeros[indice]);
                max = findMax(numeros, indice + 1, max);
                
            }
        }
        
        System.out.println("\n");
        return max;
    }
    
}
