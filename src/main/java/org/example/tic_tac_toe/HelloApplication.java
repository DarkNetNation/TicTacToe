package org.example.tic_tac_toe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private boolean playerXTurn = true;
    private Button[][] buttons = new Button[3][3];
    private int movesCount = 0;



    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button button = new Button("");
                button.setMinSize(100,100);
                button.setStyle("fx-font-size: 24;");
                buttons[row][col] = button;


                int finalRow = row;
                int finalCol = col;
                button.setOnAction(e -> handleMove(finalRow, finalRow));
                grid.add(button, col, row);
            }
        }
    }

    private void handleMove(int row, int col) {
        if (!buttons[row][col].getText().equals("")) {
            return;
        }
        buttons[row][col].setText("X" : "O");

    }
}