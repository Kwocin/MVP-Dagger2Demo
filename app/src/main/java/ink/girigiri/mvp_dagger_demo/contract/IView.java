package ink.girigiri.mvp_dagger_demo.contract;

public interface IView {
    void showLoading();
    void hideLoading();
    void showErro(String erro);
}
