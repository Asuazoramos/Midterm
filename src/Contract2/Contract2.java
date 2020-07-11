package Contract2;

public class Contract2 {
    private String contract2Type;
    private String hiredDate;
    public Contract2(String contract2Type,String hiredDate) {
        this.contract2Type = contract2Type;
        this.hiredDate = hiredDate;
    }
    public String getContract2Type() {
        return contract2Type;
    }
    public void setContract2Type(String contract2Type) {
        this.contract2Type = contract2Type;

    }
    public String getHiredDate() {
        return hiredDate;
    }
    @Override
    public String toString() {
        return "[contractType=" + contract2Type + ", hiredDate=" + hiredDate +"]";
    }















}
