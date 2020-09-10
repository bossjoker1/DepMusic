package com.example.depmusic.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.depmusic.R;

public class InputView extends FrameLayout {
    private int inputIcon;
    private String inputHint;
    private boolean isPassword;

    private View mView;
    private ImageView mIvIcon;
    private EditText mEtInput;

    public InputView(@NonNull Context context) {
        super(context);
        init(context,null);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }
    /**
     * 初始化方法
     * @param attr
     */
    private void init(Context context,AttributeSet attr) {
        if (attr == null) return;
        //获取自定义属性
        TypedArray typedArray= context.obtainStyledAttributes(attr, R.styleable.InputView);
        inputIcon = typedArray.getResourceId(R.styleable.InputView_input_icon,R.mipmap.logo);
        inputHint = typedArray.getNonResourceString(R.styleable.InputView_input_hint);
        isPassword = typedArray.getBoolean(R.styleable.InputView_is_password, false);
        typedArray.recycle();
        //绑定layout布局
        mView = LayoutInflater.from(context).inflate(R.layout.input_view,this,false);
        mIvIcon = mView.findViewById(R.id.iv_icon);
        mEtInput = mView.findViewById(R.id.et_input);

        //布局关联属性

        mIvIcon.setImageResource(inputIcon);
        mEtInput.setHint(inputHint);
        //密码形式
        mEtInput.setInputType(isPassword ? InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD : InputType.TYPE_CLASS_PHONE);

        //放入到inputView里面
        addView(mView);
    }

    /**
     * 返回输入的内容
     * @return
     */
    public String getInputStr(){//清空格
        return mEtInput.getText().toString().trim();
    }
}
