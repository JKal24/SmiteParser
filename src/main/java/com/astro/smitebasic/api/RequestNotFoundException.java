package com.astro.smitebasic.api;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

public class RequestNotFoundException implements ResponseErrorHandler {
    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        return clientHttpResponse.getStatusCode().equals(200);
    }

    @Override
    public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {
        clientHttpResponse.close();
    }
}
