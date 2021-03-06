package com.ying.administrator.masterappdemo.mvp.ui.fragment.ReceivingFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.ying.administrator.masterappdemo.R;
import com.ying.administrator.masterappdemo.mvp.ui.adapter.Appointment_failure_Adapter;
import com.ying.administrator.masterappdemo.common.DefineView;
import com.ying.administrator.masterappdemo.entity.GrabSheet_Entity;
import com.ying.administrator.masterappdemo.mvp.ui.fragment.BaseFragment.BaseFragment;

import java.util.ArrayList;

/*预约不成功*/
public class Appointment_failure_fragment extends BaseFragment implements DefineView {

    private View view;

    private RecyclerView recyclerView;
    private Appointment_failure_Adapter appointment_failure_adapter;
    private ArrayList<GrabSheet_Entity> list;
    public Appointment_failure_fragment() {
        // Required empty public constructor
    }

    public static Appointment_failure_fragment newInstance() {
        Appointment_failure_fragment fragment = new Appointment_failure_fragment();
        return fragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     if (view==null){
       view=inflater.inflate(R.layout.fragment_order_receiving,container,false);
         initView();
     }
     return view;
    }

    @Override
    public void initView() {
        recyclerView=view.findViewById(R.id.recyclerview_order_receiving);
        list=new ArrayList<>();
        GrabSheet_Entity a=new GrabSheet_Entity();
        a.setAddress("宁波市asasasas");
        GrabSheet_Entity b=new GrabSheet_Entity();
        b.setAddress("杭州市asdasfasfasf");
        GrabSheet_Entity c=new GrabSheet_Entity();
        c.setAddress("温州市asdasfasfasf");
        list.add(a);
        list.add(b);
        list.add(c);
        appointment_failure_adapter=new Appointment_failure_Adapter(R.layout.item_appointment_failure,list);
        recyclerView.setAdapter(appointment_failure_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        /*恢复订单*/
        appointment_failure_adapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                switch (view.getId()){
                    case R.id.img_pending_appointment_failure_phone:
                        appointment_failure_adapter.remove(position);
                        break;

                }
            }
        });

    }

    @Override
    public void initValidata() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void bindData() {

    }
}
