package com.example.mapper;

import com.example.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {
    @Insert("insert into category(category_name,category_alias,create_user,create_time,update_time)" +
            "values(#{categoryName},#{categoryAlias},#{createUser},#{createTime},#{updateTime})")
    void add(Category category);//写json传数据的时候，不要忘了字母怎么拼写，不要拼错

    /*{
        "categoryName":"人文",
        "categoryAlias":"rw"
    }*/
    //查询所有种类
    @Select("select * from category where create_user=#{userId}")
    List<Category> list(Integer userId);

    /* @Insert("insert into category(category_name,category_alias,create_user,create_time,update_time) " +
            "values(#{categoryName},#{categoryAlias},#{createUser},#{createTime},#{updateTime})")
    void add(Category category);*/
    /*可以看看实体类Category的命名，是不是除了id外其他的参数名称都是驼峰格式*/
    @Select("select * from category where id = #{id}")
    Category findById(Integer id);

    //更新
//更新
    @Update("update category set category_name=#{categoryName},category_alias=#{categoryAlias},update_time=#{updateTime} where id=#{id}")
    void update(Category category);
    //根据id删除
    @Delete("delete from category where id=#{id}")
    void deleteById(Integer id);
}
