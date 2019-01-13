import java.net.MalformedURLException;
import java.net.URL;

public class CheckExceptionTester {

    public static void main(String[] args) throws MalformedURLException {
        CheckExceptionTester checkExceptionTester = new CheckExceptionTester();
        //checkExceptionTester.urlTasterByTryCatch("asrgburhttp://wszib.edu.pl");
        checkExceptionTester.urlTasterByThrows("asrgburhttp://wszib.edu.pl");

    }

    public void urlTasterByTryCatch (String urlStr){
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocole: " + url.getProtocol());
            System.out.println("Host: " +url.getHost());
        }catch (MalformedURLException m){
         m.printStackTrace();

        }

    }

    public void urlTasterByThrows (String urlStr) throws MalformedURLException{
        URL url = new URL(urlStr);
        System.out.println("Protocole: " + url.getProtocol());
        System.out.println("Host: " +url.getHost());

    }
}
