package ch05;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class sonagi02 {
    public static void main(String[] args) throws IOException {
        //String address = "http://ggoreb.com/quiz/%EC%86%8C%EB%82%98%EA%B8%B0.txt";
        String word = URLEncoder.encode("소나기","utf-8");
        String address = "http://ggoreb.com/quiz/"+word+".txt";

        URL url = new URL(address);



        InputStream in = url.openStream();
    }
}
