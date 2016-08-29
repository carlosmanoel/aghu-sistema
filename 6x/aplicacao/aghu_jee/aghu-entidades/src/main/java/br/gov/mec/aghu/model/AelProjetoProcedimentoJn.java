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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelProjetoProcedimentoJn generated by hbm2java
 */
@Entity
@Table(name = "AEL_PROJETO_PROCEDIMENTOS_JN", schema = "AGH")
@Immutable
@SequenceGenerator(name="aelPprJnSeq", sequenceName="AGH.AEL_PPR_JN_SEQ", allocationSize = 1)
public class AelProjetoProcedimentoJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -8741825111390454839L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer pjqSeq;
	private Integer pciSeq;
	private Short qtdePermitido;
	private Short qtdeSolicitado;
	private Date dtInicio;
	private Date dtFim;
	private Double valor;
	private String indSituacao;
	private String numero;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;

	public AelProjetoProcedimentoJn() {
	}

	public AelProjetoProcedimentoJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer pjqSeq, Integer pciSeq) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pjqSeq = pjqSeq;
		this.pciSeq = pciSeq;
	}

	public AelProjetoProcedimentoJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer pjqSeq, Integer pciSeq,
			Short qtdePermitido, Short qtdeSolicitado, Date dtInicio, Date dtFim, Double valor, String indSituacao, String numero,
			Date criadoEm, Integer serMatricula, Short serVinCodigo) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pjqSeq = pjqSeq;
		this.pciSeq = pciSeq;
		this.qtdePermitido = qtdePermitido;
		this.qtdeSolicitado = qtdeSolicitado;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.valor = valor;
		this.indSituacao = indSituacao;
		this.numero = numero;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelPprJnSeq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	// ATUALIZADOR JOURNALS - ID
	
/* ATUALIZADOR JOURNALS - Get / Set	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JN_DATE_TIME", nullable = false, length = 29)
	public Date getJnDateTime() {
		return this.jnDateTime;
	}

	public void setJnDateTime(Date jnDateTime) {
		this.jnDateTime = jnDateTime;
	}

	@Column(name = "JN_OPERATION", nullable = false, length = 3)
	@Length(max = 3)
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}*/

	@Column(name = "PJQ_SEQ", nullable = false)
	public Integer getPjqSeq() {
		return this.pjqSeq;
	}

	public void setPjqSeq(Integer pjqSeq) {
		this.pjqSeq = pjqSeq;
	}

	@Column(name = "PCI_SEQ", nullable = false)
	public Integer getPciSeq() {
		return this.pciSeq;
	}

	public void setPciSeq(Integer pciSeq) {
		this.pciSeq = pciSeq;
	}

	@Column(name = "QTDE_PERMITIDO")
	public Short getQtdePermitido() {
		return this.qtdePermitido;
	}

	public void setQtdePermitido(Short qtdePermitido) {
		this.qtdePermitido = qtdePermitido;
	}

	@Column(name = "QTDE_SOLICITADO")
	public Short getQtdeSolicitado() {
		return this.qtdeSolicitado;
	}

	public void setQtdeSolicitado(Short qtdeSolicitado) {
		this.qtdeSolicitado = qtdeSolicitado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Column(name = "VALOR", precision = 17, scale = 17)
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "NUMERO", length = 20)
	@Length(max = 20)
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		PJQ_SEQ("pjqSeq"),
		PCI_SEQ("pciSeq"),
		QTDE_PERMITIDO("qtdePermitido"),
		QTDE_SOLICITADO("qtdeSolicitado"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim"),
		VALOR("valor"),
		IND_SITUACAO("indSituacao"),
		NUMERO("numero"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}