package project.service.C_Maintenance;
import project.entity.C_Maintenance;

public interface C_Maintenance_Service {
    void addInfo(C_Maintenance maintenance);
    void deleteInfo(int mainID);
    void updateInfo(C_Maintenance maintenance);
    C_Maintenance findInfo(int mainID);
}
