package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.CourseCategory;
import lombok.Data;

import java.util.List;

/**
 * @Author chenhaitian
 * @Packge com.xuecheng.content.model.dto
 * @Date 2025/2/19 17:48
 * @description 课程分类树型结点dto
 */
@Data
public class CourseCategoryTreeDto extends CourseCategory implements java.io.Serializable {
    List<CourseCategoryTreeDto> childrenTreeNodes;
}
