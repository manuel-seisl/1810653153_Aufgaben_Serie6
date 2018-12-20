package Aufgabe1;

import javax.swing.*;

public class Aufruf
{

    public static void main(String[] args){

        String var1 = JOptionPane.showInputDialog("Bitte 1. Eingabe tätigen:");
        String var2 = JOptionPane.showInputDialog("Bitte 2. Eingabe tätigen:");
        String var3 = JOptionPane.showInputDialog("Bitte 3. Eingabe tätigen:");

        boolean isEqual = false;

        if (var1.substring(3).equals(var2.substring(3))){
            isEqual = true;
        } else if (var1.substring(3).equals(var3.substring(3))){
            isEqual = true;
        } else if (var2.substring(3).equals(var3.substring(3))){
            isEqual = true;
        }

        if (isEqual){
            System.out.println("Es wurden gleiche Texte mit den 3 gleichen Anfangszeichen eingegeben!");
        } else {
            System.out.println("Es wurden keine gleichen Texte eingegeben!");
        }

    }

}
