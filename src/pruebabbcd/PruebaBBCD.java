package pruebabbcd;

/**
 * @author ISMAEL
 */
import java.time.*;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class PruebaBBCD {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
        /*LocalDate todaysDate = LocalDate.now();
        System.out.println(todaysDate);
        
        Calendar calendario = new GregorianCalendar();
        int hora, minutos, segundos;
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        
        System.out.println(hora + ":" + minutos + ":" + segundos);
     
        int dia = calendario.get(Calendar.DAY_OF_WEEK);  
        System.out.println(dia);
        
        int[] arr = new int[999];
        Scanner entrada = new Scanner(System.in);
       
        int salida = 1;
        int num;
        int cont = 0;
        int v1 = 1;
        int indiceF = 999;
        int indicei = 0;
        do{  
          
            //num = random.nextInt(indiceF);
            num = (int) ((Math.random() * ((indiceF - indicei) + 1)) + indicei);
            //System.out.println("---"+num);
            for(int i=0 ; i< arr.length; i++){
                //0System.out.println("*****"+arr[i]);
                if(arr[i] == num){
                    v1 = 0;
                    break;
                }
                v1 = 1;
            } 
            if(v1 == 1){
                System.out.println("Numero Aleatorio: "+num);
                arr[cont] = num;
                cont = cont + 1;
                System.out.println("Este es el numero? 0 -- Menor | 1 -- Mayor | 2 -- si");
                int op = entrada.nextInt();
                if(op == 2){
                    salida = 2;
                }
                if(op == 0){
                    indiceF = num;
                    
                }
                if(op == 1){
                    indicei = num;
                   
                }
            }
            v1 = 1;
            
        }while(1 == salida);
        
    } */   
}
    