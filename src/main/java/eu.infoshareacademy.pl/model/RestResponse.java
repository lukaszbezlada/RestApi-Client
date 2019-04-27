package eu.infoshareacademy.pl.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class RestResponse {

    @JsonProperty("RestResponse")
    private RestResponse restResponse;

    private List<String> messages;

    private List<StateInfo> result;


    public RestResponse(RestResponse restResponse, List<String> messages, List<StateInfo> result) {
        this.restResponse = restResponse;
        this.messages = messages;
        this.result = result;
    }

    public RestResponse getRestResponse() {
        return restResponse;
    }

    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<StateInfo> getResult() {
        return result;
    }

    public void setResult(List<StateInfo> result) {
        this.result = result;
    }
}
