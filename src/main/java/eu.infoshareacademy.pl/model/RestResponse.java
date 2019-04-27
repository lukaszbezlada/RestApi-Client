package eu.infoshareacademy.pl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class RestResponse implements Serializable {

    private static final long serialVersionUID = -3717029556158432315L;


    private List<String> messages;

    private List<StateInfo> result;


    public RestResponse() {
    }

    public RestResponse(List<String> messages, List<StateInfo> result) {
        this.messages = messages;
        this.result = result;
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
