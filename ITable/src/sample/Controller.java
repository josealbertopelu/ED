package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javax.swing.*;

public class Controller {

    @FXML private TableView<Persona> tableView;
    @FXML private Label label;
    @FXML ObservableList<Persona> personas = FXCollections.observableArrayList(
            new Persona("pepe","654789123"),
            new Persona("maria","657789123"),
            new Persona("jose","654889123"),
            new Persona("javier","654789123")
    );


    @FXML private TableColumn tableColumnNombre;
    @FXML private TableColumn tableColumnTelefono;

    public void initialize() {
        System.out.println("initialize ejecutando");
        label.setText("cambiando en initialize");
        tableView.setItems(personas);

    }

   @FXML private void onButtonAction(ActionEvent actionEvent){
        personas.add(new Persona("Jaume","682134878"));

    }

    public static class Persona {

        private final SimpleStringProperty nombre;
        private final SimpleStringProperty telefono;


        public Persona(String nombre, String telefono){
            this.nombre = new SimpleStringProperty(nombre);
            this.telefono = new SimpleStringProperty(telefono);
        }

        public String getNombre(){
            return nombre.get();
        }

        public void setNombre(String nombre){
            this.nombre.set(nombre);
        }

        public String getTelefono(){
            return telefono.get();
        }

        public void setTelefono(String telefono){
            this.telefono.set(telefono);
        }


    }


}
