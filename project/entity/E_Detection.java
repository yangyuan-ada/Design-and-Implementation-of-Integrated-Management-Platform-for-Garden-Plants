package project.entity;

public class E_Detection {
    private int detecNum;
    private String detecTime;
    private String detecLoc;
    private String detecPer;
    private String plantId;
    private String status;

    public E_Detection(int detecNum,String detecTime,String detecLoc,String detecPer,String plantId,String status) {
        this.detecNum = detecNum;
        this.detecTime = detecTime;
        this.detecLoc = detecLoc;
        this.detecPer = detecPer;
        this.plantId = plantId;
        this.status = status;
    }

    public int getdetecNum() {
        return detecNum;
    }

    public void setdetecNum(int detecNum) {
        this.detecNum = detecNum;
    }

    public String getdetecTime() {
        return detecTime;
    }

    public void setdetecTime(String detecTime) {
        this.detecTime = detecTime;
    }

    public String getdetecLoc() {
        return detecLoc;
    }

    public void setdetecLoc(String detecLoc) {
        this.detecLoc = detecLoc;
    }

    public String getdetecPer() {
        return detecPer;
    }

    public void setdetecPer(String detecPer) {
        this.detecPer = detecPer;
    }

    public String getplantId() {
        return detecPer;
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
        return "E_Detection{" +
                "detecNum=" + detecNum +
                ", detecTime='" + detecTime + '\'' +
                ", detecLoc='" + detecLoc + '\'' +
                ", detecPer='" + detecPer + '\'' +
                ", plantId='" + plantId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
