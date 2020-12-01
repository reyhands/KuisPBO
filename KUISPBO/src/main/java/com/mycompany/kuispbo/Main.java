/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kuispbo;

import java.util.Scanner;

/**
 *
 * @author Reyhan
 */
public class Main {
    
     public static void main(String[] args)
     {
         Scanner InputNIK = new Scanner(System.in);
         Scanner InputNama = new Scanner(System.in);
         Scanner InputTesTulis = new Scanner(System.in);
         Scanner InputTesCoding = new Scanner(System.in);
         Scanner InputTesWawancara = new Scanner(System.in);
         Scanner Temp = new Scanner(System.in);
         System.out.println("Pilihan Divisi :\n1. Android Development\n2. Web Development\n Pilih : ");
            int temp1 = Temp.nextInt();
        try{  
                System.out.println("Input NIK : ");
                    int NIK = InputNIK.nextInt();
                System.out.println("Input Nama : ");
                    String Nama = InputNama.nextLine();
                System.out.println("Input Tes Tulis : ");
                    double TesTulis = InputTesTulis.nextDouble();
                System.out.println("Input Tes Coding : ");
                    double TesCoding = InputTesCoding.nextDouble();
                System.out.println("Input Tes Wawancara : ");
                    double TesWawancara = InputTesWawancara.nextDouble();
               
                
                    
        
       
             SeleksiAndroid SeleksiAndroid1 = null  ;
             SeleksiWeb SeleksiWeb1 = null;
             
             if(temp1==0)
              {
                  SeleksiAndroid1 = new SeleksiAndroid(NIK,Nama,TesTulis,TesCoding,TesWawancara);
              }     
             else if(temp1==1)
             {
             
                 SeleksiWeb1 = new SeleksiWeb(NIK,Nama,TesTulis,TesCoding,TesWawancara);
              }
      int temp2=0;
      do
      {
            System.out.println("\nMenu:\n1.Edit\n2.Lihat\n3.Exit \nPilih : ");
              temp2 = Temp.nextInt();
              
             
       
            switch(temp2)
            {
                case 1 -> { 
                                  System.out.println("Input Tes Tulis : ");
                                       TesTulis = InputTesTulis.nextDouble();
                                   System.out.println("Input Tes Coding : ");
                                       TesCoding = InputTesCoding.nextDouble();
                                   System.out.println("Input Tes Wawancara : ");
                                       TesWawancara = InputTesWawancara.nextDouble();
                                       
                            if(temp1==0)
                                
                            SeleksiAndroid1.EditData(TesTulis, TesCoding, TesWawancara);
                            
                            else if(temp1==1)
                                SeleksiWeb1.EditData(TesTulis, TesCoding, TesWawancara);
                            
                           }
                
                case 2 -> {
                    
            
   
                        if(temp2==0)
                        {

                            if(SeleksiAndroid1.CekKelulusan()==true)
                            {
                                System.out.println("Saudara"+Nama+"Lulus");
                            }
                            else
                            {
                                System.out.println("Saudara"+Nama+"Tidak Lulus");
                            }
                        }

                        else
                        {

                            if(SeleksiWeb1.CekKelulusan()==true)
                                {
                                System.out.println("Saudara"+Nama+"Lulus");
                            }
                            else
                            {
                                System.out.println("Saudara"+Nama+"Tidak Lulus");
                            }
                        }
                        
                    }
                
                case 3 -> {
                              return;
                          }
                
                
                }
                  
            }
      while(temp2!=3);
             
     }
        
        
        catch(Exception e)
     {
         System.out.println("Masukkan Tipe Data Yang Benar !");
     }
        
     }
     
     
     
    }
    

