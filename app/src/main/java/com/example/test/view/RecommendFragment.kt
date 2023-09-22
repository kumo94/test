package com.example.tutorial.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.test.DetailRecipe
import com.example.test.R

class RecommendFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_recommend, container, false)
        view.findViewById<LinearLayout>(R.id.recommend_layout).setOnClickListener {
            activity?.let {
                val intent = Intent(context, DetailRecipe::class.java)
                startActivity(intent)
            }
        }
        return view
    }

}