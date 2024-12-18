package project.dao.C_Maintenance;
import project.entity.C_Maintenance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class C_Maintenance_Impl implements C_Maintenance_Dao {

    private C_Maintenance maintenance;

    @Override
    public void addInfo(C_Maintenance maintenance){
        String sql = "INSERT INTO maintenance VALUES(?,?,?,?,?,?)";
        Connection connection = maintenance.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, maintenance.getmainID());
            preparedStatement.setString(2, maintenance.getmainTime());
            preparedStatement.setString(3, maintenance.getmainLoc());
            preparedStatement.setString(4, maintenance.getmainPer());
            preparedStatement.setString(5, maintenance.getplantId());
            preparedStatement.setString(6, maintenance.getstatus());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteInfo(int mainID){
        String SQL = "delete from maintenance where mainID= ?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, maintenance.getmainID());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateInfo(C_Maintenance maintenance){
        String sql = "UPDATE maintenance SET mainID=?,mainTime=?,mainLoc=?,mainPer=?,plantId=?,status=?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, maintenance.getmainID());
            preparedStatement.setString(2, maintenance.getmainTime());
            preparedStatement.setString(3, maintenance.getmainLoc());
            preparedStatement.setString(4, maintenance.getmainPer());
            preparedStatement.setString(5, maintenance.getplantId());
            preparedStatement.setString(6, maintenance.getstatus());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<C_Maintenance> findInfo(int mainID) {
        ArrayList<C_Maintenance> arrayList = new ArrayList<>();
        String SQL ="";
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = null;
            SQL = "select * from C_Maintenance where mainID=?";
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1,mainID);

            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                C_Maintenance C_Maintenance = new C_Maintenance();
                C_Maintenance.setmainID(resultSet.getInt("mainID"));
                C_Maintenance.setmainTime(resultSet.getString("mainTime"));
                C_Maintenance.setmainLoc(resultSet.getString("mainLoc"));
                C_Maintenance.setmainPer(resultSet.getString("mainPer"));
                C_Maintenance.setplantId(resultSet.getString("plantId"));
                C_Maintenance.setstatus(resultSet.getString("status"));
                arrayList.add(C_Maintenance);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }
}