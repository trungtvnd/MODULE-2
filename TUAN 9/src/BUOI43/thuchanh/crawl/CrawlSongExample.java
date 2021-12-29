package BUOI43.thuchanh.crawl;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            try {
                Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
                sc.useDelimiter("\\Z");
                String content = sc.next();
                sc.close();
                content = content.replace("\\n+", "");
                Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
                Matcher m = pattern.matcher(content);
                while (m.find()) {
                    System.out.println(m.group(1));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
