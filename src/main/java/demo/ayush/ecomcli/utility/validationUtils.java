package demo.ayush.ecomcli.utility;

public class validationUtils {
    public static boolean isPositiveInt(int input){
        return input <= 0;
    }

    // Return true when input is not empty and after trimming not blank
    public static boolean isNotBlank(String input){
        return input != null && !input.trim().isEmpty();
    }
}
