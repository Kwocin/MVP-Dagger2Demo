package ink.girigiri.mvp_dagger_demo.presenter;

import javax.inject.Inject;

import ink.girigiri.mvp_dagger_demo.contract.LoginContract;
import ink.girigiri.mvp_dagger_demo.entity.UserEntity;

public class LoginPresenter extends BasePresenter<LoginContract.View,LoginContract.Model> {
    @Inject
    public LoginPresenter(LoginContract.View view, LoginContract.Model model) {
        super(view, model);
    }

    /**
     * login
     * @param name:user's acount
     * @param pwd:user's password
     */
    public void login(String name,String pwd){
        mView.showLoading();
        UserEntity entity=mModel.login(name,pwd);
        if (entity!=null){
            mView.onSuccessed(entity);
        }else {
            mView.onFailed();
            mView.showErro("账号或密码错误");
        }
        mView.hideLoading();
    }
}
