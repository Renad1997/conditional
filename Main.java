import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You Can Register");
        }else{
            System.out.println("You Can Not Register");
        }
        //*************************************************************************************************//
        System.out.println("Please enter the number: ");
        int number = input.nextInt();
        if(number%2==0){
            System.out.println("The number is Even:");
        }else{
            System.out.println("The number is Odd:");
        }
        //************************************************************************************************//
        System.out.println("Please enter your age: ");
        int age1 = input.nextInt();
        if(age1<6){
            System.out.println(" Cannot Register");
        } else if (age1>=6 && age1<18) {
            System.out.println("welcome to our courses");
        }else{
            System.out.println("welcome to our bootcamp ");
        }
        //************************************************************************************************//
        System.out.println("Please enter the number: ");
        int number1 = input.nextInt();
        if(number1>=1){
            System.out.println("the number is positive");
        } else if (number1<0) {
            System.out.println("the number is negative");
        } else {
            System.out.println("the number is zero");
        }
        //*************************************************************************************************//
        System.out.println("Please enter your grade: ");
        int grade = input.nextInt();
        if(grade<100 && grade>=95){
            System.out.println("Your grade is A+");
        } else if (grade<94 && grade>=90) {
            System.out.println("Your grade is A");
        } else if (grade<=89 && grade>=85) {
            System.out.println("Your grade is B+");
        } else if (grade<84 && grade>=80) {
            System.out.println("Your grade is B");
        } else if (grade<79 && grade>=75) {
            System.out.println("Your grade is C+");
        }else if (grade<74 && grade>=70) {
            System.out.println("Your grade is C");
        }else if (grade<69 && grade>=65) {
            System.out.println("Your grade is D+");
        }else if (grade<64 && grade>=60) {
            System.out.println("Your grade is D");
        }else if (grade<60 ){
            System.out.println("your grade is F");
            }
        //**************************************************************************************************//
        System.out.println("please enter 1 to inquire your username:");
        System.out.println("please enter 2 to inquire your id:");
        System.out.println("please enter 3 to inquire your balance:");
        System.out.println("please enter 4 to inquire your password:");
        System.out.println("please enter 5 to calling customer service now.......");
        int value = input.nextInt();
        switch (value) {
            case 1:
                System.out.println("your UserName is Renad Mohammed");
                break;
                case 2:
                System.out.println("your ID is 12345 ");
                break;
                case 3:
                    System.out.println("your balance is 2000 ");
                    break;
                    case 4:
                        System.out.println("your password is Renad123 ");
                        break;
                        case 5:
                            System.out.println(" calling customer service now.......");
                            break;
            default:
                System.out.println("Enter number from 1 to 5");
        }
        //****************************************************************************************************//
        System.out.println("Please enter the password: ");
       String password1 = input.next();
        if(password1.length() >=8) {
            System.out.println("your password is strong");
        }else{
                System.out.println("your password is weak");
        }
       //**********************************************************************************************//
        System.out.println("Please enter the number1: ");
        int numbers1 = input.nextInt();
        System.out.println("please enter the number2: :");
        int numbers2 = input.nextInt();
        System.out.println("please enter the number3: ");
        int numbers3 = input.nextInt();
        if(numbers1 >= numbers2 ){
            System.out.println(numbers1);
        } else if (numbers2 >= numbers3) {
            System.out.println(numbers2);
        } else if (numbers3 >= numbers1) {
            System.out.println(numbers3);
        }
    }
    }

