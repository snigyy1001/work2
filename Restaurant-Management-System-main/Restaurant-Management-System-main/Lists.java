import java.time.LocalDate;

public class Lists {
    static Customer[] listsOfCustomer=new Customer[500];
    static int cust=0;

    static Customer getId(int id) {
        for (int i = 0; i < cust; i++) {
            if (listsOfCustomer[i].id == id)
                return listsOfCustomer[i];
        }
        return null;
    }
    static void noOfCustomers() {
        if (cust == 0) {
            System.out.println("No Customers Yet");
        }
        else {
            System.out.println("Total customers of the day: "+ cust);
        }
    }
    static void addCustomer(Customer c) {
        listsOfCustomer[cust] = c;
        cust ++;
    }

    static Customer maxOdr() {
        if (cust == 0)
            return null;
        double max = 0.0;
        Customer obj = null;
        for (int i = 0; i < cust; i++) {
            if (listsOfCustomer[i].odramt >= max) {
                max = listsOfCustomer[i].odramt;
                obj = listsOfCustomer[i];
            }
        }
        return obj;
    }
    static double totalamt() {
        if (cust == 0)
            return 0.0;
        double total = 0.0;
        for (int i = 0; i < cust; i++) {
            total=total+ listsOfCustomer[i].odramt;
        }
        return total;
    }
    static void listAllCustomers() {
        noOfCustomers();
        for (int i = 0; i < cust; i++) {
            System.out.println("-------------------------------------------\n");
            System.out.println("Customer ID:" + listsOfCustomer[i].id);
            System.out.println("Name: " + listsOfCustomer[i].name);
            System.out.println("Phone: " + listsOfCustomer[i].mobno);
            System.out.println("Date: " + (LocalDate.now()));
            listsOfCustomer[i].ShowOdrDetails();
            System.out.println();
            System.out.println("Total Amount: " + listsOfCustomer[i].odramt);
            System.out.println("Table No: " + listsOfCustomer[i].t_no);

        }
    }
}
