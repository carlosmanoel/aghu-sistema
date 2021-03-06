package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapTmpGfipId generated by hbm2java
 */
@Embeddable
public class RapTmpGfipId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1537381010048985484L;
	private Integer codStarh;
	private Date dataInicio;
	private Short gfip;

	public RapTmpGfipId() {
	}

	public RapTmpGfipId(Integer codStarh, Date dataInicio, Short gfip) {
		this.codStarh = codStarh;
		this.dataInicio = dataInicio;
		this.gfip = gfip;
	}

	@Column(name = "COD_STARH", nullable = false)
	public Integer getCodStarh() {
		return this.codStarh;
	}

	public void setCodStarh(Integer codStarh) {
		this.codStarh = codStarh;
	}

	@Column(name = "DATA_INICIO", nullable = false, length = 29)
	public Date getDataInicio() {
		return this.dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	@Column(name = "GFIP", nullable = false)
	public Short getGfip() {
		return this.gfip;
	}

	public void setGfip(Short gfip) {
		this.gfip = gfip;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getDataInicio());
		umHashCodeBuilder.append(this.getCodStarh());
		umHashCodeBuilder.append(this.getGfip());
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
		if (!(obj instanceof RapTmpGfipId)) {
			return false;
		}
		RapTmpGfipId other = (RapTmpGfipId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getDataInicio(), other.getDataInicio());
		umEqualsBuilder.append(this.getCodStarh(), other.getCodStarh());
		umEqualsBuilder.append(this.getGfip(), other.getGfip());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
