package com.hotapk.fastandrutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cn.hotapk.fastandrutils.utils.FConvertUtils;

/**
 * @author laijian
 * @version 2017/11/3
 * @Copyright (C)下午2:44 , www.hotapk.cn
 * 数据转换工具类
 */
public class FConvertActivity extends FBaseActivity {


    private TextView convert_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fconvert);
        convert_tv = (TextView) findViewById(R.id.convert_tv);
        StringBuffer sb = new StringBuffer();
        sb.append("\n10 px值转换为dp值：" + FConvertUtils.px2dip(10));
        sb.append("\n10 px值转换为sp值：" + FConvertUtils.px2sp(10));
        sb.append("\n102345 转换为网速格式：" + FConvertUtils.binaryFormatSize(102345));
        convert_tv.setText(sb.toString());

    }
}
