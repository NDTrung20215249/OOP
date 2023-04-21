import java.io.IOException;
import java.net.URLDecoder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebCrawl {
    public static void main(String[] args) throws IOException {
        String url = "https%3A%2F%2Fvi.wikipedia.org%2Fwiki%2FDanh_s%C3%A1ch_Di_t%C3%ADch_qu%E1%BB%91c_gia_Vi%E1%BB%87t_Nam";
        String decodedUrl = URLDecoder.decode(url, "UTF-8");
        Document doc = Jsoup.connect(decodedUrl).get();

        Element table = doc.select("table.wikitable").first();
        Elements rows = table.select("tr");
        for (int i = 1; i < rows.size(); i++) {
            Element row = rows.get(i);
            Elements cols = row.select("td");

            String name = cols.get(0).text();
            String type = cols.get(1).text();
            String province = cols.get(2).text();
            String year = cols.get(3).text();
            String area = cols.get(4).text();
            System.out.println(name + " | " + type + " | " + province + " | " + year + " | " + area);
        }
    }
}