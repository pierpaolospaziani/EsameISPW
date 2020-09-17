package logic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application{
	
	double calcolo = 0.0;
	int numero;

	boolean addiz = false;
	boolean sott = false;
    
	public static void main(String[] args) {
        launch(args);
    }
	
	public void start(Stage stage){
		
    	VBox pane = new VBox();
    	HBox result = new HBox();
    	HBox row1 = new HBox();
    	HBox row2 = new HBox();
    	HBox row3 = new HBox();
    	HBox row4 = new HBox();
    	
    	Text label = new Text();

    	Button b1 = new Button();
    	Button b2 = new Button();
    	Button b3 = new Button();
    	Button b4 = new Button();
    	Button b5 = new Button();
    	Button b6 = new Button();
    	Button b7 = new Button();
    	Button b8 = new Button();
    	Button b9 = new Button();
    	Button b0 = new Button();

    	Button bPlus = new Button();
    	Button bMinus = new Button();
    	
    	Button bCC = new Button();

    	Button bLog = new Button();
    	
    	pane.setPrefWidth(300.0);
    	pane.setPrefHeight(300.0);

    	result.setAlignment(javafx.geometry.Pos.TOP_RIGHT);
    	result.setMaxHeight(50.0);
    	result.setMaxWidth(300.0);
    	
    	row1.setAlignment(javafx.geometry.Pos.CENTER);
    	row1.setSpacing(5.0);
    	row2.setAlignment(javafx.geometry.Pos.CENTER);
    	row2.setSpacing(5.0);
    	row3.setAlignment(javafx.geometry.Pos.CENTER);
    	row3.setSpacing(5.0);
    	row4.setAlignment(javafx.geometry.Pos.CENTER);
    	row4.setSpacing(5.0);
    	
    	label.setText("0");
    	label.setFont(new Font(30.0));

    	b1.setText("1");
    	b2.setText("2");
    	b3.setText("3");
    	b4.setText("4");
    	b5.setText("5");
    	b6.setText("6");
    	b7.setText("7");
    	b8.setText("8");
    	b9.setText("9");
    	b0.setText("0");
    	
    	b1.setFont(new Font(24.0));
    	b2.setFont(new Font(24.0));
    	b3.setFont(new Font(24.0));
    	b4.setFont(new Font(24.0));
    	b5.setFont(new Font(24.0));
    	b6.setFont(new Font(24.0));
    	b7.setFont(new Font(24.0));
    	b8.setFont(new Font(24.0));
    	b9.setFont(new Font(24.0));
    	b0.setFont(new Font(24.0));

    	bPlus.setText("+");
    	bMinus.setText("-");
    	bCC.setText("C");
    	bLog.setText("Log");

    	bPlus.setFont(new Font(24.0));
    	bMinus.setFont(new Font(24.0));
    	bCC.setFont(new Font(24.0));
    	bLog.setFont(new Font(24.0));

    	b1.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		if (calcolo == 0) {
        			calcolo = 1;
            		label.setText(String.valueOf(calcolo));
        		} else {
            		numero = 1;
            		if (addiz) {
            			add(numero);
                		label.setText(String.valueOf(calcolo));
                		addiz = false;
            		}
            		if (sott) {
            			minus(numero);
                		label.setText(String.valueOf(calcolo));
                		sott = false;
            		}
        		}
	        }
		});
    	b2.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		if (calcolo == 0) {
        			calcolo = 2;
            		label.setText(String.valueOf(calcolo));
        		} else {
            		numero = 2;
            		if (addiz) {
            			add(numero);
                		label.setText(String.valueOf(calcolo));
                		addiz = false;
            		}
            		if (sott) {
            			minus(numero);
                		label.setText(String.valueOf(calcolo));
                		sott = false;
            		}
        		}
	        }
		});
    	b3.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		if (calcolo == 0) {
        			calcolo = 3;
            		label.setText(String.valueOf(calcolo));
        		} else {
            		numero = 3;
            		if (addiz) {
            			add(numero);
                		label.setText(String.valueOf(calcolo));
                		addiz = false;
            		}
            		if (sott) {
            			minus(numero);
                		label.setText(String.valueOf(calcolo));
                		sott = false;
            		}
        		}
	        }
		});
    	b4.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		if (calcolo == 0) {
        			calcolo = 4;
            		label.setText(String.valueOf(calcolo));
        		} else {
            		numero = 4;
            		if (addiz) {
            			add(numero);
                		label.setText(String.valueOf(calcolo));
                		addiz = false;
            		}
            		if (sott) {
            			minus(numero);
                		label.setText(String.valueOf(calcolo));
                		sott = false;
            		}
        		}
	        }
		});
    	b5.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		if (calcolo == 0) {
        			calcolo = 5;
            		label.setText(String.valueOf(calcolo));
        		} else {
            		numero = 5;
            		if (addiz) {
            			add(numero);
                		label.setText(String.valueOf(calcolo));
                		addiz = false;
            		}
            		if (sott) {
            			minus(numero);
                		label.setText(String.valueOf(calcolo));
                		sott = false;
            		}
        		}
	        }
		});
    	b6.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		if (calcolo == 0) {
        			calcolo = 6;
            		label.setText(String.valueOf(calcolo));
        		} else {
            		numero = 6;
            		if (addiz) {
            			add(numero);
                		label.setText(String.valueOf(calcolo));
                		addiz = false;
            		}
            		if (sott) {
            			minus(numero);
                		label.setText(String.valueOf(calcolo));
                		sott = false;
            		}
        		}
	        }
		});
    	b7.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		if (calcolo == 0) {
        			calcolo = 7;
            		label.setText(String.valueOf(calcolo));
        		} else {
            		numero = 7;
            		if (addiz) {
            			add(numero);
                		label.setText(String.valueOf(calcolo));
                		addiz = false;
            		}
            		if (sott) {
            			minus(numero);
                		label.setText(String.valueOf(calcolo));
                		sott = false;
            		}
        		}
	        }
		});
    	b8.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		if (calcolo == 0) {
        			calcolo = 8;
            		label.setText(String.valueOf(calcolo));
        		} else {
            		numero = 8;
            		if (addiz) {
            			add(numero);
                		label.setText(String.valueOf(calcolo));
                		addiz = false;
            		}
            		if (sott) {
            			minus(numero);
                		label.setText(String.valueOf(calcolo));
                		sott = false;
            		}
        		}
	        }
		});
    	b9.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		if (calcolo == 0) {
        			calcolo = 9;
            		label.setText(String.valueOf(calcolo));
        		} else {
            		numero = 9;
            		if (addiz) {
            			add(numero);
                		label.setText(String.valueOf(calcolo));
                		addiz = false;
            		}
            		if (sott) {
            			minus(numero);
                		label.setText(String.valueOf(calcolo));
                		sott = false;
            		}
        		}
	        }
		});
    	b0.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		if (calcolo == 0) {
        			calcolo = 0;
            		label.setText(String.valueOf(calcolo));
        		} else {
            		numero = 0;
            		if (addiz) {
            			add(numero);
                		label.setText(String.valueOf(calcolo));
                		addiz = false;
            		}
            		if (sott) {
            			minus(numero);
                		label.setText(String.valueOf(calcolo));
                		sott = false;
            		}
        		}
	        }
		});

    	bPlus.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		addiz = true;
	        }
		});

    	bMinus.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		sott = true;
	        }
		});
    	
    	bLog.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		log();
        		label.setText(String.valueOf(calcolo));
	        }
		});
    	
    	bCC.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		numero = 0;
        		calcolo = 0.0;
        		label.setText(String.valueOf(calcolo));
	        }
		});

    	result.getChildren().add(label);

    	row1.getChildren().add(b1);
    	row1.getChildren().add(b2);
    	row1.getChildren().add(b3);
    	row1.getChildren().add(bPlus);

    	row2.getChildren().add(b4);
    	row2.getChildren().add(b5);
    	row2.getChildren().add(b6);
    	row2.getChildren().add(bMinus);

    	row3.getChildren().add(b7);
    	row3.getChildren().add(b8);
    	row3.getChildren().add(b9);
    	row3.getChildren().add(bCC);

    	row4.getChildren().add(b0);
    	row4.getChildren().add(bLog);
    	
    	pane.getChildren().add(result);
    	pane.getChildren().add(row1);
    	pane.getChildren().add(row2);
    	pane.getChildren().add(row3);
    	pane.getChildren().add(row4);
        
		Scene scene = new Scene(pane,300,300);
	    
	    stage.setResizable(false);
	    
	    stage.setTitle("EsameISPW");
	    stage.setScene(scene);
	    stage.show();	
	}
	
	public void add(int num) {
		calcolo = calcolo + num;
	}

	public void minus(int num) {
		calcolo = calcolo - num;
	}
	public void log() {
		calcolo = Math.log(calcolo);
	}
}