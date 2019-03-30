package com.fiqri.mvp;

import com.fiqri.mvp.base.BaseView;
import com.fiqri.mvp.model.ResultModel;

/**
 * Created by fiqri on 22/01/18.
 */

public interface MainView extends BaseView {

    void Success(ResultModel data);
    void Error();

}
