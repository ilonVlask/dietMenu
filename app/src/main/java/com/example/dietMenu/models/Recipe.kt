package com.example.dietMenu.models

import com.example.dietMenu.utils.Diets

data class Recipe(val title: String, val ingredients: List<Ingredient>, val description: String, val diets: List<Diets>){

    override fun toString(): String {
        val result = "${this.title} \n \n "
        var ingredientsTitle = "Ingredients: \n "
        ingredients.forEach { ingredientsTitle += "${it.name} - ${it.measure}\n" }
        return result + ingredientsTitle + this.description
    }
}