package Homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        System.out.println(" Wie viel Kartons möchten sie versenden ");

        Scanner Kartons = new Scanner( System.in);
        int Karton = Kartons.nextInt();

        System.out.println(" wie viel wiegen Kartons");
        double KG = Kartons. nextDouble();

        Scanner Name = new Scanner( System.in);

        System.out.println("Name");
        String Name1 = Name. nextLine();

        System.out.println("Nachname");
        String Nachname1 = Name.nextLine();

        System.out.println("geben sie ihre Adresse");
        String Adresse1 = Name.nextLine();

        System.out.println("Name: "+"\"" + Name1.toUpperCase() + " "+"Nachname: "+"\"" + Nachname1.toUpperCase()
                + " " + "\"" + "\n"+"Adresse: "+"\""+ Adresse1.toUpperCase() + "\"" +"\n"+"Gewicht: " + (Karton*KG ));

        boolean FT = Name.nextBoolean();
        Scanner Inputcheckbox 

        System.out.println(" Arbeit erledigt Anastasiya Nudman");





    }
}
