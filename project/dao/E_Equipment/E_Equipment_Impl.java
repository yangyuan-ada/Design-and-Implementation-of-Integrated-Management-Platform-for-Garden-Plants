package project.dao.E_Equipment ;
import project.entity.E_Equipment ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class E_Equipment_Impl implements E_Equipment_Dao {

    private E_Equipment  equipment ;

    @Override
    public void addInfo(E_Equipment  equipment ){
        String sql = "INSERT INTO equipment  VALUES(?,?)";
        Connection connection = equipment.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, equipment .getequipNum());
            preparedStatement.setString(2, equipment .getequipName());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteInfo(int equipNum){
        String SQL = "delete from equipment  where equipNum= ?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, equipment .getequipNum());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateInfo(E_Equipment  equipment ){
        String sql = "UPDATE equipment  SET equipNum=?,equipName=?";
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, equipment .getequipNum());
            preparedStatement.setString(2, equipment .getequipName());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<E_Equipment> findInfo(int equipNum) {
        ArrayList<E_Equipment > arrayList = new ArrayList<>();
        String SQL ="";
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = null;
            SQL = "select * from E_Equipment  where equipNum=?";
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1,equipNum);

            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                E_Equipment  E_Equipment  = new E_Equipment ();
                E_Equipment .setequipNum(resultSet.getInt("equipNum"));
                E_Equipment .setequipName(resultSet.getString("equipName"));
                arrayList.add(E_Equipment );
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }
}
