import java.util.Scanner;
public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner lectuScanner = new Scanner(System.in);
        final int OPCION_ENCRIPTAR = 1;
        final int OPCION_DESENCRIPTAR = 2;
        //SEPARO LAS OPCIONES DE ENCRIPTADO CON LAS OPCIONES DE FUNCION DE CADA ESTUDIANTE SOLO PARA PODER COMPRENDER MEJOR EL CODIGO
        final int OPCION_SAMUEL_CAMARGO = 1;
        final int OPCION_SERGIO = 2;
        final int OPCION_ANGELA_PEÑA = 3;
        final int OPCION_SELENE = 4;
        final int OPCION_YIMIR = 5;
        final int OPCION_DAVID_CRUZ = 6;
        final int OPCION_LAURA_CAMPIÑO = 7;
        final int OPCION_NICOL_CEPEDA = 8;
        final int OPCION_SAMIR_YATE = 9;
        final int OPCION_LAURA_CORREA = 10;
        final int OPCION_ELIAS_CAMARGO = 11;
        final int OPCION_TOMAS_ESPINEL = 12;
        final int OPCION_JUAN_FUQUENE = 13;
        final int OPCION_SAMUEL_CASTRO = 14;
        final int OPCION_YAIDER_BECERRA = 15;
        final int OPCION_SALIR = 0;



        System.out.println("-----Ingrese la palabra");
        String frase = lectuScanner.nextLine();
        //primero pido la palabra que voy a encriptar
        System.out.println("------------------------BIENVENIDO AL MENU DE ENCRIPTADO------------------------");
        System.out.println("-----Ingrese en numero 1 para acceder al programa de Samuel Camargo");
        System.out.println("-----Ingrese en numero 2 para acceder al programa de Sergio");
        System.out.println("-----Ingrese en numero 3 para acceder al programa de Angela Peña");
        System.out.println("-----Ingrese en numero 4 para acceder al programa de Selene");
        System.out.println("-----Ingrese en numero 5 para acceder al programa de Yimir");
        System.out.println("-----Ingrese en numero 6 para acceder al programa de David Cruz");
        System.out.println("-----Ingrese en numero 7 para acceder al programa de Laura Campiño");
        System.out.println("-----Ingrese en numero 8 para acceder al programa de Nicol Cepeda");
        System.out.println("-----Ingrese en numero 9 para acceder al programa de Samir Yate");
        System.out.println("-----Ingrese en numero 10 para acceder al programa de Laura Correa");
        System.out.println("-----Ingrese en numero 11 para acceder al programa de Elias Camargo");
        System.out.println("-----Ingrese en numero 12 para acceder al programa de Tomas Espinel");
        System.out.println("-----Ingrese en numero 13 para acceder al programa de Juan Fuquene");
        System.out.println("-----Ingrese en numero 14 para acceder al programa de Samuel Castro");
        System.out.println("-----Ingrese en numero 15 para acceder al programa de Yaider Becerra");
        System.out.println("-----Ingrese el numero 0 para salir del programa");
        int opcion = lectuScanner.nextInt();
//
        switch (opcion){
            case OPCION_SAMUEL_CAMARGO:
                System.out.println("-----Ingrese 1 para Encriptar");
                System.out.println("-----Ingrese 2 para Desencriptar");
                int opcion2 = lectuScanner.nextInt();
                switch (opcion2){
                    case OPCION_ENCRIPTAR:
                        String encriptarPalabra;
                        Encriptado encriptado = new Encriptado();
                        encriptarPalabra = encriptado.samuelcamargo(frase);
                        System.out.println(encriptarPalabra);//completado
                    break;
                    case OPCION_DESENCRIPTAR:
                        String desencriptarpalabra;
                        Desencriptado desencriptado = new Desencriptado();
                        desencriptado.samuel_camargo_desencriptado(frase);
                        desencriptarpalabra = desencriptado.samuel_camargo_desencriptado(frase);
                        System.out.println(desencriptarpalabra);//completado
                    
                }
            
            case OPCION_SERGIO:
                System.out.println("-----Ingrese 1 para Encriptar");
                System.out.println("-----Ingrese 2 para Desencriptar");
                int opcion3 = lectuScanner.nextInt();
                switch (opcion3){
                    case OPCION_ENCRIPTAR:
                        String encriptarPalabra;
                        Encriptado encriptado = new Encriptado();
                        encriptarPalabra = encriptado.sergio(frase);
                        System.out.println(encriptarPalabra);
                    break;
                    case OPCION_DESENCRIPTAR:
                        String desencriptarpalabra;
                        Desencriptado desencriptado = new Desencriptado();
                        //desencriptado.;
                        //desencriptarpalabra = desencriptado.
                        //System.out.println(desencriptarpalabra);//pendiente
                    
                }

                case OPCION_ANGELA_PEÑA:
                System.out.println("-----Ingrese 1 para Encriptar");
                System.out.println("-----Ingrese 2 para Desencriptar");
                int opcion4 = lectuScanner.nextInt();
                switch (opcion4){
                    case OPCION_ENCRIPTAR:
                        String encriptarPalabra;
                        Encriptado encriptado = new Encriptado();
                        encriptarPalabra = encriptado.angelapeña(frase);
                        System.out.println(encriptarPalabra);
                    break;
                    case OPCION_DESENCRIPTAR:
                        String desencriptarpalabra;
                        Desencriptado desencriptado = new Desencriptado();
                        desencriptado.angelapeña(frase);
                        desencriptarpalabra = desencriptado.angelapeña(frase);
                        System.out.println(desencriptarpalabra);//completado
                    }
                case OPCION_SELENE:
                System.out.println("-----Ingrese 1 para Encriptar");
                System.out.println("-----Ingrese 2 para Desencriptar");
                int opcion5 = lectuScanner.nextInt();
                switch (opcion5){
                    case OPCION_ENCRIPTAR:
                    String encriptarPalabra;
                    Encriptado encriptado = new Encriptado();
                    encriptarPalabra = encriptado.selene(frase);
                    System.out.println(encriptarPalabra);
                    break;
                    case OPCION_DESENCRIPTAR:
                    System.out.println("-----Favor diga cuantos numeros va a ingresar");
                    int cuantos = lectuScanner.nextInt();
                    int variable = lectuScanner.nextInt();
                    String desencriptarpalabra;
                    Desencriptado desencriptado = new Desencriptado();
                    desencriptado.selene(frase, cuantos, variable);
                    desencriptarpalabra = desencriptado.selene(frase, cuantos, variable);;
                    System.out.println(desencriptarpalabra);
                }

        }
    }
}
