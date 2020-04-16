package com.example.designpatterns.patterns.other.callback;

/**
 * Demo IOUtil
 *
 * @author Wolf-Liu
 * @date 2020/3/29 16:05
 */
@SuppressWarnings("AlibabaAvoidManuallyCreateThread")
public class IOUtil {

    public void saveFile(CallBackDiy callBackDiy, String filename) {
        System.out.println("创建文件" + filename);
        new Thread(() -> {
            try {
                System.out.println("保存文件" + filename);
                callBackDiy.onResult(true);
            } catch (Exception e) {
                callBackDiy.onResult(false);
            }
        }).start();
    }
}
