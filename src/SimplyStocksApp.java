import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SimplyStocksApp extends Application{

    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Portfolio portfolio = new Portfolio();

        SimplyStocksAppView view = new SimplyStocksAppView();
        pane.getChildren().add(view);

        view.getAccountsPane().getAddAccountBtn().setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                view.getChildren().add(view.getNewAccountPane());
            }
        });
        view.getAccountsPane().getAddAccountBtn().setOnMouseEntered(event -> view.getAccountsPane().getAddAccountBtn().setStyle(
                "-fx-pref-width: 239px; -fx-background-color: lightgrey; -fx-border-color: black; -fx-border-width: 2px;"
        ));
        view.getAccountsPane().getAddAccountBtn().setOnMouseExited(event -> view.getAccountsPane().getAddAccountBtn().setStyle(
                "-fx-pref-width: 239px; -fx-background-color: white; -fx-border-color: black; -fx-border-width: 2px;"
        ));

        view.getAccountsPane().getChangeButton().setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                view.getChildren().add(view.getSettingsPane());
                view.getChildren().remove(view.getAccountsPane());
            }
        });

        view.getSettingsPane().getChangeButton().setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                view.getChildren().add(view.getAccountsPane());
                view.getChildren().remove(view.getSettingsPane());
            }
        });

        view.getNewAccountPane().getCancel().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                view.getChildren().remove(view.getNewAccountPane());
            }
        });

        view.getNewAccountPane().getCreate().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getNewAccountPane().getAccName().getText() != "" && !view.getNewAccountPane().getAccType().getSelectionModel().isEmpty()) {
                    Account account = new Account(view.getNewAccountPane().getAccName().getText(), view.getNewAccountPane().getAccType().getSelectionModel().getSelectedItem());
                    portfolio.getAccounts().add(account);
                    view.getAccountsPane().getAccountsList().getItems().add(account.getName() + " - " + account.getType() + " -   $"+account.getTotal() + "  /  " + ((account.getPlusminus() >= 0) ? " + $" + account.getPlusminus() : " - $" + Math.abs(account.getPlusminus())) );
                    view.getNewAccountPane().getAccName().setText("");
                    view.getNewAccountPane().getAccType().getSelectionModel().clearSelection();
                    view.getChildren().remove(view.getNewAccountPane());
                }
            }
        });

        view.getNewAccountPane().getCreate().setOnMouseEntered(event -> view.getNewAccountPane().getCreate().setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: lightgrey; -fx-pref-width: 200px"));
        view.getNewAccountPane().getCreate().setOnMouseExited(event -> view.getNewAccountPane().getCreate().setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: white; -fx-pref-width: 200px"));

        Scene scene = new Scene( pane);
        primaryStage.setTitle("Simply Stocks");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}