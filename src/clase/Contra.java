/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author aldair
 */
public class Contra {

    private int longitud;
    private String contraseña;

    public Contra(int longitud, String contraseña) {
        this.longitud = 8;
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getcontraseña() {
        return contraseña;
    }

    public void setcontraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String segura() {
        
        String seg;

        if (this.longitud >= 6) {
            
            seg = "su contraseña es segura";
            
        } else {
            
            seg = "su contraseña no es muy segura";
        }

        return seg;

    }

    public String mostrar(){
        String mos;
        
        mos= "la contraseña que acaba de crear es: "+this.contraseña;
    
        return mos;
    }
    
}
