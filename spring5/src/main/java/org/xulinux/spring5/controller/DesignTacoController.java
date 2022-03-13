package org.xulinux.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xulinux.spring5.pojo.Ingredient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 接受对地址"/design"的请求
 *
 * @Author wfh
 * @Date 2022/3/12 下午4:35
 */
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model) {
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("1","番茄酱", Ingredient.Type.VEGGIES),
                new Ingredient("2","沙拉酱",Ingredient.Type.CHEESE)
        );

        Ingredient.Type[] types = Ingredient.Type.values();

        //将相同的type放到一起
        for (Ingredient.Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),filterByType(ingredients,type));
        }

        return "design";
    }



    // 这他妈写的啥啊
    private List<Ingredient> filterByType(List<Ingredient> ingredients, Ingredient.Type type) {
        return ingredients.stream().filter(x -> x.getType().equals(type)).collect(Collectors.toList());
    }
}
