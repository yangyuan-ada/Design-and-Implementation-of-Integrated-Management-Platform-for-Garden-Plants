package project.service.E_Detection;

import project.dao.E_Detection.E_Detection_Dao;
import project.entity.E_Detection;

public class E_Detection_ServiceImpl implements E_Detection_Service {
    private E_Detection_Dao detectionDao;

    public E_Detection_ServiceImpl(E_Detection_Dao detectionDao) {
        this.detectionDao = detectionDao;
    }

    @Override
    public void addInfo(E_Detection detection) {
        detectionDao.addInfo(detection);
    }

    @Override
    public void deleteInfo(int detecNum) {
        detectionDao.deleteInfo(detecNum);
    }

    @Override
    public void updateInfo(E_Detection detection) {
        detectionDao.updateInfo(detection);
    }

    @Override
    public E_Detection findInfo(int detecNum) {
        return detectionDao.findInfo(detecNum);
    }
}