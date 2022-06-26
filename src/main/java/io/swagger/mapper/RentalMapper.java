package io.swagger.mapper;

import io.swagger.domain.Rental;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RentalMapper {
    int deleteByPrimaryKey(Integer rentalId);

    int insert(Rental record);

    int insertSelective(Rental record);

    Rental selectByPrimaryKey(Integer rentalId);

    int updateByPrimaryKeySelective(Rental record);

    int updateByPrimaryKey(Rental record);
}
