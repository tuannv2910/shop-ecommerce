package shop.ecommerce.datasource.redis;


import java.io.File;

public class RedisConnector {
    static {
        File folder = new File("storage");
        boolean check = folder.exists();
        if (check) {
            folder.mkdir();
            System.out.println("okok");
        }
    }

    public static void main(String[] args) {
        RedisConnector connector = new RedisConnector();
    }
}
