module blaze.blaze {
    requires javafx.controls;
    requires javafx.fxml;


    opens blaze.blaze to javafx.fxml;
    exports blaze.blaze;
}