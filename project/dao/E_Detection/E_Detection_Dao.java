package project.dao.E_Detection;
import project.entity.E_Detection;
public interface E_Detection_Dao {
    void addInfo(E_Detection Detection);
    void deleteInfo(int detecNum);
    void updateInfo(E_Detection Detection);
    E_Detection findInfo(int detecNum);
}
