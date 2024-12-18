package project.service.C_Task;

import project.entity.C_Task;

public interface C_Task_Service {
    void addInfo(C_Task task);
    void deleteInfo(int taskID);
    void updateInfo(C_Task task);
    C_Task findInfo(int taskID);
}

