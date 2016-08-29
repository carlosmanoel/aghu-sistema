package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MciGrpMatInfectanteReportId generated by hbm2java
 */
@Embeddable
public class MciGrpMatInfectanteReportId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 172121366661186215L;
	private String pmcAplicacaoCodigo;
	private Short gmiSeq;

	public MciGrpMatInfectanteReportId() {
	}

	public MciGrpMatInfectanteReportId(String pmcAplicacaoCodigo, Short gmiSeq) {
		this.pmcAplicacaoCodigo = pmcAplicacaoCodigo;
		this.gmiSeq = gmiSeq;
	}

	@Column(name = "PMC_APLICACAO_CODIGO", nullable = false, length = 20)
	@Length(max = 20)
	public String getPmcAplicacaoCodigo() {
		return this.pmcAplicacaoCodigo;
	}

	public void setPmcAplicacaoCodigo(String pmcAplicacaoCodigo) {
		this.pmcAplicacaoCodigo = pmcAplicacaoCodigo;
	}

	@Column(name = "GMI_SEQ", nullable = false)
	public Short getGmiSeq() {
		return this.gmiSeq;
	}

	public void setGmiSeq(Short gmiSeq) {
		this.gmiSeq = gmiSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPmcAplicacaoCodigo());
		umHashCodeBuilder.append(this.getGmiSeq());
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
		if (!(obj instanceof MciGrpMatInfectanteReportId)) {
			return false;
		}
		MciGrpMatInfectanteReportId other = (MciGrpMatInfectanteReportId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPmcAplicacaoCodigo(), other.getPmcAplicacaoCodigo());
		umEqualsBuilder.append(this.getGmiSeq(), other.getGmiSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}