package basic.mvp.com.mvpbasicexample;

import android.graphics.PorterDuff;

/**
 * Created by Ekta on 31-05-2017.
 */

public class Model {
    Presenter presenter;

    public Model(Presenter presenter) {
        this.presenter = presenter;
    }

    public void dataFromPresnterToModel() {
        presenter.dataFromModelToPresenter();
    }
}
