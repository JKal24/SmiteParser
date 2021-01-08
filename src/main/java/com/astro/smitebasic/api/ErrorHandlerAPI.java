package com.astro.smitebasic.api;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;
import java.util.logging.Logger;

public class ErrorHandlerAPI implements ResponseErrorHandler {

    private Logger logger = Logger.getLogger(ErrorHandlerAPI.class.getName());

    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        return clientHttpResponse.getStatusCode().is4xxClientError() || clientHttpResponse.getStatusCode().is5xxServerError();
    }

    @Override
    public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {
        if (clientHttpResponse.getStatusCode().is5xxServerError()) {
            logger.warning(String.format("Encountered a server error, %s", clientHttpResponse.getStatusText()));
        } else if (clientHttpResponse.getStatusCode().is4xxClientError()) {
            logger.warning(String.format("Encountered a client error, %s", clientHttpResponse.getStatusText()));
        }
    }
}
