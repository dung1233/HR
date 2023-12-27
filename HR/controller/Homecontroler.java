package HR.controller;

import HR.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Homecontroler {
        public void gotoDanhsachthang(ActionEvent actionEvent) throws Exception{
            Parent root = FXMLLoader.load(getClass()
                    .getResource("../Fxml/DanhSachThang.fxml"));
            Main.rootStage.setScene(new Scene(root,800,600));
        }


    }
