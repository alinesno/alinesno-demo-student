package com.alinesno.cloud.alinesno.demo.student.service.impl;

import com.alinesno.cloud.alinesno.demo.student.entity.TeacherEntity;
import com.alinesno.cloud.alinesno.demo.student.service.ITeacherService;
import com.alinesno.cloud.common.core.service.impl.IBaseServiceImpl;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p> 教程 服务实现类 </p>
 *
 * @author 张三
 * @since 2019-10-07 22:02:06
 */
@Service
public class TeacherServiceImpl extends IBaseServiceImpl<TeacherEntity, String> implements ITeacherService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(TeacherServiceImpl.class);

}
