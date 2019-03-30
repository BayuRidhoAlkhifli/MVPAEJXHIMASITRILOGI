package com.fiqri.mvp;

import com.fiqri.mvp.base.BasePresenter;
import com.fiqri.mvp.model.ResultModel;

/**
 * Created by fiqri on 22/01/18.
 */

public class MainPresenter implements BasePresenter<MainView> {

    MainView mainView;

    @Override
    public void onAttach(MainView view) {
        mainView = view;
    }

    public void calculate(String inputanSatu, String inputanDua) {
        if (inputanSatu.isEmpty() || inputanDua.isEmpty()) {
            mainView.Error();

        } else {
            double valueSatu = Double.parseDouble(inputanSatu);
            double valueDua = Double.parseDouble(inputanDua);
            double total = valueSatu * valueDua;
            ResultModel data = new ResultModel(String.valueOf(total));
            mainView.Success(data);
        }
    }

    @Override
    public void onDettach() {
        mainView = null;
    }
}
