package me.xia.project.main

import android.os.Bundle
import me.xia.project.R
import me.xia.project.base.BaseActivity

/**
 * 描述：WelcomeActivity
 * 作者：xia
 * 邮箱：weiyao.xia@gmail.com
 * 创建日期：2018/6/5 下午2:58
 */
class WelcomeActivity : BaseActivity<WelcomeContract.IView, WelcomeContract.IPresenter>(), WelcomeContract.IView {

    /**
     * 生命周期：onCreate
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_welcome)

        getPresenter()?.opened()
    }

    /**
     * 初始化Presenter
     * @return Presenter
     */
    override fun initPresenter(): WelcomeContract.IPresenter {
        return WelcomePresenter()
    }
}
