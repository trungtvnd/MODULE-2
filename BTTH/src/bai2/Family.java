package bai2;

public class Family {
    private String ownName;
    private String address;
    private int codeEnergyMeter;

    public Family() {
    }

    public Family(String ownName, String address, int codeEnergyMeter) {
        this.ownName = ownName;
        this.address = address;
        this.codeEnergyMeter = codeEnergyMeter;
    }

    public String getOwnName() {
        return ownName;
    }

    public void setOwnName(String ownName) {
        this.ownName = ownName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCodeEnergyMeter() {
        return codeEnergyMeter;
    }

    public void setCodeEnergyMeter(int codeEnergyMeter) {
        this.codeEnergyMeter = codeEnergyMeter;
    }
}
