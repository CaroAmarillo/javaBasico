package com.ejercicio17;

public class Password {
	
	public int longitud;
	

	public String contraseña;
	public int longitudPorDefecto = 8;
	
	public Password(){}
	
	public Password(int longitud){
		this.longitud = longitud;
		this.contraseña = generarPassword();
	}

	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
	
	public String generarPassword(){
		String password="";
        for (int i=0;i<longitud;i++){
            int pedir=((int)Math.floor(Math.random()*3+1));
  
            if (pedir==1){
                char letraMinuscula=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=letraMinuscula;
            }else{
                if(pedir==2){
                    char letraMayuscula=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=letraMayuscula;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }
        }
        return password;
    }
	
	public boolean esFuerte(){
        int numeros=0;
        int minusculas=0;
        int mayusculas=0;
        for (int i=0;i<contraseña.length();i++){
                if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
                	minusculas+=1;
                }else{
                    if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
                    	mayusculas+=1;
                }else{
                	numeros+=1;
                    }
                }
            }
            if (numeros>=5 && minusculas>=1 && mayusculas>=2){
            return true;
        }else{
            return false;
        }
    }
  
		
}