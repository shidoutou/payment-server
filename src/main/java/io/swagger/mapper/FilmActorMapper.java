package io.swagger.mapper;

import io.swagger.domain.FilmActor;
import io.swagger.domain.FilmActorKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FilmActorMapper {
    int deleteByPrimaryKey(FilmActorKey key);

    int insert(FilmActor record);

    int insertSelective(FilmActor record);

    FilmActor selectByPrimaryKey(FilmActorKey key);

    int updateByPrimaryKeySelective(FilmActor record);

    int updateByPrimaryKey(FilmActor record);
}
