package com.example.visapenaltyfeecalculation.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    static BigDecimal oldLastValue;

    @Cacheable("currency")
    public BigDecimal returnTurkishLira() {
        HttpGet get = new HttpGet("https://api.currencyapi.com/v3/latest?apikey=XXcaWv5uKr2mvhox80Fg8mfsQe0bxqkMFXwGsRJP");
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(get)) {

            final String result = EntityUtils.toString(response.getEntity());

            JSONObject jsonObject = new JSONObject(result);
            JSONObject dataJson = jsonObject.getJSONObject("data");
            JSONObject tryJson = dataJson.getJSONObject("TRY");
            oldLastValue = BigDecimal.valueOf(tryJson.getDouble("value"));
        }catch (Exception ex) {
            Logger.getLogger(Class.class.getName()).log(Level.SEVERE, "currency-api", ex);
        }
        return oldLastValue;
    }
}
