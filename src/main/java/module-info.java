module javafxgbg.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens javafxgbg.javafx to javafx.fxml;
    exports javafxgbg.javafx;
}