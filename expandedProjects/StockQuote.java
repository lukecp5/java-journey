import java.io.InputStream;
import java.io.PrintStream;
import java.io.IOException.*;
// import edu.princeton.cs.introcs.In;
// import edu.princeton.cs.introcs.StdOut;
import In;

public class StockQuote {

    // Given symbol, get HTML
    private static String readHTML(String symbol) {
        In page = new In("http://finance.yahoo.com/quote/" + symbol);
        String html = page.readAll();
        if (html.contains("<title></title>"))
            return null;
        else
            return html;
    }

    // Given symbol, get current stock price.
    public static double priceOf(String symbol) {
        String html = readHTML(symbol);
        int p = html.indexOf("price.0", 0); // "price.0" index
        int from = html.indexOf(">", p); // ">" index
        int to = html.indexOf("</span>", from); // "</span>" index
        String price = html.substring(from + 1, to);

        // remove any comma separators
        return Double.parseDouble(price.replaceAll(",", ""));
    }

    // Given symbol, get current stock price.
    public static double priceOf(String symbol, String html) {
        int p = html.indexOf("price.0", 0); // "price.0" index
        int from = html.indexOf(">", p); // ">" index
        int to = html.indexOf("</span>", from); // "</span>" index
        String price = html.substring(from + 1, to);

        // remove any comma separators
        return Double.parseDouble(price.replaceAll(",", ""));
    }

    // Given symbol, get current stock name.
    public static String nameOf(String symbol, String html) {
        int p = html.indexOf("symbol.$companyName", 0);
        int from = html.indexOf(">", p);
        int to = html.indexOf("</h6>", from);
        String name = html.substring(from + 1, to);
        return name;
    }

    // Given symbol, get current date.
    public static String dateOf(String symbol, String html) {
        int p = html.indexOf("adx.bf1.yahoo.com", 0);
        int from = html.indexOf(" ", p);
        int to = html.indexOf("-->", from);
        String date = html.substring(from + 1, to);
        return date;
    }

    public static void main(String[] args) {
        String symbol = args[0];
        String html = readHTML(symbol);
        if (html == null)
            StdOut.println("Invalid symbol: " + symbol);
        else {
            StdOut.println(priceOf(symbol, html));
            StdOut.println(nameOf(symbol, html));
            StdOut.println(dateOf(symbol, html));
        }
    }

}
