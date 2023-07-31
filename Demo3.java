public class Demo3{
    public static void main(String[] args) {

        //initialize the areCode, firstNumber and secondNumber variables in the phone number. 
        int areaCode = 123;
        int firstNumber = 456;
        int secondNumber = 7890;

        //print the phone number in the given format.
        System.out.printf("\033[1;34m(%03d) \033[32;0m%03d-%04d \n",areaCode, firstNumber, secondNumber);
    
    }
}