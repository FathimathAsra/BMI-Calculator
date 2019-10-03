
package bmi;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;


public class FXMLDocumentController implements Initializable{

    @FXML
    private ImageView logoimg;

    @FXML
    private TextField Wtextfield;

    @FXML
    private TextField Htextfield;

    @FXML
    private TextField bmitextfield;

    @FXML
    private Label Lable;

    @FXML
    private Button calbutton;

    @FXML
    void handleButtonAction(ActionEvent event) {

        
       double h = Double.parseDouble(Htextfield.getText());
       double w = Double.parseDouble(Wtextfield.getText());
       double bmi = w/ (h*h);
       
       String cal = String.format("%.2f", bmi);
       
       bmitextfield.setText(cal);
       if(bmi <=18.5)
           
       {
        
        Lable.setTextFill(Color.BLUE);
        Lable.setText("UnderWeight");
         
    }
       
       else if(bmi <=24.9)
       {
        Lable.setTextFill(Color.GREEN);
        Lable.setText("Normal Weight");
        
       }
       
       else if (bmi <=29.9)
       {
        Lable.setTextFill(Color.YELLOW);
        Lable.setText("OverWeight");
       }
       
       else if (bmi >=30)
       {
        Lable.setTextFill(Color.RED);
        Lable.setText("Obese");
        
       }
    }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        
    }
}