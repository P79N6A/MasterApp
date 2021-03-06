package com.ying.administrator.masterappdemo.mvp.contract;

import com.ying.administrator.masterappdemo.base.BaseModel;
import com.ying.administrator.masterappdemo.base.BasePresenter;
import com.ying.administrator.masterappdemo.base.BaseResult;
import com.ying.administrator.masterappdemo.base.BaseView;
import com.ying.administrator.masterappdemo.entity.WorkOrder;

import io.reactivex.Observable;

public interface CompleteWorkOrderContract {
    interface Model extends BaseModel{
        //根据工单号获取工单详情
        Observable<BaseResult<WorkOrder.DataBean>> GetOrderInfo(String OrderID);
    }

    interface View extends BaseView{
        //根据工单号获取工单详情
        void GetOrderInfo(BaseResult<WorkOrder.DataBean> baseResult);

    }
   abstract class Presenter extends BasePresenter<View,Model>{
       //根据工单号获取工单详情
       public abstract void GetOrderInfo(String OrderID);
   }
}
