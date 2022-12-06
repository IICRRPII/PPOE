/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author lo
 */
public class Usuario {
    private String Mnombre;
    private String Constraseña;

    public Usuario(String Mnombre, String Constraseña) {
        this.Mnombre = Mnombre;
        this.Constraseña = Constraseña;
    }

    public String getMnombre() {
        return Mnombre;
    }

    public void setMnombre(String Mnombre) {
        this.Mnombre = Mnombre;
    }

    public String getConstraseña() {
        return Constraseña;
    }

    public void setConstraseña(String Constraseña) {
        this.Constraseña = Constraseña;
    }
    
    
}
