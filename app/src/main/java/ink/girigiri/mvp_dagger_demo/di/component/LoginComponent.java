package ink.girigiri.mvp_dagger_demo.di.component;

import dagger.Component;

import ink.girigiri.mvp_dagger_demo.di.module.LoginModule;
import ink.girigiri.mvp_dagger_demo.di.scope.ActivityScope;
import ink.girigiri.mvp_dagger_demo.ui.MainActivity;

@ActivityScope
@Component(modules ={LoginModule.class})
public interface LoginComponent {
     void inject(MainActivity activity);
}
