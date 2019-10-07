package com.alinesno.cloud.alinesno.demo.student.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.alinesno.demo.student.entity.StudentClassesEntity;
import com.alinesno.cloud.common.facade.services.IBaseService;

/**
 * <p> 班级 服务类 </p>
 *
 * @author 张三
 * @since 2019-10-07 22:12:48
 */
@NoRepositoryBean
public interface IStudentClassesService extends IBaseService<StudentClassesEntity, String> {

}
