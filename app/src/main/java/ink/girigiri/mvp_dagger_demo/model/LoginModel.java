package ink.girigiri.mvp_dagger_demo.model;


import ink.girigiri.mvp_dagger_demo.contract.LoginContract;
import ink.girigiri.mvp_dagger_demo.entity.UserEntity;

/**
 *  Login Model
 */
public class LoginModel implements LoginContract.Model {
    /**
     * 真正去做login
     * @param name
     * @param pwd
     * @return
     */
    @Override
    public UserEntity login(String name, String pwd) {
        //网络操作
        if (name.equals("pulis")&&pwd.equals("root"))
            return new UserEntity("pulis","root");
        return null;
    }
}
