package project.dao.E_Indicator;
import project.entity.E_Indicator;

import java.util.List;

public interface E_Indicator_Dao {
    void addInfo(E_Indicator Indicator);
    void deleteInfo(int indexNum);
    void updateInfo(E_Indicator Indicator);
    List<E_Indicator> findInfo(int indexNum);
}
