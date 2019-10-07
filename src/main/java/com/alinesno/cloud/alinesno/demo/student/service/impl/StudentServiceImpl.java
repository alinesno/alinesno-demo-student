package com.alinesno.cloud.alinesno.demo.student.service.impl;

import com.alinesno.cloud.alinesno.demo.student.entity.StudentEntity;
import com.alinesno.cloud.alinesno.demo.student.service.IStudentService;
import com.alinesno.cloud.common.core.service.impl.IBaseServiceImpl;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p> 学生 服务实现类 </p>
 *
 * @author 张三
 * @since 2019-10-07 22:02:06
 */
@Service
public class StudentServiceImpl extends IBaseServiceImpl<StudentEntity, String> implements IStudentService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

}
