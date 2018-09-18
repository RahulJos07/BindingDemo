package in.jayesh.bindingdemo;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.jayesh.bindingdemo.databinding.CustomLayoutBinding;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

CustomLayoutBinding mBinding;


    String[] name;

    public CustomAdapter(String[] name) {
        this.name=name;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mBinding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.custom_layout,parent,false);
        return new ViewHolder(mBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
        mBinding.countryName.setText(name[position]);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CustomLayoutBinding mBinding;

        public ViewHolder(CustomLayoutBinding mBinding) {
            super(mBinding.getRoot());
            this.mBinding=mBinding;
        }
    }
}
