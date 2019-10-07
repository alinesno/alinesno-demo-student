package com.alinesno.cloud.alinesno.demo.student.service.impl;

import com.alinesno.cloud.alinesno.demo.student.entity.StudentClassesEntity;
import com.alinesno.cloud.alinesno.demo.student.service.IStudentClassesService;
import com.alinesno.cloud.common.core.service.impl.IBaseServiceImpl;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p> 班级 服务实现类 </p>
 *
 * @author 张三
 * @since 2019-10-07 22:12:48
 */
@Service
public class StudentClassesServiceImpl extends IBaseServiceImpl<StudentClassesEntity, String> implements IStudentClassesService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(StudentClassesServiceImpl.class);

}
