package HR.entity;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class chamcong {
    private Integer Manv;
    private String Ten;
    private Integer tcAge;

    public chamcong(Integer manv, String ten, Integer tcAge) {
        Manv = manv;
        Ten = ten;
        this.tcAge = tcAge;
    }

    public Integer getManv() {
        return Manv;
    }

    public void setManv(Integer manv) {
        Manv = manv;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public Integer getTcAge() {
        return tcAge;
    }

    public void setTcAge(Integer tcAge) {
        this.tcAge = tcAge;
    }
}


