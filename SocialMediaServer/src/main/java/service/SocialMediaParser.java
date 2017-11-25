package service;

import java.io.IOException;

public interface SocialMediaParser {

    public String getTwitterProfileImageByName(String name) throws IOException;
    public String getInstagramProfileImageByName(String name) throws IOException;
}
