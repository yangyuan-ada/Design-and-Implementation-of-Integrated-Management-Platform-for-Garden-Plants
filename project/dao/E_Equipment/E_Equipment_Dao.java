package project.dao.E_Equipment;
import project.entity.E_Equipment;

import java.util.List;

public interface E_Equipment_Dao {
    void addInfo(E_Equipment Equipment);
    void deleteInfo(int equipNum);
    void updateInfo(E_Equipment Equipment);
    List<E_Equipment> findInfo(int equipNum);
}
