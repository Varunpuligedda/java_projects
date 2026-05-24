import java.util.Scanner;

class info{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);

       // System.out.print("Enter student name : ");
       // String name = sc.nextLine();


       // System.out.println("student name saved succesfully...");
       // System.out.println("student name is " + name);
        
      //  System.out.println("Enter marks of the subject... "); 

        System.out.print("PYTHON : ");
        int python = sc.nextInt();
        if (python < 0 || python > 100){
                System.out.println("invalid marks");
                System.out.println("re enter by refreshing the page");
            }
        

        System.out.print("JAVA : ");
        int java = sc.nextInt();
        if (java < 0 || java > 100){
                System.out.println("invalid marks");
                System.out.println("re enter by refreshing the page");
            }

        System.out.print("RUBY : ");
        int ruby = sc.nextInt();if (ruby < 0 || ruby > 100){
                System.out.println("invalid marks");
                System.out.println("re enter by refreshing the page");
            }

        int total = python + java + ruby;
        System.out.println("Total marks of student : " + total);

        int average = total / 3;
        System.out.println("average of marks: " + average);
        
        double a = 300;
        double percentage = total / a * 100;
        System.out.println("percentage: " + percentage + "%");

        if(total >= 250)
        {
            System.out.println("Grade : A");
        }
        else if(total >= 200)
        {
             System.out.println("Grade : B");
        }
        else if(total >= 150)
        {
            System.out.println("Grade : C");
        }
        else if(total <= 150)
        {
             System.out.println("Grade : F");
        }

        if (total <= 150)
            System.out.println("result : pass");
            else 
            System.out.println("result : fail");





        sc.close();
    }
}