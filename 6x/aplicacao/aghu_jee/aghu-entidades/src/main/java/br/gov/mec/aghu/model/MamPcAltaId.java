package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamPcAltaId generated by hbm2java
 */
@Embeddable
public class MamPcAltaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2502798221882466505L;
	private Integer ppePleSeq;
	private Integer ppeSeqp;
	private Short seqp;

	public MamPcAltaId() {
	}

	public MamPcAltaId(Integer ppePleSeq, Integer ppeSeqp, Short seqp) {
		this.ppePleSeq = ppePleSeq;
		this.ppeSeqp = ppeSeqp;
		this.seqp = seqp;
	}

	@Column(name = "PPE_PLE_SEQ", nullable = false)
	public Integer getPpePleSeq() {
		return this.ppePleSeq;
	}

	public void setPpePleSeq(Integer ppePleSeq) {
		this.ppePleSeq = ppePleSeq;
	}

	@Column(name = "PPE_SEQP", nullable = false)
	public Integer getPpeSeqp() {
		return this.ppeSeqp;
	}

	public void setPpeSeqp(Integer ppeSeqp) {
		this.ppeSeqp = ppeSeqp;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getPpePleSeq());
		umHashCodeBuilder.append(this.getPpeSeqp());
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
		if (!(obj instanceof MamPcAltaId)) {
			return false;
		}
		MamPcAltaId other = (MamPcAltaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getPpePleSeq(), other.getPpePleSeq());
		umEqualsBuilder.append(this.getPpeSeqp(), other.getPpeSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}