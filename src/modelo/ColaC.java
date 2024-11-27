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
public class ColaC implements ICola {

    private Object[] datos;
    private int frente;
    private int fin;
    private int n;//Contador

    public ColaC() {
        datos = new Object[10];
        frente = 0;
        fin = 0;
        n = 0;
    }

    public ColaC(int tam) {
        datos = new Object[tam];
        frente = 0;
        fin = 0;
        n = 0;
    }

    @Override
    public void insertar(Object item) {
        datos[fin++] = item;
        if (fin == datos.length) {
           fin=0;
        }
        n++;
    }

    @Override
    public Object eliminar() {
        Object salida = datos[frente++];
         if (frente == datos.length) {
            frente=0;
        }
        n--;
        return salida;
    }

    @Override
    public boolean estaLlena() {
        return (n==datos.length);
    }

    @Override
    public boolean estaVacia() {
        return (n==0);
    }

    public Object[] getDatos() {
        return datos;
    }

    public void setDatos(Object[] datos) {
        this.datos = datos;
    }

    public int getFrente() {
        return frente;
    }

    public void setFrente(int frente) {
        this.frente = frente;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
    public int getNumeroElementos() {
    return n; // Número de elementos actualmente en la cola
}

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

}
