/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guillermovallespir.dbscriptmaker.Clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guille
 */
public class XMLInside implements java.io.Serializable{
    private String nombre_archivo;
    private String autor;
    private String comentario;
    private Date fecha_creacion;
    private Date fecha_modificacion;
    
    private String uml;
    
    private ArrayList<Historial> historial;
    
    public XMLInside(String nombre_archivo){
        this.nombre_archivo = nombre_archivo;
        this.fecha_creacion = Calendar.getInstance().getTime();
        this.fecha_modificacion = Calendar.getInstance().getTime();
        this.historial = new ArrayList<>();
    }
    
    public void setNombre_archivo(String nombre_archivo){
        this.nombre_archivo = nombre_archivo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    
    public void setFecha_modificacion(){
        this.fecha_modificacion = Calendar.getInstance().getTime();
    }
    
    public void setUml(String uml){
        this.uml = uml;
    }
    
    public String getNombre_archivo(){
        return this.nombre_archivo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public String getComentario(){
        return this.comentario;
    }
    
    public String getFecha_creacion(){
        return this.fecha_creacion.toLocaleString();
    }
    
    public String getFecha_modificacion(){
        return this.fecha_modificacion.toLocaleString();
    }
    
    public String getUml(){
        return this.uml;
    }
    
    public Date getFecha_creacion_toDate(){
        return this.fecha_creacion;
    }
    
    public Date getFecha_modificacion_toDate(){
        return this.fecha_modificacion;
    }
    
    public void addHistorial(Historial historial){
        this.historial.add(historial);
    }
    
    public void addHistorial(String file, int linea, String modificacion){
        Historial historial = new Historial(file, linea, modificacion);
        this.historial.add(historial);
    }
    
    public ArrayList<Historial> getHistorial(){
        return this.historial;
    }
    
    public Historial getHistorial(int i){
        return this.historial.get(i);
    }
    
    public ArrayList<Historial> getHistorial(String autor){
        ArrayList<Historial> his = new ArrayList<>();
        
        for(int i = 0; i < this.historial.size(); i++){
            Historial historia = (Historial) this.historial.get(i);
            if(historia.getAutor().equalsIgnoreCase(autor)){
                his.add(this.historial.get(i));
            }
        }
        
        return his;
    }
    
    public ArrayList<Historial> getHistorial(Date fecha){
        ArrayList<Historial> his = new ArrayList<>();
        
        for(int i = 0; i < this.historial.size(); i++){
            Historial historia = (Historial) this.historial.get(i);
            if(historia.getFecha().toString().equals(fecha.toString())){
                his.add(this.historial.get(i));
            }
        }
        
        return his;
    }
}
