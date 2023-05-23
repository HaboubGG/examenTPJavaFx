module com.example.examentpjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examentpjavafx to javafx.fxml;
    exports com.example.examentpjavafx;
}