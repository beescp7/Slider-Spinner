package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Controller implements Initializable {

	@FXML
	private Spinner<Integer> spinner1;
	@FXML
	private Spinner<String> spinner2;

    @FXML
    private Slider slider1;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		SpinnerValueFactory<Integer> deger = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,3,2);
		spinner1.setValueFactory(deger);
		
		ObservableList<String> aylar =FXCollections.observableArrayList("Ocak","Þubat", "Mart", "Nisan");
				
				SpinnerValueFactory<String> deger2=new  SpinnerValueFactory.ListSpinnerValueFactory<String>(aylar);
				
				deger2.setValue("Ocak");
				spinner2.setValueFactory(deger2);
				spinner2.getStyleClass().add(Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL);
				spinner2.valueProperty().addListener(
						(obs, oldValue, newValue)-> System.out.println("Spinner yeni deðeri:\n "+newValue));	
						
				spinner1.valueProperty().addListener(
						(obs, oldValue, newValue)-> System.out.println("Spinner yeni deðeri:\n "+newValue));
				slider1.valueProperty().addListener(
						 (obs, OldValue, newValue)->
						 {
						 System.out.println("Slider Diker Deger:"+newValue);
						 
						 }
						);
				slider1.setMax(200);
				slider1.setValue(100);

	}

}
