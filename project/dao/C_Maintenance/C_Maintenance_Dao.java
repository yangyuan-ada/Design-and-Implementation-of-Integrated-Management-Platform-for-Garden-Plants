package project.dao.C_Maintenance;

import project.entity.C_Maintenance;

import java.util.List;

public interface C_Maintenance_Dao {
    void addInfo(C_Maintenance maintenance);
    void deleteInfo(int mainID);
    void updateInfo(C_Maintenance maintenance);
    List<C_Maintenance> findInfo(int mainID);
}
