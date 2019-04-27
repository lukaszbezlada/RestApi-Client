package eu.infoshareacademy.pl;

import eu.infoshareacademy.pl.model.MultipleRestResponse;
import eu.infoshareacademy.pl.model.RestResponse;
import eu.infoshareacademy.pl.model.StateInfo;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.util.List;

public class App {

    public static List<StateInfo> readData() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://services.groupkt.com/state/get/USA/all");
        Response response = target.request().get();

        MultipleRestResponse restResponse = response.readEntity(MultipleRestResponse.class);

        return restResponse.getRestResponse().getResult();
    }
}