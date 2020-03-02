package dao;

import org.apache.tomcat.jni.Address;

public interface AddressMapper {
    int deleteByPrimary(Integer addressId) ;

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimary(Integer addressId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);


}
