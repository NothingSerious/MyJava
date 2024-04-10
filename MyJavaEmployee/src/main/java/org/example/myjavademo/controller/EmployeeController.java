package org.example.myjavademo.controller;


import cn.hutool.script.ScriptUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.example.myjavademo.employee.domain.Employee;
import org.example.myjavademo.employee.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.example.myjavademo.employee.service.EmployeeService;

import javax.script.CompiledScript;

/**
 * <p>
 * 人员表 前端控制器
 * </p>
 *
 * @author author
 * @since 2024-03-27
 */
@Controller
@RequestMapping("/employee")
@SentinelResource(value = "employeeResource")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/getAllEmployee")
    public ResponseEntity<IPage<Employee>> getAllEmployee(@RequestParam(value = "pageNum",required = true) Integer pageNum , @RequestParam(value = "pageSize", required = true) Integer pageSize)
    {
        return ResponseEntity.ok(employeeService.getAllEmployee(pageNum, pageSize));
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<Boolean> addEmployee(@RequestBody Employee employee)
    {
        return ResponseEntity.ok(employeeService.saveOrUpdateEmployee(employee));
    }

    @PostMapping("/addEmployeeScript")
    public ResponseEntity<Boolean> addEmployee(String scriptStr)
    {
        String a = "\n" +
                "// 创建实例并调用实例方法\n" +
                "var employeeService = new EmployeeServiceImpl();\n" +
                "var instanceResult = employeeService.getAllEmployee(1, 10);\n" +
                "print(instanceResult); // 输出: Called instance method.\n";
        CompiledScript script = ScriptUtil.compile(a);
        try {
            script.eval();
        } catch (Exception e){
            return ResponseEntity.ok(Boolean.FALSE);
        }
        return ResponseEntity.ok(Boolean.TRUE);
    }
}

