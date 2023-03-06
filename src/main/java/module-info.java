module com.example.ta_test_fx_3_c {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ta_test_fx_3_c to javafx.fxml;
    exports com.example.ta_test_fx_3_c;
}