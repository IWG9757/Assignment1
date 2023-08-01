public class Task_b{
    public static void main(String[] args) {

        //initializing variables ages and names.
        int age1 = 24;
        String name1 = "Alice";

        int age2 = 30;
        String name2 = "Bob";

        //initializing title, record and line of the table

        final String TITLE = "\033[1;36m%-14s \033[1;33m| \033[1;36m%-3s \033[1;33m| \n";
        final String RECORD = "\033[0m%-14s \033[0;33m| \u001B[35m%3d \033[0;33m| \n";
        final String LINE = "\033[0;33m+---------------+-----+\n|";

        // Print the table title
        System.out.printf(LINE);
        System.out.printf(TITLE, "NAME", "AGE");
        
 
        // Print the table row1
        System.out.printf(LINE);
        System.out.printf(RECORD, name1,age1);

        // Print the table row2
        //System.out.printf(LINE);
        System.out.printf(RECORD, name2, age2);

        
        // Print the table footer
        System.out.printf(LINE);

        
    }
}