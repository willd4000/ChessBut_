module com.example.chessbut___ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chessbut___ to javafx.fxml;
    exports com.example.chessbut___;
}