package com.wangwei.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangwei
 * @Date 2021/5/30 11:36 下午
 * @Version 1.0
 */
public class Page<T> implements Serializable {
    private static final int DEFAULT_PAGE_SIZE = 20;
    private int pageSize = DEFAULT_PAGE_SIZE;
    private long start;
    private List<T> rows;
    private long total;

    public Page(long start, long totalSize, int pageSize, List<T> rows) {
        this.start = start;
        this.total = totalSize;
        this.pageSize = pageSize;
        this.rows = rows;
    }

    public Page() {
        this(0, 0, DEFAULT_PAGE_SIZE, new ArrayList<T>());
    }

    public int getPageSize() {
        return pageSize;
    }

    public long getTotalPage() {
        if (total % pageSize == 0){
            return total / pageSize;
        }else {
            return total / pageSize + 1;
        }
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getPageNo() {
        return start / pageSize + 1;
    }

    public boolean hasNextPage() {
        return this.getPageNo() < this.getTotalPage() - 1;
    }

    public boolean hasPreviousPage() {
        return this.getPageNo() > 1;
    }

    protected static int getStartOfPage(int pageNo) {
        return getstartOfPage(pageNo, DEFAULT_PAGE_SIZE);
    }

    private static int getstartOfPage(int pageNo, int pageSize) {
        return (pageNo - 1) * pageSize;
    }
}
