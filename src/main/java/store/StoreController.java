package store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class StoreController {

    private StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/stores")
    public List<Store> findAllStores() {
        return storeService.findAllStores();
    }

    @GetMapping("/stores/{id}")
    public Store findStore(@PathVariable int id) {
        return storeService.findStore(id);
    }

    @PostMapping("/stores")
    public void saveStore(@RequestBody Store store) {
        storeService.saveStore(store);
    }

    @DeleteMapping("/stores/{id}")
    public void deleteStore(@PathVariable int id) {
        storeService.deleteStore(id);
    }
}
