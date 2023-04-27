public class Desencriptado {

    public String samuel_camargo_desencriptado (String frase){//tomo como base el ejercicio de encriptado de Samuel----completado
        String encriptarPalabra = ""; //se inicializa una varianle para contener el resultado

        String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; // se inicializa un vector para contener las letras del abecedario
		String[] deletreo = new String [frase.length()]; // se inicializa un vector para almacenar la palabra a encriptar

        for(int i=0; i<frase.length();i++){   // para i = 0 mientras i sea menor que el largo de la palabra i aumenta en 1

			deletreo[i] = frase.substring(i, 1+i); // se toma la palagra ingresada y se separa letra por letra
        }

    for(int j=0;j<deletreo.length;j++){  // para j = 0 mientras j sea menor que el largo del deletreo de la palabra aumentar j en 1
        String deletras = deletreo[j]; // se inicializa una variable que almacene el vector de deletreo


        for(int i=0; i<abecedario.length;i++){ // para i = o mientras i sea menor que 26 aumentar i en 1

            String letras = abecedario[i];  // se inicializa una variable que almacene las letras del abecedario
            int condicion = i + frase.length()*2;  /*se inicializa una variable que almacena las condiciones de encriptacion 
                                                que es restar el numero de espacios del largo de la palabra y se multiplica ese valor en 2 */ 

            if(condicion<0){  // se crea una condicion para evitar que la encriptacion se desborde del abecedario

                condicion=condicion+abecedario.length;
            }
            if (condicion>25){//solo agrego una nueva condicion que no me busque una posicion que no existe en el vector
                condicion = condicion - abecedario.length;
            }
            if (deletras.contains(letras) == true ){ // se crea la condicion para encriptar la palabra

                encriptarPalabra = encriptarPalabra +  abecedario[condicion];
                break;
            }
        }
    }   
        return encriptarPalabra;
    }





    public String sergio (String frase) {//tomo como base el ejercicio de encriptado de Sergio----ejercicio pendiente no entiendo el y=y%z;
		String[] vector={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"," "};
		String resultado="";
		for(int i=0;i<frase.length();i++){//ciclo desde la primera letra hasta la ultima
			for(int x=0;x<vector.length;x++){//ciclo de a hasta z
				if(vector[x].equals(frase.substring(i,i+1))){//comprueba si la letra es igual a la posicion en el vector
					int y=x;
					for(int z=16;z>=1;z=z/2){//comprueba la cuatro potencias para cada letra
						if(y/z>=1){//este ciclo prueba con las potencias de 2 y si es mayor que alguna de esta agrega un asterisco
							resultado+="*";
							y=y%z;//con esto al agregar un * le saca el modulo del valor de esa potencia 
						}else{
							resultado+=" ";//si no es divisible entonces me suma un espacio que es la opcion apagado
						}
					}
					resultado+="/";//separa cada letra 
					break;//acaba con el ciclo
				}
			}
		}


		return resultado;
	}




    
    public String angelapeña (String frase){//tomo como base el ejercicio de encriptado de Angela
		String resultante1 = ""; //defino una variable tipo String donde voy a incluir la nueva palabra formada letra por letra
		int longitud_palabra = frase.length();
		for(int contador = longitud_palabra; contador>0 ; contador--){ 
			String letra = frase.substring(contador-1, contador); //tomo cada letra de la palabra
			resultante1= resultante1 + letra; // agrego la letra en que va el ciclo a la variable de la palabra al revés
		}
		String [] caracteres_diferentes = {"+", "*","-", "?","!", "~","#", "$","&", "%","*+", "**","*-", "*?","*!", "*~","*#", "*$","*&", "*%","-+", "-*","--", "-?","-!", "-~",};
		//defino en un vector el abecedario 
		String [] abecedario = {"a", "b","c", "d","e", "f","g", "h","i", "j","k", "l","m", "n","o", "p","q", "r","s", "t","u", "v","w", "x","y", "z",};
		String palabra_desencriptada = "";  //defino una variable vacia, en donde voy a ir guardando mi palabra desencriptada
		int longitud_palabra2 = resultante1.length();  //defino en una variable la longitud de la palabra resultante1

		//Recorro la palabra tomando cada letra, para esto utilizo la longitud asignada a la anterior variable
		for (int posicion_letra = 0; posicion_letra<=longitud_palabra2-1; posicion_letra++){
			String caracter_encriptado = resultante1.substring(posicion_letra,posicion_letra+1);

			//Dentro de este ciclo hacer otro ciclo anidado que recorra el vector 
			for( int posicion_vector = 0; posicion_vector<abecedario.length; posicion_vector ++){
				//comparo la letra en la que esta el ciclo de la palabra, con la letra que esta en el ciclo del arreglo de los caracteres diferentes
				String letra_vector = caracteres_diferentes[posicion_vector];


                if(caracter_encriptado.equals(letra_vector)){
                    caracter_encriptado = " " + caracter_encriptado + " ";
                    letra_vector = " " + letra_vector + " ";
                    if (caracter_encriptado.equals(letra_vector)){
                        int posicionabc = posicion_vector + ((abecedario.length-1)-posicion_vector);
                        palabra_desencriptada = palabra_desencriptada + abecedario[posicionabc];
                    }
                    
				}
			}
		}
		//finalmente la funcion me retorna la palabra encriptada
		return(palabra_desencriptada);
	}
}
