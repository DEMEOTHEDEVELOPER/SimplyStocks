import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class NewAccountPane extends Pane {

    private Button create, cancel;
    private TextField accName;
    private ComboBox<String> accType;
    private ArrayList<String> accountTypes = new ArrayList<>() {
        @Override
        public String get(int index) {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    };

    public Button getCancel() {
        return cancel;
    }

    public TextField getAccName() {
        return accName;
    }

    public ComboBox<String> getAccType() {
        return accType;
    }

    public Button getCreate(){return create;}

    public NewAccountPane() {
        accountTypes.add("Non-Registered");
        accountTypes.add("TFSA");
        accountTypes.add("LIRA");
        accountTypes.add("RESP");
        accountTypes.add("RRSP");
        Pane innerPane = new Pane();

        cancel = new Button("x");
        cancel.relocate(700,10);

        create = new Button("Create Account");
        create.relocate(275, 450);
        create.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: white; -fx-pref-width: 200px");
        create.applyCss();

        accName = new TextField();
        accName.relocate(200,75);
        accName.setPromptText("Name your Account");
        Label nameLabel = new Label("Name of account: ");
        nameLabel.relocate(80,75);

        accType = new ComboBox<>();
        accType.relocate(200, 125);
        accType.getItems().addAll(accountTypes);
        Label accTypelabel = new Label("Select Account Type: ");
        accTypelabel.relocate(60,125);
        accTypelabel.setStyle("-fx-font-size: large;");
        nameLabel.setStyle("-fx-font-size: large;");


        innerPane.getChildren().addAll(create, cancel, accName, accType, accTypelabel, nameLabel);
        getChildren().addAll(innerPane);
    }
}
