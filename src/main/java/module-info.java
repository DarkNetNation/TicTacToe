module org.example.tic_tac_toe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires eu.hansolo.tilesfx;

    opens org.example.tic_tac_toe to javafx.fxml;
    exports org.example.tic_tac_toe;
}