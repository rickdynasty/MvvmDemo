package com.bluecollar.mvvmdemo.data.source;

import com.bluecollar.lib.http.BaseResponse;
import com.bluecollar.mvvmdemo.entity.DemoEntity;

import io.reactivex.Observable;

/**
 * Created by goldze on 2019/3/26.
 */
public interface HttpDataSource {
    //模拟登录
    Observable<Object> login();

    //模拟上拉加载
    Observable<DemoEntity> loadMore();

    Observable<BaseResponse<DemoEntity>> demoGet();

    Observable<BaseResponse<DemoEntity>> demoPost(String catalog);
}
