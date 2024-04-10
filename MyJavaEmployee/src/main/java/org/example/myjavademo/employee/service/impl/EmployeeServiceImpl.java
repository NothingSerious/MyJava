package org.example.myjavademo.employee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.myjavademo.employee.domain.Employee;
import org.example.myjavademo.employee.service.EmployeeService;
import org.example.myjavademo.employee.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author genki
* @description 针对表【employee(人员表)】的数据库操作Service实现
* @createDate 2024-03-28 15:35:49
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
implements EmployeeService{

    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public IPage<Employee> getAllEmployee(Integer pageNum, Integer pageSize) {
        Page<Employee> page = new Page<>(pageNum, pageSize);
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
//        queryWrapper.eq("user_type", 2);
//        queryWrapper.like("name", "%");
        return employeeMapper.selectPage(page, queryWrapper);
    }

    @Override
    public boolean saveOrUpdateEmployee(Employee employee) {
        if (employee.getId() == null) {
            return save(employee);
        } else {
            return updateById(employee);
        }
    }
}
