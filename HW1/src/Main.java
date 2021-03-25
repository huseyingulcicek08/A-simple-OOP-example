import java.util.Scanner;  //Needed for the Scanner class
import java.util.Random;

public class Main extends Kid {
    public Main(String name, String lastName, int age, int HEScode, String g) {
        super(name, lastName, age, HEScode, g);
    }

    public static void main (String[] args) {


        System.out.println("Please enter age of a person in between 0 and 100 : ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        Random obj = new Random();
        int rand_num = obj.nextInt(0xffffff + 1);
// format it as hexadecimal string and print
        String HESCode = String.format("#%06x", rand_num);


        if (age <= 20) {
            System.out.println("We treat him/her as a kid.");

        }
        else if (age>20 & age<60){
            System.out.println("We treat him/her as a parent");
            System.out.println("Please enter his/her number kids : ");
            int kid = scan.nextInt();
            System.out.println("Please enter the kid's name : ");
            String name = scan.next();
            System.out.println("Please enter the kid's Last name : ");
            String lastName = scan.next();
            System.out.println("Please enter the kid's gender as Female or Male : ");
            String Gender = scan.next();
            System.out.println( name + " " + lastName +" is a " + Gender + " Kid " + "and HIS Hes Code : " + HESCode+ " - " + "1295 -" + " 698");
        }
        else if (age>=60 & age<=65){
            System.out.println("You are old person but not old enough");
            System.out.println("Please enter elderly person's name : ");
            String name = scan.next();
            System.out.println("Please enter elderly person's last name : ");
            String lastName= scan.next();
            System.out.println("The person's HES code : " + HESCode + " - " + "1295 -" + " 698"   );
            System.out.println("He/She is NOT old enough to get vaccine  ");

        }
        else if (age>66 & age<120){
            System.out.println("You are old person but you shouldn't be sad maybe you won't die");
            System.out.println("Please enter elderly person's name : ");
            String name = scan.next();
            System.out.println("Please enter elderly person's last name : ");
            String lastName= scan.next();
            System.out.println("The person's HES code : " + HESCode + " - " + "1295 -" + " 698"   );
            System.out.println("He/She is   old enough to get vaccine  ");
        }


    }}