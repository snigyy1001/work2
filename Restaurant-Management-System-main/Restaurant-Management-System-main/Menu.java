public class Menu {
    String item;
    double price;
    Menu(String item,double price){
        this.item=item;
        this.price=price;
    }
    static String[] items=new String[]{"Chicken Biryani","Mutton Biryani","Biryani","Butter Chicken and Naan",
            "Tandoori Chicken","Punjabi chicken with Laccha Paratha","Masala Kulcha","Chili Paneer","Chicken Hakka Noodles"
            ,"Fish Finger","Ice-Cream","Soft Drink"
    };
    static double[] cost=new double[]{200.0,350.0,130.0,399.0,249.0,359.0,110.0,269.0,210.0,99.0,89.0,59.0};
    static void displayMenuItems(){
        System.out.println("\n   ------------------Menu------------------\n");
        System.out.println("""
                1=Chicken Biryani                       200.0
                2=Mutton Biryani                        350.0
                3=Biryani                               130.0
                4=Butter Chicken and Naan               399.0
                5=Tandoori Chicken                      249.0
                6=Punjabi chicken with Laccha Paratha   359.0
                7=Masala Kulcha                         110.0
                8=Chili Paneer                          269.0
                9=Chicken Hakka Noodles                 210.0
                10=Fish Finger                           99.0
                11=Ice-Cream                             89.0
                12=Soft Drink                            59.0""");
        }
}

