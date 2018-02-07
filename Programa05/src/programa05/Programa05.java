/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa05;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Programa05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,x=1;
        Scanner entrada=new Scanner(System.in);
        while(x==1){
        System.out.println("Ingresa un numero: ");
        num=entrada.nextInt();
        switch(num){
            case 1: System.out.println("Mes: Enero \nDias: 31");
            break;
            case 2: System.out.println("Mes: Febrero \nDias: 28/29 depende el anio");
            break;
            case 3: System.out.println("Mes: Marzo \nDias: 31");
            break;
            case 4: System.out.println("Mes: Abril \nDias: 30");
            break;
            case 5: System.out.println("Mes: Mayo \nDias: 31");
            break;
            case 6: System.out.println("Mes: Junio \nDias: 30");
            break;
            case 7: System.out.println("Mes: Julio \nDias: 31");
            break;
            case 8: System.out.println("Mes: Agosto \nDias: 31");
            break;
            case 9: System.out.println("Mes: Septiembre \nDias: 30");
            break;
            case 10: System.out.println("Mes: Octubre \nDias: 31");
            break;
            case 11: System.out.println("Mes: Noviembre \nDias: 30");
            break;
            case 12: System.out.println("Mes: Diciembre \nDias: 31");
            break;
            default: System.out.println("¡¡No hay meses para este numero!!");
            break;
        }
        }
    }
    
}
