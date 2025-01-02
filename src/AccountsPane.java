import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

import javafx.scene.control.Label;

public class AccountsPane  extends Pane {
    private Label paneLabel;
    private Button searchButton, addAccountBtn;

    private ListView<String> accountsList;

    public ListView<String> getAccountsList() { return accountsList;}

    public Button getSearchButton() {
        return searchButton;
    }

    public Button getAddAccountBtn() {
        return addAccountBtn;
    }

    public AccountsPane() {
        Pane innerPane = new Pane();

    }
}
