import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class SettingsPane extends Pane {

    private Button withdraw, deposit, logOut , changeButton;

    public Button getChangeButton() {
        return changeButton;
    }

    public SettingsPane() {
        Pane innerPane = new Pane();
        changeButton = new Button(">");
        changeButton.relocate(220, 10);
        changeButton.setStyle("-fx-font-weight: 900; ");
        changeButton.applyCss();

        Label label = new Label("HEllo");
        label.relocate(100, 300);

        innerPane.getChildren().addAll(changeButton, label);
        getChildren().addAll(innerPane);
    }
}
