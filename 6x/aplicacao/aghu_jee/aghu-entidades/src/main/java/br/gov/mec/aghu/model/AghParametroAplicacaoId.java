package br.gov.mec.aghu.model;

// Generated 25/04/2012 13:50:04 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AghParametroAplicacoesId generated by hbm2java
 */
@Embeddable
public class AghParametroAplicacaoId implements EntityCompositeId {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1917634290225972072L;
	private Long cxaCxtSeq;
	private String cxaAplicacaoCodigo;
	private Short seqp;

	public AghParametroAplicacaoId() {
	}

	public AghParametroAplicacaoId(Long cxaCxtSeq, String cxaAplicacaoCodigo,
			Short seqp) {
		this.cxaCxtSeq = cxaCxtSeq;
		this.cxaAplicacaoCodigo = cxaAplicacaoCodigo;
		this.seqp = seqp;
	}

	@Column(name = "CXA_CXT_SEQ", nullable = false)
	public Long getCxaCxtSeq() {
		return this.cxaCxtSeq;
	}

	public void setCxaCxtSeq(Long cxaCxtSeq) {
		this.cxaCxtSeq = cxaCxtSeq;
	}

	@Column(name = "CXA_APLICACAO_CODIGO", nullable = false, length = 20)
	@Length(max = 20)
	public String getCxaAplicacaoCodigo() {
		return this.cxaAplicacaoCodigo;
	}

	public void setCxaAplicacaoCodigo(String cxaAplicacaoCodigo) {
		this.cxaAplicacaoCodigo = cxaAplicacaoCodigo;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	public boolean equals(Object other) {
		if ((this == other)){
			return true;
		}
		if ((other == null)){
			return false;
		}
		if (!(other instanceof AghParametroAplicacaoId)){
			return false;
		}
		AghParametroAplicacaoId castOther = (AghParametroAplicacaoId) other;

		return (this.getCxaCxtSeq() == castOther.getCxaCxtSeq())
				&& ((this.getCxaAplicacaoCodigo() == castOther
						.getCxaAplicacaoCodigo()) || (this
						.getCxaAplicacaoCodigo() != null
						&& castOther.getCxaAplicacaoCodigo() != null && this
						.getCxaAplicacaoCodigo().equals(
								castOther.getCxaAplicacaoCodigo())))
				&& (this.getSeqp() == castOther.getSeqp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getCxaCxtSeq().intValue();
		result = 37
				* result
				+ (getCxaAplicacaoCodigo() == null ? 0 : this
						.getCxaAplicacaoCodigo().hashCode());
		result = 37 * result + this.getSeqp();
		return result;
	}

}