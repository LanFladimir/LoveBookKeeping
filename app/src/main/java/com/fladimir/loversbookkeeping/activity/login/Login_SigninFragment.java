package com.fladimir.loversbookkeeping.activity.login;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fladimir.jutils.tools.PatternUtil;
import com.fladimir.jutils.ui.toast.Toasty;
import com.fladimir.loversbookkeeping.R;
import com.fladimir.loversbookkeeping.activity.main.MainActivity;


/**
 * Created by NingJiang on 2017/6/1.
 * Class Note:
 */

public class Login_SigninFragment extends Fragment implements View.OnClickListener {
    private TextInputLayout signin_name;
    private TextInputLayout signin_passwd;
    private Button signin_sign;
    private EditText signin_name_et, signin_passwd_et;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login_signin, null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        signin_name = (TextInputLayout) view.findViewById(R.id.signin_name);
        signin_passwd = (TextInputLayout) view.findViewById(R.id.signin_passwd);
        signin_sign = (Button) view.findViewById(R.id.signin_sign);
        signin_sign.setOnClickListener(this);

        signin_name_et = signin_name.getEditText();
        signin_passwd_et = signin_passwd.getEditText();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signin_sign:
                String name = signin_name_et.getText().toString();
                String pass = signin_passwd_et.getText().toString();
                if (TextUtils.isEmpty(name)) {
                    signin_name.setError("用户名不能为空!");
                    return;
                } else if (!PatternUtil.isMobile(name) && !PatternUtil.isEmail(name)) {
                    signin_name.setError("请填入正确的邮件或电话!");
                    return;
                } else signin_name.setErrorEnabled(false);

                if (TextUtils.isEmpty(pass)) {
                    signin_passwd.setError("密码不能为空!");
                    return;
                } else {
                    signin_name.setErrorEnabled(false);
                    signin_passwd.setErrorEnabled(false);
                    Toasty.withTheme(getActivity(),
                            getString(R.string.login_success), R.mipmap.ic_launcher, Color.GRAY);
                    //Toasty.success(getActivity(), getString(R.string.login_success)).show();
                    signin_passwd.postDelayed(() -> {
                        startActivity(new Intent(getActivity(), MainActivity.class));
                    }, Toast.LENGTH_SHORT);
                }
                break;
        }
    }
}
