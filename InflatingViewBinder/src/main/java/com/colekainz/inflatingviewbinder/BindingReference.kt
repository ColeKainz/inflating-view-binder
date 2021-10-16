package com.colekainz.inflatingviewbinder

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewbinding.ViewBinding

internal class BindingReference<V : ViewBinding>(_inflate: InflateViewBinding<V>) {
    var binding: V? = null
    var inflate: InflateViewBinding<V> = { inflater, viewGroup, attachToParent ->
        binding = _inflate(inflater, viewGroup, attachToParent)
        binding!!
    }

    fun registerUnbinder(fragment: Fragment) {
        fragment.parentFragmentManager.registerFragmentLifecycleCallbacks(object : FragmentManager.FragmentLifecycleCallbacks() {
            override fun onFragmentViewDestroyed(fm: FragmentManager, f: Fragment) {
                super.onFragmentViewDestroyed(fm, f)
                binding = null
            }
        }, false)
    }
}