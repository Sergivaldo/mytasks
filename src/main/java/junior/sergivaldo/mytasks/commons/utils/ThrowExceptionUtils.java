package junior.sergivaldo.mytasks.commons.utils;

import java.util.Objects;

public class ThrowExceptionUtils {


    public static void throwExceptionIfNull(Object obj, RuntimeException e){
        if(Objects.isNull(obj)){
            throw e;
        }
    }

    public static void throwExceotionIfEmptyOrNull(String str, RuntimeException e){
        if(Objects.isNull(str) || str.isBlank()){
            throw e;
        }
    }
}
