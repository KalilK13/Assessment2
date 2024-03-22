package javaassessment;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6};
        double[] myDoubleArray = {1,2,3,4,5,6};
//        tenToOne();
//        System.out.println(sumOfElements(myArray));
//        System.out.println(averageOf(myDoubleArray));
        System.out.println(randomNum());
//        System.out.println(sumOfEven(myArray));
//        System.out.println(areaOfCube(10));
//        System.out.println(charCount("Hello there", 'e'));
//        System.out.println(isAPalindrome("lol"));
//        System.out.println(leapYear(2024));
//        ticketPlease();

    }
    public static void tenToOne(){
        int num = 0;
        for(int i = 10; i > num; i--){
            System.out.println(i);
        }
    }
    public static int sumOfElements(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            count += array[i];
        }
        return count;
    }
    public static double averageOf(double[] array){
        double count = 0;
        for(int i = 0; i < array.length; i++){
            count += array[i];
        }
        return count / array.length;
    }
    public static int randomNum(){

        return (int) (Math.random()*10) +1;
    }
    public static int sumOfEven(int[] array){
        int count = 0;
        for(int i = 0; i <= array.length; i++){
            if(i % 2 == 0 && i != 0){
                count += array[i-1];
            }
        }
        return count;
    }
    public static double areaOfCube(double area){
        return Math.pow(area, 3);
    }
    public static int charCount(String newString, char charInString){
        int count = 0;
        for(int i = 0; i < newString.length(); i++){
            if(newString.charAt(i) == charInString){
                count++;
            }
        }
        return count;
    }
        public static boolean isAPalindrome(String newString){
        String[] splitString = newString.split("");
        String reversedString = "";
        for(int i = splitString.length; i > 0; i--){
            reversedString += splitString[i-1];
        }
        return reversedString.equals(newString);
    }
    public static boolean leapYear(int year){
        return year % 4 == 0;
    }

    public static void ticketPlease(){
        Scanner input = new Scanner(System.in);

        System.out.println("What is you ticket number?");
        String ticketnum = input.nextLine();

        System.out.println("What is your destination?");
        String destination = input.nextLine();

        System.out.println("Now serving customer number " + ticketnum +"." +"Enjoy your trip to " + destination);

    }

}