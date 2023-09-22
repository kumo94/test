package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.tutorial.PagerAdapter.PagerAdapter
import com.example.tutorial.RecyclerAdapter.RecyclerAdapter
import com.example.tutorial.view.FavoriteRecipeNavigation
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{

    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar) // toolBar를 통해 App Bar 생성
        setSupportActionBar(toolbar) //toolBar適応

        supportActionBar?.setDisplayHomeAsUpEnabled(true) //ドロアの活性化
        supportActionBar?.setHomeAsUpIndicator(R.drawable.baseline_density_medium_24) //イメージ挿入
        supportActionBar?.setDisplayShowTitleEnabled(true) //ツールバー
        supportActionBar!!.setTitle("RecipeAppSample")// タイトルを設定

        //ナビゲーションドロア生成
        drawerLayout = findViewById(R.id.drawer_layout)

        //ナビゲーションドロア内のイベント処理。
        navigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener (this)


        //RecyclerViewの取得
        val recyclerView = findViewById<RecyclerView>(R.id.rvList)

        //Adapterの設定
        val recyclerViewAdapter = RecyclerAdapter()
        recyclerView.adapter = recyclerViewAdapter

        //LayoutManagerの設定
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager



        //ページ移動のための変数
        val page = findViewById<ViewPager>(R.id.pager)
        val adapter = PagerAdapter(supportFragmentManager)
        page.adapter = adapter

        //ページタブ
        val tabLayout = findViewById<TabLayout>(R.id.tab)
        tabLayout.setupWithViewPager(page)

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
            R.id.access_home->{
                Toast.makeText(this,"ホームに戻る",Toast.LENGTH_SHORT).show()
            }
            R.id.access_recommend-> {
                Toast.makeText(this,"お気に入り一覧",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, FavoriteRecipeNavigation::class.java)
                startActivity(intent)
            }
        }
        return false
    }

}