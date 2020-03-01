package ddao;

import org.apache.ibatis.annotations.Param;

public class CustomerMapper {
    int deleteByPrimaryKey(Integer customerId) {
        return 0;
    }

    int insert(Customer record) {
        return 0;
    }

    int insertSelective(Customer record) {
        return 0;
    }

    Customer selectByPrimaryKey(Integer customerId) {
        return null;
    }

    int updateByPrimaryKeySelective(Customer record) {
        return 0;
    }

    int updateByPrimaryKey(Customer record) {
        return 0;
    }

//    custom

    Customer selectByUsername(@Param("username") String username) {
        return null;
    }

    String getPwdResetCode(String email) {
        return null;
    }

    Customer selectByemail(String email) {
        return null;
    }

    Customer getById(Integer customerId) {
        return null;
    }
}
