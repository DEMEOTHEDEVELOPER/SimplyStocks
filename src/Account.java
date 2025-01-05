public class Account {
    private String name, type;
    private float total, plusminus, deposited;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public float getTotal() {
        return total;
    }

    public float getPlusminus() {
        return plusminus;
    }

    public Account(String aname, String atype){
        name = aname;
        type = atype;
        total = 0;
        plusminus = 0;
        deposited = 0;

    }
}
