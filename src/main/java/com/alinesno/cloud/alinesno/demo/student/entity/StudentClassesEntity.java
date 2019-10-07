package com.alinesno.cloud.alinesno.demo.student.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import com.alinesno.cloud.common.facade.orm.entity.BaseEntity;


/**
 * <p>
 * 班级
 * </p>
 *
 * @author 张三
 * @since 2019-10-07 22:12:48
 */
@Entity
@Table(name="student_classes")
public class StudentClassesEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 班级名称
     */
	@Column(name="classes_name")
	private String classesName;
    /**
     * 班主任
     */
	@Column(name="classes_master")
	private String classesMaster;


	public String getClassesName() {
		return classesName;
	}

	public void setClassesName(String classesName) {
		this.classesName = classesName;
	}

	public String getClassesMaster() {
		return classesMaster;
	}

	public void setClassesMaster(String classesMaster) {
		this.classesMaster = classesMaster;
	}


	@Override
	public String toString() {
		return "StudentClassesEntity{" +
			"classesName=" + classesName +
			", classesMaster=" + classesMaster +
			"}";
	}
}
