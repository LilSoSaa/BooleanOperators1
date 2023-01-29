public class Main {
    public static void main(String[] args) {


        System.out.println( 2 <= 2 && !true);
        //2 è uguale a 2 quindi Vero / !true=Falso
        //vero&&falso
        //soluzione: Falso


        System.out.println( !false && 3 > 2);
        //!false= Vero/ 3 è maggiore di 2 quindi Vero
        //vero&&vero
        //soluzione: Vero

        boolean t= false;
        boolean f= true;
        System.out.println(!(!t || f));
        // !t è vero(contrario dit=false || f rimane Vero
        //soluzione parentesi Vero ma c'è ! davanti la aprentesi quindi la soluzione è falsa
        //soluzione: Falso


        System.out.println( 6 > 6 ^ !(true && true));
        //6  non è maggiore di 6 quindi Falso/   true e true dentro le parentesi danno Vero
        //!not prima delle parentesi quindi il contenuto è Falso
        //falso^falso=Falso
        //soluzione: Falso


    }
}