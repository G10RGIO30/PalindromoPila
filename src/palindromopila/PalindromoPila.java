/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromopila;
import java.util.*;
import java.io.*;

/**
 *
 * @author giovanni
 */
public class PalindromoPila {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Stack<Character> pila;
        String palabra;
        boolean pal;
        pila = new Stack<>();
        try{
            System.out.println("Palabra o frase (sin espacios): ");
            while((palabra = entrada.nextLine()) != null){
                for(int i = 0; i < palabra.length(); i++){
                    pila.push(palabra.charAt(i));
                }
                pal = true;
                int i = 0;
                while(pal && !pila.empty()){
                    Character q;
                    q = pila.pop();
                    pal = q == palabra.charAt(i++);
                }
                if(pal && pila.empty()){
                    System.out.println(palabra + "es un palindromo");
                }else{
                    System.out.println(palabra + "no es palindromo");
                }
            }
        }catch(Exception e){
            ;
        }
    }
    
}
