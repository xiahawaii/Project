package me.xia.project.main

import me.xia.project.base.BasePresenter

/**
 * 描述：WelcomePresenter
 * 作者：xia
 * 邮箱：weiyao.xia@gmail.com
 * 创建日期：2018/6/5 下午2:59
 */
class WelcomePresenter : BasePresenter<WelcomeContract.IView>(), WelcomeContract.IPresenter {

    /**
     * 界面已打开
     */
    override fun opened() {
    }
}