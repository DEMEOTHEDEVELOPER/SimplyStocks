import javax.sound.sampled.Port;
import java.util.ArrayList;

public class Portfolio {
    private int total;
    private ArrayList<Account> accounts;

    private String owner;
    private int plusminus, deposited;

    public Portfolio() {
        total = 0;
        accounts = new ArrayList<Account>();

    }
}
