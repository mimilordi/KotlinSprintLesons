package org.example.lesson_11

fun main() {
    val recipe1 = Recipe("Бургер с грибами и сыром", true, "Картинка", 3, "Приготовить")
    val recipe2 = Recipe("Классиесский гамбургер", false, "Картинка", 1, "Приготовить на гриле")
    val recipe3 = Recipe("Чизбургер", false, "Картинка", 2, "Приготовить быстро")

    val recipeCategory = RecipeCategory("Бургеры", "coverUrl")

    recipeCategory.categoryRecipes.add(recipe1)
    recipeCategory.categoryRecipes.add(recipe2)
    recipeCategory.categoryRecipes.add(recipe3)
    recipeCategory.showRecipeCategory()

    val ingredients1 = Ingredient("ТВОРОГ", "350 Г")
    val ingredients2 = Ingredient("КУРИНОЕ ЯЙЦО", "2 ШТУКИ")
    val ingredients3 = Ingredient("ПШЕНИЧНАЯ МУКА", "6 С.ЛОЖЕК")
    val ingredients4 = Ingredient("ПОДСОЛНЕЧНОЕ МАСЛО", "5 С.ЛОЖЕК")
    val ingredients5 = Ingredient("САХАР", "2 С.ЛОЖЕК")
    val ingredients6 = Ingredient("Творог", "2 ШТУКИ")

    recipe1.addIngredient(ingredients1)
    recipe1.addIngredient(ingredients2)
    recipe1.addIngredient(ingredients3)
    recipe1.addIngredient(ingredients4)
    recipe1.addIngredient(ingredients5)
    recipe1.addIngredient(ingredients6)
    recipe1.showRecipe()
}

class RecipeCategory(
    val recipeCategoryTitle: String,
    val recipeCategoryCover: String,
    val categoryRecipes: MutableList<Recipe> = mutableListOf()
) {

    fun showRecipeCategory() {
        println("Изображение: $recipeCategoryCover")
        println("Заголовок: $recipeCategoryTitle")
        println("Список рецептов: ")
        categoryRecipes.forEach { println(it.recipeName) }
    }
}

class Ingredient(
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

    var ingredients = mutableListOf<Ingredient>()

    fun addIngredient(ingredient: Ingredient) {
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