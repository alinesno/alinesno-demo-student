package com.alinesno.cloud.alinesno.demo.student.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alinesno.cloud.alinesno.demo.student.entity.StudentClassesEntity;
import com.alinesno.cloud.alinesno.demo.student.service.IStudentClassesService;

import com.alinesno.cloud.common.core.constants.SpringInstanceScope;
import com.alinesno.cloud.common.core.page.DatatablesPageBean;
import com.alinesno.cloud.common.web.base.advice.TranslateCode;
import com.alinesno.cloud.common.web.base.controller.FeignMethodController;

import org.springframework.stereotype.Controller;

/**
 * <p>班级 前端控制器 </p>
 *
 * @author 张三
 * @since 2019-10-07 22:12:48
 */
@Controller
@Scope(SpringInstanceScope.PROTOTYPE)
@RequestMapping("alinesno/demo/student/studentClasses")
public class StudentClassesController extends FeignMethodController<StudentClassesEntity, IStudentClassesService> {

	//日志记录
	private static final Logger log = LoggerFactory.getLogger(StudentClassesController.class);

	@Autowired
	private IStudentClassesService studentClassesService; 

	@TranslateCode(value="[{hasStatus:has_status}]")
	@ResponseBody
	@PostMapping("/datatables")
    public DatatablesPageBean datatables(HttpServletRequest request , Model model ,  DatatablesPageBean page){
		log.debug("page = {}" , ToStringBuilder.reflectionToString(page));
		return this.toPage(model, this.getFeign() , page) ;
    }

	@Override
	public IStudentClassesService getFeign() {
		return this.studentClassesService;
	}

}


























