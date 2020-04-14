package FINAL;
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.geometry.Insets;
import javafx.stage.Stage; 

public class Survey extends Application { 
	Label labelGroup1;
    Button btn1;
    public void start(Stage st) 
    { 
        st.setTitle("Blink Survey"); 
        
        btn1 = new Button();
        btn1.setText("Submit");			//create submit that acts when clicked
        btn1.setOnAction(e -> buttonClick1());
  
        TilePane radio1 = new TilePane(); 
  
        // create a label 
        Label l = new Label("Did you find the shopping to be simple?"); 	
  
        ToggleGroup toggle1= new ToggleGroup(); 				//create toggle group so that only 1 button can be selected
        
        RadioButton r1 = new RadioButton("Yes"); {
        	r1.setToggleGroup(toggle1);
        	r1.setSelected(true);							//sets button r1 as default
        	r1.setOnMouseClicked(null);
        }
        RadioButton r2 = new RadioButton("No");  {
        	r2.setToggleGroup(toggle1);
        	r2.setOnMouseClicked(null); 
    }
        
        radio1.getChildren().add(l); 
        radio1.getChildren().add(r1); 
        radio1.getChildren().add(r2);  
        
        
        labelGroup1 = new Label("No choice made yet");
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(l, r1, r2, labelGroup1, btn1);

        Scene sc1 = new Scene(layout, 500, 250); 
  
        // set the scene 
        st.setScene(sc1); 
  
        st.show(); 
    } 
  
    public void buttonClick1() {
    	if (btn1.getText() == "Submit") {
        	btn1.setText("Submit");
        	System.out.println("Thank you for completing the survey!");
        	System.exit(0);
        }
        else {
         	btn1.setText("Submit");
         	System.exit(0);
        }	
    }

	public void radioGroup1(RadioButton r1, RadioButton r2) {
        String userChoice1 = "";
        
        if (r1.isSelected()) {
        	labelGroup1.setText(userChoice1 += "You have selected: Yes"); 
        }
        if (r2.isSelected()) {
			labelGroup1.setText(userChoice1 += "You have selected: No"); 
        }
    }

	public static void main(String args[]) 
    {  
        launch(args); 
    } 
} 

