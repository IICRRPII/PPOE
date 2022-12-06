/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author lo
 */
public class Graduacion {
    private int mNumeroNota;
    private String mDiagnostico;
    private String[][] mHC = new String[2][6];
    
    public Graduacion(
        String ODESF, String ODCIL, String ODEJE, String ODADIC, String ODAO, String ODAI,
        String OIESF, String OICIL, String OIEJE, String OIADIC, String OIAO, String OIAI,
        String Diagnostico, int NumeroNota) {
        
        //Ojo derecho
        mHC[0][0] = ODESF;
        mHC[0][1] = ODCIL;
        mHC[0][2] = ODEJE;
        mHC[0][3] = ODADIC;
        mHC[0][4] = ODAO;
        mHC[0][5] = ODAI;
        
        //Ojo Ojo izquierdo
        mHC[1][0] = OIESF;
        mHC[1][1] = OICIL;
        mHC[1][2] = OIEJE;
        mHC[1][3] = OIADIC;
        mHC[1][4] = OIAO;
        mHC[1][5] = OIAI;
        
        mNumeroNota = NumeroNota;
        mDiagnostico = Diagnostico;
    }

    public int getmNumeroNota() {
        return mNumeroNota;
    }

    public void setmNumeroNota(int mNumeroNota) {
        this.mNumeroNota = mNumeroNota;
    }

    public String getmDiagnostico() {
        return mDiagnostico;
    }

    public void setmDiagnostico(String mDiagnostico) {
        this.mDiagnostico = mDiagnostico;
    }

    public String[][] getmHC() {
        return mHC;
    }

    public void setmHC(String[][] mHC) {
        this.mHC = mHC;
    }
    
    
    
}
