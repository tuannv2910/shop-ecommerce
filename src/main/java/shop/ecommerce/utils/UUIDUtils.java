package shop.ecommerce.utils;

import java.util.Random;
import java.util.UUID;

public class UUIDUtils {
    public static String generateString() {
        return UUID.randomUUID().toString();
    }

    public static String generatePhone() {
        Random rand = new Random();
        int num1, num2, num3;
        num1 = rand.nextInt (900) + 100;
        num2 = rand.nextInt (643) + 100;
        num3 = rand.nextInt (9000) + 1000;
        return num1+ "" + num2 + "" +num3;
    }
    public static int randomNumber() {
    Random random = new Random();
    // Tạo và hiển thị 10 số ngẫu nhiên từ 1 đến 500
    return  random.nextInt(100) + 1;
}
    public static int randomPrice() {
        Random random = new Random();
        // Tạo và hiển thị 10 số ngẫu nhiên từ 1 đến 500
        return  random.nextInt(100000) + 1;
    }

}
