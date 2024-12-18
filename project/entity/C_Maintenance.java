package project.entity;

public class C_Maintenance {
    private int mainID;
    private String mainTime;
    private String mainLoc;
    private String mainPer;
    private String plantId;
    private String status;

    public C_Maintenance() {
        this.mainID = mainID;
        this.mainTime = mainTime;
        this.mainLoc = mainLoc;
        this.mainPer = mainPer;
        this.plantId = plantId;
        this.status = status;
    }

    public int getmainID() {
        return mainID;
    }

    public void setmainID(int mainNum) {
        this.mainID = mainNum;
    }

    public String getmainTime() {
        return mainTime;
    }

    public void setmainTime(String mainTime) {
        this.mainTime = mainTime;
    }

    public String getmainLoc() {
        return mainLoc;
    }

    public void setmainLoc(String mainLoc) {
        this.mainLoc = mainLoc;
    }

    public String getmainPer() {
        return mainPer;
    }

    public void setmainPer(String mainPer) {
        this.mainPer = mainPer;
    }

    public String getplantId() {
        return mainPer;
    }

    public void setplantId(String plantId) {
        this.plantId = plantId;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "C_Maintenance{" +
                "mainNum=" + mainID +
                ", mainTime='" + mainTime + '\'' +
                ", mainLoc='" + mainLoc + '\'' +
                ", mainPer='" + mainPer + '\'' +
                ", plantId='" + plantId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
