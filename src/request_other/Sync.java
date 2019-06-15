package request_other;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wjianwu 2019/6/14 15:59
 */
public class Sync {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter(Charset.forName("utf-8")));
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("params", "someArgs");
        String url = "http://www.baidu.com/xxx";
        String response = restTemplate.postForObject(url, requestMap, String.class);
        // some operating
    }
}
