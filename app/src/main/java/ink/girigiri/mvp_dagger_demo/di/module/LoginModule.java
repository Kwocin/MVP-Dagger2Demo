package ink.girigiri.mvp_dagger_demo.di.module;


import dagger.Module;
import dagger.Provides;

import ink.girigiri.mvp_dagger_demo.contract.LoginContract;
import ink.girigiri.mvp_dagger_demo.di.scope.ActivityScope;
import ink.girigiri.mvp_dagger_demo.model.LoginModel;
import ink.girigiri.mvp_dagger_demo.ui.MainActivity;

@Module
public class LoginModule {
    private MainActivity view;

    public LoginModule (MainActivity activity){
        view = activity;
    }
    @ActivityScope
    @Provides
    public LoginContract.View providerLoginView(){
        return view;
    }
    @ActivityScope
    @Provides
    public LoginContract.Model providerLoginModel(){
        return new LoginModel();
    }
}
