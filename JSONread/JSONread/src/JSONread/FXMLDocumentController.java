/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONread;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author cstuser
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label ageLabel;
    @FXML
    private Label addressLabel;
    @FXML
    private Label phoneNumbersLabel;
    @FXML
    private Label genderLabel;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws FileNotFoundException {
        JsonElement rootElement = new JsonParser().parse(new JSONread().getData("user.json"));
        JsonObject rootObject = rootElement.getAsJsonObject();
        String firstName = rootObject.get("firstName").toString();
        String lastname = rootObject.get("lastName").toString();
        String age = rootObject.get("age").toString();
        String address = rootObject.getAsJsonObject("address").get("streetAddress").toString() + "\n" +
                         rootObject.getAsJsonObject("address").get("city").toString() + "\n" +
                         rootObject.getAsJsonObject("address").get("state").toString() + "\n" +
                         rootObject.getAsJsonObject("address").get("postalCode").toString();
        
        String type = "Type: ";
        String number = "Number: ";
        JsonArray phoneNumbersArray = rootObject.getAsJsonArray("phoneNumber");
        for (int i = 0; i < phoneNumbersArray.size(); i++) {
            type += phoneNumbersArray.get(i).getAsJsonObject().get("type").toString() + "\t";
            number += phoneNumbersArray.get(i).getAsJsonObject().get("number").toString() + "\t"; 
        }
        String phoneNumbers = type + "\n" +
                              number;
        
        String gender = rootObject.getAsJsonObject("gender").get("type").toString();
        
        firstNameLabel.setText(firstName);
        lastNameLabel.setText(lastname);
        ageLabel.setText(age);
        addressLabel.setText(address);
        phoneNumbersLabel.setText(phoneNumbers);
        genderLabel.setText(gender);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
