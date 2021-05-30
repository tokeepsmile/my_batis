package com.wangwei.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author wangwei
 * @Date 2021/5/31 12:03 上午
 * @Version 1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    private DynamicDataSourceEntry dataSourceEntry;
    @Override
    protected Object determineCurrentLookupKey() {
        return null;
    }
}
