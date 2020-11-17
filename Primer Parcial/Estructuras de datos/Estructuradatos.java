import java.util.Scanner;
    class Estructuradatos{

        public static void main(String[]args){

            Scanner entrada = new Scanner (System.in);
            int menu,edad1,valorbin2,apoyo2,positivo4,negativo4,cant5,seleccion5,opcion6,seleccion13;
            char valormenu,comp1,eleccion3,subeleccion3,apoyo4,apoyo5;
            float val2,grados3,val4,sigval4,base6,lado6;
            double binario2,resultado3,art5,per6,area6,res13,calc13,can13;
            
            do {
                menu=0;
                System.out.println("=============BIENVENIDO A ESTRUCTURAS DE DATOS=============");
                System.out.println("");
                System.out.println("Creado por: Romero Rodriguez Leonardo Maximiliano 3IV9");
                System.out.println("");
                System.out.println("");
                System.out.println("SELECCIONA UNA OPCION PARA COMENZAR");
                System.out.println("");
                System.out.println("1.-  Descuento del Abono");
                System.out.println("2.-  Conversor de decimal a binario");
                System.out.println("3.-  Conversor de unidades de temperatura");
                System.out.println("4.-  Contador de numeros positivos, y negativos");
                System.out.println("5.-  Lector de productos y precio");
                System.out.println("6.-  Calculados de Figuras");
                System.out.println("7.-  Ver tabla.");
                System.out.println("13.- Calculadora.");

                menu = entrada.nextInt();

                switch (menu){
                    case 1:
                        System.out.println("Bienvenido a descuento del abono");
                        System.out.println("");
                        System.out.println("Por favor, indique su edad su edad: ");

                        edad1= entrada.nextInt();

                        if (edad1 >100 || edad1<3){
                            System.out.println("Esta edad no es valida, intente de nuevo");
                        } 
                        else{

                            if (edad1 >= 65){
                                System.out.println("Se le aplicara un descuento del 40%");
                             }
                            
                            if (edad1 <=21){
                                System.out.println("Sus padres son socios?");
                                System.out.println("Ingrese 's' para SI, o 'n' para NO");

                                comp1 = entrada.next().charAt(0);

                                if (comp1 == 's'){
                                    System.out.println("Se le aplicara un descuento del 45%");
                                }
                                else
                                    System.out.println("Se le aplicara un descuento del 25%");
                                }
                            }
                    
                    break;

                    case 2:
                        System.out.println("Bienvenido a conversion de numeros a Binario");
                        System.out.println("");
                        System.out.println("Introduzca el valor que desea convertir");

                        val2= entrada.nextFloat();

                        valorbin2=0;

                        binario2=0;

                        if (val2<0){
                            System.out.println("Eso no es un valor positivo, intente de nuevo.");
                        }
                        else{

                            while(val2!=0){
                                apoyo2= (int) (val2 % 2);

                                binario2= binario2 +apoyo2* Math.pow(10, valorbin2);

                                valorbin2++;

                                val2= val2/2;
                            }
                            System.out.println("El valor binario de su numero seria: "+binario2);
                        }
                    break;

                    case 3:
                        System.out.println("Bienvenido a conversion de Temperatura");
                        System.out.println("");
                        System.out.println("Ingrese la letra correspondiente al sistema de temperatura que conoce");
                        System.out.println("F.- Grados Fahrenheit");
                        System.out.println("C.- Grados Celsius");
                        System.out.println("K.- Grados Kelvine");
                        System.out.println("R.- Grados Rankine");

                        eleccion3 =entrada.next().charAt(0);

                        System.out.println("Indique la cantidad de grados");

                        grados3=entrada.nextFloat();

                        switch (eleccion3){
                            case'F':
                                System.out.println("Indique a que sistema desea Convertir, utilizando las mismas letras que antes");
                                subeleccion3=entrada.next().charAt(0);

                                switch (subeleccion3){
                                    case'F': 
                                        System.out.println("Actualmente, ya tiene la temperatura en grados Fahrenheit");
                                    break;

                                    case'C':
                                        grados3= grados3-32; grados3= grados3*5/9;

                                        System.out.println("La temperatura indicada en grados Celsius es de: "+grados3);System.out.print(" grados.");
                                    break;

                                    case'K': 
                                        grados3=grados3-32;grados3=grados3*5/9;resultado3= grados3 + 273.15;

                                        System.out.println("La temperatura indicada en grados Kelvine es de: "+resultado3);System.out.print(" grados.");
                                    break;

                                    case'R':
                                        grados3= (float) (grados3 + 459.67);

                                        System.out.println("La temperatura indicada en grados Rankine es de: "+grados3);System.out.print(" grados.");
                                    break;

                                    default:
                                    System.out.println("Esta no es una opcion valida");
                                }
                            break;

                            case'C':
                                System.out.println("Indique a que sistema desea Convertir, utilizando las mismas letras que antes");
                                
                                subeleccion3=entrada.next().charAt(0);

                                switch (subeleccion3){
                                    case'F': 
                                        grados3= (grados3*9/5)+32;

                                        System.out.println("La temperatura indicada en grados Fahrenheit es de: "+grados3);System.out.print(" grados.");
                                    break;

                                    case'C':
                                        System.out.println("Actualmente, ya tiene la temperatura en grados Celsius");
                                    break;

                                    case'K': 
                                        resultado3=grados3+273.15;

                                        System.out.println("La temperatura indicada en grados Kelvine es de: "+resultado3);System.out.print(" grados.");
                                    break;

                                    case'R':
                                        resultado3= (grados3*9/5)+491.67;

                                        System.out.println("La temperatura indicada en grados Rankine es de: "+resultado3);System.out.print(" grados.");
                                    break;

                                    default:
                                        System.out.println("Esta no es una opcion valida.");
                                }
                            break;
                        
                            case'K':
                                System.out.println("Indique a que sistema desea Convertir, utilizando las mismas letras que antes");

                                subeleccion3=entrada.next().charAt(0);

                                switch (subeleccion3){
                                    case'F': 
                                        resultado3= grados3-273.15;grados3=grados3*9/5;grados3=grados3+32;

                                        System.out.println("La temperatura indicada en grados Fahrenheit es de: "+resultado3);System.out.print(" grados.");
                                    break;

                                    case'C':
                                        resultado3= grados3-273.15;

                                        System.out.println("La temperatura indicada en grados Celsius es de: "+resultado3);System.out.print(" grados.");
                                    break;

                                    case'K':
                                        System.out.println("Actualmente, ya tiene la temperatura en grados Kelvine");
                                    break;

                                    case'R':
                                        resultado3=grados3*1.8;

                                        System.out.println("La temperatura indicada en grados Rankine es de: "+resultado3);System.out.print(" grados.");
                                    break;

                                    default:
                                        System.out.println("No es una opcion valida.");
                                }
                            break;

                            case'R':
                                System.out.println("Indique a que sistema desea Convertir, utilizando las mismas letras que antes");

                                subeleccion3=entrada.next().charAt(0);

                                switch (subeleccion3){
                                    case 'F': 
                                        resultado3= grados3-459.67;

                                        System.out.println("La temperatura indicada en grados Fahrenheit es de: "+resultado3);System.out.print(" grados.");
                                    break;

                                    case'C':
                                        resultado3= grados3-491.67;resultado3=resultado3*5/9;

                                        System.out.println("La temperatura indicada en grados Celsius es de: "+resultado3);System.out.print(" grados.");
                                    break;

                                    case 'K':
                                        resultado3= grados3*5/9;

                                        System.out.println("La temperatura indicada en grados Kelvine es de: "+resultado3);System.out.print(" grados.");
                                    break;

                                    case 'R':
                                        System.out.println("Actualmente, ya tiene la temperatura en grados Rankine");
                                    break;

                                    default:
                                        System.out.println("No es una opcion valida.");
                                }
                            break;
                        }
                    break;

                    case 4:
                        System.out.println("Bienvenido al contador de numeros Positivos y Negativos");
                        System.out.println("");
                        System.out.println("Ingresa uno por uno todos los valores a contar");
                        
                        val4=entrada.nextFloat();
                        
                        positivo4=0;negativo4=0;
                            
                        if (val4>0){
                            positivo4=positivo4+1;
                        }
                        else{negativo4=negativo4+1;}
                        
                        do{
                            System.out.println("Ingrese el siguiente valor: ");

                            sigval4=entrada.nextFloat();
                            
                            if (sigval4>0){
                                positivo4=positivo4+1;
                            }
                            
                            else{negativo4=negativo4+1;}
                            
                                System.out.println("Si desea agregar otro numero, Presione 's' para SI");

                                System.out.println("En caso contrario, Presione 'n' para NO");
                            
                                apoyo4=entrada.next().charAt(0);
                        }    
                        while(apoyo4=='s');

                            System.out.println("Usted ingreso "+negativo4);System.out.print(" numeros negativos y "+positivo4);System.out.print(" numeros positivos.");
                    break;

                    case 5:
                        System.out.println("Bienvenido a cuenta de Productos");
                        System.out.println("");
                        System.out.println("Ingrese la cantidad de articulos que esta llevando");
                        System.out.println("Se Pueden llevar una maximo de 100 Articulos");

                        cant5=entrada.nextInt();art5=0;

                            if (cant5<0||cant5>100){

                                System.out.println("Esto no es posible, intente de nuevo.");
                            }
                        
                            else{
                                do{
                                        System.out.println("Seleccione los articulos que lleva entre los disponibles");
                                        System.out.println("1.- Papas de $15");
                                        System.out.println("2.- Almuerzo de $30");
                                        System.out.println("3.- Tarjeta de regalo de $200");
                                        System.out.println("4.- Agua simple de $12");
                                        System.out.println("5.- Camiseta tematica de $90");

                                        seleccion5=entrada.nextInt();

                                        switch(seleccion5){

                                            case 1:
                                                art5=art5+15;cant5=cant5-1;
                                            break;

                                            case 2:
                                                art5=art5+30;cant5=cant5-1;
                                            break;

                                            case 3:
                                                art5=art5+200;cant5=cant5-1;
                                            break;

                                            case 4:
                                                art5=art5+12;cant5=cant5-1;
                                            break;

                                            case 5:
                                                art5=art5+90;cant5=cant5-1;
                                            break;
                                        
                                            default:
                                                System.out.println("No es una opcion valida.");
                                        }
                                    
                                        System.out.println("Usted lleva actualmente $"+art5);
                                    }
                                    while(cant5!=0);
                                        System.out.println("El costo total de su compra es de $"+art5);
                                }
                    break;

                    case 6:
                        System.out.println("Bienvenido a Calculo de figuras");
                        System.out.println("");
                        System.out.println("Elige el procedimiento que deseas realizar");
                        System.out.println("1.- Calcular el Area y el Perimetro de un Rectangulo");
                        System.out.println("2.- Calcular el Area ya el Perimetro de un Triangulo Equilatero");
                        System.out.println("3.- Calcular el Volumen de una Esfera");
                        System.out.println("4.- Calcular el Volumen de un Cilindro");

                        opcion6=entrada.nextInt();

                        switch(opcion6){
                            case 1: 
                                System.out.println("Introduzca el valor de la base");

                                base6=entrada.nextFloat();

                                System.out.println("Introduzca el valor del lado");

                                lado6=entrada.nextFloat();

                                area6= base6*lado6;
                                
                                per6=(base6*2)+(lado6*2);

                                System.out.print("Su rectangulo tiene un area de: "+area6);System.out.print(" y un perimetro de: "+per6);
                            break;

                            case 2: 
                                System.out.println("Introduzca el valor de la base");

                                base6=entrada.nextFloat();

                                System.out.println("Introduzca el valor de la altura");

                                lado6=entrada.nextFloat();
                                        
                                area6= (base6*lado6)/2;
                            
                                per6=base6*3;
                                        
                                System.out.print("Su triandulo tiene un area de: "+area6);System.out.print(" y un perimetro de: "+per6);
                            break;

                            case 3: 
                                System.out.println("Introduzca el valor del radio");
                                base6=entrada.nextFloat();

                                area6= base6*base6*base6;

                                per6=(4/3)*3.1416;
                                
                                area6=area6*per6;
                                        
                                System.out.println("Su esfera tiene un volumen de: "+area6);
                            break;

                            case 4: 
                                System.out.println("Introduzca el valor del radio");

                                base6=entrada.nextFloat();
                            
                                System.out.println("Introduzca el valor de la altura");

                                lado6=entrada.nextFloat();
                                        
                                area6= base6*base6;
                            
                                per6=3.1416*lado6;
                            
                                area6=area6*per6;
                                        
                                System.out.println("Su cilindro tiene un volumen de "+area6);
                            break;
                         
                            default:
                                System.out.println("Esta no es una opcion valida.");
                            break;
                        }
                    break;

                    case 7: 
                        System.out.println("Beinvenido a Impresion de tabla");
                        System.out.println("");
                        System.out.println("La Tabla se mostrara en Auntomatico");
                            
                            System.out.println("\tN\t\t\t");
                            
                            System.out.println("\t1\t10\t100\t1000");
                            
                            System.out.println("\t2\t20\t200\t2000");
                            
                            System.out.println("\t3\t30\t300\t3000");
                            
                            System.out.println("\t4\t40\t400\t4000");
                            
                            System.out.println("\t5\t50\t500\t5000");
                            
                            System.out.println("\t6\t60\t600\t6000");
                            
                            System.out.println("\t7\t70\t700\t7000");
                            
                            System.out.println("\t8\t80\t800\t8000");
                            
                            System.out.println("\t9\t90\t900\t9000");
                            
                            System.out.println("\t10\t100\t1000\t10000");
                    break;
                    
                    case 13: 

                    System.out.println("Bienvenido a la Calculadora");

                        do{

                            res13=0;

                                System.out.println("Ingrese su primera cantidad: ");
                            
                                calc13=entrada.nextDouble();  
                            
                                System.out.println("Indique la operacion que desea realizar");
                                System.out.println("1.- Suma");
                                System.out.println("2.- Resta");
                                System.out.println("3.- Multiplicacion");
                                System.out.println("4.- Division");
                                System.out.println("5.- Salir");

                                seleccion13=entrada.nextInt();
                            
                                switch(seleccion13){
                                    case 1: 
                                        System.out.println("Ingrese la otra cantidad: ");

                                            can13=entrada.nextDouble();
                                            
                                            res13=calc13+can13+res13;
                                    break;

                                    case 2:
                                        System.out.println("Ingrese la otra cantidad: ");

                                            can13=entrada.nextDouble();

                                            res13=calc13-can13+res13;
                                    break;

                                    case 3:
                                        System.out.println("Ingrese la otra cantidad: ");

                                            can13=entrada.nextDouble();

                                            res13=calc13*can13;
                                    break;

                                    case 4:
                                        System.out.println("Ingrese la otra cantidad: ");

                                            can13=entrada.nextDouble();

                                            res13=calc13/can13;
                                    break;

                                    default:
                                        System.out.println("Esa no es una opcion.");
                                }

                            System.out.println("El resultado es: "+res13);
                            
                            System.out.println("Si desea Seguir operando. Presione 's' para SI, o 'n' para NO");

                            apoyo5=entrada.next().charAt(0);
                        }
                        while(apoyo5=='s');
                }            
                System.out.println("Si desea continuar utilizando el programa Presione 's' para SI, de lo contrario, presione cualquier otra tecla ");
                
                valormenu= entrada.next().charAt(0);

            }while (valormenu== 's'); 
               
            
        }
    }