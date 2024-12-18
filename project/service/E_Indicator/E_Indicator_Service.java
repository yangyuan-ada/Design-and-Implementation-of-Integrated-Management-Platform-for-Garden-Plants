package project.service.E_Indicator;

import project.entity.E_Indicator;

public interface E_Indicator_Service {
    void addInfo(E_Indicator indicator);
    void deleteInfo(int indexNum);
    void updateInfo(E_Indicator indicator);
    E_Indicator findInfo(int indexNum);
}

