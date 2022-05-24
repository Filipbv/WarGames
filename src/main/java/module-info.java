module no.ntnu.idata2001 {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens no.ntnu.idata2001.Data to javafx.fxml;
    opens no.ntnu.idata2001.Factory to javafx.fxml;
    opens no.ntnu.idata2001.GUI to javafx.fxml;
    opens no.ntnu.idata2001.Simulation to javafx.fxml;

    exports no.ntnu.idata2001.Data;
    exports no.ntnu.idata2001.Factory;
    exports no.ntnu.idata2001.GUI;
    exports no.ntnu.idata2001.Simulation;

    exports no.ntnu.idata2001;
    opens no.ntnu.idata2001 to javafx.fxml;

}