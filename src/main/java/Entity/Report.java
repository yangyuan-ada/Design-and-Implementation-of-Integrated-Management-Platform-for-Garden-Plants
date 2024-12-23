package Entity;

public class Report {
    public String id;
    public String name;     //报告名称
    public String type;     //报告类型
    public String time;     //报告时间
    public String address;      //报告服务单位
    public String material;     //佐证材料
    public int contribution;    //贡献度排名
    public String status;       //审核状态
    public String sid;          //学号

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getContribution() {
        return contribution;
    }

    public void setContribution(int contribution) {
        this.contribution = contribution;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }


    @Override
    public String toString() {
        return "报告{" +
                "报告名称='" + name + '\'' +
                ", 报告类型='" + type + '\'' +
                ", 报告时间='" + time + '\'' +
                ", 报告服务单位='" + address + '\'' +
                ", 佐证材料='" + material + '\'' +
                ", 贡献度排名=" + contribution +
                ", 审核状态='" + status + '\'' +
                ", 学号='" + sid + '\'' +
                '}';
    }
}
