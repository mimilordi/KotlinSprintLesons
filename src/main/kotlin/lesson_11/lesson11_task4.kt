package org.example.lesson_11

fun main() {
    val recipeCategory = RecipeCategory(
        "Бургеры", "coverUrl",
        listOf("Чизбургер", "Классиесский гамбургер", "Бургер с грибами и сыром")
    )
    recipeCategory.showRecipeCategory()

    val ingredients1 = Ingredients("ТВОРОГ", "350 Г")
    val ingredients2 = Ingredients("КУРИНОЕ ЯЙЦО", "2 ШТУКИ")
    val ingredients3 = Ingredients("ПШЕНИЧНАЯ МУКА", "6 С.ЛОЖЕК")
    val ingredients4 = Ingredients("ПОДСОЛНЕЧНОЕ МАСЛО", "5 С.ЛОЖЕК")
    val ingredients5 = Ingredients("САХАР", "2 С.ЛОЖЕК")
    val ingredients6 = Ingredients("Творог", "2 ШТУКИ")

    val recipe = Recipe("Бургер с грибами и сыром", true, "Картинка", 3, "Приготовить")

    recipe.addIngredient(ingredients1)
    recipe.addIngredient(ingredients2)
    recipe.addIngredient(ingredients3)
    recipe.addIngredient(ingredients4)
    recipe.addIngredient(ingredients5)
    recipe.addIngredient(ingredients6)
    recipe.showRecipe()
}

class RecipeCategory(
    val recipeCategoryTitle: String,
    val recipeCategoryCover: String,
    val categoryRecipes: List<String>
) {
    fun showRecipeCategory() {
        println("Изображение: $recipeCategoryCover")
        println("Заголовок: $recipeCategoryTitle")
        println("Список рецептов:")
        categoryRecipes.forEach { println(it) }
    }
}

class Ingredients(
    val ingredientName: String,
    val dosage: String
)

class Recipe(
    val recipeName: String,
    var inFavorites: Boolean = false,
    val recipeCover: String,
    val portions: Int,
    val instruction: String,
) {
    fun addFavorites() {
        println("Блюдо $recipeName добавлено в избранное")
        inFavorites = true
    }

    fun removeFromFavorites() {
        println("Блюдо $recipeName удалено из избранного")
        inFavorites = false
    }

    var ingredients = mutableListOf<Ingredients>()

    fun addIngredient(ingredient: Ingredients) {
        ingredients.add(ingredient)
    }

    fun showRecipe() {
        println(inFavorites)
        println(recipeName)
        println(recipeCover)
        println(portions)
        ingredients.forEach {
            println("${it.ingredientName.padEnd(20)} ${it.dosage.padStart(10)}")
        }
        println(instruction)
    }
}