package student.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import student.bean.Message;
import student.bean.Student;
import student.util.MessageUtil;

@RestController
@Api(description = "学生属性")
public class StudentController {
    @PostMapping("/add")
    @ApiOperation("添加学生")
    public Message add(Student student){

        return MessageUtil.success("添加学生成功");
    }
    @GetMapping("/delete")
    @ApiOperation("删除学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name="stuId",value="学号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name="name",value="学生姓名",paramType = "query",dataType = "String")
    })
    public Message delete(int stuId,String name){
        System.out.println(name);
        return MessageUtil.success("删除学生成功");


    }
}
