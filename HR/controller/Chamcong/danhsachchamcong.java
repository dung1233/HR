package HR.controller.Chamcong;


import HR.conector.Connector;
import HR.entity.chamcong;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.text.TabableView;
import java.net.URL;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Observable;
import java.util.ResourceBundle;

public class danhsachchamcong implements Initializable {


    public TableView<chamcong> tbView;
    public TableColumn<chamcong,Integer> tcMnv;
    public TableColumn<chamcong,String> tcTen;
    public TableColumn<chamcong,Integer> tcAge;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tcMnv.setCellValueFactory(new PropertyValueFactory<>("MaNhanVien"));
        tcTen.setCellValueFactory(new PropertyValueFactory<>("HoTen"));
        tcAge.setCellValueFactory(new PropertyValueFactory<>("Tuoi"));

        ObservableList<chamcong> ls = FXCollections.observableArrayList();

        try {
            String sql = "SELECT * FROM thongtinnhanvien";
            Connector cn = Connector.getInstance();
            ResultSet rs = cn.getConn().createStatement().executeQuery(sql);

            while (rs.next()) {
                ls.add(new chamcong(
                        rs.getInt("MaNhanVien"),
                        rs.getString("HoTen"),
                        rs.getInt("Tuoi")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tbView.setItems(ls);
        }
    }



}


