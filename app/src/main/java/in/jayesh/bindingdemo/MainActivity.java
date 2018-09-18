package in.jayesh.bindingdemo;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import in.jayesh.bindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        context=getApplicationContext();

        String[] name={"India","Australia","USA","Canada"};

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        mBinding.recyclerView.setLayoutManager(layoutManager);
        CustomAdapter adapter=new CustomAdapter(name);
        mBinding.recyclerView.setAdapter(adapter);
    }
}
