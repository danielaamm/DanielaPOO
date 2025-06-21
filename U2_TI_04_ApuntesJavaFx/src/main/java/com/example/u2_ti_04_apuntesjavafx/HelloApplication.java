package com.example.u2_ti_04_apuntesjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Textos
        Label label = new Label("Bienvenido a JavaFx");
        Label label2 = new Label("Daniela Araujo");
        //Botones
        Button button1 = new Button("Continuar");
        Button button2 = new Button("Cancelar");

        //Acciones botones
        button1.setOnAction(e -> {
            label.setText("Aceptado");
        });
        button2.setOnAction(e -> {
            label.setText("Rechazado");
        });

        VBox vbox = new VBox(20,label, label2, button1, button2);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 300, 240);

        //Nombre pestaña
        stage.setTitle("Apuntes JavaFx");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}