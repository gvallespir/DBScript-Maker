/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guillermovallespir.dbscriptmaker.Clases;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guille
 */
public class Historial implements java.io.Serializable {
    private Date fecha;
    private String autor;
    private String archivo;
    private int linea;
    private String modificacion;
    
    public Historial(String archivo, int linea, String modificacion){
        this.fecha = Calendar.getInstance().getTime();
        this.autor = System.getProperty("user.name");
        this.archivo = archivo;
        this.linea = linea;
        this.modificacion = modificacion;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public Date getFecha(){
        return this.fecha;
    }
}
