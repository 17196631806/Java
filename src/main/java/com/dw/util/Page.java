package com.dw.util;

import com.dw.model.Student;

import java.util.List;

/**
 * @program: ChatRobot
 * @description:
 * @author: liu yan
 * @create: 2018-08-24 18:28
 */
public class Page {
    private int pageIndex;
    private int pageSize;
    private int pageTotalPages;
    private int pagePages;
    private List<Student> empList;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageTotalPages() {
        return pageTotalPages;
    }

    public void setPageTotalPages(int pageTotalPages) {
        this.pageTotalPages = pageTotalPages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<Student> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Student> empList) {
        this.empList = empList;
    }

    public int getPagePages() {
        return pagePages;
    }

    public void setPagePages(int pagePages) {
        this.pagePages = pagePages;
    }
}
