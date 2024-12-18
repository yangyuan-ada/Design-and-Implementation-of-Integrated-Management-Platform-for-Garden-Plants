package project.entity;

public class E_Equipment {
    private int equipNum;
    private String equipName;

    public E_Equipment() {
        this.equipNum = equipNum;
        this.equipName = equipName;
    }

    public int getequipNum() {
        return equipNum;
    }

    public void setequipNum(int equipNum) {
        this.equipNum = equipNum;
    }

    public String getequipName() {
        return equipName;
    }

    public void setequipName(String equipName) {
        this.equipName = equipName;
    }

    @Override
    public String toString() {
        return "E_Equipment{" +
                "equipNum=" + equipNum +
                ", equipName='" + equipName + '\'' +
                '}';
    }
}
