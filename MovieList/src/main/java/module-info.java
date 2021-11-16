module com.example.movielist {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.movielist to javafx.fxml;
    exports com.example.movielist;
}