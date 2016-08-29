package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpaPopEtapaLiberacaoId generated by hbm2java
 */
@Embeddable
public class MpaPopEtapaLiberacaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8297097901879490058L;
	private Short povVersao;
	private Integer povPopSeq;
	private Short seqp;

	public MpaPopEtapaLiberacaoId() {
	}

	public MpaPopEtapaLiberacaoId(Short povVersao, Integer povPopSeq, Short seqp) {
		this.povVersao = povVersao;
		this.povPopSeq = povPopSeq;
		this.seqp = seqp;
	}

	@Column(name = "POV_VERSAO", nullable = false)
	public Short getPovVersao() {
		return this.povVersao;
	}

	public void setPovVersao(Short povVersao) {
		this.povVersao = povVersao;
	}

	@Column(name = "POV_POP_SEQ", nullable = false)
	public Integer getPovPopSeq() {
		return this.povPopSeq;
	}

	public void setPovPopSeq(Integer povPopSeq) {
		this.povPopSeq = povPopSeq;
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
		umHashCodeBuilder.append(this.getPovVersao());
		umHashCodeBuilder.append(this.getPovPopSeq());
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
		if (!(obj instanceof MpaPopEtapaLiberacaoId)) {
			return false;
		}
		MpaPopEtapaLiberacaoId other = (MpaPopEtapaLiberacaoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getPovVersao(), other.getPovVersao());
		umEqualsBuilder.append(this.getPovPopSeq(), other.getPovPopSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}