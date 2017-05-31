package basic.mvp.com.mvpbasicexample;

/**
 * Created by Ekta on 31-05-2017.
 */

public class Presenter {
    MainActivity mainActivity;
    Model model;

    public Presenter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        model = new Model(this);
    }


    public void dataFromViewToPresenter() {
        model.dataFromPresnterToModel();
    }

    public void dataFromModelToPresenter() {
        mainActivity.dataFromPresenterToView();
    }
}
