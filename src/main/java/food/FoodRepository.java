package food;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class FoodRepository {
    private Map<Integer, Food> db = new HashMap<>();
    private int id = 1;

    // 음식 조회
    public Food findFood(int idx) {
        return db.get(idx);
    }

    // 모든 음식 조회
    public List<Food> findAllFoods() {
        // map의 value들만 모아서 arrayList로 만들기!
        return new ArrayList<>(db.values());

    }

    // 음식 등록
    public void save(Food food) {
        db.put(id++, food);
    }

    // 음식 삭제
    public void delete(int id) {
        db.remove(id);
    }

}
