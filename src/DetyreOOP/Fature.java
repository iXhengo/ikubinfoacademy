package DetyreOOP;

public class Fature {

    private int ID;
    private Klient klient;
    private Sherbim[] sherbimi;
    private int total;

    public Fature (Sherbim[] a ,Klient b ){

        this.sherbimi =a;
        this.klient =b;

    }


    public int totalCmim(){

        for (int i = 0; i< sherbimi.length;i++){
            this.total = this.total + sherbimi[i].getCmimi();
        }
        return total;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Sherbim[] getSherbimi() {
        return sherbimi;
    }

    public void setSherbimi(Sherbim[] sherbimi) {
        this.sherbimi = sherbimi;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
