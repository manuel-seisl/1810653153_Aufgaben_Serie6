package Aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class Aufruf
{

    public static void main(String[] args){

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 58; i++){
            arrayList.add((int)(Math.random() * 99));
        }

        for (int item : arrayList){
            System.out.println(item);
        }

    }

}
