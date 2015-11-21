
package boletin9_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Calculo {
    
    
     //RESULTADO DE LA SUMA
        public void cSuma(int i, int suma){
        while (i>=10 & i<=90){
            suma=i+suma;
            i++;
        }
        JOptionPane.showMessageDialog(null, "La suma es: "+suma);
        }
        
        //RESULTADO DEL PRODUCTO
        public void cProducto(int i, double producto){
         while (i>=10 & i<=90){
            producto=producto*i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "El producto es: "+producto);
        }
}
