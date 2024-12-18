package project.entity;

public class E_Indicator {
    private int indexNum;
    private String indexName;

    public E_Indicator() {
        this.indexNum = indexNum;
        this.indexName = indexName;
    }

    public int getindexNum() {
        return indexNum;
    }

    public void setindexNum(int indexNum) {
        this.indexNum = indexNum;
    }

    public String getindexName() {
        return indexName;
    }

    public void setindexName(String indexName) {
        this.indexName = indexName;
    }

    @Override
    public String toString() {
        return "E_Indicator{" +
                "indexNum=" + indexNum +
                ", indexName='" + indexName + '\'' +
                '}';
    }
}
