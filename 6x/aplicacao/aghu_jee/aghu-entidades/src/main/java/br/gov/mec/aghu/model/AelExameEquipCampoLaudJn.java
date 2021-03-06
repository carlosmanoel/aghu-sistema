package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelExameEquipCampoLaudJn generated by hbm2java
 */
@Entity
@Table(name = "AEL_EXAME_EQUIP_CAMPOS_LAUD_JN", schema = "AGH")
@Immutable
public class AelExameEquipCampoLaudJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = 8252063021544251393L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private String pclVelEmaExaSigla;
	private Integer pclVelEmaManSeq;
	private Integer pclVelSeqp;
	private Integer pclCalSeq;
	private Integer pclSeqp;
	private String eeqEemEmaExaSigla;
	private Integer eeqEemEmaManSeq;
	private Short eeqEemEquSeq;
	private String eeqEemProgramacao;
	private String eeqCodigo;
	private String eeqNumero;
	private Short ordem;

	public AelExameEquipCampoLaudJn() {
	}

	public AelExameEquipCampoLaudJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, String pclVelEmaExaSigla,
			Integer pclVelEmaManSeq, Integer pclVelSeqp, Integer pclCalSeq, Integer pclSeqp, String eeqEemEmaExaSigla, Integer eeqEemEmaManSeq,
			Short eeqEemEquSeq, String eeqEemProgramacao, String eeqCodigo, String eeqNumero) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pclVelEmaExaSigla = pclVelEmaExaSigla;
		this.pclVelEmaManSeq = pclVelEmaManSeq;
		this.pclVelSeqp = pclVelSeqp;
		this.pclCalSeq = pclCalSeq;
		this.pclSeqp = pclSeqp;
		this.eeqEemEmaExaSigla = eeqEemEmaExaSigla;
		this.eeqEemEmaManSeq = eeqEemEmaManSeq;
		this.eeqEemEquSeq = eeqEemEquSeq;
		this.eeqEemProgramacao = eeqEemProgramacao;
		this.eeqCodigo = eeqCodigo;
		this.eeqNumero = eeqNumero;
	}

	public AelExameEquipCampoLaudJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, String pclVelEmaExaSigla,
			Integer pclVelEmaManSeq, Integer pclVelSeqp, Integer pclCalSeq, Integer pclSeqp, String eeqEemEmaExaSigla, Integer eeqEemEmaManSeq,
			Short eeqEemEquSeq, String eeqEemProgramacao, String eeqCodigo, String eeqNumero, Short ordem) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pclVelEmaExaSigla = pclVelEmaExaSigla;
		this.pclVelEmaManSeq = pclVelEmaManSeq;
		this.pclVelSeqp = pclVelSeqp;
		this.pclCalSeq = pclCalSeq;
		this.pclSeqp = pclSeqp;
		this.eeqEemEmaExaSigla = eeqEemEmaExaSigla;
		this.eeqEemEmaManSeq = eeqEemEmaManSeq;
		this.eeqEemEquSeq = eeqEemEquSeq;
		this.eeqEemProgramacao = eeqEemProgramacao;
		this.eeqCodigo = eeqCodigo;
		this.eeqNumero = eeqNumero;
		this.ordem = ordem;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	// ATUALIZADOR JOURNALS - ID
	
