package connection.mySQLConnection.repository;

import connection.mySQLConnection.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,String> {
}
