public class Demo5{
    public static void main(String[] args) {
        
        //initialize the four separate parts of the ISBN number.
        int prefix = 978;
        int group = 3;
        int publisher = 16;
        int title = 1484100;

        //print the ISBN number in the given format with colors. 
        System.out.printf("\u001B[35m%d-\u001B[34m%d-\u001B[31m%d-\u001B[37m%d \n",prefix,group,publisher,title);
    }
}