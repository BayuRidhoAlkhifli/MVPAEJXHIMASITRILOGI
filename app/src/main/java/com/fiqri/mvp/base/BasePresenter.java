package com.fiqri.mvp.base;

public interface BasePresenter<T extends BaseView> {

    void onAttach(T view);
    void onDettach();
}
