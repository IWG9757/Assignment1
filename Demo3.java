public class Demo3{
    public static void main(String[] args) {
        int areaCode = 123;
        int firstNumber = 456;
        int secondNumber = 7890;

        System.out.printf("\033[1;34m(%03d) \033[32;0m%03d-%04d \n",areaCode, firstNumber, secondNumber);
    
    }
}