package project.service.C_Task;

import project.dao.C_Task.C_Task_Dao;
import project.entity.C_Task;

public class C_Task_ServiceImpl implements C_Task_Service {
    private C_Task_Dao taskDao;

    public C_Task_ServiceImpl(C_Task_Dao taskDao) {
        this.taskDao = taskDao;
    }

    @Override
    public void addInfo(C_Task task) {
        taskDao.addInfo(task);
    }

    @Override
    public void deleteInfo(int taskID) {
        taskDao.deleteInfo(taskID);
    }

    @Override
    public void updateInfo(C_Task task) {
        taskDao.updateInfo(task);
    }

    @Override
    public C_Task findInfo(int taskID) {
        return taskDao.findInfo(taskID);
    }
}