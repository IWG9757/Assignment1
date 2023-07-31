public class Task_c {
    public static void main(String[] args) {
        
                //initializing variables
                String city1 = "Los Angeles";
                String state1 = "California";
                long polpulation1 = 3966936;
        
                String city2 = "\033[0;32mNew \033[0mYork";
                String state2 = "\033[0;32mNew \033[0mYork";
                long polpulation2 = 8336817;
                
        
                //initializing title, record and line of the table
        
                final String TITLE = "\033[0;37m%-14s \033[1;33m| \033[0;37m%-10s \033[1;33m| \033[0;37m%-10s \033[1;33m|\n";
                final String RECORD = "\033[0m%-14s \033[0;33m| \033[0m%10s \033[0;33m| \u001B[35m%,d \033[0;33m|\n";
                
                // Print the table title
                final String LINE = "\033[0;33m+---------------+----------+--------------+ \n|";
                System.out.printf(LINE);
                System.out.printf(TITLE, "CITY", "STATE", "POPULAION");
                
         
                // Print the table row1
                System.out.printf(LINE);
                System.out.printf(RECORD, city1, state1, polpulation1);
        
                // Print the table row2
                System.out.printf(LINE);
                System.out.printf(RECORD, city2, state2, polpulation2);
        
                
                // Print the table footer
                System.out.printf(LINE);
    
        
           
    
        
    }
}