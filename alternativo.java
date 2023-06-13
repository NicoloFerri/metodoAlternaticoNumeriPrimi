package co.develhope.introduction._10;

import java.util.Arrays;

public class alternativo {

    public static void main(String[] args) {

        int n=6;
        int[] arrPrime = new int[n];
        int currentNumber =2;
        int index=0;

        do {
            int c=0;
            for ( int j= 2 ; j<currentNumber ; j++){
                if ( currentNumber % j == 0){
                    if ( currentNumber !=j ){
                        c++;
                    }
                }
            }
            if ( c == 0 )
            {
                arrPrime[index]=currentNumber;
                index++;
            }
            currentNumber++;

        }while(index<n);

        System.out.println(Arrays.toString(arrPrime));








        }



    }


