package com.alinesno.cloud.alinesno.demo.student.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import com.alinesno.cloud.common.facade.orm.entity.BaseEntity;


/**
 * <p>
 * 学生分数
 * </p>
 *
 * @author 张三
 * @since 2019-10-07 22:02:06
 */
@Entity
@Table(name="learn_score")
public class LearnScoreEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 所属学生
     */
	@Column(name="student_id")
	private Float studentId;
    /**
     * 数学
     */
	@Column(name="math_score")
	private Float mathScore;
    /**
     * 中文
     */
	@Column(name="china_score")
	private Float chinaScore;
    /**
     * 英语
     */
	@Column(name="english_score")
	private Float englishScore;
    /**
     * 物理
     */
	@Column(name="physics_score")
	private Float physicsScore;
    /**
     * 微积分
     */
	@Column(name="calculus_score")
	private Float calculusScore;
    /**
     * 图形学
     */
	@Column(name="graphics_score")
	private Float graphicsScore;


	public Float getStudentId() {
		return studentId;
	}

	public void setStudentId(Float studentId) {
		this.studentId = studentId;
	}

	public Float getMathScore() {
		return mathScore;
	}

	public void setMathScore(Float mathScore) {
		this.mathScore = mathScore;
	}

	public Float getChinaScore() {
		return chinaScore;
	}

	public void setChinaScore(Float chinaScore) {
		this.chinaScore = chinaScore;
	}

	public Float getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(Float englishScore) {
		this.englishScore = englishScore;
	}

	public Float getPhysicsScore() {
		return physicsScore;
	}

	public void setPhysicsScore(Float physicsScore) {
		this.physicsScore = physicsScore;
	}

	public Float getCalculusScore() {
		return calculusScore;
	}

	public void setCalculusScore(Float calculusScore) {
		this.calculusScore = calculusScore;
	}

	public Float getGraphicsScore() {
		return graphicsScore;
	}

	public void setGraphicsScore(Float graphicsScore) {
		this.graphicsScore = graphicsScore;
	}


	@Override
	public String toString() {
		return "LearnScoreEntity{" +
			"studentId=" + studentId +
			", mathScore=" + mathScore +
			", chinaScore=" + chinaScore +
			", englishScore=" + englishScore +
			", physicsScore=" + physicsScore +
			", calculusScore=" + calculusScore +
			", graphicsScore=" + graphicsScore +
			"}";
	}
}
