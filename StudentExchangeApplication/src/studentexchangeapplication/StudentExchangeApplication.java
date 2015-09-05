/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentexchangeapplication;

import java.awt.geom.Rectangle2D;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Li
 */
public class StudentExchangeApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        //login page
        
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);      
        
        String css = StudentExchangeApplication.class.getResource("theme.css").toExternalForm();
        scene.getStylesheets().add(css);
        
        stage.setWidth(940);
        stage.setHeight(710);
        
       /**This will fit the application to the screen size
        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D bounds = screen.getVisualBounds();

        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());*/
        
        //student view
        
        Parent root2 = FXMLLoader.load(getClass().getResource("StudentHomePage.fxml"));
        
        Scene scene2 = new Scene(root2);
        stage.setScene(scene2);      
        
        String css2 = StudentExchangeApplication.class.getResource("studenthomepage.css").toExternalForm();
        scene2.getStylesheets().add(css2);
        
        stage.setWidth(940);
        stage.setHeight(710);
        
        
        
        //student centre administrator view
        
        Parent root3 = FXMLLoader.load(getClass().getResource("StudentCentreAdminPage.fxml"));
        
        Scene scene3 = new Scene(root3);
        stage.setScene(scene3);      
        
        String css3 = StudentExchangeApplication.class.getResource("studentcentreadminpage.css").toExternalForm();
        scene3.getStylesheets().add(css3);
        
        stage.setWidth(940);
        stage.setHeight(710);
        
        
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
