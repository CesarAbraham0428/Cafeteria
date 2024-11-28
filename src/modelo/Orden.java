/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Cesar Abraham Lopez Aguilar GDS0643
 */
public class Orden {
    private int num;
    private int mesa;
    private String pedido;

    public Orden() {
    }

    public Orden(int num, int mesa, String pedido) {
        this.num = num;
        this.mesa = mesa;
        this.pedido = pedido;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
}
