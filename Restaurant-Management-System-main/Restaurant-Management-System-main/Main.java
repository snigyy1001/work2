import java.util.*;
public class Main {
    public static void main(String[] args) {
        int m, n;
        try(Scanner var=new Scanner(System.in)){
           do{
               System.out.println("-----------Resturant------------\n");
               System.out.println("Enter your choice according to the menu given below-");
               System.out.println("1=Book a Table");
               System.out.println("2=Check table availability");
               System.out.println("3=Collections of the day");
               System.out.println("4=Total customer of the day");
               System.out.println("5=Highest bill of the day");
               System.out.println("6=Customer details");
               System.out.println("7=Food Menu");
               System.out.println("0=Exit");

               m=var.nextInt();
               if(m==0)
                   break;
               switch (m) {
                   case 1 -> {
                       Customer obj = new Customer();
                       obj.inputCustomer();
                       Menu.displayMenuItems();
                       obj = Lists.getId(obj.id);
                       int food, choose;
                       System.out.print("Enter your Choice(1-12): ");
                       food = var.nextInt();
                       assert obj != null;
                       obj.addMore(food);
                       do {
                           System.out.print("Do You Want To Order More(0/1): ");
                           choose = var.nextInt();
                           if (choose == 0)
                               break;
                           System.out.print("Enter your Choice(1-12): ");
                           food = var.nextInt();
                           obj.addMore(food);
                       } while (choose > 0);
                       BookTable.displayTimeSlots();
                       System.out.println("Enter Slot: ");
                       n = var.nextInt();
                       if (BookTable.isAvailable(n)) {
                           BookTable t = new BookTable();
                           t.bookTable(n, obj);
                           System.out.println("Successful!");
                           System.out.println("Customer ID: " + obj.id);
                           System.out.println("Table No: " + obj.t_no);
                       } else {
                           System.out.println("Table Not Available between " + BookTable.tymSlots[n - 1]);
                       }
                   }
                   case 2 -> {
                       BookTable.displayTimeSlots();
                       System.out.println("Enter Slot: ");
                       n = var.nextInt();
                       for (int j = 0; j < 7; j++) {
                           if (BookTable.isAvail(n, j)) {
                               System.out.println("Table number - " + (j + 1) + "   Status - Empty   ");
                           } else {
                               System.out.println("Table number - " + (j + 1) + "   Status - Booked   "+ " Customer ID "+(BookTable.fetchCustomerID(n,j)));
                           }
                       }
                   }
                   case 3 -> System.out.println("Total income of the day = " + (Lists.totalamt()));
                   case 4 -> Lists.noOfCustomers();
                   case 5 -> {
                       Customer obj1 = Lists.maxOdr();
                       if (obj1 == null)
                           System.out.println("No Customers Yet");
                       else
                           obj1.highestBill();
                   }
                   case 6 -> Lists.listAllCustomers();
                   case 7 -> Menu.displayMenuItems();
                   default -> System.out.println("Enter values from (1-7)..!!!");
               }
           }while(m>0);
        }


    }
}
