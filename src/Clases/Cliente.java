/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author lo
 */
public class Cliente {
    private int mNumeroNota;
    private Date mFechaNota;
    private String mNombre;
    private int mEdad;
    private String mTelefono;
    private String mDireccion;

    public Cliente(int mNumeroNota, Date mFechaNota, String mNombre, int mEdad, String mTelefono, String mDireccion) {
        this.mNumeroNota = mNumeroNota;
        this.mFechaNota = mFechaNota;
        this.mNombre = mNombre;
        this.mEdad = mEdad;
        this.mTelefono = mTelefono;
        this.mDireccion = mDireccion;
    }

    public int getmNumeroNota() {
        return mNumeroNota;
    }

    public void setmNumeroNota(int mNumeroNota) {
        this.mNumeroNota = mNumeroNota;
    }

    public Date getmFechaNota() {
        return mFechaNota;
    }

    public void setmFechaNota(Date mFechaNota) {
        this.mFechaNota = mFechaNota;
    }

    public String getmNombre() {
        return mNombre;
    }

    public void setmNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    public int getmEdad() {
        return mEdad;
    }

    public void setmEdad(int mEdad) {
        this.mEdad = mEdad;
    }

    public String getmTelefono() {
        return mTelefono;
    }

    public void setmTelefono(String mTelefono) {
        this.mTelefono = mTelefono;
    }

    public String getmDireccion() {
        return mDireccion;
    }

    public void setmDireccion(String mDireccion) {
        this.mDireccion = mDireccion;
    }
    
    
    
}
