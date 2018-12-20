package Aufgabe5;

public class Aufruf
{

    public static void main(String[] args){

        int[][] array1 = new int[3][3];
        int cnt = 1;

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                array1[i][j] = cnt;
                cnt++;
            }
        }

        for (int k = 0; k < array1.length; k++){
            for (int l = 0; l < array1[k].length; l++){
                System.out.println(array1[k][l]);
            }
        }

    }

}
