package Sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Sample.controller.MedicineController;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        MedicineController controller = new MedicineController();
        Scene scene = new Scene(controller.getView().getRoot(), 800, 600);
        primaryStage.setTitle("Pharmacy System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}