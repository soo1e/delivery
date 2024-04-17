package store;

import food.Food;
import food.FoodRepository;

import java.util.List;

public class Store {
    private String name;
    private List<Food> menu;

    private FoodRepository foodRepository;

    public Store(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // 가게의 메뉴 조회
    public List<Food> getMenu() {
        return foodRepository.findAllFoods();
    }

    // 가게에 메뉴 추가
    public void addMenu(Food food) {
        foodRepository.save(food);
    }
}
