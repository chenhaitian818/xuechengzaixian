package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Title: PageParams
 * @Author itmei
 * @Packge com.xuecheng.base.model
 * @Date 2025/1/8 20:21
 * @description 分页查询分页参数
 */
@Data
@ToString
public class PageParams {
    public PageParams() {
    }
    public PageParams(long pageNo, long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    //当前页码
    @ApiModelProperty(value = "当前页码")
    private long pageNo = 1L;

    //每页记录数
    private long pageSize = 30L;

}
