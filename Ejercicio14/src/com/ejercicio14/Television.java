package com.ejercicio14;

public class Television extends Electrodomestico{
	  
	 
    private final static int resolucionPorDefecto=20;
  

    private int resolucion;

    private boolean sintonizadorTDT;
 
  

    public Television(double precioBase, double peso){
        this(precioBase, peso, consumoEnergeticoPorDefecto, colorPorDefecto, resolucionPorDefecto, false);
    }

    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
      
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
    
    public double precioFinal(){
        double plus=super.precioFinal();
        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }
  
        return plus;
    }  
}