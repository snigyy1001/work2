import java.util.*;
public class BookTable {

    String tslots;
    int tno;
    static int[][] tavailable = new int[12][7];
    static int[][] storeCu_Id = new int[12][7];
    static String[] tymSlots = new String[] { "11:00-12:00", "12:00-13:00", "13:00-14:00", "14:00-15:00",
            "15:00-16:00", "16:00-17:00", "17:00-18:00", "18:00-19:00", "19:00-20:00", "20:00-21:00", "21:00-22:00",
            "22:00-23:00" };

    static void displayTimeSlots() {
        System.out.println("-----------------TIME SLOTS----------------\n");
        for (int i = 0; i < 12; i++) {
            System.out.println(i + 1 + ". " + tymSlots[i]);
        }

    }
    static boolean isAvailable(int option) {
        for (int i = 0; i < 7; i++) {
            if (tavailable[option - 1][i] == 0)
                return true;
        }
        return false;
    }



     static boolean isAvail(int option,int j) {
         return tavailable[option - 1][j] == 0;

    }
    static int fetchCustomerID(int n,int j){
        return storeCu_Id[n - 1][j];
    }

    void bookTable(int option, Customer c) {
        for (int i = 0; i < 7; i++) {
            if (tavailable[option - 1][i] == 0) {
                tno = i + 1;
                tslots = tymSlots[option - 1];
                tavailable[option - 1][i] = 1;
                storeCu_Id[option - 1][i]=c.id;
                c.t_no = tno;
                c.tslots= tslots;
                return;
            }

        }
    }
}


