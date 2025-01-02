import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SimplyStocksApp extends Application{
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene( pane);
        primaryStage.setTitle("Simply Stocks");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}