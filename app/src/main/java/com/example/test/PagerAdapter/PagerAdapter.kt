package com.example.tutorial.PagerAdapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tutorial.view.FavoriteFragment
import com.example.tutorial.view.RecommendFragment

class PagerAdapter(fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    // 今回は固定の数を返す
    override fun getCount(): Int = 2
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                RecommendFragment()
            }
            1 -> {
                FavoriteFragment()
            }
            else -> {
                RecommendFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        if (position == 0) {
            return "RECOMMEND"
        }else {
            return "FAVORITE"
        }
    }
}