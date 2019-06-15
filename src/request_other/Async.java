package request_other;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.concurrent.FailureCallback;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.SuccessCallback;
import org.springframework.web.client.AsyncRestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wjianwu 2019/6/14 15:59
 * 异步请求
 * spring4.0 以上 需要spring-core，spring-web
 */
public class Async {

    public static void main(String[] args) {
        AsyncRestTemplate asyncRestTemplate = new AsyncRestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);

        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        Map<String, Object> postMap = new HashMap<>();

        postMap.put("username", "root");
        postMap.put("password", "123456");

        String url = "http://www.wjianwu.cn:8888/account/login";
        params.set("params", postMap);
        HttpEntity<MultiValueMap> requestEntity = new HttpEntity<MultiValueMap>(params, headers);
        ListenableFuture<ResponseEntity<String>> forEntity = asyncRestTemplate.postForEntity(url, requestEntity, String.class);
        forEntity.addCallback(new SuccessCallback<ResponseEntity<String>>() {
            @Override
            public void onSuccess(ResponseEntity<String> stringResponseEntity) {
                System.out.println(stringResponseEntity.getBody());
            }
        }, new FailureCallback() {
            @Override
            public void onFailure(Throwable throwable) {
                System.out.println("error");
            }
        });
    }
}
