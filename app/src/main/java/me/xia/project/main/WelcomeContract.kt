package me.xia.project.main

import me.xia.project.base.BaseContract

/**
 * 描述：WelcomeContract
 * 作者：xia
 * 邮箱：weiyao.xia@gmail.com
 * 创建日期：2018/6/5 下午2:58
 */
interface WelcomeContract {

    interface IView: BaseContract.IView

    interface IPresenter: BaseContract.IPresenter<IView> {

        /**
         * 界面已打开
         */
        fun opened()
    }
}