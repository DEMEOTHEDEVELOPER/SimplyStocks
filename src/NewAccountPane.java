import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class NewAccountPane extends Pane {

    private Button create, cancel;
    private TextField accName;

    public Button getCancel() {
        return cancel;
    }

    public Button getCreate(){return create;}

    public NewAccountPane() {
        Pane innerPane = new Pane();

        cancel = new Button("x");
        cancel.relocate(700,10);

        create = new Button("Create Account");
        create.relocate(275, 450);
        create.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: white; -fx-pref-width: 200px");
        create.applyCss();

        accName = new TextField();
        accName.relocate(275,250);


        innerPane.getChildren().addAll(create, cancel, accName);
        getChildren().addAll(innerPane);
    }
}
