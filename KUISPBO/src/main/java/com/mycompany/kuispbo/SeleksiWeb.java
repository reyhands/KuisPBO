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
public class SeleksiWeb extends Seleksi 
{
    
     SeleksiWeb(int NIK,String Nama,double TesTulis,double TesCoding,double TesWawancara)
    {
        this.NIK = NIK;
        this.Nama = Nama;
        this.TesTulis = TesTulis;
        this.TesCoding = TesCoding;
        this.TesWawancara = TesWawancara;
    }

      public boolean CekKelulusan()
    {
       if((this.TesTulis*(0.4)+this.TesCoding*(0.35)+this.TesWawancara*(0.25))>=85)
       {
           return true;
       }
       
       else
           return false;
    }
    
}
