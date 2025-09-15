package demo.ayush.ecomcli.utility;

import demo.ayush.ecomcli.model.enums.OrderStatus;

public class ValidationUtils {
    /**
     * Checks if the given number is positive
     *
     * @param number The number to check
     * @return true if the number is greater than zero, false otherwise
     */
    public static boolean isPositive(Number number) {
        return number != null && number.doubleValue() > 0;
    }

    // Return true when input is not empty and after trimming not blank
    public static boolean isNotBlank(String input) {
        return input != null && !input.trim().isEmpty();
    }
    // TODO: Learn about enums & how they work
//    public static <E extends Enum<E>> boolean isValidEnum(Class<E> enumClass, E value) {
//        return enumClass.isInstance(value);
//    }

    public static boolean isValidOrderStatus(OrderStatus status) {
        return OrderStatus.isInstance(status);
    }
}
