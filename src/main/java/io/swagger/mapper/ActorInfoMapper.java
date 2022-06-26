package io.swagger.mapper;

import io.swagger.domain.ActorInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActorInfoMapper {
    List<ActorInfo> findAllActorInfos();
    ActorInfo findUserByActorId(Long actorId);
}
