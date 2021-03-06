package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CsePerfilPermissaoId generated by hbm2java
 */
@Embeddable
public class CsePerfilPermissaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6193200810830613286L;
	private String perNome;
	private Double prmSeq;

	public CsePerfilPermissaoId() {
	}

	public CsePerfilPermissaoId(String perNome, Double prmSeq) {
		this.perNome = perNome;
		this.prmSeq = prmSeq;
	}

	@Column(name = "PER_NOME", nullable = false, length = 30)
	@Length(max = 30)
	public String getPerNome() {
		return this.perNome;
	}

	public void setPerNome(String perNome) {
		this.perNome = perNome;
	}

	@Column(name = "PRM_SEQ", nullable = false, precision = 17, scale = 17)
	public Double getPrmSeq() {
		return this.prmSeq;
	}

	public void setPrmSeq(Double prmSeq) {
		this.prmSeq = prmSeq;
	}






	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPerNome());
		umHashCodeBuilder.append(this.getPrmSeq());
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
		if (!(obj instanceof CsePerfilPermissaoId)) {
			return false;
		}
		CsePerfilPermissaoId other = (CsePerfilPermissaoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPerNome(), other.getPerNome());
		umEqualsBuilder.append(this.getPrmSeq(), other.getPrmSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
