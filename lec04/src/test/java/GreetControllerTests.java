

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class GreetControllerTests {
    private HttpClient client;


    @Before
    public void setup() {
        this.client = HttpClientBuilder.create().build();
    }

    @Test
    public void simple() throws Exception {
        String url = "http://localhost:8080/greet";
        HttpPost post = new HttpPost(url);
        post.setHeader("Content-type", "text/plain");
        post.setHeader("Accept", "text/plain");
        String testMessage = "Hello message";
        post.setEntity(new StringEntity(testMessage));
        HttpResponse response = client.execute(post);
        String receivedMsg = new Scanner(response.getEntity().getContent(),"UTF-8").useDelimiter("\\A").next();

        assertEquals(testMessage, receivedMsg);
    }
    @Test
    public void jsonSimple() throws Exception {
        String url = "http://localhost:8080/json_greet";
        HttpPost post = new HttpPost(url);
        String testMessage = "{\"greetMessage\": \"Hello json\"}";
//        String testMessage = "<greeting><greetMessage>Hello xml</greetMessage></greeting>";
        post.setEntity(new StringEntity(testMessage));
        post.setHeader("Content-type", "application/json");
        post.setHeader("Accept", "application/json");
        HttpResponse response = client.execute(post);
        String receivedMsg = new Scanner(response.getEntity().getContent(),"UTF-8").useDelimiter("\\A").next();
        System.out.println(receivedMsg);
        assertEquals("{\"greetMessage\":\"HELLO JSON\"}", receivedMsg);
    }
    @Test
    public void jsonXml() throws Exception {
        String url = "http://localhost:8080/json_greet";
        HttpPost post = new HttpPost(url);
        String testMessage = "{\"greetMessage\": \"Hello json\"}";
//        String testMessage = "<greeting><greetMessage>Hello xml</greetMessage></greeting>";
        post.setEntity(new StringEntity(testMessage));
        post.setHeader("Content-type", "application/json");
        post.setHeader("Accept", "application/xml");
        HttpResponse response = client.execute(post);
        String receivedMsg = new Scanner(response.getEntity().getContent(),"UTF-8").useDelimiter("\\A").next();
        System.out.println(receivedMsg);
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><greeting><greetMessage>HELLO JSON</greetMessage></greeting>", receivedMsg);
    }


}
