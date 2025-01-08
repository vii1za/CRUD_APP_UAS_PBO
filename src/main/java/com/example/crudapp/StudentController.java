package com.example.crudapp;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.TablePosition;

public class StudentController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField addressField;

    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> nameColumn;

    @FXML
    private TableColumn<Student, String> addressColumn;

    // Menambahkan data ke TableView
    @FXML
    private void addStudent() {
        String name = nameField.getText();
        String address = addressField.getText();
        if (!name.isEmpty() && !address.isEmpty()) {
            studentTable.getItems().add(new Student(name, address));
            clearFields();
        }
    }

    // Mengupdate data yang dipilih di TableView
    @FXML
    private void updateStudent() {
        TablePosition pos = studentTable.getSelectionModel().getSelectedCells().get(0);
        int rowIndex = pos.getRow();

        // Ambil data mahasiswa yang dipilih
        Student selectedStudent = studentTable.getItems().get(rowIndex);

        // Update data berdasarkan input di TextField
        selectedStudent.setName(nameField.getText());
        selectedStudent.setAddress(addressField.getText());

        // Refresh tabel untuk memperbarui tampilan
        studentTable.refresh();
        clearFields();
    }

    // Menghapus data yang dipilih di TableView
    @FXML
    private void deleteStudent() {
        int selectedIndex = studentTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            studentTable.getItems().remove(selectedIndex);
            clearFields();
        }
    }

    // Membersihkan TextField
    private void clearFields() {
        nameField.clear();
        addressField.clear();
    }
}
