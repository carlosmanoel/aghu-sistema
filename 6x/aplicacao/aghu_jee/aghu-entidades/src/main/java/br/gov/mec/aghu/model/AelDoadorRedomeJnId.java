package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelDoadorRedomeJnId generated by hbm2java
 */
@Embeddable
public class AelDoadorRedomeJnId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 731956224440600665L;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;
	private Integer seq;
	private String codigoHemocentro;
	private Integer codigoRedome;
	private Date dataColeta;
	private Integer pacCodigo;
	private Integer laeSeq;
	private BigDecimal campCodigo;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date alteradoEm;
	private Integer serMatriculaAlterado;
	private Short serVinCodigoAlterado;
	private String contato1;
	private Short dddFoneContato1;
	private Long foneContato1;
	private String contato2;
	private Short dddFoneContato2;
	private Long foneContato2;
	private String fumante;

	public AelDoadorRedomeJnId() {
	}

	public AelDoadorRedomeJnId(String jnUser, Date jnDateTime, String jnOperation, Integer seq) {
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;
		this.seq = seq;
	}

	public AelDoadorRedomeJnId(String jnUser, Date jnDateTime, String jnOperation, Integer seq, String codigoHemocentro,
			Integer codigoRedome, Date dataColeta, Integer pacCodigo, Integer laeSeq, BigDecimal campCodigo, Date criadoEm,
			Integer serMatricula, Short serVinCodigo, Date alteradoEm, Integer serMatriculaAlterado, Short serVinCodigoAlterado,
			String contato1, Short dddFoneContato1, Long foneContato1, String contato2, Short dddFoneContato2, Long foneContato2,
			String fumante) {
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;
		this.seq = seq;
		this.codigoHemocentro = codigoHemocentro;
		this.codigoRedome = codigoRedome;
		this.dataColeta = dataColeta;
		this.pacCodigo = pacCodigo;
		this.laeSeq = laeSeq;
		this.campCodigo = campCodigo;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.alteradoEm = alteradoEm;
		this.serMatriculaAlterado = serMatriculaAlterado;
		this.serVinCodigoAlterado = serVinCodigoAlterado;
		this.contato1 = contato1;
		this.dddFoneContato1 = dddFoneContato1;
		this.foneContato1 = foneContato1;
		this.contato2 = contato2;
		this.dddFoneContato2 = dddFoneContato2;
		this.foneContato2 = foneContato2;
		this.fumante = fumante;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

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
	}

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "CODIGO_HEMOCENTRO", length = 15)
	@Length(max = 15)
	public String getCodigoHemocentro() {
		return this.codigoHemocentro;
	}

	public void setCodigoHemocentro(String codigoHemocentro) {
		this.codigoHemocentro = codigoHemocentro;
	}

	@Column(name = "CODIGO_REDOME")
	public Integer getCodigoRedome() {
		return this.codigoRedome;
	}

	public void setCodigoRedome(Integer codigoRedome) {
		this.codigoRedome = codigoRedome;
	}

	@Column(name = "DATA_COLETA", length = 29)
	public Date getDataColeta() {
		return this.dataColeta;
	}

	public void setDataColeta(Date dataColeta) {
		this.dataColeta = dataColeta;
	}

	@Column(name = "PAC_CODIGO")
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "LAE_SEQ")
	public Integer getLaeSeq() {
		return this.laeSeq;
	}

	public void setLaeSeq(Integer laeSeq) {
		this.laeSeq = laeSeq;
	}

	@Column(name = "CAMP_CODIGO", precision = 131089, scale = 0)
	public BigDecimal getCampCodigo() {
		return this.campCodigo;
	}

	public void setCampCodigo(BigDecimal campCodigo) {
		this.campCodigo = campCodigo;
	}

	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "SER_MATRICULA_ALTERADO")
	public Integer getSerMatriculaAlterado() {
		return this.serMatriculaAlterado;
	}

	public void setSerMatriculaAlterado(Integer serMatriculaAlterado) {
		this.serMatriculaAlterado = serMatriculaAlterado;
	}

	@Column(name = "SER_VIN_CODIGO_ALTERADO")
	public Short getSerVinCodigoAlterado() {
		return this.serVinCodigoAlterado;
	}

	public void setSerVinCodigoAlterado(Short serVinCodigoAlterado) {
		this.serVinCodigoAlterado = serVinCodigoAlterado;
	}

	@Column(name = "CONTATO_1", length = 50)
	@Length(max = 50)
	public String getContato1() {
		return this.contato1;
	}

	public void setContato1(String contato1) {
		this.contato1 = contato1;
	}

	@Column(name = "DDD_FONE_CONTATO_1")
	public Short getDddFoneContato1() {
		return this.dddFoneContato1;
	}

	public void setDddFoneContato1(Short dddFoneContato1) {
		this.dddFoneContato1 = dddFoneContato1;
	}

	@Column(name = "FONE_CONTATO_1")
	public Long getFoneContato1() {
		return this.foneContato1;
	}

	public void setFoneContato1(Long foneContato1) {
		this.foneContato1 = foneContato1;
	}

	@Column(name = "CONTATO_2", length = 50)
	@Length(max = 50)
	public String getContato2() {
		return this.contato2;
	}

	public void setContato2(String contato2) {
		this.contato2 = contato2;
	}

	@Column(name = "DDD_FONE_CONTATO_2")
	public Short getDddFoneContato2() {
		return this.dddFoneContato2;
	}

	public void setDddFoneContato2(Short dddFoneContato2) {
		this.dddFoneContato2 = dddFoneContato2;
	}

	@Column(name = "FONE_CONTATO_2")
	public Long getFoneContato2() {
		return this.foneContato2;
	}

	public void setFoneContato2(Long foneContato2) {
		this.foneContato2 = foneContato2;
	}

	@Column(name = "FUMANTE", length = 1)
	@Length(max = 1)
	public String getFumante() {
		return this.fumante;
	}

	public void setFumante(String fumante) {
		this.fumante = fumante;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCriadoEm());
		umHashCodeBuilder.append(this.getSerMatricula());
		umHashCodeBuilder.append(this.getSerVinCodigo());
		umHashCodeBuilder.append(this.getSeq());
		umHashCodeBuilder.append(this.getPacCodigo());
		umHashCodeBuilder.append(this.getAlteradoEm());
		umHashCodeBuilder.append(this.getJnUser());
		umHashCodeBuilder.append(this.getJnDateTime());
		umHashCodeBuilder.append(this.getJnOperation());
		umHashCodeBuilder.append(this.getSerMatriculaAlterado());
		umHashCodeBuilder.append(this.getSerVinCodigoAlterado());
		umHashCodeBuilder.append(this.getLaeSeq());
		umHashCodeBuilder.append(this.getCodigoHemocentro());
		umHashCodeBuilder.append(this.getCodigoRedome());
		umHashCodeBuilder.append(this.getDataColeta());
		umHashCodeBuilder.append(this.getCampCodigo());
		umHashCodeBuilder.append(this.getContato1());
		umHashCodeBuilder.append(this.getDddFoneContato1());
		umHashCodeBuilder.append(this.getFoneContato1());
		umHashCodeBuilder.append(this.getContato2());
		umHashCodeBuilder.append(this.getDddFoneContato2());
		umHashCodeBuilder.append(this.getFoneContato2());
		umHashCodeBuilder.append(this.getFumante());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AelDoadorRedomeJnId)) {
			return false;
		}
		AelDoadorRedomeJnId other = (AelDoadorRedomeJnId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCriadoEm(), other.getCriadoEm());
		umEqualsBuilder.append(this.getSerMatricula(), other.getSerMatricula());
		umEqualsBuilder.append(this.getSerVinCodigo(), other.getSerVinCodigo());
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getPacCodigo(), other.getPacCodigo());
		umEqualsBuilder.append(this.getAlteradoEm(), other.getAlteradoEm());
		umEqualsBuilder.append(this.getJnUser(), other.getJnUser());
		umEqualsBuilder.append(this.getJnDateTime(), other.getJnDateTime());
		umEqualsBuilder.append(this.getJnOperation(), other.getJnOperation());
		umEqualsBuilder.append(this.getSerMatriculaAlterado(), other.getSerMatriculaAlterado());
		umEqualsBuilder.append(this.getSerVinCodigoAlterado(), other.getSerVinCodigoAlterado());
		umEqualsBuilder.append(this.getLaeSeq(), other.getLaeSeq());
		umEqualsBuilder.append(this.getCodigoHemocentro(), other.getCodigoHemocentro());
		umEqualsBuilder.append(this.getCodigoRedome(), other.getCodigoRedome());
		umEqualsBuilder.append(this.getDataColeta(), other.getDataColeta());
		umEqualsBuilder.append(this.getCampCodigo(), other.getCampCodigo());
		umEqualsBuilder.append(this.getContato1(), other.getContato1());
		umEqualsBuilder.append(this.getDddFoneContato1(), other.getDddFoneContato1());
		umEqualsBuilder.append(this.getFoneContato1(), other.getFoneContato1());
		umEqualsBuilder.append(this.getContato2(), other.getContato2());
		umEqualsBuilder.append(this.getDddFoneContato2(), other.getDddFoneContato2());
		umEqualsBuilder.append(this.getFoneContato2(), other.getFoneContato2());
		umEqualsBuilder.append(this.getFumante(), other.getFumante());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}