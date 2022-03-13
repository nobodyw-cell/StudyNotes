package org.xulinux.spring5.pojo;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/3/12 下午8:58
 */
@Component
public class Taco {

    @NotNull
    @Size(min = 5,message = "名字必须大于5个字符")
    private String tacoName;

    @Size(min = 1,message = "至少选一个配料")
    private List<String> ingredients;

    public Taco() {
    }

    public Taco(String tacoName) {
        this.tacoName = tacoName;
    }


    public String getTacoName() {
        return tacoName;
    }

    public void setTacoName(String tacoName) {
        this.tacoName = tacoName;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
