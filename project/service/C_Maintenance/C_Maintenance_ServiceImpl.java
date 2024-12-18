package project.service.C_Maintenance;

import project.dao.C_Maintenance.C_Maintenance_Dao;
import project.entity.C_Maintenance;

public class C_Maintenance_ServiceImpl implements C_Maintenance_Service {
    private C_Maintenance_Dao maintenanceDao;

    public C_Maintenance_ServiceImpl(C_Maintenance_Dao maintenanceDao) {
        this.maintenanceDao = maintenanceDao;
    }

    @Override
    public void addInfo(C_Maintenance maintenance) {
        maintenanceDao.addInfo(maintenance);
    }

    @Override
    public void deleteInfo(int mainID) {
        maintenanceDao.deleteInfo(mainID);
    }

    @Override
    public void updateInfo(C_Maintenance maintenance) {
        maintenanceDao.updateInfo(maintenance);
    }

    @Override
    public C_Maintenance findInfo(int mainID) {
        return maintenanceDao.findInfo(mainID);
    }
}