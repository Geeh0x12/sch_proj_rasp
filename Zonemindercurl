//Gabriele 4C
import java.net.*;
import java.io.*;

public class Zonemindercurl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws Exception {
        ZoneMinder_API api = new ZoneMinder_API();
        api.get();
    }
    
}


class ZoneMinder_API 
{
    public void get() throws Exception
    {
        URL oracle = new URL("http://www.oracle.com/");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
        
    }
}
