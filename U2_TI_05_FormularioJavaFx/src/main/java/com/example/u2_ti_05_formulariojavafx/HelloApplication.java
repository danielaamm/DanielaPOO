package com.example.u2_ti_05_formulariojavafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Etiquetas y campos de textos creados
        Label lbNombre = new Label("Nombre:");
        TextField tfNombre = new TextField();
        Label lbApellido = new  Label("Apellido:");
        TextField tfApellido = new  TextField();
        Label lbEdad = new  Label("Edad:");
        TextField tfEdad = new  TextField();
        Label lblRol = new Label("Rol:");
        ObservableList<String> roles = FXCollections.observableArrayList("Estudiante", "Profesor", "Administrador");
        ComboBox<String> cbRol = new  ComboBox<String>(roles);
        Button btnCrear = new  Button("Crear");
        Button btnReset = new  Button("Reset");
        Label lblResultado = new Label();

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setVgap(20);

        //Posiciones de los elementos
        root.add(lbNombre,0,0);
        root.add(tfNombre,1,0);
        root.add(lbApellido,0,1);
        root.add(tfApellido,1,1);
        root.add(lbEdad,0,2);
        root.add(tfEdad,1,2);
        root.add(lblRol,0,3);
        root.add(cbRol,1,3);
        root.add(btnCrear,0,4);
        root.add(btnReset,1,4);
        root.add(lblResultado,0,5);

        btnCrear.setOnAction(e -> {
            String nombre = tfNombre.getText();
            String apellido = tfApellido.getText();
            String edad = tfEdad.getText();
            String rol = cbRol.getSelectionModel().getSelectedItem();


            if(nombre.isEmpty() || apellido.isEmpty() || edad.isEmpty() || rol.isEmpty()){
                lblResultado.setText("Debes llenar todos los campos");
            } else {
                root.setStyle("-fx-background-color: #96ac60");
                lblResultado.setStyle("-fx-text-fill: #2196f3;");
                lblResultado.setText("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nRol: " + rol);
            }
        });

        btnReset.setOnAction(e ->{
            tfNombre.setText("");
            tfApellido.setText("");
            tfEdad.setText("");
            lblResultado.setText("");
            root.setStyle("-fx-background-color: white;");
            lblResultado.setStyle("-fx-text-fill: black;");
        });

        stage.setTitle("Formulario con JavaFx");
        Scene scene = new Scene(root, 400, 350);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}