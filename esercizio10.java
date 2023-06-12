package co.develhope.introduction._10;

public class esercizio10 {
    public static void main(String[] args) {

        String[] carBrands = { "Audi" , "Mercedes" , "BMW" , "Ferrari" , "Lamborghini" };
        System.out.println(carBrands.length);
        System.out.println(carBrands[2]);

        int n = 6;
        int index = 0;
        int currentNumber = 2;
        int[] primeNumbers = new int[n];
        while(index<n) {
            if (isPrime(currentNumber)) {
                primeNumbers[index] = currentNumber;
                index++;
            }
            currentNumber++;
        }
        for (int i=0;i<n;i++) {
            System.out.print(primeNumbers[i] + " ");
        }
    }

    public static boolean isPrime (int n) {

        boolean isPrimo = true;
        for (int divisore = 2; divisore < n; divisore++) {
            if (n % divisore == 0) {
                isPrimo = false;
                break;
            }
        }
        return isPrimo;
    }
}
