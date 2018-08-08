package com.hyp.charpter1.util;

/**
 * @Author: yp.huang
 * @Create time: 2018/8/8 17:13
 */

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 */
public class StringUtil {

    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty (String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     */
    public static boolean isNotEmpty (String str) {
        return !isEmpty(str);
    }
}
