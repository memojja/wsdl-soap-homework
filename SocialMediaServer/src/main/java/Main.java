import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ws.impl.SocialMediaServerImpl;

import javax.xml.ws.Endpoint;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Endpoint.publish("http://localhost:1313/ws/demo",new SocialMediaServerImpl());
    }
}
