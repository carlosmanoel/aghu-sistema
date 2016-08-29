package br.gov.mec.aghu.model;

// Generated 19/03/2010 12:41:50 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcEspecialidadeProcCirgsId generated by hbm2java
 */

@Embeddable
public class MbcEspecialidadeProcCirgsId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3315247517429592487L;
	private Integer pciSeq;
	private Short espSeq;

	public MbcEspecialidadeProcCirgsId() {
	}

	public MbcEspecialidadeProcCirgsId(Integer pciSeq, Short espSeq) {
		this.pciSeq = pciSeq;
		this.espSeq = espSeq;
	}

	@Column(name = "PCI_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getPciSeq() {
		return this.pciSeq;
	}

	public void setPciSeq(Integer pciSeq) {
		this.pciSeq = pciSeq;
	}

	@Column(name = "ESP_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MbcEspecialidadeProcCirgsId)) {
			return false;
		}
		MbcEspecialidadeProcCirgsId other = (MbcEspecialidadeProcCirgsId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getEspSeq(), other.getEspSeq());
		umEqualsBuilder.append(this.getPciSeq(), other.getPciSeq());

		return umEqualsBuilder.isEquals();
	}

	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getEspSeq());
		umHashCodeBuilder.append(this.getPciSeq());
		return umHashCodeBuilder.toHashCode();
	}
}