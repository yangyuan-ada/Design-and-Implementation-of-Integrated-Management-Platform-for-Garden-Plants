package project.dao.C_Task ;
import project.entity.C_Task ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class C_Task_Impl implements C_Task_Dao {

    private C_Task  task ;

    @Override
    public void addInfo(C_Task  task ){
        String sql = "INSERT INTO task  VALUES(?,?)";
        Connection connection = task .getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, task .gettaskID());
            preparedStatement.setString(2, task .gettaskName());
            preparedStatement.setString(3, task .gettaskDes());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteInfo(int taskID){
        String SQL = "delete from task  where taskID= ?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, task .gettaskID());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateInfo(C_Task  task){
        String sql = "UPDATE task  SET taskID=?,taskName=?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, task.gettaskID());
            preparedStatement.setString(2, task.gettaskName());
            preparedStatement.setString(3, task.gettaskDes());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<C_Task> findInfo(int taskID) {
        ArrayList<C_Task > arrayList = new ArrayList<>();
        String SQL="";
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = null;
            SQL = "select * from C_Task  where taskID=?";
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1,taskID);

            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                C_Task C_Task = new C_Task();
                C_Task.settaskID(resultSet.getInt("taskID"));
                C_Task.settaskName(resultSet.getString("taskName"));
                C_Task.settaskDes(resultSet.getString("taskDes"));
                arrayList.add(C_Task );
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }
}
