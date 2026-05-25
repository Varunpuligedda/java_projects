import java.util.Scanner;

class Studentgrade{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int opt;


      do
        {
            System.out.println("===== Student Result System =====");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Exit");

            System.out.print("Enter your choice :");
            opt = sc.nextInt(); // to take the input to enter the name or exit from project

            if(opt == 1)
            {
                sc.nextLine();
                System.out.println("===== Taking Student Details  =====");
                System.out.print("Enter student name : ");
                String name = sc.nextLine();

                System.out.print("Roll no : ");
                int id = sc.nextInt();

                System.out.print("Python : ");
                int python = sc.nextInt();

                System.out.print("Java : ");
                int java = sc.nextInt();

                System.out.print("Ruby : ");
                int ruby = sc.nextInt();

                int total = java + python + ruby;
                System.out.println("Total : " + total);

                int average = total / 3;
                System.out.println("Average :" + average);

                double a = 300;
                double percentage = total / a * 100;
                System.out.println("Percentage :" + percentage + "%");

                if(total >= 270 && total <=300)
                {
                    System.out.println("Grade : A+ ");
                }
                else if (total >= 240 && total >= 269)
                {
                    System.out.println("Grade : A ");
                }
                else if (total >= 210 && total >= 239)
                {
                    System.out.println("Grade : B ");
                }
                else if (total >= 180 && total >= 209)
                {
                    System.out.println("Grade : C ");
                }
                else if (total >= 150 && total >= 179)
                {
                    System.out.println("Grade : D ");
                }else if (total >= 150)
                {
                    System.out.println("Grade : F ");
                }

                System.out.println("===== Thank you  =====");

                //break;
            }
            else if(opt == 2)
            {
                System.out.println("Exiting program...");
                System.out.println("===== Thank you  =====");
            }
            else 
            {
                System.out.println("Invalid choice");
            }
        }while(opt != 2);  

        sc.close();

    }
}
