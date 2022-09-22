import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        switchExample(1);
//
//        forLoopExample(4);
//
//        System.out.println("Value = " + 20000.00000000);
//        System.out.println("Value = " + String.format("%.2f", 20000.00000000) );

//        sum3And5(5, 1, 1000);
//
//        System.out.println(sumOdd(1, 100));
//        System.out.println(sumOdd(-1, 100));

//        System.out.println(isPalindrome(1221));
//        System.out.println(isPalindrome(-1221));
//        System.out.println(isPalindrome(-12021));
//        System.out.println(isPalindrome(1234));

//        convertStringToNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What year were you born?");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // Need to get the new line character out of the input stream
        int age = 2022 - birthYear;

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();



        System.out.println("Hello, " + name + " you are " + age + " years old!");
        scanner.close();
    }

    public static void switchExample(int switchValue) {
        // Applicable Types: Byte, Short, Char, Int, String
        switch (switchValue) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            case 4: case 5: case 6:
                System.out.println("Case 4 -6");
                break;
            default:
                System.out.println("Default");
        }
    }

    public static void forLoopExample(int loopQty) {
        for (int i = 0; i < loopQty; i++) {
            System.out.println("Loop " + i);
        }
    }

    public static void printPrimeNumbers() {
        int count = 0;
        for(int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        //for(int i=2; i <= (long) Math.sqrt(n); i++) {   // This version is slightly more optimized then the n/2 version below
        for(int i=2; i <= n/2; i++) {
            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sum3And5(int qtyMatchesTarget, int searchRangeLow, int searchRangeHigh) {
        int qtyMatches = 0;
        int sumTotal = 0;

        for (int i = searchRangeLow; i <= searchRangeHigh; i++) {
            if ( ((i % 3) == 0) && ((i % 5) == 0) ) {
                qtyMatches++;
                sumTotal+=i;
                System.out.println(i);
            }

            if (qtyMatches >= qtyMatchesTarget) {
                break;
            }
        }

        System.out.println("Total = " + sumTotal);
    }

    public static boolean isOdd(int input) {
        if ( (input > 0) && (input % 2 != 0 ) ) {
            return true;
        }

        return false;
    }

    public static int sumOdd(int rangeLow, int rangeHigh) {
        if ((rangeLow < 0) ||
            (rangeHigh < 0) ||
            (rangeLow > rangeHigh))
        {
            return -1;
        }

        int sumValue = 0;
        for (int i = rangeLow; i <= rangeHigh; i++) {
            if (isOdd(i)) {
                sumValue += i;
            }
        }

        return sumValue;
    }

    public static void whileExample() {
        int count = 1;
        while (count != 6) {
            count++;
        }
    }

    public static void whileExampleWithBreak() {
        int count = 1;
        while (true) {
            if (count % 2 == 0) {
                continue;
            }

            if (count == 6) {
                break;
            }
            count++;
        }
    }

    public static void doWhileExample() {
        // Note: The advantage/disadvantage of this is it will always execute once
        int count = 1;
        do {
            count++;
        } while (count != 6);
    }


    public static boolean isPalindrome(int number) {
        int fwdValue = Math.abs(number);
        int revValue = 0;

        int prcValue = fwdValue;
        boolean numReversed = false;

        while (!numReversed) {
            revValue = (revValue * 10) + (prcValue % 10);
            prcValue = (int) Math.floor(prcValue / 10);

            if (prcValue <= 0) {
                numReversed = true;
            }
        }


        boolean compareComplete = false;

        while (!compareComplete) {
            if ( (revValue % 10) == (fwdValue % 10) ) {
                revValue = (int) Math.floor(revValue/10);
                fwdValue = (int) Math.floor(fwdValue / 10);
            } else {
                return false;
            }

            if (revValue <= 0 || fwdValue <= 0) {
                compareComplete = true;
            }
        }

        return true;
    }

    public static void convertStringToNumber() {
        String intAsString = "2018";
        int number = Integer.parseInt(intAsString);

        System.out.println(number);

        System.out.println(number + 1);

        String doubleAsString = "2018.123";
        double doubleNumber = Double.parseDouble(doubleAsString);
        System.out.println(doubleNumber);
    }


}