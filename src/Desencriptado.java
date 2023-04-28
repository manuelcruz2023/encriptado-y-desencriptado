import java.util.Scanner;

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
		String resultante = "";
		String[] caracteres_diferentes = { "+", "*", "-", "?", "!", "~", "#", "$", "&", "%", "*+", "**", "*-", "*?",
				"*!", "*~", "*#", "*$", "*&", "*%", "-+", "-*", "--", "-?", "-!", "-~", };
		// defino en un vector el abecedario
		String[] abecedario = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z", };
		String palabra_desencriptada = ""; // defino una variable vacia, en donde voy a ir guardando mi palabra
											// desencriptada
		int longfrase = frase.length();
		if (frase.substring(1, 2).equals(" ")) {
			frase = " " + frase;
		}
		if (frase.length() / 2 * 2 != frase.length()) {
			frase = frase + " ";
			for (int numero = 0; numero < longfrase; numero = numero + 2) {
				System.out.println(frase.substring(numero, numero + 3));
				String caracter_uno_por_uno = frase.substring(numero, numero + 3);
				if (numero == 2) {
					numero += 1;
				}
				for (int posicion_caracter = 0; posicion_caracter < caracteres_diferentes.length; posicion_caracter++) {
					String caracter_encriptado = caracteres_diferentes[posicion_caracter];// recorro el vector de
																							// caracteres
					String nuevo_caracter_encriptado = " " + caracter_encriptado + " ";
					if (caracter_uno_por_uno.equals(nuevo_caracter_encriptado)) {
						int posicion_original = (caracteres_diferentes.length - 1) - posicion_caracter;
						palabra_desencriptada = palabra_desencriptada + abecedario[posicion_original];
					}
					if (caracter_uno_por_uno.substring(0, 2).equals(caracter_encriptado)) {
						int posicion_original = (caracteres_diferentes.length - 1) - posicion_caracter;
						palabra_desencriptada = palabra_desencriptada + abecedario[posicion_original];
					}
					if (caracter_uno_por_uno.substring(1, 3).equals(caracter_encriptado)) {
						int posicion_original = (caracteres_diferentes.length - 1) - posicion_caracter;
						palabra_desencriptada = palabra_desencriptada + abecedario[posicion_original];
					}
				}
			}
		} else {
			frase = frase + "  ";
			for (int numero = 0; numero < longfrase; numero += 2) {
				String caracter_uno_por_uno = frase.substring(numero, numero + 3);
				if (numero == 2) {
					numero += 1;
				}
				for (int posicion_caracter = 0; posicion_caracter < caracteres_diferentes.length; posicion_caracter++) {
					String caracter_encriptado = caracteres_diferentes[posicion_caracter];// recorro el vector de
																							// caracteres
					String nuevo_caracter_encriptado = " " + caracter_encriptado + " ";
					if (caracter_uno_por_uno.equals(nuevo_caracter_encriptado)) {
						int posicion_original = (caracteres_diferentes.length - 1) - posicion_caracter;
						palabra_desencriptada = palabra_desencriptada + abecedario[posicion_original];
					}
					if (caracter_uno_por_uno.substring(0, 2).equals(caracter_encriptado)) {
						int posicion_original = (caracteres_diferentes.length - 1) - posicion_caracter;
						palabra_desencriptada = palabra_desencriptada + abecedario[posicion_original];
					}
					if (caracter_uno_por_uno.substring(1, 3).equals(caracter_encriptado)) {
						int posicion_original = (caracteres_diferentes.length - 1) - posicion_caracter;
						palabra_desencriptada = palabra_desencriptada + abecedario[posicion_original];
					}
				}
			}
		}
		for (int contador = palabra_desencriptada.length(); contador > 0; contador--) {
			String letra = palabra_desencriptada.substring(contador - 1, contador); // tomo cada letra de la palabra
			resultante = resultante + letra; // agrego la letra en que va el ciclo a la variable de la palabra al
												// revés
		}
		return resultante;
	}




	public String selene (String frase, int cuantos, int variable){//tomo como base el ejercicio de selene
		Scanner lectuScanner = new Scanner(System.in);
		
		String desencriptado = "";
		String[] abecedario = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };// array abecedario
		int[] sucesión_de_fibonacci = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
				6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418 };
		for (int ciclos = 1; ciclos <= cuantos; ciclos++) {
			variable = lectuScanner.nextInt();
			for (int i = 0; i < sucesión_de_fibonacci.length; i++) {
				int numero_fibonnaci = sucesión_de_fibonacci[i];
				if (variable == numero_fibonnaci){
					desencriptado = desencriptado + abecedario[i];
					if (variable == 1){
						int condicion = sucesión_de_fibonacci[i+1];
						if (2==condicion){
							desencriptado = desencriptado + abecedario[1];
						}
						if (1 == condicion){
							desencriptado = desencriptado + abecedario[0];
						}
					}
				}

			}
		}

       return desencriptado;
	}
}
