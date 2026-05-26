import java.util.Scanner;
class atm{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int choice ;
        int balance = 5000;
        

        do
        {
             System.out.println("===== ATM MACHINE =====");
             System.out.println("1. Check Balance");
             System.out.println("2. Deposit Money");
             System.out.println("3. Withdraw Money");
             System.out.println("4. Exit");

             System.out.println("Enter your choice : ");
             choice = sc.nextInt();

             if (choice == 1 )
             {
                 sc.nextLine();
                 System.out.println("===== Check Balance =====");
                 System.out.print("Enter pin : ");
                 String pin = sc.nextLine();
                 
                 if(pin.length() == 4 && pin.equals("4323"))
                 {
                  System.out.println("= login to your account succesfull =");
                  System.out.println("BALANCE : " + balance);
                  
                 }
                 else  
                  {
                     System.out.println("= invalid pin =");
                  System.out.println("Start from begining");
                  }
                 
             }
             else if(choice == 2)
             {
                 sc.nextLine();
                 System.out.print("Enter pin : ");
                 String pin = sc.nextLine();

                 if(pin.length() == 4 && pin.equals("4323"))
                 {
                  System.out.println("= login to your account succesfull =");
                  System.out.println("Enter  the deposit amount : ");
                  int deposit = sc.nextInt();
                  System.out.println("Your amount of " + deposit + " rupees deposit succesfull");
                 }
                 else  
                  {
                     System.out.println("= invalid pin =");
                  System.out.println("Start from begining");
                  }
             }
             else if (choice ==3)
             {
               sc.nextLine();
                 System.out.print("Enter pin : ");
                 String pin = sc.nextLine();

                 if(pin.length() == 4 && pin.equals("4323"))
                 {
                  System.out.println("= login to your account succesfull =");
                  System.out.println("Enter  the withdraw amount : ");
                  int withdraw = sc.nextInt();
                  System.out.println("Your amount of " + withdraw + " rupees withdraw succesfull");
                 }
                 else  
                  {
                     System.out.println("= invalid pin =");
                  System.out.println("Start from begining");
                  }
             }

            
        }while(choice != 4);

         System.out.println("Program Exit");




        sc.close();

    }
}