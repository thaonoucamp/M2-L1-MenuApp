import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {

        while (true) {
            int choice;
            Scanner input = new Scanner(System.in);

            System.out.println("Menu");
            System.out.println("1. Ve tam giac");
            System.out.println("2. Ve hinh vuong");
            System.out.println("3. Ve hinh chu nhat");
            System.out.println("0. Exit");
            System.out.println("");

            choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("");
                        System.out.println("******");
                        System.out.println("*****");
                        System.out.println("****");
                        System.out.println("***");
                        System.out.println("**");
                        System.out.println("*");
                        break;
                    case 2:
                        System.out.println("Ve hinh vuong");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        break;
                    case 3:
                        System.out.println("Ve hinh chu nhat");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Khong chon");
                }
            }
        }
    }
