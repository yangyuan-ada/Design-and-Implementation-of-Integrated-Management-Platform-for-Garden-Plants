package project.dao.E_Indicator;
import project.entity.E_Indicator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class E_Indicator_Impl implements E_Indicator_Dao {

    private E_Indicator indicator;

    @Override
    public void addInfo(E_Indicator indicator){
        String sql = "INSERT INTO indicator VALUES(?,?)";
        Connection connection = indicator.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, indicator.getindexNum());
            preparedStatement.setString(2, indicator.getindexName());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteInfo(int indexNum){
        String SQL = "delete from indicator where indexNum= ?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, indicator.getindexNum());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateInfo(E_Indicator indicator){
        String sql = "UPDATE indicator SET indexNum=?,indexName=?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, indicator.getindexNum());
            preparedStatement.setString(2, indicator.getindexName());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<E_Indicator> findInfo(int indexNum) {
        ArrayList<E_Indicator> arrayList = new ArrayList<>();
        String SQL ="";
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = null;
            SQL = "select * from E_Indicator where indexNum=?";
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1,indexNum);

            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                E_Indicator E_Indicator = new E_Indicator();
                E_Indicator.setindexNum(resultSet.getInt("indexNum"));
                E_Indicator.setindexName(resultSet.getString("indexName"));
                arrayList.add(E_Indicator);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }
}
