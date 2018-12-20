package Aufgabe2;

public class Aufruf
{

    public static void main(String[] args){

        int [] array1 = new int[10];

        for (int i = 0; i < 10; i++){
            array1[i] = i + 1;
        }

        for (int item : array1){
            System.out.println(item);
        }

    }

}
