package com.colekainz.InflatingViewBinder.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.colekainz.inflatingviewbinder.FragmentViewBinder
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass

abstract class BaseFragment: Fragment() {
    private val binder = FragmentViewBinder()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return binder.inflate(inflater, container)
    }

    fun <V : ViewBinding> bind(viewBindingKClass: KClass<V>): ReadOnlyProperty<Fragment, V> {
        return binder.bind(viewBindingKClass)
    }

    inline fun <reified V : ViewBinding> BaseFragment.bind(): ReadOnlyProperty<Fragment, V> = bind(V::class)
}