package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Boletin9_5 {
    public static void main(String[] args) {
        
        final int CONSTANTEPAR=2;
        final int CONSTANTENEG=-2;
        int elementos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de elementos"));;
        int contador=0;
        int serieA=0;
        
        //SERIE A
        System.out.println("Serie A");
        do{
            
            serieA=serieA+CONSTANTEPAR;
            System.out.print(serieA+" + ");
            contador++;
        }while(contador<elementos);
        
        //SERIE B
        int serieB=1;
        contador=0;
        serieA=0;
         System.out.println("\nSerie B");
        do{
            serieA=serieA+CONSTANTEPAR;
            serieB=serieB+CONSTANTENEG;
            System.out.print(" "+serieB+" + "+serieA);
            contador++;
        }while(contador<elementos);
        
        
        //SERIE C
        int anterior = 0;
        int actual = 1;
        int siguiente = 1;
         System.out.println("\nSerie C");        
        //Imprimimos el 0.
        System.out.print("0, ");
        for (int i = 0; i < elementos - 1; i++) {
        System.out.print(siguiente + ", ");
        siguiente = actual + anterior;
        anterior = actual;
        actual = siguiente;
        }
        System.out.println();
    }
    
}
