package com.example.test


import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import org.json.JSONArray


class DetailRecipe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_recipe)

        // ツールバー生成
        val toolbar: Toolbar = findViewById(com.example.test.R.id.tool_bar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true) //戻るボタン
        supportActionBar!!.setTitle("洋食屋さんのハンバーグ")

        //お気に入りボタン
        val click_btn = findViewById<ImageButton>(R.id.recommend_button)
        click_btn.setOnClickListener {
//            if (){
//
//                click_btn.setImageResource(R.drawable.baseline_star_border_24)
//            }else{
//
//                click_btn.setImageResource(R.drawable.baseline_star_24)
//            }
        }

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}