/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Mantuano ---- Luis Torres
 */
public class Ejemplo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
    Scanner ingreso=new Scanner(System.in);
    JOptionPane.showInputDialog("Ingrese Dimension en la Matriz:\n x: ");
    int x=ingreso.nextInt();
        System.out.println("y: ");
        int y=ingreso.nextInt();
        int numero;
        int matriz[][]=new int [x][y];
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
         JOptionPane.showInputDialog("Ingrese valor en Posicion.: "+i+j);   
           numero=ingreso.nextInt();
           matriz[i][j]=numero;
                
            }        
        }   
     int dimension=x*y,a=0;
     int vectorcontador[]=new int[dimension];
     for (int i = 0; i <x; i++) {
     for (int j = 0; j < y; j++) {
     vectorcontador[a]=matriz[i][j];
                //System.out.println(vectorcontndr[a]);
     a++;
            }
     }
     ArrayList matriz1=new ArrayList();
        ArrayList cant=new ArrayList();
        Arrays.sort(vectorcontador);
        matriz1.add(vectorcontador);
        
        int cc=0;
        for (int i = 0; i < vectorcontador.length; i++) {
            if(vectorcontador[i]!=vectorcontador[cc+1]){
               matriz1.add(vectorcontador[cc+1]);  
            } 
        }
        int numTemp, cantRepite = 0, numRepite = -1; 
        
        for (int i=0; i < vectorcontador.length-1; i++){
            numTemp = 1;
            for(int j = i+1 ; j< vectorcontador.length; j++){
                if(vectorcontador[i] == vectorcontador[j])
                    numTemp ++;                
            }
            if(numTemp > cantRepite){
                cantRepite = numTemp;
                numRepite = vectorcontador[i];
            }
        }
        System.out.println("El # que mas se repite es el: " + numRepite + 
                " Porque se repite " + cantRepite+" Veces en la matriz");  
        
    }
}
