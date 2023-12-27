package HR.controller;

import HR.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Homecontroler1 {
    public void gotolist(ActionEvent actionEvent) throws Exception{
        Parent root = FXMLLoader.load(getClass()
                .getResource("../Fxml/Bangchamcong.fxml"));
        Main.rootStage.setScene(new Scene(root,1500,600));
    }

}
