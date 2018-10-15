/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONread;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author cstuser
 */
public class JSONread extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    public String getData(String filename) throws FileNotFoundException {
        String jsonString = "";
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            BufferedReader in = new BufferedReader(new InputStreamReader(fileIn));
            
            String inputLine;
            while((inputLine = in.readLine()) != null) {
                jsonString += inputLine;
            }
            in.close();
            fileIn.close();
            
            
        } catch(Exception e) {
            System.out.println("ERROR!");
        }
        return jsonString;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
