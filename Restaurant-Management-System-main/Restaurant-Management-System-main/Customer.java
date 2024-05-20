import java.time.LocalDate;
import java.util.*;
public class Customer {
    static int customerId=100;
    public String tslots;
    int id,t_no,items;
    double odramt;
    String name;
    long mobno;
    Menu[] ord= new Menu[500];

    void inputCustomer(){
        Scanner var=new Scanner(System.in);
        System.out.println("Name=");
        name=var.nextLine();
        System.out.println("Phone Number=");
        mobno=var.nextLong();
        LocalDate date= LocalDate.now();
        System.out.println("Date="+date);
        customerId=customerId+1;
        id=customerId;
        items=0;

        Lists.addCustomer(this);
    }
    void addMore(int opt){
        String food=Menu.items[opt-1];
        double cost=Menu.cost[opt-1];
        Menu obj=new Menu(food,cost);
        ord[items]=obj;
        odramt += cost;
        items++;
    }

     void ShowOdrDetails() {
        if (items == 0) {
            System.out.println(" Order!  ");
            return;
        }
        System.out.print("Order Details - ");
        for (int i = 0; i < items; i++) {
            System.out.print( "/" + ord[i].item);
        }
    }

    void highestBill(){
        System.out.println("Highest bill of the day = "+odramt);
        System.out.println("Customer ID = "+id);
        System.out.println(name+" wins the Gift for today..!!");
    }
}
