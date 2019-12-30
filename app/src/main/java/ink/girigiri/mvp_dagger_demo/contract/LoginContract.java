package ink.girigiri.mvp_dagger_demo.contract;

import ink.girigiri.mvp_dagger_demo.entity.UserEntity;

/**
 * Login 模块的一些接口
 */
public interface LoginContract {
    interface View extends IView{
        void onSuccessed(UserEntity userEntity);
        void onFailed();
    }
    interface Model extends IModel{
        UserEntity login(String name, String pwd);

    }
}
