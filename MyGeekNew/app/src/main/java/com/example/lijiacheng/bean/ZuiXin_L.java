package com.example.lijiacheng.bean;

import java.util.List;

/**
 * Created by LijiaCheng on 2019/4/17.
 */

public class ZuiXin_L {

    /**
     * date : 20190417
     * top_stories : [{"image":"https://pic1.zhimg.com/v2-e61227b2e6f420f6c62a71f089db8100.jpg","ga_prefix":"041707","id":9710289,"title":"三星 Galaxy Fold：它是一台手机，但屏幕告诉你它不是","type":0},{"image":"https://pic2.zhimg.com/v2-4b16fd1c9c22d5bc115d75100bcc536d.jpg","ga_prefix":"041709","id":9710280,"title":"用游戏「实地」图解：巴黎圣母院为什么会着火？","type":0},{"image":"https://pic3.zhimg.com/v2-26b7a11ab1f5ef8b4aadaf773069f48e.jpg","ga_prefix":"041607","id":9710258,"title":"一个巨大的汽车行业潜规则，就这么不经意间捅了出来","type":0},{"image":"https://pic1.zhimg.com/v2-18c6d20db38a2d8b0efc746f09803830.jpg","ga_prefix":"041521","id":9710248,"title":"「权游」最终季第 1 集：最好最好的重逢，久违了","type":0},{"image":"https://pic2.zhimg.com/v2-32ecfc49df86c8d9285e16794aa31e91.jpg","ga_prefix":"041420","id":9710210,"title":"「支付宝到账 XXX 元」，真的有催眠效果吗？","type":0}]
     * stories : [{"images":["https://pic4.zhimg.com/v2-dfcf0541558587ac9af59bf954908c73.jpg"],"ga_prefix":"041719","id":9710335,"title":"《刺客信条》真的对修复巴黎圣母院有帮助吗?","type":0},{"images":["https://pic1.zhimg.com/v2-9d22c120d2206f4c31f9525cab5027f8.jpg"],"ga_prefix":"041716","multipic":true,"id":9710284,"title":"「超级视力」来了，经过改造的小鼠可裸眼看见红外线","type":0},{"images":["https://pic2.zhimg.com/v2-9cdc4b2a57325d83f171a5675485e655.jpg"],"ga_prefix":"041709","multipic":true,"id":9710280,"title":"用游戏「实地」图解：巴黎圣母院为什么会着火？","type":0},{"images":["https://pic3.zhimg.com/v2-927b72fe1ea8562b14544bc222069586.jpg"],"ga_prefix":"041708","id":9710298,"title":"被正面表达的诉求，才有被解决的可能","type":0},{"images":["https://pic3.zhimg.com/v2-3cd88bc0d9d888ffd947b01b38b6544a.jpg"],"ga_prefix":"041707","multipic":true,"id":9710289,"title":"三星 Galaxy Fold：它是一台手机，但屏幕告诉你它不是","type":0},{"images":["https://pic3.zhimg.com/v2-48280d6d028fcca9fff19e296d204ece.jpg"],"ga_prefix":"041706","id":9710274,"title":"瞎扯 · 如何正确地吐槽","type":0}]
     */
    private String date;
    private List<Top_storiesEntity> top_stories;
    private List<StoriesEntity> stories;

    public void setDate(String date) {
        this.date = date;
    }

    public void setTop_stories(List<Top_storiesEntity> top_stories) {
        this.top_stories = top_stories;
    }

    public void setStories(List<StoriesEntity> stories) {
        this.stories = stories;
    }

    public String getDate() {
        return date;
    }

    public List<Top_storiesEntity> getTop_stories() {
        return top_stories;
    }

    public List<StoriesEntity> getStories() {
        return stories;
    }

    public class Top_storiesEntity {
        /**
         * image : https://pic1.zhimg.com/v2-e61227b2e6f420f6c62a71f089db8100.jpg
         * ga_prefix : 041707
         * id : 9710289
         * title : 三星 Galaxy Fold：它是一台手机，但屏幕告诉你它不是
         * type : 0
         */
        private String image;
        private String ga_prefix;
        private int id;
        private String title;
        private int type;

        public void setImage(String image) {
            this.image = image;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getImage() {
            return image;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public int getType() {
            return type;
        }
    }

    public class StoriesEntity {
        /**
         * images : ["https://pic4.zhimg.com/v2-dfcf0541558587ac9af59bf954908c73.jpg"]
         * ga_prefix : 041719
         * id : 9710335
         * title : 《刺客信条》真的对修复巴黎圣母院有帮助吗?
         * type : 0
         */
        private List<String> images;
        private String ga_prefix;
        private int id;
        private String title;
        private int type;

        public void setImages(List<String> images) {
            this.images = images;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<String> getImages() {
            return images;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public int getType() {
            return type;
        }
    }
}
