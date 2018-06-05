package me.xia.project.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import me.xia.project.R;

/**
 * 描述：MyItemTitle
 * 作者：xia
 * 邮箱：weiyao.xia@gmail.com
 * 创建日期：2018/6/5 下午2:58
 */
public class MyItemTitle extends LinearLayout {

    public MyItemTitle(Context context) {
        this(context, null);
    }

    public MyItemTitle(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyItemTitle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        // 绑定控件
        LayoutInflater.from(context).inflate(R.layout.widget_item_title, this, true);
        TextView mItemName = findViewById(R.id.mItemTitle);

        // 获取属性
        if (attrs != null) {
            String mName = null;
            TypedArray mTypedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.MyItemTitle, defStyleAttr, 0);
            for (int i = 0; i < mTypedArray.getIndexCount(); i++) {
                int attr = mTypedArray.getIndex(i);
                switch (attr) {
                    case R.styleable.MyItemTitle_itemName:
                        mName = mTypedArray.getString(attr);
                        break;
                }
            }
            mTypedArray.recycle();

            // 赋值
            mItemName.setText(mName);
        }
    }
}
