package com.oncreate.estimatelist.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.oncreate.estimatelist.MainApp;
import com.oncreate.estimatelist.R;
import com.oncreate.estimatelist.general.Const;
import com.oncreate.estimatelist.mvp.ListContract;
import com.oncreate.estimatelist.objects.Cell;
import com.oncreate.estimatelist.presenters.ListPresenter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements ListContract.ListView {

    @Inject
    ListPresenter listPresenter;
    @BindView(R.id.et_amount_of_par_threads)
    EditText etThreads;
    @BindView(R.id.et_amount_of_operation)
    EditText etOperations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MainApp)getApplication()).getAppComponent().inject(this);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.but_start_calc)
    public void startCalculation(){
        listPresenter.start(parseIntFromEt(etOperations), parseIntFromEt(etThreads));
    }

    @OnClick(R.id.but_stop_calc)
    public void stopCalculation(){
        listPresenter.stop();
    }

    private int parseIntFromEt(EditText et){
        return Integer.parseInt(et.getText().toString());
    }

    @Override
    protected void onStart() {
        listPresenter.attachView(this);
        super.onStart();
    }

    @Override
    protected void onStop() {
        listPresenter.detachView();
        super.onStop();
    }

    @Override
    public void dataIsAvailable(List<Cell> list) {
        Log.d(Const.LOG.VIEW, "dataIsAvailable");

    }

    @Override
    public void estimateIsNotComplete() {
        Log.d(Const.LOG.VIEW, "estimateIsNotComplete");
        Toast.makeText(this, "Estimate is not complete!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void estimateComplete() {
        Log.d(Const.LOG.VIEW, "estimateComplete");
        Toast.makeText(this, "Estimate completed!", Toast.LENGTH_SHORT).show();
    }
}
