package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AfaCompoGrupoComponenteId generated by hbm2java
 */
@Embeddable
public class AfaCompoGrupoComponenteId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5362173709671223250L;
	private Short gcnSeq;
	private Short ticSeq;

	public AfaCompoGrupoComponenteId() {
	}

	public AfaCompoGrupoComponenteId(Short gcnSeq, Short ticSeq) {
		this.gcnSeq = gcnSeq;
		this.ticSeq = ticSeq;
	}

	@Column(name = "GCN_SEQ", nullable = false)
	public Short getGcnSeq() {
		return this.gcnSeq;
	}

	public void setGcnSeq(Short gcnSeq) {
		this.gcnSeq = gcnSeq;
	}

	@Column(name = "TIC_SEQ", nullable = false)
	public Short getTicSeq() {
		return this.ticSeq;
	}

	public void setTicSeq(Short ticSeq) {
		this.ticSeq = ticSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getGcnSeq());
		umHashCodeBuilder.append(this.getTicSeq());
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
		if (!(obj instanceof AfaCompoGrupoComponenteId)) {
			return false;
		}
		AfaCompoGrupoComponenteId other = (AfaCompoGrupoComponenteId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getGcnSeq(), other.getGcnSeq());
		umEqualsBuilder.append(this.getTicSeq(), other.getTicSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
