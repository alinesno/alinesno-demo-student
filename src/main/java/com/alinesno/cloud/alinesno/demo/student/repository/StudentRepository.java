package com.alinesno.cloud.alinesno.demo.student.repository;

import com.alinesno.cloud.alinesno.demo.student.entity.StudentEntity;
import com.alinesno.cloud.common.facade.orm.repository.IBaseJpaRepository;

/**
 * <p>
  * 学生 持久层接口
 * </p>
 *
 * @author 张三
 * @since 2019-10-07 22:02:06
 */
public interface StudentRepository extends IBaseJpaRepository<StudentEntity, String> {

}
