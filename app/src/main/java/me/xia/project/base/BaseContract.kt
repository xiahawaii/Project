package me.xia.project.base

/**
 * 描述：BaseContract
 * 作者：xia
 * 邮箱：weiyao.xia@gmail.com
 * 创建日期：2018/6/1 下午3:15
 */
interface BaseContract {

    interface IView {

        /**
         * 显示等待提示
         * @param msg 提示语
         */
        fun showLoading(msg: String)
    }

    interface IPresenter<V: IView> {

        /**
         * 绑定View
         * @param view 视图
         */
        fun attachView(view: V)

        /**
         * 解除View的绑定
         */
        fun detachView()

        /**
         * 获取View
         * @return 视图
         */
        fun getView(): V?
    }
}