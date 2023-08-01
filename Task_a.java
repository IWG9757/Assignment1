public class Task_a{
    public static void main(String[] args) {
        double progress = 50.0; // Progress in percentage

        // Calculate the number of characters for each half of the progress bar
        int halfLength = (int) (progress / 2);
        int remainingLength = 50 - halfLength;

        // Create the progress bar string with desired formatting
        String progressBar = String.format("[%1$" + halfLength + "s%2$" + remainingLength + "s]", "", "");
        String redBackground = String.format("\u001B[41m"); // Red background
        String greenBackground = String.format("\u001B[42m"); // Green background
        String resetColor = String.format("\u001B[0m"); // Reset color to default

        // Print the progress bar
        System.out.println(redBackground + progressBar.substring(0, halfLength) +
                greenBackground + progressBar.substring(halfLength) + resetColor);
    }
}

