import java.util.Scanner;
class pokedexalfa{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nom1= "Charmander";
        String nom2= "Bulbasaur";
        String nom3= "Squartle";
        int smenu,id1,id2,id3,fu1,fu2,fu3,def1,def2,def3,vi1,vi2,vi3,atk1,atk2,atk3,atq1,atq2,atq3;
        boolean programa = false;

        System.out.println("================================================");
        System.out.println("   3IV9 ROMERO RODRIGUEZ LEONARDO MAXIMILIANO");
        System.out.println("================================================");
        System.out.println("");
        System.out.println("================================================");
        System.out.println("            EXAMEN POO 1 'POKEDEX'");
        System.out.println("================================================");

        id1=01; id2=02; id3=03;
        fu1=23; fu2=20; fu3=22;
        def1=15; def2=18; def3=25;
        vi1=50; vi2=50; vi3=50;
        atk1=15; atk2=13; atk3=16;
        atq1=8; atq2=12; atq3=12;

        seleccion_principal:
        do{
            System.out.println("Elige una de las siguietes opciones:");
            System.out.println("");
            System.out.println("Informacion sobre los pokemones");
            System.out.println("");
            System.out.println("1.- 'Charmander'");
            System.out.println("2.- 'Bulbasaur'");
            System.out.println("3.- 'Squartle'");
            System.out.println("");
            System.out.println("Otras opciones");
            System.out.println("");
            System.out.println("4.-Iniciar una batalla pokemon");
            System.out.println("5.-Salir");

            smenu = entrada.nextInt();
            switch (smenu) {
                case 1:
                    System.out.println("Ficha de datos de: " +nom1);
                    System.out.println("");
                    System.out.println("                       ID: " +id1);
                    System.out.println("                   Fuerza: " +fu1);
                    System.out.println("                  Defensa: " +def1);
                    System.out.println("                     Vida: " +vi1);
                    System.out.println("  Dano de ataque primario: " +atk1);
                    System.out.println("Dano de Ateque secundario: " +atq1);
                    System.out.println("");
                    System.out.println("");                    
                    break;
                case 2:
                    System.out.println("Ficha de datos de: " +nom2);
                    System.out.println("");
                    System.out.println("                       ID: " +id2);
                    System.out.println("                   Fuerza: " +fu2);
                    System.out.println("                  Defensa: " +def2);
                    System.out.println("                     Vida: " +vi2);
                    System.out.println("  Dano de ataque primario: " +atk2);
                    System.out.println("Dano de Ateque secundario: " +atq2);
                    System.out.println("");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Ficha de datos de: " +nom3);
                    System.out.println("");
                    System.out.println("                       ID: " +id3);
                    System.out.println("                   Fuerza: " +fu3);
                    System.out.println("                  Defensa: " +def3);
                    System.out.println("                     Vida: " +vi3);
                    System.out.println("  Dano de ataque primario: " +atk3);
                    System.out.println("Dano de Ateque secundario: " +atq3);
                    System.out.println("");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Normalmente, te narraria toda la batalla, pero no me dio tiempo :'(");
                    System.out.println("Eso si, ten por seguro que gano Squartle, por que esta rotisimo");
                    System.out.println("");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("El programa se cerrara ahora");
                    programa=true;
                    break;
                default:
                    System.out.println("Esta no es una opcion valida, Intentalo nuevamente");
                    System.out.println("");
                    continue seleccion_principal;
                    
            }
        }
        while(programa == false);
        
    }
}