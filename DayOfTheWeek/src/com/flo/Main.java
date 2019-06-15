package com.flo;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(5);
        printNumberInWord(3);
    }
        public static void printDayOfTheWeek (int day) {
            switch (day) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Value was Monday");
                    break;
                case 2:
                    System.out.println("Value was Tuesday");
                    break;
                case 3:
                    System.out.println("Value was Wednesday");
                    break;
                case 4:
                    System.out.println("Value was Thursday");
                    break;
                case 5:
                    System.out.println("Value was Friday");
                    break;
                case 6:
                    System.out.println("Value was Saturday");
                    break;

                default:
                    System.out.println("Invalid day");
            }
        }
            public static void printNumberInWord (int number) {
                switch (number) {
                    case 0:
                        System.out.println("ZERO");
                        break;
                    case 1:
                        System.out.println("ONE");
                        break;
                    case 2:
                        System.out.println("TWO");
                        break;
                    case 3:
                        System.out.println("THREE");
                        break;
                    case 4:
                        System.out.println("FOUR");
                        break;
                    case 5:
                        System.out.println("FIVE");
                        break;
                    case 6:
                        System.out.println("SIX");
                        break;
                    case 7:
                        System.out.println("SEVEN");
                        break;
                    case 8:
                        System.out.println("EIGHT");
                        break;
                    case 9:
                        System.out.println("NINE");
                        break;

                    default:
                        System.out.println("OTHER");
        }
    }
}
