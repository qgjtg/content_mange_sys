package cn.com.aiidc.cms.entity;
// Generated 2017-1-9 15:32:23 by Hibernate Tools 5.1.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TSign generated by hbm2java
 */
@Entity
@Table(name = "t_sign", catalog = "aiidc_cms")
public class TSign implements java.io.Serializable {

	private Long signId;
	private Long contentId;
	private Integer signUserId;
	private Integer depId;
	private Date signTime;

	public TSign() {
	}

	public TSign(Long contentId, Integer signUserId, Integer depId, Date signTime) {
		this.contentId = contentId;
		this.signUserId = signUserId;
		this.depId = depId;
		this.signTime = signTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "sign_id", unique = true, nullable = false)
	public Long getSignId() {
		return this.signId;
	}

	public void setSignId(Long signId) {
		this.signId = signId;
	}

	@Column(name = "contentId")
	public Long getContentId() {
		return this.contentId;
	}

	public void setContentId(Long contentId) {
		this.contentId = contentId;
	}

	@Column(name = "sign_user_id")
	public Integer getSignUserId() {
		return this.signUserId;
	}

	public void setSignUserId(Integer signUserId) {
		this.signUserId = signUserId;
	}

	@Column(name = "dep_id")
	public Integer getDepId() {
		return this.depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sign_time", length = 19)
	public Date getSignTime() {
		return this.signTime;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

}
