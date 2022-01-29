import java.util.Scanner;

class BasicCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number - ");
        int number1 = sc.nextInt();
        System.out.println("Enter 2nd Number - ");
        int number2 = sc.nextInt();
        System.out.println("Enter Option from Following ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int option= sc.nextInt();
        switch (option){
            case1:
            System.out.println(number1 + number2);
            break;
            case2:
            System.out.println(number1 - number2);
            break;
            case3:
            System.out.println(number1 * number2);
            break;
            case4:
            if(number2==0){
                System.out.println("Cannot be divided");
            } 
            else{
                System.out.println(number1 / number2);
            }
            break;   
        }
    }
}