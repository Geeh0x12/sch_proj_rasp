package com.example.mrlui.android_app4;

import java.net.*;
import java.io.*;

/*
public class JavaApplication2 {
    public static void main(String[] args)  throws Exception {
        ZoneMinder_API api = new ZoneMinder_API();
        api.get();
    }

}
*/

public class Zonemindercurl
{
    String user = "&userId=Test";
    String pw = "&password=Test2";
    String dom = "http://www.google.com";
    String link = "/intl/it/chrome/devices/chromecast/index.html";

    Zonemindercurl()
    {
    }

    public void get() throws Exception
    {
        URL link2 = new URL("http://www.twitter.com");


        //TODO: Test Cookies w/ compatible websites
        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);
        HttpCookie cookie = new HttpCookie("lang","fr");
        cookie.setDomain("twitter.com");
        cookie.setPath("/");
        cookie.setVersion(0);
        cookieManager.getCookieStore().add(new URI("http://www.twitter.com"),cookie);

        HttpURLConnection con = (HttpURLConnection)link2.openConnection();

        con.setRequestMethod("GET");
        //con.getOutputStream().write("LOGIN".getBytes("UTF-8"));

        BufferedReader in = new BufferedReader(new InputStreamReader(
                con.getInputStream()
        ));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();

    }
}
