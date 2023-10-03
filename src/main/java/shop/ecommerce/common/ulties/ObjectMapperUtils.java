package shop.ecommerce.common.ulties;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class ObjectMapperUtils {
    public static String convertObjectToStringObject(Object source) {
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String result = "";
            try {
                // convert user object to json string and return it
                result = ow.writeValueAsString(source);
            } catch (JsonProcessingException e) {
                //catch various errors
                e.printStackTrace();
            }
            return result;
    }
}
