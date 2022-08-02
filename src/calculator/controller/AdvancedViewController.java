package calculator.controller;

import calculator.App;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class AdvancedViewController {
	// Main app
	private App mainApp;
	
	// -------------------------------------------- GUI elements --------------------------------------------------------
	
	// Buttons
	@FXML private Button btn0;
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
    @FXML private Button btn4;
    @FXML private Button btn5;
    @FXML private Button btn6;
    @FXML private Button btn7;
    @FXML private Button btn8;
    @FXML private Button btn9;

    @FXML private Button btnAddition;
    @FXML private Button btnClear;
    @FXML private Button btnCos;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnDivision;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnEquality;

    @FXML
    private Button btnEuler;

    @FXML
    private Button btnFactorial;

    @FXML
    private Button btnGreater;

    @FXML
    private Button btnGreaterEqual;

    @FXML
    private Button btnLess;

    @FXML
    private Button btnLessEqual;

    @FXML
    private Button btnLog;

    @FXML
    private Button btnModule;

    @FXML
    private Button btnMultiplication;

    @FXML
    private Button btnNaturalLog;

    @FXML
    private Button btnPi;

    @FXML
    private Button btnPoint;

    @FXML
    private Button btnPower;

    @FXML
    private Button btnRoot;

    @FXML
    private Button btnSin;

    @FXML
    private Button btnSubtraction;

    @FXML
    private Button btnTan;

    @FXML
    private ComboBox<String> cmbMode;

    @FXML
    private ImageView imgMode;

    @FXML
    private TextField txtScreen;

    // -------------------------------- Constructor, Getters & Setters --------------------------------------------------
    
    // Constructor
    public AdvancedViewController() {
		
	}
    
    // Getter & setter
    public App getMainApp() {
		return mainApp;
	}

	public void setMainApp(App mainApp) {
		this.mainApp = mainApp;
	}
    
	// --------------------------------------------- Initialize --------------------------------------------------------
	
	@FXML
    void initialize() {
		// ComboBox initialization
		ObservableList<String> modesList = FXCollections.observableArrayList();
		modesList.add("Basic");
		modesList.add("Advanced");
		modesList.add("Developer");
		cmbMode.setItems(modesList);
    }
    
    // ----------------------------------------------- Actions ---------------------------------------------------------
	
	// Control the digits buttons ---------------------------------------------------------------------------------
	@FXML
	void zeroAction(ActionEvent event) {
		txtScreen.setText( txtScreen.getText() + "0");
	}

	@FXML
	void oneAction(ActionEvent event) {
		txtScreen.setText( txtScreen.getText() + "1");
	}

	@FXML
	void twoAction(ActionEvent event) {
		txtScreen.setText( txtScreen.getText() + "2");
	}

	@FXML
	void threeAction(ActionEvent event) {
		txtScreen.setText( txtScreen.getText() + "3");
	}

	@FXML
	void fourAction(ActionEvent event) {
		txtScreen.setText( txtScreen.getText() + "4");
	}

	@FXML
	void fiveAction(ActionEvent event) {
		txtScreen.setText( txtScreen.getText() + "5");
	}

	@FXML
	void sixAction(ActionEvent event) {
		txtScreen.setText( txtScreen.getText() + "6");
	}

	@FXML
	void sevenAction(ActionEvent event) {
		txtScreen.setText( txtScreen.getText() + "7");
	}

	@FXML
	void eightAction(ActionEvent event) {
		txtScreen.setText( txtScreen.getText() + "8");
	}

	@FXML
	void nineAction(ActionEvent event) {
		txtScreen.setText( txtScreen.getText() + "9");
	}

	@FXML
	void pointAction(ActionEvent event) {
		txtScreen.setText( txtScreen.getText() + ".");
	}
	
	
    @FXML
    void lessEqualAction(ActionEvent event) {

    }

    @FXML
    void additionAction(ActionEvent event) {

    }

    @FXML
    void clearAction(ActionEvent event) {

    }

    @FXML
    void cosAction(ActionEvent event) {

    }

    @FXML
    void deleteAction(ActionEvent event) {

    }

    @FXML
    void divisionAction(ActionEvent event) {

    }

    @FXML
    void equalAction(ActionEvent event) {

    }

    @FXML
    void equalityAction(ActionEvent event) {

    }

    @FXML
    void eulerAction(ActionEvent event) {

    }

    @FXML
    void factorialAction(ActionEvent event) {

    }

    @FXML
    void greaterAction(ActionEvent event) {

    }

    @FXML
    void greaterEqualAction(ActionEvent event) {

    }

    @FXML
    void keyPressedAction(KeyEvent event) {

    }

    @FXML
    void lessAction(ActionEvent event) {

    }

    @FXML
    void logAction(ActionEvent event) {

    }

    @FXML
    void modeAction(ActionEvent event) {

    }

    @FXML
    void moduleAction(ActionEvent event) {

    }

    @FXML
    void multiplicationAction(ActionEvent event) {

    }

    @FXML
    void naturalLogAction(ActionEvent event) {

    }

    @FXML
    void piAction(ActionEvent event) {

    }

    @FXML
    void powerAction(ActionEvent event) {

    }

    @FXML
    void rootAction(ActionEvent event) {

    }

    @FXML
    void sinAction(ActionEvent event) {

    }

    @FXML
    void subtractionAction(ActionEvent event) {

    }

    @FXML
    void tanAction(ActionEvent event) {

    }
    
    // -------------------------------------------- Other methods -------------------------------------------------------
    
    

}
