import com.sun.scenario.Settings;
import javafx.scene.layout.Pane;

public class SimplyStocksAppView extends Pane {
    private AccountsPane accountsPane;
    private SettingsPane settingsPane;

    public AccountsPane getAccountsPane() {return accountsPane;}
    public SettingsPane getSettingsPane() {return settingsPane;}

    public SimplyStocksAppView() {
        accountsPane = new AccountsPane();
        accountsPane.setPrefSize(250, 500);
        accountsPane.relocate(0,0);

        settingsPane = new SettingsPane();
        settingsPane.relocate(0, 0);
        settingsPane.setPrefSize(250, 500);

        getChildren().addAll(accountsPane);

        setPrefSize(1000, 500);
    }
}
