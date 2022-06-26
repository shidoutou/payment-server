package io.swagger.mapper;

import io.swagger.domain.NicerButSlowerFilmList;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NicerButSlowerFilmListMapper {

    @Select("SELECT fid, title, description, category, price, length, rating, actors FROM nicer_but_slower_film_list")
    Page<NicerButSlowerFilmList> findByPage();
}
