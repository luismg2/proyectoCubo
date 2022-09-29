/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Alumno Mañana
 */
public class cubo {
    public int alto;
    public int ancho;
    public int profundo;

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    public cubo(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public cubo() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cubo{alto=").append(alto);
        sb.append(", ancho=").append(ancho);
        sb.append(", profundo=").append(profundo);
        sb.append('}');
        return sb.toString();
    }
    
    public void volumen(int alto, int ancho, int profundo){
        System.out.println("El volumen del cubo("+alto+", "+ancho+", "+profundo+") es: "+(alto*ancho*profundo));
    }
    
}