public class Task_d {
    // ANSI color codes
    

    public static void main(String[] args) {


        //initializing variables
        String name1 = "Apples";
        int quantity1 = 5;
        double price1 = 0.99;

        String name2 = "Oranges";
        int quantity2 = 10;
        double price2 = 1.48;

        //initializing title, record and line of the table

        final String TITLE = "\033[1;37m%-14s \033[1;33m| \033[1;37m%-8s \033[1;33m| \033[1;37m%-6s \033[1;33m|\n";
        final String RECORD = "\033[0m%-14s \033[0;33m| \033[0;34m%8d \033[0;33m| \033[0;32m$\u001B[35m%-5.2f \033[0;33m|\n";
        final String LINE = "\033[0;33m+---------------+----------+--------+ \n|";

        // Print the table title
        System.out.printf(LINE);
        System.out.printf(TITLE, "ITEM", "QUANTITY", "PRICE");
        
 
        // Print the table row1
        System.out.printf(LINE);
        System.out.printf(RECORD, name1, quantity1, price1);

        // Print the table row2
        System.out.printf(LINE);
        System.out.printf(RECORD, name2, quantity2, price2);

        
        // Print the table footer
        System.out.printf(LINE);

    }

   
}
