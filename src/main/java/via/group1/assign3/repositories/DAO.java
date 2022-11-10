package via.group1.assign3.repositories;

import org.springframework.stereotype.Repository;

import via.group1.assign3.protobuf.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DAO {

    private final String URL = "postgres://postgres:password@localHost:5432/slaughterhouse";
    private final String USER = "postgres";
    private final String PASSWORD = "password";

    private Connection connection;

     private Connection connect(){
         if (connection == null){
             try {
                 connection = DriverManager.getConnection(URL, USER, PASSWORD);
             } catch (SQLException e) {
                 e.printStackTrace();
             }
         }
         return connection;
     }


    public InvolvedAnimals retrieveRegNums(ProductId request){

        List<Integer> involvedAnimalsList = new ArrayList<>();

        try (Connection connection = connect()){
            PreparedStatement preparedStatement = connection.prepareStatement("select animal_id from parts_in_tray where product_id = " + request);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                involvedAnimalsList.add(resultSet.getInt(1));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        InvolvedAnimals involvedAnimals = InvolvedAnimals.newBuilder().addAllIdOfAnimal(involvedAnimalsList).build();

        return involvedAnimals;
    }

    public InvolvedProducts retrieveProdNums(AnimalId request) {

        List<Integer> involvedProductsList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select intray.product_id from parts_in_tray intray join animal_part parts using (part_id) where parts.animal_id = " + request);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                involvedProductsList.add(resultSet.getInt(1));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        InvolvedProducts involvedProducts = InvolvedProducts.newBuilder().addAllIdOfProduct(involvedProductsList).build();

        return involvedProducts;
    }

}
