package service.impl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import service.SocialMediaParser;

import java.io.IOException;

public class SocialMediaParserImpl implements SocialMediaParser {

    private Document document;

    public String getInstagramProfileImageByName(String userName) throws IOException {
        document = getJsoapConnectionByUrl(userName,"instagram");
        return document.getElementsByClass("_9bt3u").attr("src");
    }

    public String getTwitterProfileImageByName(String userName) throws IOException {
        document = getJsoapConnectionByUrl(userName,"twitter");
        return document.getElementsByClass("ProfileAvatar-image ").attr("src");
    }

    private Document getJsoapConnectionByUrl(String userName,String socialAdress) throws IOException {
        return Jsoup.connect("https://www."+socialAdress +".com/" + userName).get();
    }
}
