package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.IOException;

@WebService
public interface SocialMediaServer {

    @WebMethod
    public String getInsPic(String userName) throws IOException;

    @WebMethod
    public String getTwitPic(String userName) throws IOException;
}
