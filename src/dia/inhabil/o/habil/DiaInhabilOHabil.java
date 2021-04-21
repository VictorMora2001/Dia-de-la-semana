/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia.inhabil.o.habil;
import java.util.Scanner;
/**
 *
 * @author amigo
 */
public class DiaInhabilOHabil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        String text = null;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número para poder indicarle que día de la semana es. Siguiendo la siguiente numeración (1-Lunes, 2-Martes, 3-Miércoles, 4-Jueves, 5-Viernes, 6-Sábado, 7-Domingo)");
        dia = sc.nextInt ();
        
        if (dia > 0 && dia <= 7){
            switch (dia){
                case 1:
                System.out.println("El día Lunes es un día hábil");
                break;
                case 2:
                System.out.println("El día Martes es un día hábil");
                break;
                case 3:
                System.out.println("El día Miércoles es un día hábil");
                break;
                case 4:
                System.out.println("El día Jueves es un día hábil");
                break;
                case 5:
                System.out.println("El día Viernes es un día hábil");
                break;
                case 6:
                System.out.println("El día Sábado es un día inhábil (fin de semana)");
                break;
                case 7:
                System.out.println("El día Domingo es un día inhábil (fin de semana)");
                break;
                
            }
        }
        
    }
    
}
