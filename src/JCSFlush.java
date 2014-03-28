import org.apache.jcs.JCS;

public class JCSFlush {
    private static final String CACHE_NAME = "DNS_REMOTE_CERT_CACHE";

    public static void main(String[] args) {
	try {
	    JCS.getInstance(CACHE_NAME).clear();
	    System.exit(0);
	} catch (Throwable t) {
	    t.printStackTrace();
	    System.exit(1);
	}
    }
}
