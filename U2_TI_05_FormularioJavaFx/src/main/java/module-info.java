module com.example.u2_ti_05_formulariojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.u2_ti_05_formulariojavafx to javafx.fxml;
    exports com.example.u2_ti_05_formulariojavafx;
}