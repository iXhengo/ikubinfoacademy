package DetyreOOP;

public class Sherbim {

    private int id;
    private static int Id = 0;
    private String lloji;
    private int cmimi;

    public Sherbim(int a , int b , String c){
        this.Id++;
        this.id=a;
        this.cmimi = b;
        this.lloji = c;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLloji() {
        return lloji;
    }

    public void setLloji(String lloji) {
        this.lloji = lloji;
    }

    public int getCmimi() {
        return cmimi;
    }

    public void setCmimi(int cmimi) {
        this.cmimi = cmimi;
    }
}
