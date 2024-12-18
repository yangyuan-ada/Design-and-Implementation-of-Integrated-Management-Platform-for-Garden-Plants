package project.service.E_Indicator;

import project.dao.E_Indicator.E_Indicator_Dao;
import project.entity.E_Indicator;

public class E_Indicator_ServiceImpl implements E_Indicator_Service {
    private E_Indicator_Dao indicatorDao;

    public E_Indicator_ServiceImpl(E_Indicator_Dao indicatorDao) {
        this.indicatorDao = indicatorDao;
    }

    @Override
    public void addInfo(E_Indicator indicator) {
        indicatorDao.addInfo(indicator);
    }

    @Override
    public void deleteInfo(int indexNum) {
        indicatorDao.deleteInfo(indexNum);
    }

    @Override
    public void updateInfo(E_Indicator indicator) {
        indicatorDao.updateInfo(indicator);
    }

    @Override
    public E_Indicator findInfo(int indexNum) {
        return indicatorDao.findInfo(indexNum);
    }
}