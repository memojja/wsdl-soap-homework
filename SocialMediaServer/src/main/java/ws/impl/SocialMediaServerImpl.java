package ws.impl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import service.SocialMediaParser;
import service.impl.SocialMediaParserImpl;
import ws.SocialMediaServer;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.IOException;

@WebService(endpointInterface = "ws.SocialMediaServer")
public class SocialMediaServerImpl implements SocialMediaServer{

    private final SocialMediaParser parser = new SocialMediaParserImpl();

    public String getInsPic(String userName) throws IOException {
        return parser.getInstagramProfileImageByName(userName);
    }

    public String getTwitPic(String userName) throws IOException {
        return parser.getTwitterProfileImageByName(userName);
    }

}
