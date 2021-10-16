package com.colekainz.InflatingViewBinder.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.colekainz.InflatingViewBinder.R
import com.colekainz.InflatingViewBinder.databinding.MainFragmentBinding
import com.colekainz.InflatingViewBinder.ui.base.BaseFragment

class MainFragment : BaseFragment() {

    val binding by bind<MainFragmentBinding>()

    companion object {
        fun newInstance() = MainFragment()
    }
}