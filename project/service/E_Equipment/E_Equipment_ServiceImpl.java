package project.service.E_Equipment;

import project.dao.E_Equipment.E_Equipment_Dao;
import project.entity.E_Equipment;

public class E_Equipment_ServiceImpl implements E_Equipment_Service {
    private E_Equipment_Dao equipmentDao;

    public E_Equipment_ServiceImpl(E_Equipment_Dao equipmentDao) {
        this.equipmentDao = equipmentDao;
    }

    @Override
    public void addInfo(E_Equipment equipment) {
        equipmentDao.addInfo(equipment);
    }

    @Override
    public void deleteInfo(int equipNum) {
        equipmentDao.deleteInfo(equipNum);
    }

    @Override
    public void updateInfo(E_Equipment equipment) {
        equipmentDao.updateInfo(equipment);
    }

    @Override
    public E_Equipment findInfo(int equipNum) {
        return equipmentDao.findInfo(equipNum);
    }
}