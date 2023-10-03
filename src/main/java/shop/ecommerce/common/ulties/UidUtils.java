package shop.ecommerce.common.ulties;

import java.util.Locale;
import java.util.Random;
import java.util.UUID;

public class UidUtils {

    private UidUtils() {
    }

    public static String generateUid() {
        return UUID.randomUUID().toString();
    }

    public static String cleanUid(String uid) {
        return uid.replace("\"", "").trim();
    }

    public static String generateVoucher() {
        String uid = generateUid();
        return uid.substring(uid.lastIndexOf("-") + 1).substring(4).toUpperCase(Locale.ROOT);
    }
    public static String generateToken(Integer length) {
        if (length == null || length < 1) length = 6;
        String minString = "1" + new String(new char[length - 1]).replace("\0", "0");
        int min = Integer.parseInt(minString);
        String maxString = "9" + new String(new char[length - 1]).replace("\0", "9");
        int max = Integer.parseInt(maxString);
        int randomValue = new Random().nextInt(max - min) + min;
        return randomValue + "";
    }

}
