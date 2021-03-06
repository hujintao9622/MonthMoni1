package com.bawei.monthmoni1.model.bean;

import java.util.List;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/14 0014 下午 3:14
 */
public class OrderBean {

    /**
     * orderList : [{"detailList":[{"commentStatus":2,"commodityCount":3,"commodityId":5,"commodityName":"双头两用修容笔","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/5.jpg","commodityPrice":39,"orderDetailId":12279},{"commentStatus":1,"commodityCount":4,"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/5.jpg","commodityPrice":39,"orderDetailId":12280},{"commentStatus":1,"commodityCount":3,"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/5.jpg","commodityPrice":88,"orderDetailId":12281},{"commentStatus":1,"commodityCount":4,"commodityId":31,"commodityName":"【畅销款毛毛鞋+加绒真毛】冬款新尖货时尚防滑耐磨保暖加绒金属搭扣加绒方头低跟毛毛鞋豆豆鞋单鞋女鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/7/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/ddx/7/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/ddx/7/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/ddx/7/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/ddx/7/5.jpg","commodityPrice":168,"orderDetailId":12282}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020012117320111327823","orderStatus":3,"orderTime":1579599121000,"payAmount":1209,"payMethod":1,"userId":27823}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<OrderListBean> orderList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderListBean> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderListBean> orderList) {
        this.orderList = orderList;
    }

    public static class OrderListBean {
        /**
         * detailList : [{"commentStatus":2,"commodityCount":3,"commodityId":5,"commodityName":"双头两用修容笔","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/5.jpg","commodityPrice":39,"orderDetailId":12279},{"commentStatus":1,"commodityCount":4,"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/5.jpg","commodityPrice":39,"orderDetailId":12280},{"commentStatus":1,"commodityCount":3,"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/5.jpg","commodityPrice":88,"orderDetailId":12281},{"commentStatus":1,"commodityCount":4,"commodityId":31,"commodityName":"【畅销款毛毛鞋+加绒真毛】冬款新尖货时尚防滑耐磨保暖加绒金属搭扣加绒方头低跟毛毛鞋豆豆鞋单鞋女鞋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/7/1.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/ddx/7/2.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/ddx/7/3.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/ddx/7/4.jpg,http://mobile.bwstudent.com/images/small/commodity/nx/ddx/7/5.jpg","commodityPrice":168,"orderDetailId":12282}]
         * expressCompName : 京东快递
         * expressSn : 1001
         * orderId : 2020012117320111327823
         * orderStatus : 3
         * orderTime : 1579599121000
         * payAmount : 1209
         * payMethod : 1
         * userId : 27823
         */

        private String expressCompName;
        private String expressSn;
        private String orderId;
        private int orderStatus;
        private long orderTime;
        private int payAmount;
        private int payMethod;
        private int userId;
        private List<DetailListBean> detailList;

        public String getExpressCompName() {
            return expressCompName;
        }

        public void setExpressCompName(String expressCompName) {
            this.expressCompName = expressCompName;
        }

        public String getExpressSn() {
            return expressSn;
        }

        public void setExpressSn(String expressSn) {
            this.expressSn = expressSn;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public int getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(int orderStatus) {
            this.orderStatus = orderStatus;
        }

        public long getOrderTime() {
            return orderTime;
        }

        public void setOrderTime(long orderTime) {
            this.orderTime = orderTime;
        }

        public int getPayAmount() {
            return payAmount;
        }

        public void setPayAmount(int payAmount) {
            this.payAmount = payAmount;
        }

        public int getPayMethod() {
            return payMethod;
        }

        public void setPayMethod(int payMethod) {
            this.payMethod = payMethod;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public List<DetailListBean> getDetailList() {
            return detailList;
        }

        public void setDetailList(List<DetailListBean> detailList) {
            this.detailList = detailList;
        }

        public static class DetailListBean {
            /**
             * commentStatus : 2
             * commodityCount : 3
             * commodityId : 5
             * commodityName : 双头两用修容笔
             * commodityPic : http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/5.jpg
             * commodityPrice : 39
             * orderDetailId : 12279
             */

            private int commentStatus;
            private int commodityCount;
            private int commodityId;
            private String commodityName;
            private String commodityPic;
            private int commodityPrice;
            private int orderDetailId;

            public int getCommentStatus() {
                return commentStatus;
            }

            public void setCommentStatus(int commentStatus) {
                this.commentStatus = commentStatus;
            }

            public int getCommodityCount() {
                return commodityCount;
            }

            public void setCommodityCount(int commodityCount) {
                this.commodityCount = commodityCount;
            }

            public int getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(int commodityId) {
                this.commodityId = commodityId;
            }

            public String getCommodityName() {
                return commodityName;
            }

            public void setCommodityName(String commodityName) {
                this.commodityName = commodityName;
            }

            public String getCommodityPic() {
                return commodityPic;
            }

            public void setCommodityPic(String commodityPic) {
                this.commodityPic = commodityPic;
            }

            public int getCommodityPrice() {
                return commodityPrice;
            }

            public void setCommodityPrice(int commodityPrice) {
                this.commodityPrice = commodityPrice;
            }

            public int getOrderDetailId() {
                return orderDetailId;
            }

            public void setOrderDetailId(int orderDetailId) {
                this.orderDetailId = orderDetailId;
            }
        }
    }
}
