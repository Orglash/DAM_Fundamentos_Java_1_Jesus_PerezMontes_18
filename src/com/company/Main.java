package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Pedimos la fecha en formato dia/mes/año por consola y asignamos cada uno a una variable.
        System.out.println("Introduzca el dia:\n");
        Scanner sc=new Scanner(System.in);
        int dia=sc.nextInt();
        System.out.println("Introduzca el mes:\n");
        int mes=sc.nextInt();
        System.out.println("Introduzca el año:\n");
        int año=sc.nextInt();
        //Boolean para imprimir la respuesta adecuada.
        boolean fecha=false;
        //Variables auxiliares para comparaciones
        int diafinal;
        int mesfinal=mes;
        int añofinal=año;
        int cantidadDias=0;
        //If para comprobar si los datos introducidos estan dentro del rango aceptado.
        if (año>0){
            if (mes==2&&(dia>0&&dia<=28)){
                cantidadDias=28;
                fecha=true;
            }else{
                if((mes==4||mes==6||mes==9||mes==11)&&(dia>0&&dia<=30)){
                    cantidadDias=30;
                    fecha=true;
                }else{
                    if((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&(dia>0&&dia<=31)){
                        cantidadDias=31;
                        fecha=true;
                    }
                }
            }
        }
        //Comprobamos si la fecha es final de mes/año e incrementamos las variables apropiadas y reseteamos el dia/mes. En caso de que no sea final de mes/año, se aumenta en uno el dia.
        if(fecha){
            System.out.println("La fecha introducida es correcta.");
            if(mes!=12&&dia!=cantidadDias){
                diafinal=dia+1;
            }else {
                if (mes == 12 && dia == cantidadDias) {
                    diafinal = 1;
                    mesfinal = 1;
                    añofinal ++;
                } else {
                    if (mes != 12 && dia == cantidadDias) {
                        diafinal = 1;
                        mesfinal ++;
                    } else {
                        diafinal = dia + 1;
                    }
                }
            }
            //Imprimimos en pantalla el resultado
            System.out.printf("El dia siguiente al introducido es: %d/%d/%d", diafinal, mesfinal, añofinal);
        }else{
            System.out.println("La fecha introducida es incorrecta.");
        }
    }
}
