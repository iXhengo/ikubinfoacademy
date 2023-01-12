import DetyreOOP.Berberane;
import DetyreOOP.Fature;
import DetyreOOP.Klient;
import DetyreOOP.Sherbim;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        Berberane CO = new Berberane();
        Klient Flori = new Klient(10, 11, "Flori", LocalDate.now());
        Klient Kristi = new Klient(11,12,"Kristi", LocalDate.now());

        CO.addCmr(Flori);
        CO.addCmr(Kristi);

        Sherbim Qethje = new Sherbim(1,1,"Qethje");
        Sherbim LarjeKoke = new Sherbim(1,1,"Larje Koke");
        Sherbim Pastrim = new Sherbim(1,1,"Pastrim mjekerr");
        Sherbim Modelim = new Sherbim(1,1,"Modelim Flokesh");

        Qethje.setCmimi(300);
        LarjeKoke.setCmimi(100);
        Pastrim.setCmimi(200);
        Modelim.setCmimi(150);

        Sherbim[] sherbimi1 = new Sherbim[] {Qethje,LarjeKoke,Pastrim,Modelim};

        Fature fatura1 = new Fature(sherbimi1,Flori);



    }
}