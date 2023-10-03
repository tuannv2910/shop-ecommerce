package shop.ecommerce.common.ulties;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.BeanUtils;

public class ApiUtils {
    public static <T> T copy(final Object source, T target, String... ignores) {
        if (source == null) return null;
        BeanUtils.copyProperties(source, target, ignores);
        return target;
    }

    public static <T> T copy(final Object source, T target) {
        if (source == null) return null;
        BeanUtils.copyProperties(source, target);
        return target;
    }

    public static <T extends Object> String convertJsonObjToString(T source) {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String result = "";
        try {
            //convert json object to String and return
            result = ow.writeValueAsString(source);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}