package cn.itsource.youpin.controller;

import cn.itsource.youpin.domain.Employee;
import cn.itsource.youpin.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    //@RequestBody 将body页面的参数安装springmvc封装到employee对象中
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getName())&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMsg("登录成功");
        }else{
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }
    }
}
