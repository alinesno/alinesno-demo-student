package com.alinesno.cloud.alinesno.demo.student.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.alinesno.demo.student.entity.StudentEntity;
import com.alinesno.cloud.common.facade.services.IBaseService;

/**
 * <p> 学生 服务类 </p>
 *
 * @author 张三
 * @since 2019-10-07 22:02:06
 */
@NoRepositoryBean
public interface IStudentService extends IBaseService<StudentEntity, String> {

}
