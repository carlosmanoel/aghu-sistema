package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamMtvAtendEspecialidadeId generated by hbm2java
 */
@Embeddable
public class MamMtvAtendEspecialidadeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4808150252580522375L;
	private Short espSeq;
	private Integer cidSeq;

	public MamMtvAtendEspecialidadeId() {
	}

	public MamMtvAtendEspecialidadeId(Short espSeq, Integer cidSeq) {
		this.espSeq = espSeq;
		this.cidSeq = cidSeq;
	}

	@Column(name = "ESP_SEQ", nullable = false)
	public Short getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}

	@Column(name = "CID_SEQ", nullable = false)
	public Integer getCidSeq() {
		return this.cidSeq;
	}

	public void setCidSeq(Integer cidSeq) {
		this.cidSeq = cidSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getEspSeq());
		umHashCodeBuilder.append(this.getCidSeq());
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
		if (!(obj instanceof MamMtvAtendEspecialidadeId)) {
			return false;
		}
		MamMtvAtendEspecialidadeId other = (MamMtvAtendEspecialidadeId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getEspSeq(), other.getEspSeq());
		umEqualsBuilder.append(this.getCidSeq(), other.getCidSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
