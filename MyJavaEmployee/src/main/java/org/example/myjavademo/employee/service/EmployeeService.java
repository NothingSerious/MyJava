package org.example.myjavademo.employee.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.myjavademo.employee.domain.Employee;

/**
* @author genki
* @description 针对表【employee(人员表)】的数据库操作Service
* @createDate 2024-03-28 15:35:49∂
*/
public interface EmployeeService extends IService<Employee> {
    // 分页查询员工
    IPage<Employee> getAllEmployee(Integer pageNum, Integer pageSize);

    // 保存或者更新
    boolean saveOrUpdateEmployee(Employee employee);

}
