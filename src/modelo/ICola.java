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
public interface ICola {
    public void insertar(Object item);
    public Object eliminar();
    public boolean estaLlena();
    public boolean estaVacia();
}
