package store;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StoreRepository {
    private Map<Integer, Store> db = new HashMap<>();
    private int id = 1;

    // 가게 조회
    public Store findStore(int id) {
        return db.get(id);
    }

    // 모든 가게 조회
    public List<Store> findAllStores() {
        return new ArrayList<>(db.values());
    }

    // 가게 등록
    public void save(Store store) {
        db.put(id++, store);
    }

    // 가게 삭제
    public void delete(int id) {
        db.remove(id);
    }
}
