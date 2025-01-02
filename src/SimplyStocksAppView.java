import javafx.scene.layout.Pane;

public class SimplyStocksAppView extends Pane {
    private AccountsPane accountsPane;

    public AccountsPane getAccountsPane() {return accountsPane;}

    public SimplyStocksAppView() {
        accountsPane = new AccountsPane();
        accountsPane.relocate(0,0);
        accountsPane.setPrefSize(250, 500);

        getChildren().addAll(accountsPane);

        setPrefSize(1000, 500);
    }
}
