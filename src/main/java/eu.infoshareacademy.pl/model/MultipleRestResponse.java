package eu.infoshareacademy.pl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class MultipleRestResponse implements Serializable {

    @JsonProperty("RestResponse")
    private RestResponse restResponse;

    public MultipleRestResponse() {
    }

    public MultipleRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }

    public RestResponse getRestResponse() {
        return restResponse;
    }

    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }
}
