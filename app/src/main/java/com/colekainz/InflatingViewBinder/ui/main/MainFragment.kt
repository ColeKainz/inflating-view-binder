package com.colekainz.InflatingViewBinder.ui.main

import com.colekainz.InflatingViewBinder.databinding.MainFragmentBinding
import com.colekainz.InflatingViewBinder.ui.base.BaseFragment

class MainFragment : BaseFragment() {

    val binding by viewBinding<MainFragmentBinding>()

    companion object {
        fun newInstance() = MainFragment()
    }
}