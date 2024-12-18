package project.dao.C_Task;
import project.entity.C_Task;

import java.util.List;

public interface C_Task_Dao {
    void addInfo(C_Task task);
    void deleteInfo(int taskID);
    void updateInfo(C_Task task);
    List<C_Task> findInfo(int taskID);
}
