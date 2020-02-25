package Dao.in.out.out;

import java.util.List;

public class PageOutDTO<A> {
    public Integer getTotal() {
        return total;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

//    public List<T> getList() {
//        return list;
//    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

//    public void setList(List<T> list) {
//        this.list = list;
//    }

    private Integer total;
    private Integer pageSize;
    private Integer pageNum;
//    private List<T> list;
}
