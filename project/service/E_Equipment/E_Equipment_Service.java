package project.service.E_Equipment;

import project.entity.E_Equipment;

public interface E_Equipment_Service {
    void addInfo(E_Equipment equipment);
    void deleteInfo(int equipNum);
    void updateInfo(E_Equipment equipment);
    E_Equipment findInfo(int equipNum);
}
