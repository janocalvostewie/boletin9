package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Boletin9_4 {

    public static void main(String[] args) {
        
        //VARIABLES VARIAS
        int numeroM=1;
        int multiplicador=1;
        
        //CONDICIÓN DE RUPTURA
        do{
            numeroM=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
              while (multiplicador<11){
                  JOptionPane.showMessageDialog(null, numeroM+"*"+multiplicador+"="+(numeroM*multiplicador));
                  multiplicador++;
            }
        
        
        }while(numeroM>0);
    }
    
}