/* ATUALIZADOR JOURNALS - Get / Set	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JN_DATE_TIME", nullable = false, length = 29)
	public Date getJnDateTime() {
		return this.jnDateTime;
	}

	public void setJnDateTime(Date jnDateTime) {
		this.jnDateTime = jnDateTime;
	}

	@Column(name = "JN_OPERATION", nullable = false, length = 3)
	@Length(max = 3)
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}*/

	@Column(name = "PCL_VEL_EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getPclVelEmaExaSigla() {
		return this.pclVelEmaExaSigla;
	}

	public void setPclVelEmaExaSigla(String pclVelEmaExaSigla) {
		this.pclVelEmaExaSigla = pclVelEmaExaSigla;
	}

	@Column(name = "PCL_VEL_EMA_MAN_SEQ", nullable = false)
	public Integer getPclVelEmaManSeq() {
		return this.pclVelEmaManSeq;
	}

	public void setPclVelEmaManSeq(Integer pclVelEmaManSeq) {
		this.pclVelEmaManSeq = pclVelEmaManSeq;
	}

	@Column(name = "PCL_VEL_SEQP", nullable = false)
	public Integer getPclVelSeqp() {
		return this.pclVelSeqp;
	}

	public void setPclVelSeqp(Integer pclVelSeqp) {
		this.pclVelSeqp = pclVelSeqp;
	}

	@Column(name = "PCL_CAL_SEQ", nullable = false)
	public Integer getPclCalSeq() {
		return this.pclCalSeq;
	}

	public void setPclCalSeq(Integer pclCalSeq) {
		this.pclCalSeq = pclCalSeq;
	}

	@Column(name = "PCL_SEQP", nullable = false)
	public Integer getPclSeqp() {
		return this.pclSeqp;
	}

	public void setPclSeqp(Integer pclSeqp) {
		this.pclSeqp = pclSeqp;
	}

	@Column(name = "EEQ_EEM_EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEeqEemEmaExaSigla() {
		return this.eeqEemEmaExaSigla;
	}

	public void setEeqEemEmaExaSigla(String eeqEemEmaExaSigla) {
		this.eeqEemEmaExaSigla = eeqEemEmaExaSigla;
	}

	@Column(name = "EEQ_EEM_EMA_MAN_SEQ", nullable = false)
	public Integer getEeqEemEmaManSeq() {
		return this.eeqEemEmaManSeq;
	}

	public void setEeqEemEmaManSeq(Integer eeqEemEmaManSeq) {
		this.eeqEemEmaManSeq = eeqEemEmaManSeq;
	}

	@Column(name = "EEQ_EEM_EQU_SEQ", nullable = false)
	public Short getEeqEemEquSeq() {
		return this.eeqEemEquSeq;
	}

	public void setEeqEemEquSeq(Short eeqEemEquSeq) {
		this.eeqEemEquSeq = eeqEemEquSeq;
	}

	@Column(name = "EEQ_EEM_PROGRAMACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getEeqEemProgramacao() {
		return this.eeqEemProgramacao;
	}

	public void setEeqEemProgramacao(String eeqEemProgramacao) {
		this.eeqEemProgramacao = eeqEemProgramacao;
	}

	@Column(name = "EEQ_CODIGO", nullable = false, length = 3)
	@Length(max = 3)
	public String getEeqCodigo() {
		return this.eeqCodigo;
	}

	public void setEeqCodigo(String eeqCodigo) {
		this.eeqCodigo = eeqCodigo;
	}

	@Column(name = "EEQ_NUMERO", nullable = false, length = 2)
	@Length(max = 2)
	public String getEeqNumero() {
		return this.eeqNumero;
	}

	public void setEeqNumero(String eeqNumero) {
		this.eeqNumero = eeqNumero;
	}

	@Column(name = "ORDEM")
	public Short getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Short ordem) {
		this.ordem = ordem;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		PCL_VEL_EMA_EXA_SIGLA("pclVelEmaExaSigla"),
		PCL_VEL_EMA_MAN_SEQ("pclVelEmaManSeq"),
		PCL_VEL_SEQP("pclVelSeqp"),
		PCL_CAL_SEQ("pclCalSeq"),
		PCL_SEQP("pclSeqp"),
		EEQ_EEM_EMA_EXA_SIGLA("eeqEemEmaExaSigla"),
		EEQ_EEM_EMA_MAN_SEQ("eeqEemEmaManSeq"),
		EEQ_EEM_EQU_SEQ("eeqEemEquSeq"),
		EEQ_EEM_PROGRAMACAO("eeqEemProgramacao"),
		EEQ_CODIGO("eeqCodigo"),
		EEQ_NUMERO("eeqNumero"),
		ORDEM("ordem");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}
