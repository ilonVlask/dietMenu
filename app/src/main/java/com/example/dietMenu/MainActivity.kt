package com.example.dietMenu

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonRecipes.setOnClickListener {
            Log.d("tag", "Recipes were opened")
            val recipesIntent = Intent(this, RecipesListActivity::class.java)
            startActivity(recipesIntent)
        }
    }
}
