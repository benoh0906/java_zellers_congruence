/*
JB Oh
CS201 Y
The program that uses Zeller's Congruence to tell you the day of the week by taking month, day, and yeat as an input"
*/


import java.util.Scanner;

class Zeller{

    public Zeller(){

    }

    public void dayOfTheWeek(int month, int day, int year){

        switch (month){
            case 1: 
                month=13;
                year-=1;
                break;
            case 2: 
                month=14;
                year--;
                break;
            default:
                month=1;
        }

        int d = day; 
        int m = month; 
        int y = year % 100; 
        int yy = year / 100; 
        int h = d + 13*(m+1)/5 + y + y/4 + yy/4 + 5*yy; 
        h = h % 7; 
        String output;

        switch(h){
            case 0: 
                output = "Saturday";
                break;
            case 1: 
                output = "Sunday";
                break;   
            case 2: 
                output = "Monday";
                break;   
            case 3: 
                output = "Tuesday";
                break;        
            case 4: 
                output = "Wednesday";
                break;     
            case 5: 
                output = "Thursday";
                break;     
            case 6: 
                output = "Friday";
                break;            
            default:
                output="wrong input";
                break;
        }

        System.out.printf("This date falls on a %s\n",output);


    }

    public static void main(String[] args) {


        System.out.println("This program calculates the calendar day of the week from a given month, day, and year.");
        
        System.out.println("Enter a month (e.g. 12):");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        System.out.println("Enter a day (e.g. 25):");
        Scanner sc2 = new Scanner(System.in);
        int day = sc2.nextInt();

        System.out.println("Enter a year (e.g. 2019):");
        Scanner sc3 = new Scanner(System.in);
        int year = sc3.nextInt();

        Zeller zellerObj = new Zeller();

        zellerObj.dayOfTheWeek(month, day, year);

        
    }
}
/*
Switch(month){
    case "December": 
        month=12;
        break;
    case"January": 
        month=1;
        return "January"
        break;
    default:
        month=1;
}
*/