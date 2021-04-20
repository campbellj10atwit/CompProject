package edu.wit.cs.comp1050.CompProject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CompProject extends Application{
    
    static Button arr[][] = new Button[3][3];
    

    public static void main(String[] args) {
        
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        //declare puzzle class and win boolean, retrieve the array
        genpuz puz = new genpuz();
        boolean win = false;
        arr = puz.genpuz();
        int k = 1;
        Button blank = new Button();
        //declares the blank button so it can be found later
        //other jfx declarations for the game scene
        Button rand = new Button("Randomize");
        rand.setStyle("-fx-font-size: 2em; ");
        BorderPane pane = new BorderPane();
        HBox bot = new HBox(rand);
        GridPane grid = new GridPane();
        //initializes new arrays until the puzzle is solvable
        while (!puz.isSolvable()) {
            arr = puz.genpuz(); 
        }
        //initialize new arrays on the randomize button keypress
        rand.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                arr = puz.genpuz();
                while (!puz.isSolvable()) {
                    arr = puz.genpuz();
                    
                    
                }
                //clears the gridpane everytime it gets a new valid array
                grid.getChildren().clear();
                for (int i = 0; i<3; i++) {
                    for (int j = 0; j<3; j++) {
                        
                        grid.add(arr[i][j], j, i);
                    }
                }
                }
            
        });
        grid.getChildren().clear();
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                
                grid.add(arr[i][j], j, i);
            }
        }
        
        
        //gridpane declarations
        grid.setVgap(10);
        grid.setHgap(10);
        pane.setCenter(grid);
        grid.setAlignment(Pos.CENTER);
        bot.setAlignment(Pos.BOTTOM_CENTER);
        bot.setSpacing(15);
        pane.setCenter(grid);
        pane.setBottom(bot);
        Scene scene = new Scene (pane, 270,300);
        stage.setTitle("Puzzle");
        stage.setScene(scene);
        stage.show();
        //check if the game is one on every mouse click
        scene.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (((Button)getNodeFromGridPane(grid,0,0)).getText().contains("1")) {
                    if (((Button)getNodeFromGridPane(grid,1,0)).getText().contains("2")) {
                        if (((Button)getNodeFromGridPane(grid,2,0)).getText().contains("3")) {
                            if (((Button)getNodeFromGridPane(grid,0,1)).getText().contains("4")) {
                                if (((Button)getNodeFromGridPane(grid,1,1)).getText().contains("5")) {
                                    if (((Button)getNodeFromGridPane(grid,2,1)).getText().contains("6")) {
                                        if (((Button)getNodeFromGridPane(grid,0,2)).getText().contains("7")) {
                                            if (((Button)getNodeFromGridPane(grid,1,2)).getText().contains("8")) {
                                                pane.getChildren().clear();
                                                Label wi = new Label("YOU WIN!");
                                                wi.setStyle("-fx-font-size: 4em; ");
                                                pane.setCenter(wi);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                
                   
            }
        });
        
        
        
        
    }
    //method to retrieve a node at a specific point in the gridpane, used for win alg
    private Node getNodeFromGridPane(GridPane gridPane, int col, int row) {
        for (Node node : gridPane.getChildren()) {
            if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
                return node;
            }
        }
        return null;
    }

}
