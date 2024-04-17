package store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StoreService {
    private StoreRepository storeRepository;

    @Autowired
    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public Store findStore(int id) {
        return storeRepository.findStore(id);
    }

    public List<Store> findAllStores() {
        return storeRepository.findAllStores();
    }

    public void saveStore(Store store) {
        storeRepository.save(store);
    }

    public void deleteStore(int id) {
        storeRepository.delete(id);
    }
}
