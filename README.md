# inflating-view-binder

Finally! A fragment view binder that uses inflate!! This is a truely one-line view binding solution, provided you make use of a base fragment.

Setting up the base code is as easy as adding the follow to your base fragment:

```
abstract class BaseFragment: Fragment() {
    ...
    private val binder = FragmentViewBinder()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return binder.inflate(inflater, container)
    }

    fun <V : ViewBinding> bind(viewBindingKClass: KClass<V>): ReadOnlyProperty<Fragment, V> {
        return binder.bind(viewBindingKClass)
    }

    inline fun <reified V : ViewBinding> BaseFragment.bind(): ReadOnlyProperty<Fragment, V> = bind(V::class)
    ...
}
```

With this you fragments can be as neat and clean as:

```
class MainFragment : BaseFragment() {
    val binding by bind<MainFragmentBinding>()
    ...
}
```

And that's it!!!
