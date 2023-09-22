package com.example.tutorial.PagerAdapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class PagerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val layoutId = arguments?.getInt(KEY)
        return layoutId?.let {
            inflater.inflate(it, null)
        } ?: super.onCreateView(inflater, container, savedInstanceState)
    }


    companion object {
        private const val KEY = "key"
        fun newInstance(layoutId: Int): PagerFragment {
            val bundle = Bundle().also {
                it.putInt(KEY, layoutId)
            }
            return PagerFragment().also {
                it.arguments = bundle
            }
        }
    }
}