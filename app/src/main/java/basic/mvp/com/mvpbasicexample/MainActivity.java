package basic.mvp.com.mvpbasicexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter= new Presenter(this);

        Button button= (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.dataFromViewToPresenter();
            }
        });

    }

    public void dataFromPresenterToView() {
        Toast.makeText(this,"Saved",Toast.LENGTH_SHORT).show();
    }
}