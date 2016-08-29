package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MptHorarioGradeSessaoId generated by hbm2java
 */
@Embeddable
public class MptHorarioGradeSessaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5415480186982005287L;
	private Integer gseSeq;
	private Short seqp;

	public MptHorarioGradeSessaoId() {
	}

	public MptHorarioGradeSessaoId(Integer gseSeq, Short seqp) {
		this.gseSeq = gseSeq;
		this.seqp = seqp;
	}

	@Column(name = "GSE_SEQ", nullable = false)
	public Integer getGseSeq() {
		return this.gseSeq;
	}

	public void setGseSeq(Integer gseSeq) {
		this.gseSeq = gseSeq;
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
		umHashCodeBuilder.append(this.getGseSeq());
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
		if (!(obj instanceof MptHorarioGradeSessaoId)) {
			return false;
		}
		MptHorarioGradeSessaoId other = (MptHorarioGradeSessaoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getGseSeq(), other.getGseSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}