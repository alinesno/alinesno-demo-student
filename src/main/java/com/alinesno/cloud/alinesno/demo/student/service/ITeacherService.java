package com.alinesno.cloud.alinesno.demo.student.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.alinesno.demo.student.entity.TeacherEntity;
import com.alinesno.cloud.common.facade.services.IBaseService;

/**
 * <p> 教程 服务类 </p>
 *
 * @author 张三
 * @since 2019-10-07 22:02:06
 */
@NoRepositoryBean
public interface ITeacherService extends IBaseService<TeacherEntity, String> {

}