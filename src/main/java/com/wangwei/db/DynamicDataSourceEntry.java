package com.wangwei.db;

import org.aopalliance.intercept.Joinpoint;

/**
 * @Author wangwei
 * @Date 2021/5/31 12:04 上午
 * @Version 1.0
 */
public class DynamicDataSourceEntry {
    public final static String DEFAULT_SOURCE = null;
    private final static  ThreadLocal<String> LOCAL = new ThreadLocal<>();
    public void clear(){
        LOCAL.remove();
    }

    public String get(){
        return LOCAL.get();
    }

    public void restore(Joinpoint joinpoint) {
        LOCAL.set(DEFAULT_SOURCE);
    }


}
