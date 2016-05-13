
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Project extends Application{

	BorderPane mainPane;
	GridPane pane;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,dot,clear,clearAll,add,sub,mul,div,equal,sign,percent,bracketL,bracketR;
	Label screen;
	boolean result=false;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		createButtons();
		addButtons();
		binding();
		styling();
		handle();
		
		Scene scene = new Scene(mainPane,350,550);
		stage.setTitle("Calculator");
		stage.setScene(scene);
		stage.show();						
}

void createButtons()
	{
		screen = new Label();

		 b0 = new Button("0");
		 b1 = new Button("1");
		 b2 = new Button("2");
		 b3 = new Button("3");
		 b4 = new Button("4");
		 b5 = new Button("5");
		 b6 = new Button("6");
		 b7 = new Button("7");			
		 b8 = new Button("8");
		 b9 = new Button("9");
		 dot = new Button(".");
		 clear = new Button("DEL");
		 clearAll = new Button("C");
		 add = new Button("+");
		 sub = new Button("-");
		 mul = new Button("X");
		 div = new Button("/");
		 equal = new Button("=");
		 percent = new Button("%");
		 sign = new Button("+/-");
		 bracketL =new Button("(");
		 bracketR=new Button(")");
	
	}
void addButtons()
{
	pane = new GridPane();
	// First Row
	       pane.add(clearAll, 0, 0);
	       pane.add(bracketL, 1, 0);
	       pane.add(bracketR, 2, 0);
	       pane.add(sign, 3, 0);
	// Second Row
	       pane.add(clear, 0, 1);
	       pane.add(div, 1, 1);
	       pane.add(mul, 2, 1);
	       pane.add(percent, 3, 1);
	// Third Row
	       pane.add(b7, 0, 2);
	       pane.add(b8, 1, 2);
	       pane.add(b9, 2, 2);
	       pane.add(sub, 3, 2);
	// Fourth Row
			pane.add(b4, 0, 3);
			pane.add(b5, 1, 3);
			pane.add(b6, 2, 3);
			pane.add(add, 3, 3);
	// Fifth Row
			pane.add(b1, 0, 4 );
			pane.add(b2, 1, 4);
			pane.add(b3, 2, 4);
			pane.add(equal, 3, 4, 1, 2);
	// Sixth Row
			pane.add(b0, 0, 5, 2, 1);
			pane.add(dot, 2, 5);
				
			
			mainPane = new BorderPane();
			mainPane.setBottom(pane);
			mainPane.setTop(screen);
}
void binding()
{
	                
		 pane.prefWidthProperty().bind(mainPane.widthProperty().divide(0.8));
		 pane.prefHeightProperty().bind(mainPane.heightProperty().divide(1.3));
		 screen.prefWidthProperty().bind(mainPane.widthProperty());
		 screen.prefHeightProperty().bind(mainPane.heightProperty().divide(5));
		 
		 
					b0.prefHeightProperty().bind(pane.heightProperty());
					b1.prefHeightProperty().bind(pane.heightProperty());
					b2.prefHeightProperty().bind(pane.heightProperty());
					b3.prefHeightProperty().bind(pane.heightProperty());
					b4.prefHeightProperty().bind(pane.heightProperty());
					b5.prefHeightProperty().bind(pane.heightProperty());
					b6.prefHeightProperty().bind(pane.heightProperty());
					b7.prefHeightProperty().bind(pane.heightProperty());
					b8.prefHeightProperty().bind(pane.heightProperty());
					b9.prefHeightProperty().bind(pane.heightProperty());
					add.prefHeightProperty().bind(pane.heightProperty());
					sub.prefHeightProperty().bind(pane.heightProperty());
					mul.prefHeightProperty().bind(pane.heightProperty());
					div.prefHeightProperty().bind(pane.heightProperty());
					equal.prefHeightProperty().bind(pane.heightProperty());
					dot.prefHeightProperty().bind(pane.heightProperty());
					clear.prefHeightProperty().bind(pane.heightProperty());
					clearAll.prefHeightProperty().bind(pane.heightProperty());
					percent.prefHeightProperty().bind(pane.heightProperty());
					sign.prefHeightProperty().bind(pane.heightProperty());
					bracketL.prefHeightProperty().bind(pane.heightProperty());
					bracketR.prefHeightProperty().bind(pane.heightProperty());
					
					    b0.prefWidthProperty().bind(pane.widthProperty());
						b1.prefWidthProperty().bind(pane.widthProperty());
						b2.prefWidthProperty().bind(pane.widthProperty());
						b3.prefWidthProperty().bind(pane.widthProperty());
						b4.prefWidthProperty().bind(pane.widthProperty());
						b5.prefWidthProperty().bind(pane.widthProperty());
						b6.prefWidthProperty().bind(pane.widthProperty());
						b7.prefWidthProperty().bind(pane.widthProperty());
						b8.prefWidthProperty().bind(pane.widthProperty());
						b9.prefWidthProperty().bind(pane.widthProperty());
						add.prefWidthProperty().bind(pane.widthProperty());
						sub.prefWidthProperty().bind(pane.widthProperty());
						mul.prefWidthProperty().bind(pane.widthProperty());
						div.prefWidthProperty().bind(pane.widthProperty());
						equal.prefWidthProperty().bind(pane.widthProperty());
						dot.prefWidthProperty().bind(pane.widthProperty());
						clear.prefWidthProperty().bind(pane.widthProperty());
						clearAll.prefWidthProperty().bind(pane.widthProperty());
						percent.prefWidthProperty().bind(pane.widthProperty());
						sign.prefWidthProperty().bind(pane.widthProperty());
						bracketL.prefWidthProperty().bind(pane.widthProperty());
						bracketR.prefWidthProperty().bind(pane.widthProperty());
										
}
void styling()
{
		b0.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;  ");
		b1.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b2.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b3.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b4.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b5.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b6.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b7.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b8.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b9.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		clear.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		clearAll.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		sign.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		percent.setStyle("-fx-base: black; -fx-text-fill: #009933; -fx-background-radius: 10;");
		dot.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bracketL.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bracketR.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		add.setStyle("-fx-base: black; -fx-text-fill: #009933; -fx-background-radius: 10;");
		sub.setStyle("-fx-base: black; -fx-text-fill: #009933; -fx-background-radius: 10;");
		mul.setStyle("-fx-base: black; -fx-text-fill: #009933; -fx-background-radius: 10;");
		div.setStyle("-fx-base: black; -fx-text-fill: #009933; -fx-background-radius: 10;");
		equal.setStyle("-fx-base: #009933; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		
		pane.setStyle("-fx-background-color: #ccffcc");
		mainPane.setStyle("-fx-background-color: #ccffcc");
		screen.setStyle("-fx-background-color: #ccffcc");
		b0.setFont(new Font("elephant", 25));
		b1.setFont(new Font("elephant", 25));
		b2.setFont(new Font("elephant", 25));
		b3.setFont(new Font("elephant", 25));
		b4.setFont(new Font("elephant", 25));
		b5.setFont(new Font("elephant", 25));
		b6.setFont(new Font("elephant", 25));
		b7.setFont(new Font("elephant", 25));
		b8.setFont(new Font("elephant", 25));
		b9.setFont(new Font("elephant", 25));
		clear.setFont(new Font("elephant", 20));
		clearAll.setFont(new Font("elephant", 20));
		sign.setFont(new Font("elephant", 20));
		percent.setFont(new Font("elephant", 20));
		dot.setFont(new Font("elephant", 20));
		bracketL.setFont(new Font("elephant", 20));
		bracketR.setFont(new Font("elephant", 20));
		add.setFont(new Font("elephant", 20));
		sub.setFont(new Font("elephant", 20));
		mul.setFont(new Font("elephant", 20));
		div.setFont(new Font("elephant", 20));
		equal.setFont(new Font("elephant", 20));
		
		
		
	}
void handle()
{
	events o=new events();
	
	
		b0.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '0')); result=false;});
		b1.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '1')); result=false;});
		b2.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '2')); result=false;});
		b3.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '3')); result=false;});
		b4.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '4')); result=false;});
		b5.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '5')); result=false;});
		b6.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '6')); result=false;});
		b7.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '7')); result=false;});
		b8.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '8')); result=false;});
		b9.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '9')); result=false;});
		dot.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '.')); result=false;});
		add.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '+')); result=false;});
		sub.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '-')); result=false;});
		mul.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '*')); result=false;});
		div.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '/')); result=false;});
		percent.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '%')); result=false;});
		equal.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '=')); result=true; });
		clearAll.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'c')); result=false;});
		clear.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'd')); result=false;});
		sign.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 's')); result=false;});
		bracketL.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '(')); result=false;});
		bracketR.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), ')')); result=false;});	
		
}

private String set_size(String text) {

	screen.setFont(new Font("elephant", Math.max(15,30-3*(text.length())/5)));
	return text;
}



public static void main(String[] args) {
	
		//launch(args);
	
	}
}
