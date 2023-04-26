public class Desencriptado {

    public String samuel_camargo_desencriptado (String frase){
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
            if (condicion>25){
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





    public String sergio (String frase) {//ejercicio pendiente no entiendo el y=y%z;
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




    
    public String angelapeña (String frase){
		/*
		 * Esta funcion recibe una palabra para encriptarla, primero toma la palabra ingresada y la vuelve al reves, luego toma la 
		 * palabra al reves y segun la distancia que hay desde el inicio del abecedario hasta cada letra de la palabra, toma esa misma 
		 * distancia desde el final del abecedario y genera una nueva posicion, finalmete toma en un vector de caracteres especiales
		 * esta nueva posicion y lo que hay en ella lo mete dentro de una variable que va a ser la que retorna mi funcion
		 */

		/*en el primer paso para encriptar tomo la palabra al reves 
        hago un ciclo que tome cada valor desde la longitud total de la palabra hasta 0*/

		String resultante1 = ""; //defino una variable tipo String donde voy a incluir la nueva palabra formada letra por letra
		int longitud_palabra = frase.length();//hallo la longitud de la palabra con .length para hacer un ciclo
		for(int contador = longitud_palabra; contador>0 ; contador--){ 
			//hago un ciclo que tome cada valor desde la longitud total de la palabra hasta 0
			String letra = frase.substring(contador-1, contador); //tomo cada letra de la palabra
			resultante1= resultante1 + letra; // agrego la letra en que va el ciclo a la variable de la palabra al revés
		}

		/*ahora defino un vector de caracteres especiales o signos que voy a utilizar para encriptar segun la posicion del abecedario.
        Este vector toma como base los numeros, son diferentes hasta 9 y luego son combinaciones*/
		String [] caracteres_diferentes = {"+", "*","-", "?","!", "~","#", "$","&", "%","*+", "**","*-", "*?","*!", "*~","*#", "*$","*&", "*%","-+", "-*","--", "-?","-!", "-~",};
		//defino en un vector el abecedario 
		String [] abecedario = {"a", "b","c", "d","e", "f","g", "h","i", "j","k", "l","m", "n","o", "p","q", "r","s", "t","u", "v","w", "x","y", "z",};
		String palabra_encriptada = "";  //defino una variable vacia, tipo string en la que voy a meter la palabra encriptada dentro del ciclo
		int longitud_palabra2 = resultante1.length();  //defino en una variable la longitud de la palabra resultante1

		//Recorro la palabra resultante1 tomando cada letra, para esto utilizo la longitud asignada a la anterior variable
		for (int posicion_letra = 1; posicion_letra<=longitud_palabra2; posicion_letra++){
			//en la variable letra_palabra voy tomando cada letra de la palabra ingresada
			String letra_palabra = resultante1.substring(posicion_letra-1,posicion_letra);

			//Dentro de este ciclo hacer otro ciclo anidado que recorra el vector 
			for( int posicion_vector = 0; posicion_vector<abecedario.length; posicion_vector ++){
				//comparo la letra en la que esta el ciclo de la palabra, con la letra que esta en el ciclo del arreglo de abecedario
				String letra_vector = abecedario[posicion_vector];


				//la funcion.equals compara strings. Si la letra de la palabra es igual a la letra del vector entra al condicional 
				if(letra_palabra.equals(letra_vector)){
					/* tomo la posicion en que va el vector y la resto a la longitud del abecedario, este resultado lo asigno a una
                    nueva variable como la nueva posicion con la que se va a tomar la letra para la palabra resultante2*/
					int nueva_posicion = (abecedario.length-1) - posicion_vector;
					//tomo esa nueva posicion en el vector de caracteres especiales y la agrego a la palabra encriptada resultante
					palabra_encriptada = palabra_encriptada + caracteres_diferentes[nueva_posicion]+" ";
				}
			}
		}
		//finalmente la funcion me retorna la palabra encriptada
		return(palabra_encriptada);
	}
}
