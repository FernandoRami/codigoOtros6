import java.util.Scanner;

public class codigo6 {

    public static void main(String[] args) {// se agrgo main
        int[] n = new int[20]; // se corrigio el array
        for (int i = 0; i < 20; i++) {//se agrgo un + a la ultima i
            n[i] = (int) (Math.random() * 381) + 20;
            System.out.print(n[i] + " ");//se corrigio agregando el .out.
        }

        System.out.println("\n¿Qué números quiere resaltar?");//se corrigio el prinln
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt(); // se utilizo un scanner 

        int multiplo = (opcion == 1) ? 5 : 7; // se corrigio los operadores 

        for (int e : n) { //se utilizo un for en vez de un Foreach
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {//se cerro con una llave
                System.out.print(e + " "); 
            }
        }
        
        sc.close(); // se cerro el scanner
    }
}
