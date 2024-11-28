/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author lopez
 */
public class ColaC {

    private Orden[] datos;
    private int frente;
    private int fin;
    private int n;//Contador

    public ColaC() {
        datos = new Orden[10];
        frente = 0;
        fin = 0;
        n = 0;
    }

    public ColaC(int tam) {
        datos = new Orden[tam];
        frente = 0;
        fin = 0;
        n = 0;
    }

    public void insertar(Orden nueva){
        datos[fin++] = nueva;
        if (fin == datos.length) {
           fin=0;
        }
        n++;
    }
    
    public Orden eliminar(){
        Orden salida = datos[frente++];
         if (frente == datos.length) {
            frente=0;
        }
        n--;
        return salida;
    }
    
    public boolean estaLlena(){
         return (n==datos.length);
    }
    
    public boolean estaVacia(){
         return (n==0);
    }

    public int getFrente() {
        return frente;
    }

    public int getFin() {
        return fin;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

}
