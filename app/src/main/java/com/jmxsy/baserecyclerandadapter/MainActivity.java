package com.jmxsy.baserecyclerandadapter;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.itheima.loopviewpager.LoopViewPager;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;


import org.itheima.recycler.header.RecyclerViewHeader;
import org.itheima.recycler.widget.ItheimaRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Headers;
import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    ItheimaRecyclerView recyclerView;
    @BindView(R.id.swipe_refresh_layout)
    SwipeRefreshLayout swipeRefreshLayout;
    LoopViewPager loopViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        RecyclerViewHeader header = (RecyclerViewHeader) findViewById(R.id.recycler_header);
        recyclerView = (ItheimaRecyclerView) findViewById(R.id.recycler_view);
        header.attachTo(recyclerView);

        loopViewPager = (LoopViewPager) findViewById(R.id.lvp_pager);
        loopViewPager.setImgData(imgListString());
        loopViewPager.setTitleData(titleListString());
        loopViewPager.start();
        }

        private List<String> imgListString() {
            List<String> imageData = new ArrayList<>();
            imageData.add("http://www.geiliweike.com/sites/all/themes/sensation/images/banner1.jpg");
            imageData.add("http://www.geiliweike.com/sites/all/themes/sensation/images/banner2.jpg");
            imageData.add("http://www.geiliweike.com/sites/all/themes/sensation/images/banner1.jpg");
            imageData.add("http://www.geiliweike.com/sites/all/themes/sensation/images/banner2.jpg");
            imageData.add("http://www.geiliweike.com/sites/all/themes/sensation/images/banner1.jpg");
            return imageData;
        }

        private List<String> titleListString() {
            List<String> titleData = new ArrayList<>();
            titleData.add("1、在这里等着你");
            titleData.add("2、在你身边");
            titleData.add("3、打电话给你就是想说声“嗨”");
            titleData.add("4、不介意你对我大喊大叫");
            titleData.add("5、期待你总是尽全力");
            return titleData;
        }

        //loopViewPager = (LoopViewPager) findViewById(R.id.lvp_pager);
       // initBanner();




//    List<String> imageLists = new ArrayList<>();
//    List<String> textLists = new ArrayList<>();
//    private void initBanner(){
//        Request request = ItheimaHttp.newGetRequest("action/apiv2/banner?catalog=1");//apiUrl格式："xxx/xxxxx"
//        Call call = ItheimaHttp.send(request, new HttpResponseListener<BannerBean>() {
//
//            @Override
//            public void onResponse(BannerBean bannerBean, Headers headers) {
//
//                List<BannerBean.ResultBean.ItemsBean> itemDatas = bannerBean.getItemDatas();
//                for (int i = 0; i < itemDatas.size(); i++) {
//                    imageLists.add(itemDatas.get(i).getImg());
//                    textLists.add(itemDatas.get(i).getName());
//                }
//                loopViewPager.setImgData(imageLists);
//                loopViewPager.setTitleData(textLists);
//                loopViewPager.start();
//            }
//        });
//    }


}


