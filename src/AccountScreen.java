import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

public class AccountScreen extends Pane{
    private Label name, type, plusminus, total;
    private Button withdraw, exit, deposit;
    private ListView<String> stocks;
    public AccountScreen(Account account) {
        Pane innerPane = new Pane();

        innerPane.getChildren().addAll();
        getChildren().addAll(innerPane);
    }
}
