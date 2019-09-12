package com.example.dietMenu.models

data class Recipe(val title: String, val ingredients: MutableList<Ingredient>, val text: String){

    override fun toString(): String {
        val result = "${this.title} \n \n "
        var ingredientsTitle = "Ingredients: \n "
        ingredients.forEach { ingredientsTitle += "${it.name} - ${it.measure}\n" }
        return result + ingredientsTitle + this.text
    }
}