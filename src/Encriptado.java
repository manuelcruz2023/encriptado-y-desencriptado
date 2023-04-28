import java.util.Random;



public class Encriptado {
	public String samuelcamargo(String frase) {
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
				int condicion = i - frase.length()*2;  /*se inicializa una variable que almacena las condiciones de encriptacion 
                                                    que es restar el numero de espacios del largo de la palabra y se multiplica ese valor en 2 */ 

				if(condicion<0){  // se crea una condicion para evitar que la encriptacion se desborde del abecedario

					condicion=condicion+abecedario.length;
				}
				if (deletras.contains(letras) == true ){ // se crea la condicion para encriptar la palabra

					encriptarPalabra = encriptarPalabra +  abecedario[condicion];
					break;
				}
			}
		}
		return encriptarPalabra;   
	}





	public String sergio (String frase) {
		String[] vector={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"," "};
		String resultado="";
		for(int i=0;i<frase.length();i++){//ciclo desde la primera letra hasta la ultima
			for(int x=0;x<vector.length;x++){//ciclo de a hasta z
				if(vector[x].equals(frase.substring(i,i+1))){//comprueba si la letra es igual a la posicion en el vector
					int y=x;
					for(int z=16;z>=1;z=z/2){//comprueba la cuatro potencias para cada letra
						if(y/z>=1){//este ciclo prueba con las potencias de 2 y si es mayor que alguna de esta agrega un asterisco
							resultado+="1";
							y=y%z;//con esto al agregar un 1 le saca el modulo del valor de esa potencia 
						}else{
							resultado+="0";//si no es divisible entonces me suma un espacio que es la opcion apagado
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





	public String manuel (String frase){//correccion
		return"";
	}





	public String selene (String frase){
		String texto=frase;
		//*esta función recibe una palabra para encriptarla, según la posición en el abecedario de la letra, se realizará
    	/* la sucesión de fibonnaci, y se arrojara el número resultante*/
       String fin ="programa finalizado"; 
       String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};//array abecedario
       int large = texto.length();//largo de la palabra ingresada para hacer un ciclo
       for(int i=0; i<large; i++){//ciclo que recorre las letras de la palabra
           String letra = texto.substring(i, i+1);//substring que toma cada letra
           for(int j = 0; j<=26; j++ ){//ciclo que recorre el abecedario
               /*contadores que permiten realizar la sucesión de fibonnaci */
               int contadorUno=0;
               int contadorDos=1;
               int contadorTres=1;
               if(letra.equals(abecedario[j])){//cuando encuentre la letra en el abecedario
                   int posicion = j+1;//la posición de la letra +1 para q "a" no sea igual a 0
                   for(int x=0; x<posicion; x++){//for para sucesión de fibonacci
                       //el contadorUno representará el número anterior por el que se va a sumar luego, el contadorDos la suma ya hecha y el contadorTres la suma como tal
                       contadorDos=contadorTres;
                       contadorTres=contadorDos+contadorUno;
                       contadorUno=contadorDos;
                   }System.out.println(contadorDos);//imprime el resultado de la encriptación letra por letra
               }
           }
       }

       return fin;
	}

	public String yimir (String frase, int año, int mes) {
		/*
		 * esta funcion recibe una palabra para encriptar a su vez recibe un año 
		 * y un mes (prferiblemente año y ,es de nacimiento)que mediente operaciones matematicas basica
		 * genera un numero personal, el cual sera el numero de veces que avanza  de la posicion original a la nueva posicion
		 * s
		String palabra="";// recibe la palbra a encriptar
		int año=0;// recibe un valor numerico
		int mes=0;//recibe valor numerico
		/*
		 * array que contiene una palabra que inicia  por cada letra del abecedario
		 */
		String[] abc = {"array","bucle","cadena","definir","enlace","funcion","gato","hijo","incremento","java","kilo","lamento","matriz","nada","ñandu","operador","patron","quizz","raton","sistema","terminal","ubicacion","vida","wilslson","xilofon","yuca","zzz"};
		String palabra= frase;
		/*
		 * el siguiente proceso se hace para tener un numero personalizado depentienndo el año y mes de nacimiento
		 */
		int codigo=(año*mes)/(mes+(año/2));//genera un numero realizando operaciones matematicas basado en los datos recibidos 
		int codigoA=codigo/10; // divide el resultado anterior y saca la parte parte entera
		int codigoB=codigo %10; //divide el resultado anterior y saca la parte decimalparte decimal
		int codigoF= codigoA+ codigoB; // suma la parte entera y la parte decimal para que sea un solo numero  
		String encriptado=""; // almacena las palabras que componen la encriptacion 
		/*
		 * for que sirve para aumentar la variable dependiendo el numero de las letras de la palabra ingresada
		 * para poder recorrer cada letra de la palabra
		 */
		for(int incremento=0;incremento<= palabra.length()-1;incremento++) { 
			for(int posicion=0; posicion<= abc.length-1; posicion++) { // for para recorrer el arreglo
				/*
				 * el string me toma la primera letra de cada palabara del arreglo
				 * para despues compararla con cada letra de la palabra
				 */
				String letra= abc[posicion].substring(0, 1); 
				/*
				 *  condicional para comparar cada una de  las letras de la palabra 
				 *  con la primera de la palbra de cada palabra del arreglo 
				 */
				if( palabra.substring(incremento, incremento+1).equals(letra)) { 
					int posicion2=posicion+codigoF;
					/*
					 * esta condicion sirve para que cuando la letra encriptada supere el tamaño del arreglo esta
					 * continue ahora desde el inico del arreglo
					 */
					if(posicion2>abc.length) { 
						/*
						 * con esta operacion lo que hago es sumar la posicion de la letra en el arreglo
						 * con el codigo que cree anteriormente que es el que me dice las veces que avanzo de legtra 
						 * en el arreglo, luego lo resto con la longitud del arreglo y el resultado es el 
						 * numero que veces que avnzara ahora desde el primer caracter del arreglo
						 */
						int volver = ( posicion2)-abc.length ;
						/*
						 * agrega palabras a las ya guardadas, ademas de un "/" para distinguir mejor cada palabra
						 */
						encriptado=encriptado+"/"+abc[volver]; 
					}else {
						/*
						 * agrega palabras a las ya guardadas, ademas de un "/" para distinguir mejor cada palabras
						 */
						encriptado=encriptado+"/"+abc[posicion2];
					}
				}
			}
		}
		return encriptado;
	}





	public String davidcruz(String palabra) { //correccion 
		
		return "" ; //La funcion me retorna la palabra encriptada	       
	}





	public String lauracampiño(String frase) {

		/*El programa encripta la palabra asi:
		 * Paso 1: Convierte cada letra a su equivalente en numero (a=1, b=2...)
		 *Paso 2: Si el numero es par le suma la cantidad de letras de la palabra.
		 *Si el numero es impar le resta la cantidad de letras de la palabra.
		 *Paso 3: convierte el nuevo numero de vuelta a letra (1=a, 2=b...)
		 *Paso 4: Busca la nueva letra en un vector de 13 columnas y 2 filas con el abecedario escrito al reves
		 *Paso 5: multiplica las coordenadas en las que se encontro la letra (z=1*1, a=13*2...)
		 *Paso 6: Si la fila es 1 añade A antes del numero, si la fila es 2 añade B.
		 *Paso 7: Escribe la letra seguida del numero para cada letra (cada letra se separa con un punto)
		 *Ejemplo:
		 *Vaca= A1.A4.A2.A4
		 */

		String palabra = frase;
		palabra.toLowerCase();

		String abc = "abcdefghijklmnopqrstuvwxyz";
		//definir variables
		//variable que guarde la posicion en el abecedario de la letra
		int valorNumero = 0;
		//variable que guarde el valor despues del paso 2
		int nuevoValor = 0;
		//variable que guarde la nueva letra en el paso 3
		char nuevaLetra = ' ';
		//vector que guarde dos filas de 13 columnas de letras para el paso 4
		char[][] paso4 = {
				{'z','y','x','w','v','u','t','s','r','q','p','o','n'},
				{'m','l','k','j','i','h','g','f','e','d','c','b','a'},
		};
		//variable que guarde la fila de la letra
		int coor1 = 0;
		//variable que guarde la columna de la letra
		int coor2 = 0;
		//variable que guarde la palabra encriptada
		String nuevaPalabra = "";

		//un ciclo for que recorra la palabra letra por letra
		//para i que es 0, mientras i sea menor a la longitud de la palabra, aumentar i en 1
		for (int i=0; i<palabra.length(); i++) {

			//un ciclo que recorra el abecedario letra por letra
			//para posicion que es 0, mientras sea menor a la longitud de abc, aumentar en 1
			for (int posicion = 0; posicion<abc.length(); posicion++) {

				//un if que guarde en valorNumero la posicion de la letra en el abecedario
				if (palabra.charAt(i) == abc.charAt(posicion)) {
					valorNumero = posicion+1;

					//un if que determine si el valorNumero es par o no
					if (valorNumero % 2 == 0) {
						//si es par, que sume a valorNumero (posicion de letra) el largo de palabra
						nuevoValor = valorNumero+palabra.length();

						//si nuevoValor se sale del largo de abc, que se reste el largo de abc 
						//este if hace que despues de z siga a
						if (nuevoValor > abc.length()) {
							nuevoValor = nuevoValor - abc.length();
							nuevaLetra = abc.charAt(nuevoValor-1);
						}else {
							nuevaLetra = abc.charAt(nuevoValor-1);
						}

					}else {
						//si no es par, que reste a valorNumero(posicion letra) el largo de palabra
						nuevoValor = valorNumero-palabra.length();

						//si nuevoValor se sale del largo de abc, que se sume el largo de abc
						//este if hace que antes de a este z
						if (nuevoValor < 1) {
							nuevoValor = nuevoValor + abc.length();
							nuevaLetra = abc.charAt(nuevoValor-1);
						}else {
							nuevaLetra = abc.charAt(nuevoValor-1);

						}

					}

					//un for que recorra las filas del vector paso4
					for (int fila = 0; fila<2; fila++) {
						//un for que recorra las columnas del vector paso4
						for (int columna = 0; columna<13; columna++ ) {

							//un if que guarde la fila y columna en que se encuentra cada letra
							//coor1 (fila), coor2 (columna)
							if (nuevaLetra == paso4[fila][columna]) {
								coor1 = fila+1;								
								coor2 = columna+1;

								//la variable nuevoValor es el producto de las coordenadas
								nuevoValor = coor1*coor2;

								//la nuevaPalabra es cada letra encriptada separada por punto

								if (coor1==1) {
									nuevaPalabra = nuevaPalabra+'A'+nuevoValor+".";
								}else {
									nuevaPalabra = nuevaPalabra+'B'+nuevoValor+".";
								}
							}
						}
					}
				}
			}
		}

		return nuevaPalabra;
	}
	/*
	 * Nicol Sofia Cepeda Vanegas - 202213321
	 * Con este ejercicio se pasa de una palabra en español a una en morse haciendo uso de los vectores y sus posiciónes.
	 * Se pide la palabra, se pasa a mayusculas y después dependiendo de las posiciones cambia a morse
	 */
	public String nicolcepeda(String frase) {
		/*
		 * vector de abecedario y de morse correspondientemente,
		 * las letras tienen la misma posición en morse que en el abecedario
		 */
		String[] letraEsp = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		String[] letraMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "--.--", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		System.out.println("Por favor ingrese la palabra a encriptar"); //muestra el mensaje que pide la palabra
		String palabraEsp = frase; //Scanner para ingresar palabra

		String palabraMayus = palabraEsp.toUpperCase(); // pasar toda la palabra a mayusculas porque en el vector está así

		String palabraEnc = ""; //Inicializa palabraEnc con nada para poderse usar después en la impresión de la palabra encriptada
		// ciclo for desde 1 hasta la longitud de la palabra
		for (int i = 1; i <= palabraEsp.length(); i++) {
			/*  esa el substring para extraer la subcadena de texto de la palabra (Letra), va desde el inicio de la letra hasta 
	            el final de la letra (i-1, i)*/
			String letra = palabraMayus.substring(i-1, i);
			// ciclo for para establecer la posición morse
			for (int j = 0; j < letraEsp.length; j++) {
				// comparar la letra en la posición correspondiente con el vector de las letras del abecedario en español
				if (letra.equals(letraEsp[j])) {
					/*
					 * se muestra la letra en morse con la posición j que se había comparado en el vector de las letras en español, 
					 * como tienen la misma posición en español y en morse solo hay que poner la j para que se entienda cual posición es en morse
					 * la letra encriptada se va almacenando en palabraEnc
					 */ 
					palabraEnc = palabraEnc + letraMorse[j] + "|"; 
				}
			}
		}
		return palabraEnc;
	}





	public String samiryate( String texto){//correccion
		return "";
	}





	public String lauracorrea (String palabra) {
   	 
 		int largoPalabra = palabra.length(); // Variable de tipo entero para obtener el largo de la palabra dada

 		String encriptada = "";	//Variable string para agregar la palabra ya encriptada

 		// Vector de strings con las palabras que se retornan por letra encriptada

 		String [] lista_palabras = 

{"magdalena","fishburne","crucial","kendrik","suena","perfume","goodgirls","bahia","swift","semejante","akkas","ambulance","tiempos","mango","ghost","zepet","buque","world","misma","anestecia","uchuvas","alvin","williamwilson","boxeo","nsync","gozar"};

 		for(int i = 0; i < largoPalabra; i++) { //Ciclo for para recorrer la palabra por caracteres

 			String caracter = palabra.substring(i,i+1); // Variable string para tomar cada caracter de la palabra

 			for(int j = 0; j < lista_palabras.length; j++) { //Ciclo for para recorrer el vector de palabras

 				String letraPalabra = lista_palabras[j]; //Variable string para tomar la palabra en cada posicion del vector

 				int buscar = (letraPalabra.length()-1)/2 ; // Variable de tipo entero para tomar la letra central en la palabra del vector

 				//Variable string para tomar la letra central de la palabra

 				String coincidenciaPalabra = letraPalabra.substring(buscar,buscar+1);

 				//Condicional en caso de que la letra en la palabra sea igual a la letra extraida
 

 				if (coincidenciaPalabra.equals(caracter)) {

 					encriptada = encriptada+letraPalabra+"-";//Si coinciden se agrega a la variable encriptar
                     break;
 				}
 			}

 		}	 		
    	         return(encriptada);
     } 





	public String eliascamargo (String frase) {
		int posicionanterior=0;
		int posicionsiguiente=0;
		String palabra="";
		String letraanterior="";
		String letrasiguiente="";
		String nuevapalabra="";
		String [] abecedario = {"a", "b","c", "d","e", "f","g", "h","i", "j","k", "l","m", "n","o", "p","q", "r","s", "t","u", "v","w", "x","y", "z",};
		for (int g=0; g<frase.length();g++) {
			palabra=frase.substring(g,g+1);
			for (int y=0; y<abecedario.length;y++) {
				if(palabra.compareTo(abecedario[y])==0) {
					posicionanterior=y-1;
					posicionsiguiente=y+1;
					if(posicionanterior<0) {
						posicionanterior=posicionanterior+abecedario.length;
					}
					if(posicionsiguiente>abecedario.length) {
						posicionsiguiente=posicionsiguiente-abecedario.length;
					}
					letraanterior=abecedario[posicionanterior];
					letrasiguiente=abecedario[posicionsiguiente];
				}
			}
			nuevapalabra=nuevapalabra+letraanterior+letrasiguiente;
			
		}
		return nuevapalabra;
	}





	public String tomasespinel (String palabra, int numero, boolean desicion) {// creamos metodo para encriptar la palabra
		int posicion=0;
		String palabraEncriptada = "";//creamos variable para ir agragando letra encriptada
		String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};// array con abecedario
		for(int i = 0; i < palabra.length(); i++) {//ciclo que recorre la longitud de la palabra a encriptar
			String caracter = palabra.substring(i,i+1);//substring para sacar letra por letra
			for(int y=0; y<abc.length;y++) {
				if(caracter.compareTo(abc[y])==0) {
					 posicion=y;
					break;
				}
			}
			int zona =posicion ;//asigno variable con la posicio de la letra
			if(zona < 0) {
				palabraEncriptada += caracter;// si se cumple la condicion agregar caracter directamente
			}else {
				int zonaNueva = 0;// si no se cumple zona == 0
				if(desicion) {//recordar: desicion = true
					zonaNueva = zona + numero;// le sumamos a zona el número del dorsal
					if(zonaNueva >= abc.length) {//condicion: mayor al número de posiciones
						zonaNueva = zonaNueva - abc.length ;//restamos el número de posiciones
					}
				}else {
					zonaNueva = zona - numero;//restamos el número del dorsal
					if(zonaNueva < 0) {
						zonaNueva = zonaNueva + abc.length ;//sumamos el número de posiciones
					}
					
				}
				String letraNueva = abc[zonaNueva];//toma la posicion zona nueva
				palabraEncriptada += letraNueva;//agragamos letra encriptada
				
			}
		}
		
		return palabraEncriptada;//retorna palabra encriptada
	}





	public String juanfuquene(String frase) {
		String palabraEncriptar=frase;
        String palabraEncriptada = ""; // Este string almacenará el resultado de la encriptación
        Random randomOpcion = new Random(); // Nombro la función random para usarla durante el proceso
        int longitudPalabra = palabraEncriptar.length(); // Utilizo este length para saber la longitud de la palabra
        String[] abecedario = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z" }; // Vector abecedario
        for (int interno = 0; interno < longitudPalabra; interno++) { // Ciclo "para" para recorrer cada letra de la
                                                                      // palabra ingresada
            String letraComp = palabraEncriptar.substring(interno, interno + 1); // El String letraComp almacenará cada
                                                                                 // letra de la palabra que tome en ese
                                                                                 // momento
            for (int posiciones = 0; posiciones < abecedario.length; posiciones++) { // Ciclo "para" para recorrer el
                                                                                     // vector abecedario
                String letra = abecedario[posiciones]; // El String letra tomará la letra según el número de posición
                                                       // del for anterior
                if (letraComp.equals(letra)) { // Si la letra a comparar es igual a la letra del abecedario en la que
                                               // nos encontramos en el momento entonces:
                    final int opcionA = 0; // Determino las constantes para saber cúal
                    final int opcionB = 1; // Vector de palabras tomará para codificar
                    int opcionPalabra = randomOpcion.nextInt(2); // Creo el int opcionPalabra para que sea random con un
                                                                 // limite de 2
                                                                 // Para que tome las opciones 0 y 1.
                    switch (opcionPalabra) { // Switch dependiendo de la opcion elegida por el random
                        case opcionA: // Primer caso
                            String[] palabrasA = { "farol ", "abaco ", "acido ", "odiar ", "celda ", "afan ", "egida ",
                                    "chelo ", "giga ", "ojo ", "akilo ", "llave ", "amor ", "unico ",
                                    "dolar ", "apolo ", "equis ", "bravo ", "aspas ", "ataud ", "cuidar ", "evitar ",
                                    "ewall ", "oxido ", "lycra ", "ozono " };
                            // Vector con palabras para el primer caso
                            palabraEncriptada = palabraEncriptada + palabrasA[posiciones];
                            // Se agrega la palabra que corresponde a la letra al string de
                            // palabraEncriptada
                            break; // Termina esta parte del proceso
                        case opcionB: // Segundo caso
                            String[] palabrasB = { "dados ", "obrar ", "acoge ", "ideas ", "delta ", "eficaz ",
                                    "igual ", "short ", "hiena ", "ajuste ", "akafir ", "oliva ",
                                    "omega ", "angel ", "logos ", "epoca ", "aquel ", "trozo ", "usual ", "otoño ",
                                    "lulo ", "avisa ", "uwisky ", "extra ", "ayate ", "azota " };
                            // Vector con palabras para el segundo caso
                            palabraEncriptada = palabraEncriptada + palabrasB[posiciones];
                            // Se agrega la palabra que corresponde a la letra al string de
                            // palabraEncriptada
                    }
                }
            }
        }
        return palabraEncriptada; // Retorna las palabras con las que codificamos la palabra inicial!
    }





	public String samuelcastro (String palabra) {
		//Defino vector de el abecedario normal
				String[]vector=new String[27];
				
				//Defino variables
				//oalabranueva la cual va a ser la palabra encriptada
				String palabranueva="";
				//letra nueva la cual va a ser la nueva letra que va a formar la palabra encriptada
				String letranueva="";
				//esta variable defino los espacios entre palabras
				String espacio=" ";
				//el umero de la letra segun el abecedario
				int numeroletra=-1;
				//esta variable representa hasta que caracter se va a leer el substring
				int hasta=0;
				//esta variable va a guardar la longitud de la palabra 
				int longifrase=palabra.length();
				
				//defino los vectores
				vector[1]="a";
				vector[2]="b";
				vector[3]="c";
				vector[4]="d";
				vector[5]="e";
				vector[6]="f";
				vector[7]="g";
				vector[8]="h";
				vector[9]="i";
				vector[10]="j";
				vector[11]="k";
				vector[12]="l";
				vector[13]="m";
				vector[14]="n";
				vector[15]="o";
				vector[16]="p";
				vector[17]="q";
				vector[18]="r";
				vector[19]="s";
				vector[20]="t";
				vector[21]="u";
				vector[22]="v";
				vector[23]="w";
				vector[24]="x";
				vector[25]="y";
				vector[26]="z";
				
				//Defino el ciclo que guarada la posicion de cada letra
				for(int i=0; i<longifrase; i++) {
					//variable que me va a ayudar que se lea una sola palabra
					hasta=i+1;
					//mientras se repasa el abecedario hacer
					for(int q=1; q<27; q++) {
						//si la palabra de la frase es un espacio hacer
						if(palabra.substring(i,hasta).compareTo(espacio)==0) {
							//se cambia los espacios por signos de interrogacion 
							letranueva= "?";
							//sino 
							}else {
								//si la letra es igual a la letra que se encuentra en el vector hacer
								if(palabra.substring(i,hasta).compareTo(vector[q])==0) {
									//el numero de la letra es igual a donde esta
									numeroletra=q;
									//si la posicion de la letra es par hacer
									if(hasta%2==0 ) {
										//Defino el vector del abecedario chino
										String[] vectorchino=new String[27];

										//Defino el abecedario chino
										vectorchino[1]="阿";
										vectorchino[2]="贝";
										vectorchino[3]="色";
										vectorchino[4]="德";
										vectorchino[5]="饿";
										vectorchino[6]="艾";
										vectorchino[7]="日";
										vectorchino[8]="什";
										vectorchino[9]="伊";
										vectorchino[10]="鸡";
										vectorchino[11]="卡";
										vectorchino[12]="勒";
										vectorchino[13]="马";
										vectorchino[14]="娜";
										vectorchino[15]="哦";
										vectorchino[16]="佩";
										vectorchino[17]="苦";
										vectorchino[18]="和";
										vectorchino[19]="丝";
										vectorchino[20]="特";
										vectorchino[21]="玉";
										vectorchino[22]="维";
										vectorchino[23]="独";
										vectorchino[24]="<";
										vectorchino[25]="黑";
										vectorchino[26]="贼";
										//mientras se recorre el abecedario chino hacer
										for (int w=1; w<27; w++) {
											//si la posicion en el abecedario de la letra es igual a w(letra que recorre el abecedario) hacer
											if (numeroletra==w) {
												//a la posicion se le suma la mitad de la longitud de la frase
												int nunumero=w+longifrase/2;
												//si el numero es mayor a las letras del abecedario hacer
												if(nunumero>26) {
													//numero menos el total de las letras del abecedario
													nunumero=nunumero-26;
												}
												//se cambia la letra por la que esta en el vector de ese numero
												letranueva=vectorchino[nunumero];
												break;
											}
										}
										//sino
									}else {
										//si la longitud de la frase es par
										if (longifrase%2==0) {
											//Defino el vector de el abecedario japones
											String[] vectorjapo=new String[27];
											//Defino el abecedario
											vectorjapo[1]="ア";
											vectorjapo[2]="イ";
											vectorjapo[3]="ウ";
											vectorjapo[4]="エ";
											vectorjapo[5]="オ";
											vectorjapo[6]="カ";
											vectorjapo[7]="キ";
											vectorjapo[8]="ク";
											vectorjapo[9]="ケ";
											vectorjapo[10]="コ";
											vectorjapo[11]="サ";
											vectorjapo[12]="シ";
											vectorjapo[13]="ス";
											vectorjapo[14]="セ";
											vectorjapo[15]="ソ";
											vectorjapo[16]="タ";
											vectorjapo[17]="チ";
											vectorjapo[18]="ツ";
											vectorjapo[19]="テ";
											vectorjapo[20]="ト";
											vectorjapo[21]="ナ";
											vectorjapo[22]="ニ";
											vectorjapo[23]="ぬ";
											vectorjapo[24]="ね";
											vectorjapo[25]="の";
											vectorjapo[26]="ひ";
											//mientras se recorre el abecedario japones hacer
											for (int w=1; w<27; w++) {
												//si la posicion en el abecedario de la letra es igual a w hacer
												if (numeroletra==w) {
													//a la posicion se le suma la mitad de la longitud de la frase
													int nunumero=w+longifrase/2;
													//si el numero es mayor a las letras del abecedario hacer
													if(nunumero>26) {
														//numero menos el total de las letras del abecedario
														nunumero=nunumero-26;
													}
													//se cambia la letra por la que esta en el vector de ese numero
													letranueva=vectorjapo[nunumero];
													break;
												}
											}
											//sino
										}else {
											//Defino el vector del abecedario alrevez
											String[] vectoral=new String[27];
											//Defino el abecedario alrevez
											vectoral[1]="z";
											vectoral[2]="y";
											vectoral[3]="x";
											vectoral[4]="w";
											vectoral[5]="v";
											vectoral[6]="u";
											vectoral[7]="t";
											vectoral[8]="s";
											vectoral[9]="r";
											vectoral[10]="q";
											vectoral[11]="p";
											vectoral[12]="o";
											vectoral[13]="n";
											vectoral[14]="m";
											vectoral[15]="l";
											vectoral[16]="k";
											vectoral[17]="j";
											vectoral[18]="i";
											vectoral[19]="h";
											vectoral[20]="g";
											vectoral[21]="f";
											vectoral[22]="e";
											vectoral[23]="d";
											vectoral[24]="c";
											vectoral[25]="b";
											vectoral[26]="a";
											//mientras se recorre el abecedario hacer
											for (int w=1; w<27; w++) {
												//si la posicion en el abecedario de la letra es igual a w hacer
												if (numeroletra==w) {
													//a la posicion se le suma la mitad de la longitud de la frase
													int nunumero=w+longifrase/2;
													//si el numero es mayor a las letras del abecedario hacer
													if(nunumero>26) {
														//numero menos el total de las letras del abecedario
														nunumero=nunumero-26;
													}
													//se cambia la letra por la que esta en el vector de ese numero
													letranueva=vectoral[nunumero];
													break;
												}
											}	
										}
									}
								}
							}
					}
					//aqui se va formando la palabra con las letras que nos arroja los condicionales
					palabranueva=palabranueva+letranueva;
				}
					
				//se retorna la palabra encriptada 
		return palabranueva;
	}




    
	 public String yaiderbecerra(String palabra) {
		return "";
		 //no supe agrupar esa vaina 
	    
}
	 
}