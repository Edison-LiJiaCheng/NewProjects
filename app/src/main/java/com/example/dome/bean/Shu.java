package com.example.dome.bean;

import java.util.List;

public class Shu {

    /**
     * data : [{"collect_num":"448","food_str":"白菜 生抽 白糖 醋 辣椒","id":"10113","num":448,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/11/10113.jpg","title":"糖醋白菜"},{"collect_num":"447","food_str":"柚子 冰糖 蜂蜜","id":"49617","num":447,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/50/49617.jpg","title":"蜂蜜柚子茶"},{"collect_num":"441","food_str":"菠菜 猪肝 姜片 枸杞 淀粉","id":"6866","num":441,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/7/6866.jpg","title":"菠菜猪肝汤"},{"collect_num":"438","food_str":"本鸡 胡萝卜 干黑木耳 料酒 葱","id":"3059","num":438,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/4/3059.jpg","title":"胡萝卜木耳炖鸡汤"},{"collect_num":"427","food_str":"黑豆 黑米 黑芝麻 牛奶 糖","id":"1648","num":427,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/2/1648.jpg","title":"谷粒黑牛奶"},{"collect_num":"422","food_str":"鸡 金针 黑木耳 红枣 冬菇","id":"3475","num":422,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/4/3475.jpg","title":"妈妈家常蒸鸡"},{"collect_num":"414","food_str":"空心菜 油 盐 蒜末 葱段","id":"10194","num":414,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/11/10194.jpg","title":"清炒空心菜"},{"collect_num":"414","food_str":"新鲜草莓 白砂糖 柠檬","id":"30959","num":414,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/31/30959.jpg","title":"草莓酱"},{"collect_num":"405","food_str":"鸡 粟子 姜葱","id":"3383","num":405,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/4/3383.jpg","title":"粟子焖鸡"},{"collect_num":"403","food_str":"金针菇 黄瓜 鸡蛋 盐 油","id":"77569","num":403,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/78/77569.jpg","title":"金针菇黄瓜鸡蛋饼"},{"collect_num":"403","food_str":"猪肉丝 葱段 泡红海椒米 泡姜米 蒜米","id":"2869","num":403,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2869.jpg","title":"鱼香肉丝重庆版"},{"collect_num":"403","food_str":"年糕 猪肉丝 韭黄 盐 鸡精","id":"2731","num":403,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2731.jpg","title":"韭黄肉丝炒年糕"},{"collect_num":"401","food_str":"娃娃菜 大蒜 水 盐 油","id":"10647","num":401,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/11/10647.jpg","title":"蒜蓉娃娃菜"},{"collect_num":"395","food_str":"面粉 燕麦片 胡萝卜 鸡蛋 牛奶","id":"52857","num":395,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/53/52857.jpg","title":"胡萝卜奶香煎饼"},{"collect_num":"395","food_str":"芹菜 香干 姜末 蒜末 葱花","id":"10037","num":395,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/11/10037.jpg","title":"芹菜炒香干"},{"collect_num":"378","food_str":"猪肉 鸡蛋 花椒 淀粉 面粉","id":"2502","num":378,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2502.jpg","title":"酥肉"},{"collect_num":"378","food_str":"菠萝 虾 火腿 糯米 米","id":"49330","num":378,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/50/49330.jpg","title":"赞不绝口无与伦比绝妙黄金菠萝饭"},{"collect_num":"375","food_str":"牛奶 红枣 蜜豆","id":"16511","num":375,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/17/16511.jpg","title":"红枣蜜豆牛奶羹"},{"collect_num":"366","food_str":"皮冻 猪肉 面粉 姜 葱","id":"2390","num":366,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2390.jpg","title":"小笼汤包"},{"collect_num":"364","food_str":"蒜苔 瘦肉 辣椒 大蒜 醋","id":"10330","num":364,"pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/11/10330.jpg","title":"蒜苔炒肉"}]
     * ret : 1
     */

    private int ret;
    private List<DataBean> data;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * collect_num : 448
         * food_str : 白菜 生抽 白糖 醋 辣椒
         * id : 10113
         * num : 448
         * pic : http://www.qubaobei.com/ios/cf/uploadfile/132/11/10113.jpg
         * title : 糖醋白菜
         */

        private String collect_num;
        private String food_str;
        private String id;
        private int num;
        private String pic;
        private String title;

        public String getCollect_num() {
            return collect_num;
        }

        public void setCollect_num(String collect_num) {
            this.collect_num = collect_num;
        }

        public String getFood_str() {
            return food_str;
        }

        public void setFood_str(String food_str) {
            this.food_str = food_str;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
