package dataCodeController.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dataCodeController.Model.DataFirst;

@Repository
public interface DataFirstControllerDao extends CrudRepository<DataFirst, Integer> {

}
