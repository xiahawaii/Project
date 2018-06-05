package me.xia.project.base

import java.lang.ref.WeakReference

/**
 * 描述：BasePresenter
 * 作者：xia
 * 邮箱：weiyao.xia@gmail.com
 * 创建日期：2018/6/1 下午3:22
 */
open class BasePresenter<V : BaseContract.IView>: BaseContract.IPresenter<V> {

    private var mWeakReference: WeakReference<V>? = null

    /**
     * 绑定View
     * @param view 视图
     */
    override fun attachView(view: V) {
        mWeakReference = WeakReference(view)
    }

    /**
     * 解除View的绑定
     */
    override fun detachView() {
        mWeakReference?.clear()
        mWeakReference = null
    }

    /**
     * 获取View
     * @return 视图
     */
    override fun getView(): V? {
        return mWeakReference?.get()
    }
}