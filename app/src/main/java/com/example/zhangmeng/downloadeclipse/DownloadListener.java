package com.example.zhangmeng.downloadeclipse;

/**
 * Created by zhangmeng on 2017/7/12.
 */

public interface DownloadListener {
    void onProgress(int Progress);
    void onSuccessed();
    void onFailed();
    void onPaused();
    void onCanceled();

}
