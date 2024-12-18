package project.dao.E_Detection;
import project.entity.E_Detection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class E_Detection_Impl implements E_Detection_Dao {

    private E_Detection detection;

    @Override
    public void addInfo(E_Detection detection){
        String sql = "INSERT INTO detection VALUES(?,?,?,?,?,?)";
        Connection connection = detection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, detection.getdetecNum());
            preparedStatement.setString(2, detection.getdetecTime());
            preparedStatement.setString(3, detection.getdetecLoc());
            preparedStatement.setString(4, detection.getdetecPer());
            preparedStatement.setString(5, detection.getplantId());
            preparedStatement.setString(6, detection.getstatus());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteInfo(int detecNum){
        String SQL = "delete from detection where detecNum= ?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, detection.getdetecNum());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateInfo(E_Detection detection){
        String sql = "UPDATE detection SET detecNum=?,detecTime=?,detecLoc=?,detecPer=?,plantId=?,status=?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, detection.getdetecNum());
            preparedStatement.setString(2, detection.getdetecTime());
            preparedStatement.setString(3, detection.getdetecLoc());
            preparedStatement.setString(4, detection.getdetecPer());
            preparedStatement.setString(5, detection.getplantId());
            preparedStatement.setString(6, detection.getstatus());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<E_Detection> findInfo(int detecNum) {
        ArrayList<E_Detection> arrayList = new ArrayList<>();
        String SQL ="";
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = null;
            SQL = "select * from E_Detection where detecNum=?";
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, detecNum);

            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                E_Detection E_Detection = new E_Detection();
                E_Detection.setdetecNum(resultSet.getInt("detecNum"));
                E_Detection.setdetecTime(resultSet.getString("detecTime"));
                E_Detection.setdetecLoc(resultSet.getString("detecLoc"));
                E_Detection.setdetecPer(resultSet.getString("detecPer"));
                E_Detection.setplantId(resultSet.getString("plantNum"));
                E_Detection.setstatus(resultSet.getString("status"));
                arrayList.add(E_Detection);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }
}
