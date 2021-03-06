package com.ejercicio14;

public class Electrodomestico {
	
	protected int precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	private String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
	private boolean colorCorrecto=false;
	//Datos por defecto

	protected final static String colorPorDefecto = "blanco";
	protected final static char consumoEnergeticoPorDefecto = 'F';
	protected static int precioBasePorDefecto = 100;
	protected final static double pesoPorDefecto = 5;



	public Electrodomestico(){}
	
	public Electrodomestico(double peso, int precioBase){
		
		this.peso = peso;
		this.precioBase = precioBase;
		this.color = "Blanco";
		this.consumoEnergetico = 'F';		
	}
	
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	
	public void comprobarColor(){
  
        for(int i=0;i<this.colores.length && !colorCorrecto;i++){
              
            if(colores[i].equals(color)){
                colorCorrecto=true;
            }
              
        }
          
        if(colorCorrecto){
            this.color=color;
        }else{
            this.color=colorPorDefecto;
        }
          
	}

	 public double precioFinal(){
        double plusConsumo=0;
        switch(consumoEnergetico){
            case 'A':
                plusConsumo+=100;
                break;
            case 'B':
                plusConsumo+=80;
                break;
            case 'C':
                plusConsumo+=60;
                break;
            case 'D':
                plusConsumo+=50;
                break;
            case 'E':
                plusConsumo+=30;
                break;
            case 'F':
                plusConsumo+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
            plusConsumo+=10;
        }else if(peso>=20 && peso<49){
            plusConsumo+=50;
        }else if(peso>=50 && peso<=79){
            plusConsumo+=80;
        }else if(peso>=80){
            plusConsumo+=100;
        }
   
        return precioBase+plusConsumo;
    }
	 public void comprobarConsumoEnergetico(char consumoEnergetico){
          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=consumoEnergeticoPorDefecto;
        }
          
    }
}
