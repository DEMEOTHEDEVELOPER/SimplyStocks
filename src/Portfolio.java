import javax.sound.sampled.Port;
import java.util.ArrayList;

public class Portfolio {
    private float total;
    private ArrayList<Account> accounts;
    private ArrayList<String> accnames;

    private String owner;
    private float plusminus, deposited;

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    public ArrayList<String> getaccNames() {
        return accnames;
    }

    public void addAccount(Account a) {
        accounts.add(a);
        accnames.add(a.getName());
    }

    public Portfolio() {
        total = 0;
        accounts = new ArrayList<Account>();

    }
}
