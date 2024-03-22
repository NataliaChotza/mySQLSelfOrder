package connection.mySQLConnection.controller;

import connection.mySQLConnection.model.Item;
import connection.mySQLConnection.repository.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MySQLConnectionController {
    private ItemRepository itemRepository;

    @GetMapping("/menu")
    public @ResponseBody Iterable<Item> getAll(){
        return itemRepository.findAll();
    }
}
