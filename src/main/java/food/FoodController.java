package food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FoodController {

    @Autowired
    private FoodService foodService;

    // 전체 메뉴 조회
    @GetMapping("/foods")
    public List<Food> findAllFoods() {
        return foodService.findAllFoods();
    }

    // 개별 메뉴 조회
    @GetMapping("/foods/{id}")
    public Food findFood(@PathVariable("id") int id) {
        return foodService.findFood(id);
    }

    // 메뉴 등록
    @PostMapping("/foods")
    public void saveFood(@RequestBody Food food) {
        // 객체로 받아서 객체로 돌려줌
        foodService.saveFood(food);
    }


    // 메뉴 삭제
    @DeleteMapping("/foods/{id}")
    public void deleteFood(@PathVariable("id") int id) {
        foodService.deleteFood(id);
    }
}
