package DetyreOOP;
import java.time.LocalDate;

public class Klient {

    private int klientId;
    private LocalDate orari;
    private String Emer;
    private int num;

    public Klient (int a ,int b , String c,LocalDate d){
        this.klientId =a;
        this.Emer = c;
        this.num =b;
        this.orari =d;

    }

    public int getKlientId() {
        return klientId;
    }

    public void setKlientId(int klientId) {
        this.klientId = klientId;
    }

    public String getEmer() {
        return Emer;
    }

    public void setEmer(String emer) {
        Emer = emer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
