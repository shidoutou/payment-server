package io.swagger.mapper;

import io.swagger.domain.Film;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FilmMapper {
    int deleteByPrimaryKey(Integer filmId);

    int insert(Film record);

    int insertSelective(Film record);

    Film selectByPrimaryKey(Integer filmId);

    int updateByPrimaryKeySelective(Film record);

    int updateByPrimaryKey(Film record);
}
