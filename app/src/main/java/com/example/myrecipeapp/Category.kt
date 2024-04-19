package com.example.myrecipeapp

data class Category(val strMeal:String,
                    val strMealThumb:String,
                    val idMeal:String
)

data class CategoriesResponse(val meals: List<Category>)