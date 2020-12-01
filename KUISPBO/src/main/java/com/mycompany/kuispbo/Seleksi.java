/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kuispbo;

/**
 *
 * @author Reyhan
 */
public class Seleksi implements Pembobotan {
    protected int NIK;
    protected String Nama;
    protected double TesTulis;
    protected double TesCoding;
    protected double TesWawancara;
    
     @Override
    public void EditData(double TesTulis, double TesCoding, double TesWawancara)
    {
          this.TesTulis = TesTulis;
          this.TesCoding = TesCoding;
          this.TesWawancara = TesWawancara;
    }

    @Override
    public boolean cekKelulusan() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
