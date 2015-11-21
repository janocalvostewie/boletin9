
package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Boletin9_1 {
    public static void main(String[] args) {
        //CONTADOR
        int i=0;
        //DETERMINACIÓN DE LAS VUELTAS DEL BUCLE
        int vueltas=10;
        //VARIABLES PARA CONTAR
        int nNeg=0;
        int nPos=0;
        int nCero=0;
        
        //COMIENZO DEL BUCLE
        while(i<vueltas){
            
            int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            
            
            if (num<0)
                nNeg++;
            else if (num>0)
                nPos++;
            else 
                nCero++;
            i++;
        }
        JOptionPane.showMessageDialog(null, "Se han introducido "+nPos+ " números positivos");
        JOptionPane.showMessageDialog(null, "Se han introducido "+nNeg+ " números negativos");
        JOptionPane.showMessageDialog(null, "Se han introducido "+nCero+ " ceros");
    }
    }
    

