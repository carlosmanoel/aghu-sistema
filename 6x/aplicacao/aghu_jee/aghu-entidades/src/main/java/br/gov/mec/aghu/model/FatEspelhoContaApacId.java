package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatEspelhosContaApacId generated by hbm2java
 */
@Embeddable
public class FatEspelhoContaApacId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -900831269624381582L;
	private Long capAtmNumero;
	private Byte capSeqp;
	private boolean seqpContinuacao;

	public FatEspelhoContaApacId() {
	}

	public FatEspelhoContaApacId(Long capAtmNumero, Byte capSeqp,
			boolean seqpContinuacao) {
		this.capAtmNumero = capAtmNumero;
		this.capSeqp = capSeqp;
		this.seqpContinuacao = seqpContinuacao;
	}

	@Column(name = "CAP_ATM_NUMERO", nullable = false, precision = 13, scale = 0)
	public Long getCapAtmNumero() {
		return this.capAtmNumero;
	}

	public void setCapAtmNumero(Long capAtmNumero) {
		this.capAtmNumero = capAtmNumero;
	}

	@Column(name = "CAP_SEQP", nullable = false, precision = 2, scale = 0)
	public Byte getCapSeqp() {
		return this.capSeqp;
	}

	public void setCapSeqp(Byte capSeqp) {
		this.capSeqp = capSeqp;
	}

	@Column(name = "SEQP_CONTINUACAO", nullable = false, precision = 1, scale = 0)
	public boolean isSeqpContinuacao() {
		return this.seqpContinuacao;
	}

	public void setSeqpContinuacao(boolean seqpContinuacao) {
		this.seqpContinuacao = seqpContinuacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capAtmNumero == null) ? 0 : capAtmNumero.hashCode());
		result = prime * result + ((capSeqp == null) ? 0 : capSeqp.hashCode());
		result = prime * result + (seqpContinuacao ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof FatEspelhoContaApacId)) {
			return false;
		}
		FatEspelhoContaApacId other = (FatEspelhoContaApacId) obj;
		if (capAtmNumero == null) {
			if (other.capAtmNumero != null) {
				return false;
			}
		} else if (!capAtmNumero.equals(other.capAtmNumero)) {
			return false;
		}
		if (capSeqp == null) {
			if (other.capSeqp != null) {
				return false;
			}
		} else if (!capSeqp.equals(other.capSeqp)) {
			return false;
		}
		if (seqpContinuacao != other.seqpContinuacao) {
			return false;
		}
		return true;
	}

}
