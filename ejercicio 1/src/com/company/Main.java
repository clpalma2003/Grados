package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leer = new Scanner(System.in);


        System.out.println(" Cual es tu edad : ");

        int edad = leer.nextInt();

        if(edad >=18){
            System.out.println(" Eres mayor de edad: " + edad);
        } else{
            System.out.println(" Eres menor de edad " + edad);
        }

        if( edad > 10 && 15 < edad ){
            System.out.println(" Te toca el grado A ");
        } else{
            System.out.println(" Te toca el grado B ");
        }








    }
}
