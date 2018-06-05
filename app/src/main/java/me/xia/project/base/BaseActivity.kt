package me.xia.project.base

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import android.os.Build
import android.view.View


/**
 * 描述：BaseActivity
 * 作者：xia
 * 邮箱：weiyao.xia@gmail.com
 * 创建日期：2018/6/1 下午3:25
 */
abstract class BaseActivity<V : BaseContract.IView, out P : BaseContract.IPresenter<V>> : AppCompatActivity(), BaseContract.IView {

    /**
     * Presenter引用
     */
    private var mPresenter: P? = null

    /**
     * 生命周期：onCreate
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 设置状态栏透明
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS or WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }

        mPresenter = initPresenter()
    }

    /**
     * 生命周期：onStart
     */
    override fun onStart() {
        super.onStart()

        @Suppress("UNCHECKED_CAST")
        mPresenter?.attachView(this as V)
    }

    /**
     * 生命周期：onStart
     */
    override fun onDestroy() {
        mPresenter?.detachView()
        super.onDestroy()
    }

    /**
     * 显示等待提示
     * @param msg 提示语
     */
    override fun showLoading(msg: String) {
    }

    /**
     * 获取Presenter
     */
    fun getPresenter(): P? {
        return mPresenter
    }

    /**
     * 初始化Presenter
     * @return Presenter
     */
    abstract fun initPresenter(): P
}