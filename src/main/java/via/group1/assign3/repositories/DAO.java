package via.group1.assign3.repositories;

import org.springframework.stereotype.Repository;

import via.group1.assign3.protobuf.AnimalId;
import via.group1.assign3.protobuf.InvolvedAnimals;
import via.group1.assign3.protobuf.InvolvedProducts;
import via.group1.assign3.protobuf.ProductId;

@Repository
public class DAO {

    public InvolvedAnimals retrieveRegNums(ProductId request) {

        InvolvedAnimals involvedAnimals;

        // Todo

        return involvedAnimals;
    }

    public InvolvedProducts retrieveProdNums(AnimalId request) {

        InvolvedProducts involvedProducts;

        // Todo

        return involvedProducts;
    }

}
