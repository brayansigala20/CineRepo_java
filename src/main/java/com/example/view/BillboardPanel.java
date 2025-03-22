package com.example.view;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

import com.example.models.Schedule;

public class BillboardPanel extends Application {
    private static List<Schedule> billboardData;

    public static void setBillboardData(List<Schedule> data) {
        billboardData = data;
    }

    @Override
    public void start(Stage stage) {

        TableView<Schedule> tableView = new TableView<>();

        // Definir columnas
        TableColumn<Schedule, String> titleColumn = new TableColumn<>("Título");
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("movieTitle"));

        TableColumn<Schedule, String> genreColumn = new TableColumn<>("Género");
        genreColumn.setCellValueFactory(new PropertyValueFactory<>("movieGenre"));

        TableColumn<Schedule, Integer> durationColumn = new TableColumn<>("Duración");
        durationColumn.setCellValueFactory(new PropertyValueFactory<>("movieDuration"));

        TableColumn<Schedule, String> roomColumn = new TableColumn<>("Sala");
        roomColumn.setCellValueFactory(new PropertyValueFactory<>("roomName"));

        TableColumn<Schedule, Integer> capacityColumn = new TableColumn<>("Capacidad");
        capacityColumn.setCellValueFactory(new PropertyValueFactory<>("roomCapacity"));

        // Columna de botón "Reservar"
        TableColumn<Schedule, Void> reserveColumn = new TableColumn<>("Acción");

        reserveColumn.setCellFactory(param -> new TableCell<>() {
            private final Button reserveButton = new Button("Reservar");

            {
                reserveButton.setOnAction(event -> {
                    Schedule schedule = getTableView().getItems().get(getIndex());
                    reservar(schedule);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(reserveButton);
                }
            }
        });

        // Agregar columnas a la tabla
        tableView.getColumns().addAll(titleColumn, genreColumn, durationColumn, roomColumn, capacityColumn,
                reserveColumn);

        // Cargar datos
        ObservableList<Schedule> observableBillboardData = FXCollections.observableArrayList(billboardData);
        tableView.setItems(observableBillboardData);

        VBox root = new VBox(tableView);

        Scene scene = new Scene(root, 700, 400);
        stage.setScene(scene);
        stage.setTitle("Horarios de Películas");
        stage.show();
    }

    private void reservar(Schedule schedule) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Reserva");
        alert.setHeaderText("Reserva realizada");
        alert.setContentText("Has reservado la película: " + schedule.getMovieTitle());
        alert.showAndWait();
    }
}
