package com.example.dietMenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.dietMenu.models.Ingredient
import com.example.dietMenu.models.Recipe
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recipe = Recipe(
            title = "Суп-пюре из кабачков",
            ingredients = mutableListOf(
                Ingredient("Кабачок", "1 шт."),
                Ingredient("Картофель", "2-3 шт."),
                Ingredient("Морковь", "1 шт."),
                Ingredient("Лук", "1 шт."),
                Ingredient("Соль", "по вкусу")
            ),
            text = "Лук и морковь нарезать кольцами или как вам больше нравится.\n" +
                    "\n" +
                    "Картофель и кабачок очистить и нарезать кубиками.\n" +
                    "\n" +
                    "Положить в сотейник лук и морковь, картофель и кабачки. Добавить 3 стакана бульона (овощного или мясного) или воды. Варить овощи до готовности около 20 минут, посолить по вкусу."
        )

        textView.text = recipe.toString()
    }
}
