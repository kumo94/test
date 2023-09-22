package com.example.tutorial.RecyclerAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R


class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var data = listOf<String>("肉じゃが","ラーメン","味噌汁","寿司","牛丼","スパゲッティ")

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textView: TextView
        init {
            textView = view.findViewById(R.id.recommend_name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.activity_main, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item = data[position]
        viewHolder.textView.text = item
    }

    override fun getItemCount() = data.size
}