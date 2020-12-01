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
public class SeleksiAndroid extends Seleksi 
{
    SeleksiAndroid(int NIK,String Nama,double TesTulis,double TesCoding,double TesWawancara)
    {
        this.NIK = NIK;
        this.Nama = Nama;
        this.TesTulis = TesTulis;
        this.TesCoding = TesCoding;
        this.TesWawancara = TesWawancara;
    }
    
    public boolean CekKelulusan()
    {
       if((this.TesTulis*(20/100)+this.TesCoding*(50/100)+this.TesWawancara*(30/100))>=85)
       {
           return true;
       }
       
       else
           return false;
    }
}
