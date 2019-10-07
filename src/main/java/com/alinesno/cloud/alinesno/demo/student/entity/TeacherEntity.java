package com.alinesno.cloud.alinesno.demo.student.entity;

import javax.persistence.Column;
import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Entity;
import com.alibaba.fastjson.annotation.JSONField;
import com.alinesno.cloud.common.facade.orm.entity.BaseEntity;


/**
 * <p>
 * 教程
 * </p>
 *
 * @author 张三
 * @since 2019-10-07 22:02:06
 */
@Entity
@Table(name="teacher")
public class TeacherEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 老师名称
     */
	@Column(name="teacher_name")
	private String teacherName;
    /**
     * 老师头像
     */
	@Column(name="teracher_avotor")
	private String teracherAvotor;
    /**
     * 管理班级
     */
	@Column(name="classes_name")
	private String classesName;
    /**
     * 老师地址
     */
	@Column(name="teacher_address")
	private String teacherAddress;
    /**
     * 老师生日
     */
	@Column(name="teacher_birthday")
	@JSONField(format="yyyy-MM-dd")
	private Date teacherBirthday;


	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeracherAvotor() {
		return teracherAvotor;
	}

	public void setTeracherAvotor(String teracherAvotor) {
		this.teracherAvotor = teracherAvotor;
	}

	public String getClassesName() {
		return classesName;
	}

	public void setClassesName(String classesName) {
		this.classesName = classesName;
	}

	public String getTeacherAddress() {
		return teacherAddress;
	}

	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}

	public Date getTeacherBirthday() {
		return teacherBirthday;
	}

	public void setTeacherBirthday(Date teacherBirthday) {
		this.teacherBirthday = teacherBirthday;
	}


	@Override
	public String toString() {
		return "TeacherEntity{" +
			"teacherName=" + teacherName +
			", teracherAvotor=" + teracherAvotor +
			", classesName=" + classesName +
			", teacherAddress=" + teacherAddress +
			", teacherBirthday=" + teacherBirthday +
			"}";
	}
}
