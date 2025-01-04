import com.sun.scenario.Settings;
import javafx.scene.layout.Pane;

public class SimplyStocksAppView extends Pane {
    private AccountsPane accountsPane;
    private SettingsPane settingsPane;
    private NewAccountPane newAccountPane;

    public AccountsPane getAccountsPane() {
        return accountsPane;
    }

    public SettingsPane getSettingsPane() {
        return settingsPane;
    }

    public NewAccountPane getNewAccountPane() {
        return newAccountPane;
    }

    public SimplyStocksAppView() {
        accountsPane = new AccountsPane();
        accountsPane.setPrefSize(250, 500);
        accountsPane.relocate(0, 0);

        settingsPane = new SettingsPane();
        settingsPane.relocate(0, 0);
        settingsPane.setPrefSize(250, 500);

        newAccountPane = new NewAccountPane();
        newAccountPane.relocate(250,0);
        newAccountPane.setPrefSize(750, 500);

        getChildren().addAll(accountsPane);

        setPrefSize(1000, 500);
    }
}
