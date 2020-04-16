package com.example.designpatterns.patterns.behavioral.strategy;

/**
 * Demo Software
 *
 * @author Wolf-Liu
 * @date 2019/12/12 22:37
 */

//错误写法
//public class Software {
//    public void doSport() {
//        System.out.println("开始运动");
//    }
//
//    public void doShoping(Activity activity) {
//        System.out.println("开始购物");
//        System.out.println("今日活动：" + activity.discount());
//    }
//}
public class Software {
    private Activity activity;

    public Software(Activity activity) {
        this.activity = activity;
    }

    public void doSport() {
        System.out.println("开始运动");
    }

    public void doShoping() {
        System.out.println("开始购物");
        System.out.println("今日活动：" + activity.discount());
    }

    public float countValue(float value) {
        float total = activity.countDiscountValue(value);
        System.out.println("您的优惠价格是：" + total);
        return total;
    }
}