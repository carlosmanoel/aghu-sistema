package br.gov.mec.aghu.model;

// Generated 27/12/2010 20:08:36 by Hibernate Tools 3.3.0.GA

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MptControleDispensacoes generated by hbm2java
 */
@Entity
@Table(name = "MPT_CONTROLE_DISPENSACOES", schema = "AGH")
public class MptControleDispensacao extends BaseEntityId<MptControleDispensacaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3527194288578860793L;
	private MptControleDispensacaoId id;
	private Boolean indSolicDispensacao;
	private String tipoRetorno;
	private Date criadoEm;
	private Date alteradoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String indSituacao;
	private Short unfSeqSolicitante;
	private String indImpPrescricao;
	private Date dthrImpPrescricao;
	private Integer serMatriculaImprime;
	private Short serVinCodigoImprime;
	private Date dthrSolicDispensacao;
	private Date dthrRetorno;
	private Integer serMatriculaSolicita;
	private Short serVinCodigoSolicita;
	private Integer serMatriculaRetorno;
	private Short serVinCodigoRetorno;
	private Date dthrInfRetorno;
	private String ltoLtoId;
	private Short qrtNumero;
	private String indAvisaCancAgenda;
	private Date dthrAvisoCancAgenda;
	private Integer serMatriculaAvisoAgenda;
	private Short serVinCodigoAvisoAgenda;

	public MptControleDispensacao() {
	}

	public MptControleDispensacao(MptControleDispensacaoId id,
			Boolean indSolicDispensacao, Date criadoEm, Integer serMatricula,
			Short serVinCodigo, String indSituacao, Short unfSeqSolicitante,
			String indImpPrescricao, String indAvisaCancAgenda) {
		this.id = id;
		this.indSolicDispensacao = indSolicDispensacao;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.indSituacao = indSituacao;
		this.unfSeqSolicitante = unfSeqSolicitante;
		this.indImpPrescricao = indImpPrescricao;
		this.indAvisaCancAgenda = indAvisaCancAgenda;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public MptControleDispensacao(MptControleDispensacaoId id,
			Boolean indSolicDispensacao, String tipoRetorno, Date criadoEm,
			Date alteradoEm, Integer serMatricula, Short serVinCodigo,
			String indSituacao, Short unfSeqSolicitante,
			String indImpPrescricao, Date dthrImpPrescricao,
			Integer serMatriculaImprime, Short serVinCodigoImprime,
			Date dthrSolicDispensacao, Date dthrRetorno,
			Integer serMatriculaSolicita, Short serVinCodigoSolicita,
			Integer serMatriculaRetorno, Short serVinCodigoRetorno,
			Date dthrInfRetorno, String ltoLtoId, Short qrtNumero,
			String indAvisaCancAgenda, Date dthrAvisoCancAgenda,
			Integer serMatriculaAvisoAgenda, Short serVinCodigoAvisoAgenda) {
		this.id = id;
		this.indSolicDispensacao = indSolicDispensacao;
		this.tipoRetorno = tipoRetorno;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.indSituacao = indSituacao;
		this.unfSeqSolicitante = unfSeqSolicitante;
		this.indImpPrescricao = indImpPrescricao;
		this.dthrImpPrescricao = dthrImpPrescricao;
		this.serMatriculaImprime = serMatriculaImprime;
		this.serVinCodigoImprime = serVinCodigoImprime;
		this.dthrSolicDispensacao = dthrSolicDispensacao;
		this.dthrRetorno = dthrRetorno;
		this.serMatriculaSolicita = serMatriculaSolicita;
		this.serVinCodigoSolicita = serVinCodigoSolicita;
		this.serMatriculaRetorno = serMatriculaRetorno;
		this.serVinCodigoRetorno = serVinCodigoRetorno;
		this.dthrInfRetorno = dthrInfRetorno;
		this.ltoLtoId = ltoLtoId;
		this.qrtNumero = qrtNumero;
		this.indAvisaCancAgenda = indAvisaCancAgenda;
		this.dthrAvisoCancAgenda = dthrAvisoCancAgenda;
		this.serMatriculaAvisoAgenda = serMatriculaAvisoAgenda;
		this.serVinCodigoAvisoAgenda = serVinCodigoAvisoAgenda;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "pteAtdSeq", column = @Column(name = "PTE_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "pteSeq", column = @Column(name = "PTE_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 4, scale = 0)) })
	public MptControleDispensacaoId getId() {
		return this.id;
	}

	public void setId(MptControleDispensacaoId id) {
		this.id = id;
	}

	@Column(name = "IND_SOLIC_DISPENSACAO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndSolicDispensacao() {
		return this.indSolicDispensacao;
	}

	public void setIndSolicDispensacao(Boolean indSolicDispensacao) {
		this.indSolicDispensacao = indSolicDispensacao;
	}

	@Column(name = "TIPO_RETORNO", length = 1)
	@Length(max = 1)
	public String getTipoRetorno() {
		return this.tipoRetorno;
	}

	public void setTipoRetorno(String tipoRetorno) {
		this.tipoRetorno = tipoRetorno;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "UNF_SEQ_SOLICITANTE", nullable = false, precision = 4, scale = 0)
	public Short getUnfSeqSolicitante() {
		return this.unfSeqSolicitante;
	}

	public void setUnfSeqSolicitante(Short unfSeqSolicitante) {
		this.unfSeqSolicitante = unfSeqSolicitante;
	}

	@Column(name = "IND_IMP_PRESCRICAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndImpPrescricao() {
		return this.indImpPrescricao;
	}

	public void setIndImpPrescricao(String indImpPrescricao) {
		this.indImpPrescricao = indImpPrescricao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_IMP_PRESCRICAO", length = 7)
	public Date getDthrImpPrescricao() {
		return this.dthrImpPrescricao;
	}

	public void setDthrImpPrescricao(Date dthrImpPrescricao) {
		this.dthrImpPrescricao = dthrImpPrescricao;
	}

	@Column(name = "SER_MATRICULA_IMPRIME", precision = 7, scale = 0)
	public Integer getSerMatriculaImprime() {
		return this.serMatriculaImprime;
	}

	public void setSerMatriculaImprime(Integer serMatriculaImprime) {
		this.serMatriculaImprime = serMatriculaImprime;
	}

	@Column(name = "SER_VIN_CODIGO_IMPRIME", precision = 3, scale = 0)
	public Short getSerVinCodigoImprime() {
		return this.serVinCodigoImprime;
	}

	public void setSerVinCodigoImprime(Short serVinCodigoImprime) {
		this.serVinCodigoImprime = serVinCodigoImprime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_SOLIC_DISPENSACAO", length = 7)
	public Date getDthrSolicDispensacao() {
		return this.dthrSolicDispensacao;
	}

	public void setDthrSolicDispensacao(Date dthrSolicDispensacao) {
		this.dthrSolicDispensacao = dthrSolicDispensacao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_RETORNO", length = 7)
	public Date getDthrRetorno() {
		return this.dthrRetorno;
	}

	public void setDthrRetorno(Date dthrRetorno) {
		this.dthrRetorno = dthrRetorno;
	}

	@Column(name = "SER_MATRICULA_SOLICITA", precision = 7, scale = 0)
	public Integer getSerMatriculaSolicita() {
		return this.serMatriculaSolicita;
	}

	public void setSerMatriculaSolicita(Integer serMatriculaSolicita) {
		this.serMatriculaSolicita = serMatriculaSolicita;
	}

	@Column(name = "SER_VIN_CODIGO_SOLICITA", precision = 3, scale = 0)
	public Short getSerVinCodigoSolicita() {
		return this.serVinCodigoSolicita;
	}

	public void setSerVinCodigoSolicita(Short serVinCodigoSolicita) {
		this.serVinCodigoSolicita = serVinCodigoSolicita;
	}

	@Column(name = "SER_MATRICULA_RETORNO", precision = 7, scale = 0)
	public Integer getSerMatriculaRetorno() {
		return this.serMatriculaRetorno;
	}

	public void setSerMatriculaRetorno(Integer serMatriculaRetorno) {
		this.serMatriculaRetorno = serMatriculaRetorno;
	}

	@Column(name = "SER_VIN_CODIGO_RETORNO", precision = 3, scale = 0)
	public Short getSerVinCodigoRetorno() {
		return this.serVinCodigoRetorno;
	}

	public void setSerVinCodigoRetorno(Short serVinCodigoRetorno) {
		this.serVinCodigoRetorno = serVinCodigoRetorno;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_INF_RETORNO", length = 7)
	public Date getDthrInfRetorno() {
		return this.dthrInfRetorno;
	}

	public void setDthrInfRetorno(Date dthrInfRetorno) {
		this.dthrInfRetorno = dthrInfRetorno;
	}

	@Column(name = "LTO_LTO_ID", length = 14)
	@Length(max = 14)
	public String getLtoLtoId() {
		return this.ltoLtoId;
	}

	public void setLtoLtoId(String ltoLtoId) {
		this.ltoLtoId = ltoLtoId;
	}

	@Column(name = "QRT_NUMERO", precision = 4, scale = 0)
	public Short getQrtNumero() {
		return this.qrtNumero;
	}

	public void setQrtNumero(Short qrtNumero) {
		this.qrtNumero = qrtNumero;
	}

	@Column(name = "IND_AVISA_CANC_AGENDA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndAvisaCancAgenda() {
		return this.indAvisaCancAgenda;
	}

	public void setIndAvisaCancAgenda(String indAvisaCancAgenda) {
		this.indAvisaCancAgenda = indAvisaCancAgenda;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_AVISO_CANC_AGENDA", length = 7)
	public Date getDthrAvisoCancAgenda() {
		return this.dthrAvisoCancAgenda;
	}

	public void setDthrAvisoCancAgenda(Date dthrAvisoCancAgenda) {
		this.dthrAvisoCancAgenda = dthrAvisoCancAgenda;
	}

	@Column(name = "SER_MATRICULA_AVISO_AGENDA", precision = 7, scale = 0)
	public Integer getSerMatriculaAvisoAgenda() {
		return this.serMatriculaAvisoAgenda;
	}

	public void setSerMatriculaAvisoAgenda(Integer serMatriculaAvisoAgenda) {
		this.serMatriculaAvisoAgenda = serMatriculaAvisoAgenda;
	}

	@Column(name = "SER_VIN_CODIGO_AVISO_AGENDA", precision = 3, scale = 0)
	public Short getSerVinCodigoAvisoAgenda() {
		return this.serVinCodigoAvisoAgenda;
	}

	public void setSerVinCodigoAvisoAgenda(Short serVinCodigoAvisoAgenda) {
		this.serVinCodigoAvisoAgenda = serVinCodigoAvisoAgenda;
	}

	public enum Fields {

		ID("id"),
		PTE_ATD_SEQ("id.pteAtdSeq"),
		PTE_SEQ("id.pteSeq"),
		UNF_SEQ("id.unfSeq"),
		IND_SOLIC_DISPENSACAO("indSolicDispensacao"),
		TIPO_RETORNO("tipoRetorno"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		IND_SITUACAO("indSituacao"),
		UNF_SEQ_SOLICITANTE("unfSeqSolicitante"),
		IND_IMP_PRESCRICAO("indImpPrescricao"),
		DTHR_IMP_PRESCRICAO("dthrImpPrescricao"),
		SER_MATRICULA_IMPRIME("serMatriculaImprime"),
		SER_VIN_CODIGO_IMPRIME("serVinCodigoImprime"),
		DTHR_SOLIC_DISPENSACAO("dthrSolicDispensacao"),
		DTHR_RETORNO("dthrRetorno"),
		SER_MATRICULA_SOLICITA("serMatriculaSolicita"),
		SER_VIN_CODIGO_SOLICITA("serVinCodigoSolicita"),
		SER_MATRICULA_RETORNO("serMatriculaRetorno"),
		SER_VIN_CODIGO_RETORNO("serVinCodigoRetorno"),
		DTHR_INF_RETORNO("dthrInfRetorno"),
		LTO_LTO_ID("ltoLtoId"),
		QRT_NUMERO("qrtNumero"),
		IND_AVISA_CANC_AGENDA("indAvisaCancAgenda"),
		DTHR_AVISO_CANC_AGENDA("dthrAvisoCancAgenda"),
		SER_MATRICULA_AVISO_AGENDA("serMatriculaAvisoAgenda"),
		SER_VIN_CODIGO_AVISO_AGENDA("serVinCodigoAvisoAgenda");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof MptControleDispensacao)) {
			return false;
		}
		MptControleDispensacao other = (MptControleDispensacao) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}