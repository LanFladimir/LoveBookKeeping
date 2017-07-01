package com.fladimir.loversbookkeeping.activity.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.fladimir.jutils.tools.PatternUtil;
import com.fladimir.loversbookkeeping.R;


/**
 * Created by NingJiang on 2017/6/1.
 * Class Note:
 */

public class Login_SignupFragment extends Fragment implements View.OnClickListener {
    private TextInputLayout signup_name, signup_passwd;
    private Button signup_sign;
    private ImageView imageView1, imageView2, imageView3, imageView4;
    private EditText signup_name_et, signup_passwd_et;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login_signup, null);
        initView(view);
        /*AndroidBug5497Workaround.assistActivity(getActivity());*/
        return view;
    }

    private void initView(View view) {
        signup_name = (TextInputLayout) view.findViewById(R.id.signup_name);
        signup_passwd = (TextInputLayout) view.findViewById(R.id.signup_passwd);
        signup_sign = (Button) view.findViewById(R.id.signup_sign);
        imageView1 = (ImageView) view.findViewById(R.id.imageView1);
        imageView2 = (ImageView) view.findViewById(R.id.imageView2);
        imageView3 = (ImageView) view.findViewById(R.id.imageView3);
        imageView4 = (ImageView) view.findViewById(R.id.imageView4);

        signup_sign.setOnClickListener(this);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);


        //signup_name.setHintTextAppearance(R.style.sign_input);
        signup_name.setHint(getString(R.string.emailorphone));
        signup_name_et = signup_name.getEditText();
        signup_passwd_et = signup_passwd.getEditText();

        //signup_passwd.setHintTextAppearance(R.style.sign_input)
        signup_passwd.setHint(getString(R.string.password));

    /*    signup_name_et.setOnFocusChangeListener(this);
        signup_passwd_et.setOnFocusChangeListener(this);*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signup_sign:
                String name = signup_name_et.getText().toString();
                String pass = signup_passwd_et.getText().toString();

                if (TextUtils.isEmpty(name)) {
                    signup_name.setError("用户名不能为空!");
                    return;
                } else if (!PatternUtil.isMobile(name) && !PatternUtil.isEmail(name)) {
                    signup_name.setError("请填入正确的邮件或电话!");
                    return;
                } else signup_name.setErrorEnabled(false);

                if (TextUtils.isEmpty(pass)) {
                    signup_passwd.setError("密码不能为空!");
                    return;
                } else {
                    signup_name.setErrorEnabled(false);
                    signup_passwd.setErrorEnabled(false);
                    //Toasty.success(getActivity(), "Creat Success!").show();
                }
                break;
        }
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        if (hidden) {
            ((LoginActivity) getActivity()).hideInput();
        }
        super.onHiddenChanged(hidden);
    }

    //提示太频繁  放弃该方式
    /*@Override
    public void onFocusChange(View view, boolean hasFocus) {
        if (!hasFocus)
            switch (view.getId()) {
                case R.id.signup_name_et:
                    String name = signup_name.getEditText().getText().toString();
                    if (TextUtils.isEmpty(name))
                        signup_name.setError("用户名不能为空!");
                    else if (!PatternUtil.isMobile(name) && !PatternUtil.isEmail(name))
                        //Toasty.error(getActivity(), "输入内容不符!").show();
                        signup_name.setError("请填入正确的邮件或电话!");
                    break;
                case R.id.signup_passwd_et:
                    String pass = signup_passwd_et.getText().toString();
                    if (TextUtils.isEmpty(pass))
                        signup_passwd.setError("密码不能为空!");
                    break;
                default:
            }
    }*/
}