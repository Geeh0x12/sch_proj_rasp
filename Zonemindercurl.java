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
    String user = "";
    String pw = "";
    String dom = "";
    String link = "";
    
    ZoneMinder_API(String pU, String pP,String pD, String pL)
    {
        user = pU;
        pw = pP;
        dom = pD;
        link = pL;
    }
    
    public void get() throws Exception
    {
        /*HttpURLConnection con = (HttpURLConnection) new URL("https://www.example.com").openConnection();
con.setRequestMethod("POST");
con.getOutputStream().write("LOGIN".getBytes("UTF-8"));
con.getInputStream();*/
        URL oracle = new URL(dom + link);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
        
    }
}
