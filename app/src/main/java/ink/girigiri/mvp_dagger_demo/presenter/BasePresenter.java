package ink.girigiri.mvp_dagger_demo.presenter;

import ink.girigiri.mvp_dagger_demo.contract.IModel;
import ink.girigiri.mvp_dagger_demo.contract.IView;

/**
 * Presenter 基类
 * @param <V>
 * @param <M>
 */
public class BasePresenter <V extends IView,M extends IModel> implements IPresenter {

    protected V mView;
    protected M mModel;

    public BasePresenter(V v, M m){
        mView = v;
        mModel = m;
    }

    public V getmView() {
        return mView;
    }

    public void setmView(V mView) {
        this.mView = mView;
    }

    public M getmModel() {
        return mModel;
    }

    public void setmModel(M mModel) {
        this.mModel = mModel;
    }
}
