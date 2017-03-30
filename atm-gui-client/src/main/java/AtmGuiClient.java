import com.mors741.ws.CheckAtmWs;
import com.mors741.ws.CheckAtmWsService;

public class AtmGuiClient {
    static CheckAtmWsService service = new CheckAtmWsService();

    public static void main(String[] args) {
        try {
            AtmGuiClient client = new AtmGuiClient();
            client.doTest(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doTest(int id) {
        try {
            System.out.println("Retrieving the port from the following service:" + service);
            CheckAtmWs port = service.getCheckAtmWsPort();
            System.out.println("Invoking the availableCash operation on the port.");

            String response = port.availableCash(id);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
