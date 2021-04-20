package edu.wit.cs.comp1050.CompProject;
import javafx.scene.layout.BorderPane;

import java.util.Arrays;
import java.util.Collections;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
public class genpuz {
    
    private static Integer[] locs;
    
    
    public Button[][] genpuz() {
        //intialize buttons to go in the array
        Button one = new Button("  1  ");
        one.setStyle("-fx-font-size: 3em; ");
        one.setPadding(new Insets(10));
        Button two = new Button("  2  ");
        two.setStyle("-fx-font-size: 3em; ");
        two.setPadding(new Insets(10));
        Button three = new Button("  3  ");
        three.setStyle("-fx-font-size: 3em; ");
        three.setPadding(new Insets(10));
        Button four = new Button("  4  ");
        four.setStyle("-fx-font-size: 3em; ");
        four.setPadding(new Insets(10));
        Button five = new Button("  5  ");
        five.setStyle("-fx-font-size: 3em; ");
        five.setPadding(new Insets(10));
        Button six = new Button("  6  ");
        six.setStyle("-fx-font-size: 3em; ");
        six.setPadding(new Insets(10));
        Button seven = new Button("  7  ");
        seven.setStyle("-fx-font-size: 3em; ");
        seven.setPadding(new Insets(10));
        Button eight = new Button("  8  ");
        eight.setStyle("-fx-font-size: 3em; ");
        eight.setPadding(new Insets(10));
        Button blank = new Button("      ");
        blank.setStyle("-fx-font-size: 3em; ");
        blank.setPadding(new Insets(10));
        Button arr[][] = new Button[3][3];
        Integer[] loc = new Integer[9];
        
        for (int i = 0; i < loc.length; i++) {
            loc[i] = i;
        }
        Collections.shuffle(Arrays.asList(loc));
        //a one dimensional array to get the order of the buttons
        locs = loc;
        //a loop to map each button to the array in its desired position
        int k = 0;
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                if (loc[k]==0) {
                    arr[i][j] = blank;
                    k++;
                }
                else if (loc[k]==1) {
                    arr[i][j] = one;
                    k++;
                }
                else if (loc[k]==2) {
                    arr[i][j] = two;
                    k++;
                }
                else if (loc[k]==3) {
                    arr[i][j] = three;
                    k++;
                }
                else if (loc[k]==4) {
                    arr[i][j] = four;
                    k++;
                }
                else if (loc[k]==5) {
                    arr[i][j] = five;
                    k++;
                }
                else if (loc[k]==6) {
                    arr[i][j] = six;
                    k++;
                }
                else if (loc[k]==7) {
                    arr[i][j] = seven;
                    k++;
                }
                else if (loc[k]==8) {
                    arr[i][j] = eight;
                    k++;
                }
            }
        }
        
        //lines for movement, definitely could have been a method, but this was the fastest way to implement this     
        one.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                int a = GridPane.getRowIndex(one);
                int b = GridPane.getColumnIndex(one);
                int c = GridPane.getRowIndex(blank);
                int d = GridPane.getColumnIndex(blank);
                if ((d-b == 1 && a == c)|| (b-d == 1 && a == c)|| (a-c == 1 && b == d)|| (c-a == 1 && b ==d)) {
                GridPane.setRowIndex(one,c);
                GridPane.setColumnIndex(one,d);
                GridPane.setRowIndex(blank,a);
                GridPane.setColumnIndex(blank,b);
                arr[a][b] = blank;
                arr[c][d] = one;
                
                
                }
            }
        })
        ;
        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                int a = GridPane.getRowIndex(two);
                int b = GridPane.getColumnIndex(two);
                int c = GridPane.getRowIndex(blank);
                int d = GridPane.getColumnIndex(blank);
                if ((d-b == 1 && a == c)|| (b-d == 1 && a == c)|| (a-c == 1 && b == d)|| (c-a == 1 && b ==d)) {
                GridPane.setRowIndex(two,c);
                GridPane.setColumnIndex(two,d);
                GridPane.setRowIndex(blank,a);
                GridPane.setColumnIndex(blank,b);
                arr[a][b] = blank;
                arr[c][d] = two;
                
                
                }
            }
        })
        ;
        three.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                int a = GridPane.getRowIndex(three);
                int b = GridPane.getColumnIndex(three);
                int c = GridPane.getRowIndex(blank);
                int d = GridPane.getColumnIndex(blank);
                if ((d-b == 1 && a == c)|| (b-d == 1 && a == c)|| (a-c == 1 && b == d)|| (c-a == 1 && b ==d)) {
                GridPane.setRowIndex(three,c);
                GridPane.setColumnIndex(three,d);
                GridPane.setRowIndex(blank,a);
                GridPane.setColumnIndex(blank,b);
                arr[a][b] = blank;
                arr[c][d] = three;
                
                }
            }
        })
        ;
        four.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                int a = GridPane.getRowIndex(four);
                int b = GridPane.getColumnIndex(four);
                int c = GridPane.getRowIndex(blank);
                int d = GridPane.getColumnIndex(blank);
                if ((d-b == 1 && a == c)|| (b-d == 1 && a == c)|| (a-c == 1 && b == d)|| (c-a == 1 && b ==d)) {
                GridPane.setRowIndex(four,c);
                GridPane.setColumnIndex(four,d);
                GridPane.setRowIndex(blank,a);
                GridPane.setColumnIndex(blank,b);
                arr[a][b] = blank;
                arr[c][d] = four;
                
                }
            }
        })
        ;
        five.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                int a = GridPane.getRowIndex(five);
                int b = GridPane.getColumnIndex(five);
                int c = GridPane.getRowIndex(blank);
                int d = GridPane.getColumnIndex(blank);
                if ((d-b == 1 && a == c)|| (b-d == 1 && a == c)|| (a-c == 1 && b == d)|| (c-a == 1 && b ==d)) {
                GridPane.setRowIndex(five,c);
                GridPane.setColumnIndex(five,d);
                GridPane.setRowIndex(blank,a);
                GridPane.setColumnIndex(blank,b);
                arr[a][b] = blank;
                arr[c][d] = five;
                
                }
            }
        })
        ;
        six.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                int a = GridPane.getRowIndex(six);
                int b = GridPane.getColumnIndex(six);
                int c = GridPane.getRowIndex(blank);
                int d = GridPane.getColumnIndex(blank);
                if ((d-b == 1 && a == c)|| (b-d == 1 && a == c)|| (a-c == 1 && b == d)|| (c-a == 1 && b ==d)) {
                GridPane.setRowIndex(six,c);
                GridPane.setColumnIndex(six,d);
                GridPane.setRowIndex(blank,a);
                GridPane.setColumnIndex(blank,b);
                arr[a][b] = blank;
                arr[c][d] = six;
                
                }
            }
        })
        ;
        seven.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                int a = GridPane.getRowIndex(seven);
                int b = GridPane.getColumnIndex(seven);
                int c = GridPane.getRowIndex(blank);
                int d = GridPane.getColumnIndex(blank);
                if ((d-b == 1 && a == c)|| (b-d == 1 && a == c)|| (a-c == 1 && b == d)|| (c-a == 1 && b ==d)) {
                GridPane.setRowIndex(seven,c);
                GridPane.setColumnIndex(seven,d);
                GridPane.setRowIndex(blank,a);
                GridPane.setColumnIndex(blank,b);
                arr[a][b] = blank;
                arr[c][d] = seven;
                
                }
            }
        })
        ;
        eight.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                int a = GridPane.getRowIndex(eight);
                int b = GridPane.getColumnIndex(eight);
                int c = GridPane.getRowIndex(blank);
                int d = GridPane.getColumnIndex(blank);
                if ((d-b == 1 && a == c)|| (b-d == 1 && a == c)|| (a-c == 1 && b == d)|| (c-a == 1 && b ==d)) {
                GridPane.setRowIndex(eight,c);
                GridPane.setColumnIndex(eight,d);
                GridPane.setRowIndex(blank,a);
                GridPane.setColumnIndex(blank,b);
                arr[a][b] = blank;
                arr[c][d] = eight;
                
                }
            }
        })
        ;
        
        //returns the final array
        return arr;
    }
    static int getInvCount()
    {
        //algorithm to get the count of inverses for the is solvable method, using the locs one dimensional array as an intializer
        //using the locs one d array, an inverse is defined as a all the pieces after a piece that are less than it
        //so for the array [734502186]
        //7 has 6 pieces less than after it, 3 has 2, 4 has 2, 5 has 2, 2 has 1, 1 has none, 8 has 1, and 6 has none
        //the total is 14, and because the count is even, it means the puzzle is solvable
        //the loop goes over each piece, ignoring zero in all cases
        //source that helped write alg: https://math.stackexchange.com/questions/293527/how-to-check-if-a-8-puzzle-is-solvable
        int inv_count = 0;
        for (int i =0; i< 9; i++) {
            if (locs[i]!=0) {
                
                for (int j = i+1; j <9; j++) {
                    if (locs[j] < locs[i] && locs[j]!=0) {
                        
                        inv_count++;
                    }
                }
            }
        }
        
        return inv_count;
    }
     
    // This function returns true
    // if given 8 puzzle is solvable.
    boolean isSolvable()
    {
        // Count inversions in given 8 puzzle
        int invCount = getInvCount();
        
        // return true if inversion count is even.
        return (invCount % 2 == 0);
    }
    
}
