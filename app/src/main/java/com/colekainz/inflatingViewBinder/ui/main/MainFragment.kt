package com.colekainz.inflatingViewBinder.ui.main

import com.colekainz.inflatingViewBinder.databinding.MainFragmentBinding
import com.colekainz.inflatingViewBinder.ui.base.BaseFragment

class MainFragment : BaseFragment() {

    val binding by viewBinding<MainFragmentBinding>()

    companion object {
        fun newInstance() = MainFragment()
    }
}