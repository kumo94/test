package com.example.tutorial.view

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.test.MainActivity
import com.example.test.R
import com.google.android.material.navigation.NavigationView

class FavoriteRecipeNavigation : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.favorite_tool_bar) // toolBarを通じてApp bar生成
        setSupportActionBar(toolbar) //toolBar適用

        supportActionBar?.setDisplayHomeAsUpEnabled(true) //ドロアの活性化
        supportActionBar?.setHomeAsUpIndicator(R.drawable.baseline_density_medium_24) //イメージ挿入
        supportActionBar?.setDisplayShowTitleEnabled(true) //ツールバー
        supportActionBar!!.setTitle("RecipeAppSample")// タイトルを設定

        //ナビゲーションドロア生成
        drawerLayout = findViewById(R.id.favorite_drawer_layout)

        //ナビゲーションドロア内のイベント処理。
        navigationView = findViewById(R.id.favorite_nav_view)
        navigationView.setNavigationItemSelectedListener (this)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // メニューのインフレート(後述)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // ツールバーのアイテムidは別で実行されるように設定
        when(item!!.itemId){
            android.R.id.home->{
                drawerLayout.openDrawer(GravityCompat.START)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    // ドロア内のボタンクリック時、画面遷移。
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.access_home ->{
                Toast.makeText(this,"ホームに戻る", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.access_recommend -> {
                Toast.makeText(this,"お気に入り一覧", Toast.LENGTH_SHORT).show()
            }
        }
        return false
    }

}