package DetyreOOP;

public class Berberane {

    private int id ;
    private static int Id = 0;
    private Klient[] klient;
    private Sherbim[] sherbimi;
    private Fature[] fatura;

    private int klientID = 0;
    private int sherbimID = 0;
    private int fatureID = 0;



    public Berberane (){
        this.Id++;
        this.klient = new Klient[20];
        this.sherbimi = new Sherbim[5];
        this.fatura = new Fature[25];

    }

    public void addCmr (Klient klienti){
        if ( this.klientID >= 20){
            System.out.println("Nuk ka me orare te lira");
            return;
        }
        this.klient[this.klientID++] = klienti;
    }

    public void addSherbim (Sherbim sherbim){
        if ( this.sherbimID >= 5) {
            System.out.println("Nuk ka me orare te lira");
            return;
        }
        this.sherbimi[this.sherbimID++] = sherbim;
    }
    public void addFature (Fature fature){
        if ( this.fatureID >= 25){
            System.out.println("Nuk ka me orare te lira");
            return;
        }
        this.fatura[this.fatureID++] = fature;
    }

    public Fature fatureMax() {

        Fature faturaMax = fatura[0];
        for (int i = 1; i < fatureID; i++) {
            if (fatura[i].totalCmim() > faturaMax.totalCmim()) {
                faturaMax = fatura[i];
            }
        }
        return faturaMax;
    }

    public Klient[] klienteQethje(Sherbim sherbimiSpec) {
        int varId = 0;
        Klient[] Qethjet = new Klient[25];
        for (int i = 0; i < fatura.length; i++) {
            Sherbim[] qethja = new fatura[i].getSherbim();

            for (int j = 0; j < sherbimi.length; j++) {

                if (qethja[j].getLloji().equals(sherbimiSpec.getLloji())) {
                    if (Qethjet[varId] != fatura[i].getKlient()) {
                        Qethjet[varId] = fatura[i].getKlient();
                    }

                }

            } }
            return Qethjet;
        }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Klient[] getKlient() {
        return klient;
    }

    public void setKlient(Klient[] klient) {
        this.klient = klient;
    }

    public Sherbim[] getSherbimi() {
        return sherbimi;
    }

    public void setSherbimi(Sherbim[] sherbimi) {
        this.sherbimi = sherbimi;
    }

    public Fature[] getFatura() {
        return fatura;
    }

    public void setFatura(Fature[] fatura) {
        this.fatura = fatura;
    }

    public int getKlientID() {
        return klientID;
    }

    public void setKlientID(int klientID) {
        this.klientID = klientID;
    }

    public int getSherbimID() {
        return sherbimID;
    }

    public void setSherbimID(int sherbimID) {
        this.sherbimID = sherbimID;
    }

    public int getFatureID() {
        return fatureID;
    }

    public void setFatureID(int fatureID) {
        this.fatureID = fatureID;
    }
}

