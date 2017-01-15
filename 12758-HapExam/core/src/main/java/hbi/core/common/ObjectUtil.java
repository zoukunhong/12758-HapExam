package hbi.core.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 邹昆宏 on 2017/1/11.
 */
public class ObjectUtil {
    public static String testString(String str){
        if(str == null || "".equals(str.trim())){
            return null;
        }
        return str;
    }
    public static Long testLong(Long l){
        if(l == null || l < 1){
            return null;
        }
        return l;
    }
    public static Date testDate(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        if(date == null || "".equals(date.trim())){
            return null;
        }
        try{
            return format.parse(date);
        }catch(Exception e){
            return null;
        }
    }
}
