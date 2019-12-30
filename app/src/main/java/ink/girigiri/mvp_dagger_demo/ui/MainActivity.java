package ink.girigiri.mvp_dagger_demo.ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import javax.inject.Inject;

import ink.girigiri.mvp_dagger_demo.R;
import ink.girigiri.mvp_dagger_demo.contract.LoginContract;
import ink.girigiri.mvp_dagger_demo.di.component.DaggerLoginComponent;
import ink.girigiri.mvp_dagger_demo.di.module.LoginModule;
import ink.girigiri.mvp_dagger_demo.entity.UserEntity;
import ink.girigiri.mvp_dagger_demo.presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements LoginContract.View {
    private static final String TAG=MainActivity.class.getSimpleName();

    private EditText name_editText;
    private EditText pwd_editText;


    @Inject
    LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化dagger
        DaggerLoginComponent.builder()
                .loginModule(new LoginModule(this))
                .build()
                .inject(this);

        name_editText=findViewById(R.id.acount_et);
        pwd_editText=findViewById(R.id.pwd_et);


    }

    public void login(View view) {
        String name=name_editText.getText().toString().trim();
        String pwd=pwd_editText.getText().toString().trim();
        presenter.login(name,pwd);
    }


    @Override
    public void onSuccessed(UserEntity userEntity) {

        Log.i(TAG,"onSuccessed:"+userEntity.toString());
    }

    @Override
    public void onFailed() {
        Log.i(TAG,"登录失败");
    }

    @Override
    public void showLoading() {
        Log.i(TAG,"showLoading()");

    }

    @Override
    public void hideLoading() {
        Log.i(TAG,"hideLoading()");
    }

    @Override
    public void showErro(String erro) {
        Log.i(TAG,"Erro:"+erro);
    }
}
