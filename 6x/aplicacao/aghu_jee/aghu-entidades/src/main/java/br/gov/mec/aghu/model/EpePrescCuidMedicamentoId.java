package br.gov.mec.aghu.model;

// Generated 17/10/2011 14:21:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * EpePrescCuidMedicamentosId generated by hbm2java
 */
@Embeddable
public class EpePrescCuidMedicamentoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5895554917932624560L;
	private Integer prcAtdSeq;
	private Short prcSeq;
	private Short cmeCuiSeq;
	private Integer cmeMedMatCodigo;

	public EpePrescCuidMedicamentoId() {
	}

	public EpePrescCuidMedicamentoId(Integer prcAtdSeq, Short prcSeq,
			Short cmeCuiSeq, Integer cmeMedMatCodigo) {
		this.prcAtdSeq = prcAtdSeq;
		this.prcSeq = prcSeq;
		this.cmeCuiSeq = cmeCuiSeq;
		this.cmeMedMatCodigo = cmeMedMatCodigo;
	}

	@Column(name = "PRC_ATD_SEQ", nullable = false, precision = 9, scale = 0)
	public Integer getPrcAtdSeq() {
		return this.prcAtdSeq;
	}

	public void setPrcAtdSeq(Integer prcAtdSeq) {
		this.prcAtdSeq = prcAtdSeq;
	}

	@Column(name = "PRC_SEQ", nullable = false, precision = 3, scale = 0)
	public Short getPrcSeq() {
		return this.prcSeq;
	}

	public void setPrcSeq(Short prcSeq) {
		this.prcSeq = prcSeq;
	}

	@Column(name = "CME_CUI_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getCmeCuiSeq() {
		return this.cmeCuiSeq;
	}

	public void setCmeCuiSeq(Short cmeCuiSeq) {
		this.cmeCuiSeq = cmeCuiSeq;
	}

	@Column(name = "CME_MED_MAT_CODIGO", nullable = false, precision = 6, scale = 0)
	public Integer getCmeMedMatCodigo() {
		return this.cmeMedMatCodigo;
	}

	public void setCmeMedMatCodigo(Integer cmeMedMatCodigo) {
		this.cmeMedMatCodigo = cmeMedMatCodigo;
	}



	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPrcSeq());
		umHashCodeBuilder.append(this.getPrcAtdSeq());
		umHashCodeBuilder.append(this.getCmeCuiSeq());
		umHashCodeBuilder.append(this.getCmeMedMatCodigo());
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
		if (!(obj instanceof EpePrescCuidMedicamentoId)) {
			return false;
		}
		EpePrescCuidMedicamentoId other = (EpePrescCuidMedicamentoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPrcSeq(), other.getPrcSeq());
		umEqualsBuilder.append(this.getPrcAtdSeq(), other.getPrcAtdSeq());
		umEqualsBuilder.append(this.getCmeCuiSeq(), other.getCmeCuiSeq());
		umEqualsBuilder.append(this.getCmeMedMatCodigo(), other.getCmeMedMatCodigo());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}