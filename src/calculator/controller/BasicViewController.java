package calculator.controller;

import java.util.Stack;

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

public class BasicViewController {
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
    @FXML private Button btnDelete;
    @FXML private Button btnDivision;
    @FXML private Button btnEqual;
    @FXML private Button btnModule;
    @FXML private Button btnMultiplication;
    @FXML private Button btnPoint;
    @FXML private Button btnSubtraction;

    // Other elements
    @FXML private ComboBox<String> cmbMode;
    @FXML private ImageView imgMode;
    @FXML private TextField txtScreen;
    
    // -------------------------------- Constructor, Getters & Setters --------------------------------------------------
    
    // Constructor
    public BasicViewController() {
		
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
    
    // Control the operators buttons -----------------------------------------------------------------------------
    @FXML
    void additionAction(ActionEvent event) {
    	txtScreen.setText( txtScreen.getText() + "+");
    }
    
    @FXML
    void subtractionAction(ActionEvent event) {
    	txtScreen.setText( txtScreen.getText() + "-");
    }
    
    @FXML
    void multiplicationAction(ActionEvent event) {
    	txtScreen.setText( txtScreen.getText() + "*");
    }
    
    @FXML
    void divisionAction(ActionEvent event) {
    	txtScreen.setText( txtScreen.getText() + "/");
    }
    
    @FXML
    void moduleAction(ActionEvent event) {
    	txtScreen.setText( txtScreen.getText() + "%");
    }
    
    // Control other buttons -------------------------------------------------------------------------------------
    @FXML
    void clearAction(ActionEvent event) {
    	txtScreen.setText("");
    }

    @FXML
    void deleteAction(ActionEvent event) {
    	
    	if( txtScreen.getText() == null ) {
    		txtScreen.setText("");
    	}
    	else if( !txtScreen.getText().equals("") ) {
    		String oldExpression = txtScreen.getText();
        	String newExpression = oldExpression.substring(0, oldExpression.length()-1);
        	txtScreen.setText(newExpression);
    	}
    }

    @FXML
    void equalAction(ActionEvent event) {
    	
    	if( txtScreen.getText() != null || !txtScreen.getText().equals("") ) {
        	txtScreen.setText( evaluateExpression('(' + txtScreen.getText() + ')') );
    	}
    	
    }
    
    @FXML
    void modeAction(ActionEvent event) {
    	
    	if( cmbMode.getSelectionModel().getSelectedItem().equals("Basic") )
    		mainApp.showBasicView();
   
    	else if( cmbMode.getSelectionModel().getSelectedItem().equals("Advanced") ) 
    		mainApp.showAdvancedView();
    
    	else if( cmbMode.getSelectionModel().getSelectedItem().equals("Developer") ) 
    		mainApp.showDeveloperView();
    
    }
    
    // Capture keyboard -----------------------------------------------------------------------------------------
    @FXML
    void keyPressedAction(KeyEvent event) {
    	
    	switch( event.getCode() ) {
    	
    		case NUMPAD0: 
    		case DIGIT0: zeroAction(new ActionEvent());
    			break;
    		
    		case NUMPAD1: 
    		case DIGIT1: oneAction(new ActionEvent());
				break;
			
    		case NUMPAD2: 
    		case DIGIT2: twoAction(new ActionEvent());
				break;
				
    		case NUMPAD3: 
    		case DIGIT3: threeAction(new ActionEvent());
				break;
			
    		case NUMPAD4: 
    		case DIGIT4: fourAction(new ActionEvent());
				break;
			
    		case NUMPAD5: 
    		case DIGIT5: fiveAction(new ActionEvent());
				break;
			
    		case NUMPAD6: 
    		case DIGIT6: sixAction(new ActionEvent());
				break;
			
    		case NUMPAD7: 
    		case DIGIT7: sevenAction(new ActionEvent());
				break;
			
    		case NUMPAD8: 
    		case DIGIT8: eightAction(new ActionEvent());
				break;
			
    		case NUMPAD9: 
    		case DIGIT9: nineAction(new ActionEvent());
				break;
				
    		case COMMA:	
    		case PERIOD: pointAction(new ActionEvent());
    			break;
				
    		case ADD: additionAction(new ActionEvent());
    			break;
    			
    		case SUBTRACT: subtractionAction(new ActionEvent());
				break;
			
    		case MULTIPLY: multiplicationAction(new ActionEvent());
				break;
			
    		case SLASH: 
    		case DIVIDE: divisionAction(new ActionEvent());
    			break;
			
    		case ENTER: equalAction(new ActionEvent());
    			break;
    		
    		case DELETE: deleteAction(new ActionEvent());
				break; 
				
    		default:
    			break;
    	}
    }
    
    // -------------------------------------------- Other methods -------------------------------------------------------
    
	/**
     * Evaluates the expression in the screen and returns its result
     * @param expression
     * @return result
     */
    private String evaluateExpression(String expression) {
		Stack<Double> numberStack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();
		String digitBuffer = "";
		boolean isDigit;
		boolean priorityOperationWaiting = false;
		
		// Iterate through each character in the expression
		for(int i = 0; i < expression.length(); i++) {
			
			switch( expression.charAt(i) ) {
			case '0': 
			case '1': 
			case '2': 
			case '3': 
			case '4': 
			case '5': 
			case '6': 
			case '7': 
			case '8': 
			case '9': 
			case '.': 
				isDigit = true;
				break;

			default: 
				isDigit = false;
				break;
			}	
			
			// If the character is a digit (0-9) or a dot, it's concatenated to the digit buffer
			if(isDigit) 
				digitBuffer += expression.charAt(i);
			else {
				if( !digitBuffer.equals("") ) {
					// The buffer stops reading digits, and pushes its value to the numbers stack
					numberStack.push( Double.parseDouble(digitBuffer) );
					digitBuffer = "";
					
					if(priorityOperationWaiting) 
						numberStack = calculatePreviousOperation( numberStack, operatorStack.pop() );
				}
				
				// Identify which operator is the character
				switch( expression.charAt(i) ) {
				
				case '(': operatorStack.push('(');
					break;
					
				case '+': 
					if( !operatorStack.peek().equals('(') && numberStack.size() > 1 ) 
						numberStack = calculatePreviousOperation( numberStack, operatorStack.pop() );
		 	
					operatorStack.push('+');
					break;	
			
				case '-':
					if( !operatorStack.peek().equals('(') ) 
						numberStack = calculatePreviousOperation( numberStack, operatorStack.pop() );
		 	
					operatorStack.push('-');
					break;
					
				case '*':
					if( operatorStack.peek().equals('+') || operatorStack.peek().equals('-') ) 
						priorityOperationWaiting = true;
					
					else if( !operatorStack.peek().equals('(') )
						numberStack = calculatePreviousOperation( numberStack, operatorStack.pop() );
					
					operatorStack.push('*');
					break;
				
				case '/':
					if( operatorStack.peek().equals('+') || operatorStack.peek().equals('-') ) 
						priorityOperationWaiting = true;
					
					else if( !operatorStack.peek().equals('(') )
						numberStack = calculatePreviousOperation( numberStack, operatorStack.pop() );
					
					operatorStack.push('/');
					break;
					
				case '%':
					if( operatorStack.peek().equals('+') || operatorStack.peek().equals('-') ) 
						priorityOperationWaiting = true;
					
					else if( !operatorStack.peek().equals('(') )
						numberStack = calculatePreviousOperation( numberStack, operatorStack.pop() );
					
					operatorStack.push('%');
					break;
				
				case ')':
					while(numberStack.size() > 1 && operatorStack.size() > 1)
						numberStack = calculatePreviousOperation( numberStack, operatorStack.pop() );
					break;
				}
			}
			
		}
    	
		/* 
		 * All the operations results are pushed to the stack, so the final result has to be the only
		 * number in the stack
		 */
		if(numberStack.size() == 1) {
			return (numberStack.pop()).toString();
		}
		else {
			return "";
		}
	}

    /**
     * 
     * @param numberStack
     * @param operator
     * @return
     */
	private Stack<Double> calculatePreviousOperation(Stack<Double> numberStack, Character operator) {
		
		switch(operator) {
		case '+': return calculateAddition(numberStack);
		case '-': return calculateSubtraction(numberStack);
		case '*': return calculateMultiplication(numberStack);
		case '/': return calculateDivision(numberStack);
		case '%': return calculateModule(numberStack);
		default: return null;
		}
	}

	/**
     * 
     * @param numberStack
     * @return
     */
	private Stack<Double> calculateAddition(Stack<Double> numberStack) {
		Double leftOperand, rightOperand;
		
		rightOperand = numberStack.pop();
		leftOperand = numberStack.pop();
		numberStack.push(leftOperand + rightOperand);
		
		return numberStack;
	}
	
	/**
	 * 
	 * @param numberStack
	 * @return
	 */
	private Stack<Double> calculateSubtraction(Stack<Double> numberStack) {
		Double leftOperand, rightOperand;
		
		rightOperand = numberStack.pop();
		leftOperand = numberStack.pop();
		numberStack.push(leftOperand - rightOperand);
		
		return numberStack;
	}
	
	private Stack<Double> calculateMultiplication(Stack<Double> numberStack) {
		Double leftOperand, rightOperand;
		
		rightOperand = numberStack.pop();
		leftOperand = numberStack.pop();
		numberStack.push(leftOperand * rightOperand);
		
		return numberStack;
	}
	
	/**
	 * 
	 * @param numberStack
	 * @return
	 */
	private Stack<Double> calculateDivision(Stack<Double> numberStack) {
		Double leftOperand, rightOperand;
		
		rightOperand = numberStack.pop();
		leftOperand = numberStack.pop();
		numberStack.push(leftOperand / rightOperand);
		
		return numberStack;
	}
	
	/**
	 * 
	 * @param numberStack
	 * @return
	 */
	private Stack<Double> calculateModule(Stack<Double> numberStack) {
		Double leftOperand, rightOperand;
		
		rightOperand = numberStack.pop();
		leftOperand = numberStack.pop();
		numberStack.push(leftOperand % rightOperand);
		
		return numberStack;
	}
    
}
