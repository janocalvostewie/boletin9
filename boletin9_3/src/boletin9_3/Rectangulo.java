package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Rectangulo {
    
    private float base;
    private float altura;
    
    //CONSTRUCTORES
    public Rectangulo(){}
    public Rectangulo(float base, float altura ){this.base=base; this.altura=altura;}
    
    //SETTERS Y GETTERES
    public void setBase(){
        int cont=1;
        while (cont >0){
            cont++;
        float base=Float.parseFloat(JOptionPane.showInputDialog("Introduce la base"));
        if (base<=0){
            JOptionPane.showMessageDialog(null, "No puede ser negativa o 0");
        }
        else{
            cont=0;
            this.base=base;
        }
        }
    }
    public void setAltura(){
        int cont=1;
        while (cont >0){
            cont++;
        float altura=Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura"));
        if (altura<=0){
            JOptionPane.showMessageDialog(null, "No puede ser negativa o 0");
        }
        else{
            cont=0;
            this.altura=altura;
        }
        }
    }
    public float getBase(){return base;}
    public float getAltura(){return altura;}
    
    //MÉTODOS
    public void calArea(){
          float area=this.base*this.altura;
          JOptionPane.showMessageDialog(null, "El área es de "+area);
    
    }
}
