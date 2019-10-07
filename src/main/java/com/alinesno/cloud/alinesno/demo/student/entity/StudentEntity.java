package com.alinesno.cloud.alinesno.demo.student.entity;

import javax.persistence.Column;
import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Entity;
import com.alibaba.fastjson.annotation.JSONField;
import com.alinesno.cloud.common.facade.orm.entity.BaseEntity;


/**
 * <p>
 * 学生
 * </p>
 *
 * @author 张三
 * @since 2019-10-07 22:02:06
 */
@Entity
@Table(name="student")
public class StudentEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 学生姓名
     */
	@Column(name="student_name")
	private String studentName;
    /**
     * 学号
     */
	@Column(name="student_number")
	private String studentNumber;
    /**
     * 生日
     */
	@Column(name="student_birthday")
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date studentBirthday;
    /**
     * 学生住址
     */
	@Column(name="student_address")
	private String studentAddress;
    /**
     * 民族
     */
	@Column(name="student_natice")
	private String studentNatice;
    /**
     * 学生电话
     */
	@Column(name="student_phone")
	private String studentPhone;
    /**
     * 学生头像
     */
	@Column(name="student_avotor")
	private String studentAvotor;


	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Date getStudentBirthday() {
		return studentBirthday;
	}

	public void setStudentBirthday(Date studentBirthday) {
		this.studentBirthday = studentBirthday;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentNatice() {
		return studentNatice;
	}

	public void setStudentNatice(String studentNatice) {
		this.studentNatice = studentNatice;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentAvotor() {
		return studentAvotor;
	}

	public void setStudentAvotor(String studentAvotor) {
		this.studentAvotor = studentAvotor;
	}


	@Override
	public String toString() {
		return "StudentEntity{" +
			"studentName=" + studentName +
			", studentNumber=" + studentNumber +
			", studentBirthday=" + studentBirthday +
			", studentAddress=" + studentAddress +
			", studentNatice=" + studentNatice +
			", studentPhone=" + studentPhone +
			", studentAvotor=" + studentAvotor +
			"}";
	}
}
