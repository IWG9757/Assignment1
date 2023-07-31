public class Demo4{
    public static void main(String[] args) {
        
        //initialize the year, month, day, hour, minute and second as integers 
        int year = 2023;
        int month = 12;
        int day = 28;
        int hour = 23;
        int minute = 59;
        int second = 59;

        //print the date-time in the given format. 
        System.out.printf("\u001B[35m%02d/\u001B[34m%02d/\u001B[31m%04d \u001B[37m%02d:\u001B[32m%02d:\u001B[33m%02d \n",month,day,year,hour,minute,second);

    }
}