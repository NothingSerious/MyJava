package org.example.myjavademo.employee.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.myjavademo.employee.domain.Employee;

/**
* @author genki
* @description 针对表【employee(人员表)】的数据库操作Mapper
* @createDate 2024-03-28 15:35:49
* @Entity org.example.myjavademo.employee.domain.Employee
*/
public interface EmployeeMapper extends BaseMapper<Employee> {
    List<Employee> selectByIdCardNumberAfter(@Param("idCardNumber") String idCardNumber);
}
