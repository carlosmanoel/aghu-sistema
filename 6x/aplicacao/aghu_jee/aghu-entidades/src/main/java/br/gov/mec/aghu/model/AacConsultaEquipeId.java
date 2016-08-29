package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AacConsultaEquipeId generated by hbm2java
 */
@Embeddable
public class AacConsultaEquipeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8966891045153361630L;
	private Date cpeCpfMesReferencia;
	private Short cpeCpfEpcSeq;
	private Short cpeEspSeq;
	private Short eqpSeq;

	public AacConsultaEquipeId() {
	}

	public AacConsultaEquipeId(Date cpeCpfMesReferencia, Short cpeCpfEpcSeq, Short cpeEspSeq, Short eqpSeq) {
		this.cpeCpfMesReferencia = cpeCpfMesReferencia;
		this.cpeCpfEpcSeq = cpeCpfEpcSeq;
		this.cpeEspSeq = cpeEspSeq;
		this.eqpSeq = eqpSeq;
	}

	@Column(name = "CPE_CPF_MES_REFERENCIA", nullable = false, length = 29)
	public Date getCpeCpfMesReferencia() {
		return this.cpeCpfMesReferencia;
	}

	public void setCpeCpfMesReferencia(Date cpeCpfMesReferencia) {
		this.cpeCpfMesReferencia = cpeCpfMesReferencia;
	}

	@Column(name = "CPE_CPF_EPC_SEQ", nullable = false)
	public Short getCpeCpfEpcSeq() {
		return this.cpeCpfEpcSeq;
	}

	public void setCpeCpfEpcSeq(Short cpeCpfEpcSeq) {
		this.cpeCpfEpcSeq = cpeCpfEpcSeq;
	}

	@Column(name = "CPE_ESP_SEQ", nullable = false)
	public Short getCpeEspSeq() {
		return this.cpeEspSeq;
	}

	public void setCpeEspSeq(Short cpeEspSeq) {
		this.cpeEspSeq = cpeEspSeq;
	}

	@Column(name = "EQP_SEQ", nullable = false)
	public Short getEqpSeq() {
		return this.eqpSeq;
	}

	public void setEqpSeq(Short eqpSeq) {
		this.eqpSeq = eqpSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getEqpSeq());
		umHashCodeBuilder.append(this.getCpeCpfMesReferencia());
		umHashCodeBuilder.append(this.getCpeCpfEpcSeq());
		umHashCodeBuilder.append(this.getCpeEspSeq());
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
		if (!(obj instanceof AacConsultaEquipeId)) {
			return false;
		}
		AacConsultaEquipeId other = (AacConsultaEquipeId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getEqpSeq(), other.getEqpSeq());
		umEqualsBuilder.append(this.getCpeCpfMesReferencia(), other.getCpeCpfMesReferencia());
		umEqualsBuilder.append(this.getCpeCpfEpcSeq(), other.getCpeCpfEpcSeq());
		umEqualsBuilder.append(this.getCpeEspSeq(), other.getCpeEspSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}