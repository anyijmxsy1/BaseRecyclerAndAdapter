package com.jmxsy.baserecyclerandadapter;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/27 0027.
 */

public class BannerBean extends BasePageBean <BannerBean.ResultBean.ItemsBean>{


    /**
     * code : 1
     * message : success
     * notice : {"newsCount":22}
     * result : {"items":[{"detail":"","href":"https://www.oschina.net/tweet-topic/OSC%E5%9F%BA%E5%8F%8B%E5%87%BA%E6%9F%9C%E5%AE%A3%E8%A8%80","id":0,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_de4036ed-d1d6-426f-a384-5aebc16f2b4f.jpg","name":"【源聚十年·码上相爱】你们想要的同性告白活动来了！","pubDate":"2018-08-27 11:22:39","type":0,"weight":15},{"detail":"","href":"https://www.oschina.net/news/99352/new-languages-dethroning-the-old","id":99352,"img":"https://static.oschina.net/uploads/cooperation/event/guangzhou/event/2201438_5a35d645-24c2-40d9-a136-f1de53fbb029.jpg","name":"老牌语言依然强势，GO、Kotlin 等新语言为何不能破局？","pubDate":"2018-08-27 10:16:46","type":6,"weight":14},{"detail":"","href":"https://www.oschina.net/translate/the-cost-of-javascript-in-2018","id":4367,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_c707a758-cd76-4ff6-a6a8-21a7f7d5a732.jpg","name":"翻译 | JavaScript 的代价（2018 版）","pubDate":"2018-08-27 10:26:37","type":4,"weight":13},{"detail":"","href":"https://www.oschina.net/news/98910/show-your-changes-for-decade","id":98910,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_3c58241a-6b6f-41bc-b05d-283d5fb0f005.png","name":"#秀出你的十年变化照# 十年前立下的flag，如今都达成了吗？","pubDate":"2018-08-23 10:58:49","type":6,"weight":12},{"detail":"","href":"https://www.oschina.net/question/2720166_2285446","id":2285446,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_5cbe6608-af0a-4f40-b8f2-ec7004d44ac7.jpg","name":"深度学习如此火热，你了解得怎么样了？","pubDate":"2018-08-21 18:20:59","type":2,"weight":3}],"nextPageToken":"61AF0C190D6BD629","prevPageToken":"3EA621243546C8A5","requestCount":5,"responseCount":5,"totalResults":5}
     * time : 2018-08-27 15:28:24
     */

    private int code;
    private String message;
    private NoticeBean notice;
    private ResultBean result;
    private String time;

    @Override
    public List getItemDatas() {
        return result.items;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NoticeBean getNotice() {
        return notice;
    }

    public void setNotice(NoticeBean notice) {
        this.notice = notice;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



    public static class NoticeBean {
        /**
         * newsCount : 22
         */

        private int newsCount;

        public int getNewsCount() {
            return newsCount;
        }

        public void setNewsCount(int newsCount) {
            this.newsCount = newsCount;
        }
    }

    public static class ResultBean {
        /**
         * items : [{"detail":"","href":"https://www.oschina.net/tweet-topic/OSC%E5%9F%BA%E5%8F%8B%E5%87%BA%E6%9F%9C%E5%AE%A3%E8%A8%80","id":0,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_de4036ed-d1d6-426f-a384-5aebc16f2b4f.jpg","name":"【源聚十年·码上相爱】你们想要的同性告白活动来了！","pubDate":"2018-08-27 11:22:39","type":0,"weight":15},{"detail":"","href":"https://www.oschina.net/news/99352/new-languages-dethroning-the-old","id":99352,"img":"https://static.oschina.net/uploads/cooperation/event/guangzhou/event/2201438_5a35d645-24c2-40d9-a136-f1de53fbb029.jpg","name":"老牌语言依然强势，GO、Kotlin 等新语言为何不能破局？","pubDate":"2018-08-27 10:16:46","type":6,"weight":14},{"detail":"","href":"https://www.oschina.net/translate/the-cost-of-javascript-in-2018","id":4367,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_c707a758-cd76-4ff6-a6a8-21a7f7d5a732.jpg","name":"翻译 | JavaScript 的代价（2018 版）","pubDate":"2018-08-27 10:26:37","type":4,"weight":13},{"detail":"","href":"https://www.oschina.net/news/98910/show-your-changes-for-decade","id":98910,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_3c58241a-6b6f-41bc-b05d-283d5fb0f005.png","name":"#秀出你的十年变化照# 十年前立下的flag，如今都达成了吗？","pubDate":"2018-08-23 10:58:49","type":6,"weight":12},{"detail":"","href":"https://www.oschina.net/question/2720166_2285446","id":2285446,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_5cbe6608-af0a-4f40-b8f2-ec7004d44ac7.jpg","name":"深度学习如此火热，你了解得怎么样了？","pubDate":"2018-08-21 18:20:59","type":2,"weight":3}]
         * nextPageToken : 61AF0C190D6BD629
         * prevPageToken : 3EA621243546C8A5
         * requestCount : 5
         * responseCount : 5
         * totalResults : 5
         */

        private String nextPageToken;
        private String prevPageToken;
        private int requestCount;
        private int responseCount;
        private int totalResults;
        private List<ItemsBean> items;

        public String getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        public String getPrevPageToken() {
            return prevPageToken;
        }

        public void setPrevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
        }

        public int getRequestCount() {
            return requestCount;
        }

        public void setRequestCount(int requestCount) {
            this.requestCount = requestCount;
        }

        public int getResponseCount() {
            return responseCount;
        }

        public void setResponseCount(int responseCount) {
            this.responseCount = responseCount;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * detail :
             * href : https://www.oschina.net/tweet-topic/OSC%E5%9F%BA%E5%8F%8B%E5%87%BA%E6%9F%9C%E5%AE%A3%E8%A8%80
             * id : 0
             * img : https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_de4036ed-d1d6-426f-a384-5aebc16f2b4f.jpg
             * name : 【源聚十年·码上相爱】你们想要的同性告白活动来了！
             * pubDate : 2018-08-27 11:22:39
             * type : 0
             * weight : 15
             */

            private String detail;
            private String href;
            private int id;
            private String img;
            private String name;
            private String pubDate;
            private int type;
            private int weight;

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }
        }
    }
}
