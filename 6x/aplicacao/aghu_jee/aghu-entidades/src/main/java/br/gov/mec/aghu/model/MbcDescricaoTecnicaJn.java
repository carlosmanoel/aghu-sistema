package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * MbcDescricaoTecnicaJn generated by hbm2java
 */
@Entity
@Table(name = "MBC_DESCRICAO_TECNICAS_JN", schema = "AGH")
@SequenceGenerator(name = "mbcDtcJnSeq", sequenceName = "AGH.MBC_DTC_JN_SEQ", allocationSize = 1)
@Immutable
public class MbcDescricaoTecnicaJn extends BaseJournal {

	private static final long serialVersionUID = 3262828871176248491L;
	private Integer dcgCrgSeq;
	private Short dcgSeqp;
	private String descricaoTecnica;

	public MbcDescricaoTecnicaJn() {
	}

	public MbcDescricaoTecnicaJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer dcgCrgSeq, Short dcgSeqp) {
		this.dcgCrgSeq = dcgCrgSeq;
		this.dcgSeqp = dcgSeqp;
	}

	public MbcDescricaoTecnicaJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer dcgCrgSeq, Short dcgSeqp,
			String descricaoTecnica) {
		this.dcgCrgSeq = dcgCrgSeq;
		this.dcgSeqp = dcgSeqp;
		this.descricaoTecnica = descricaoTecnica;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mbcDtcJnSeq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "DCG_CRG_SEQ", nullable = false)
	public Integer getDcgCrgSeq() {
		return this.dcgCrgSeq;
	}

	public void setDcgCrgSeq(Integer dcgCrgSeq) {
		this.dcgCrgSeq = dcgCrgSeq;
	}

	@Column(name = "DCG_SEQP", nullable = false)
	public Short getDcgSeqp() {
		return this.dcgSeqp;
	}

	public void setDcgSeqp(Short dcgSeqp) {
		this.dcgSeqp = dcgSeqp;
	}

	@Column(name = "DESCRICAO_TECNICA", length = 4000)
	@Length(max = 4000)
	public String getDescricaoTecnica() {
		return this.descricaoTecnica;
	}

	public void setDescricaoTecnica(String descricaoTecnica) {
		this.descricaoTecnica = descricaoTecnica;
	}

	public enum Fields {
		DCG_CRG_SEQ("dcgCrgSeq"),
		DCG_SEQP("dcgSeqp"),
		DESCRICAO_TECNICA("descricaoTecnica");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((dcgCrgSeq == null) ? 0 : dcgCrgSeq.hashCode());
		result = prime * result + ((dcgSeqp == null) ? 0 : dcgSeqp.hashCode());
		result = prime
				* result
				+ ((descricaoTecnica == null) ? 0 : descricaoTecnica.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MbcDescricaoTecnicaJn other = (MbcDescricaoTecnicaJn) obj;
		if (dcgCrgSeq == null) {
			if (other.dcgCrgSeq != null) {
				return false;
			}
		} else if (!dcgCrgSeq.equals(other.dcgCrgSeq)) {
			return false;
		}
		if (dcgSeqp == null) {
			if (other.dcgSeqp != null) {
				return false;
			}
		} else if (!dcgSeqp.equals(other.dcgSeqp)) {
			return false;
		}
		if (descricaoTecnica == null) {
			if (other.descricaoTecnica != null) {
				return false;
			}
		} else if (!descricaoTecnica.equals(other.descricaoTecnica)) {
			return false;
		}
		return true;
	}

}