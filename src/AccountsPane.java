import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import javafx.scene.control.Label;
import javafx.scene.shape.Line;

public class AccountsPane  extends Pane {
    private Label paneLabel, total, plusminus;
    private Button  addAccountBtn;

    private TextField searchField;


    private ListView<String> accountsList;

    public ListView<String> getAccountsList() { return accountsList;}

    public TextField getSearchButton() {
        return searchField;
    }

    public Button getAddAccountBtn() {
        return addAccountBtn;
    }

    public AccountsPane() {
        Pane innerPane = new Pane();

        paneLabel = new Label("Total Balance");
        paneLabel.setStyle("-fx-font-size: xx-large; -fx-font-weight: 600;");
        paneLabel.applyCss();
        paneLabel.relocate(50, 5);
        Line divider = new Line(249,0,249,500);
        Line divider1 = new Line(50,32,200,32);
        Line divider2 = new Line(0,80,249,80);
        Line divider3 = new Line(0,120,249,120);
        Line divider4 = new Line(20,148,130,148);

        searchField = new TextField();
        searchField.setPromptText("Search Stock");
        searchField.relocate(0, 86);
        searchField.setStyle("-fx-pref-width: 249px; -fx-background-color: white; -fx-border-color: black; -fx-border-width: 2px;");
        searchField.applyCss();

        addAccountBtn = new Button("Add new Account");
        addAccountBtn.relocate(0, 470);
        addAccountBtn.setStyle("-fx-pref-width: 249px; -fx-background-color: white; -fx-border-color: black; -fx-border-width: 2px;");
        addAccountBtn.applyCss();

        total = new Label("$100000");
        plusminus = new Label("+$2352");

        total.relocate(20, 33);
        plusminus.relocate(20, 55);

        total.setStyle("-fx-font-size: x-large; -fx-font-weight: 700;");
        total.applyCss();

        plusminus.setStyle("-fx-font-size: large; -fx-text-fill: green; -fx-font-weight: 700;");
        plusminus.applyCss();

        accountsList = new ListView<String>();
        accountsList.relocate(0, 160);
        accountsList.setPrefSize(249, 300);

        Label accounts = new Label("Accounts:");
        accounts.relocate(20,120);
        accounts.setStyle("-fx-font-size: xx-large;");
        accounts.applyCss();

        innerPane.getChildren().addAll(paneLabel, divider, divider1, divider2, plusminus, total, addAccountBtn, searchField,accountsList ,divider4, accounts, divider3);
        getChildren().addAll(innerPane);

    }
}
