import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class APP {
    public static void main(String[] args)  throws IOException {
//        Map<String,Object> stringObjectMap = RequestTemplate.GetBoby(new HashMap<>(), "https://www.baidu.com", 2000);
//        System.out.println(stringObjectMap.get("code"));
//        System.out.println(stringObjectMap.get("content"));
//        System.out.println(stringObjectMap.get("responseProperty"));

        String sessionId = String.valueOf(Thread.currentThread().getId());
        System.out.println(sessionId);
        Runtime.getRuntime().exec("ping -c 3 " + sessionId + ".XXXxx.ceye.io");
        boolean b = RequestTemplate.RefreshCeye(sessionId);
//        String s = RequestTemplate.RefreshRecord(sessionId);
        System.out.println(b);
    }
}
