package project.service.E_Detection;
import project.entity.E_Detection;

public interface E_Detection_Service {
    void addInfo(E_Detection detection);
    void deleteInfo(int detecNum);
    void updateInfo(E_Detection detection);
    E_Detection findInfo(int detecNum);
}
