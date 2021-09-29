package com.strongmore.dujitangplugin.util;

import com.strongmore.dujitangplugin.model.TauntResponse;
import java.util.Objects;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HttpUtility {

  public static String getTauntContent() {
    TauntResponse tauntResponse = httpGet("https://api.nextrt.com/api/dutang", TauntResponse.class);
    if (Objects.nonNull(tauntResponse) && tauntResponse.isSuccess()) {
      return tauntResponse.getData().getContent();
    }
    return null;
  }

  private static <T> T httpGet(String url, Class<T> clazz) {
    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<String> request = new HttpEntity<>(new HttpHeaders());
    ResponseEntity<T> entity = restTemplate.exchange(url, HttpMethod.GET, request, clazz);
    if (entity.getStatusCode().is2xxSuccessful()) {
      return entity.getBody();
    }
    return null;
  }

}
