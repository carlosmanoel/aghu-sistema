package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * CtbAgrupamentoBalanco generated by hbm2java
 */
@Entity
@Table(name = "CTB_AGRUPAMENTO_BALANCOS", schema = "AGH")
public class CtbAgrupamentoBalanco extends BaseEntityId<CtbAgrupamentoBalancoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7204960230100908375L;
	private CtbAgrupamentoBalancoId id;
	private Integer version;
	private CtbNaturezaPlano ctbNaturezaPlano;
	private CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano;
	private RapServidores rapServidores;
	private CtbNivel5 ctbNivel5;
	private CtbIdentificacao ctbIdentificacao;
	private Date criadoEm;
	private Date alteradoEm;

	public CtbAgrupamentoBalanco() {
	}

	public CtbAgrupamentoBalanco(CtbAgrupamentoBalancoId id, RapServidores rapServidores, CtbNivel5 ctbNivel5,
			CtbIdentificacao ctbIdentificacao, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.ctbNivel5 = ctbNivel5;
		this.ctbIdentificacao = ctbIdentificacao;
		this.criadoEm = criadoEm;
	}

	public CtbAgrupamentoBalanco(CtbAgrupamentoBalancoId id, CtbNaturezaPlano ctbNaturezaPlano,
			CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano, RapServidores rapServidores, CtbNivel5 ctbNivel5,
			CtbIdentificacao ctbIdentificacao, Date criadoEm, Date alteradoEm) {
		this.id = id;
		this.ctbNaturezaPlano = ctbNaturezaPlano;
		this.ctbGrupoNaturezaPlano = ctbGrupoNaturezaPlano;
		this.rapServidores = rapServidores;
		this.ctbNivel5 = ctbNivel5;
		this.ctbIdentificacao = ctbIdentificacao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "ideSeq", column = @Column(name = "IDE_SEQ", nullable = false)),
			@AttributeOverride(name = "nv5Nv4Nv3Nv2Nv1Seq", column = @Column(name = "NV5_NV4_NV3_NV2_NV1_SEQ", nullable = false)),
			@AttributeOverride(name = "nv5Nv4Nv3Nv2Seqp", column = @Column(name = "NV5_NV4_NV3_NV2_SEQP", nullable = false)),
			@AttributeOverride(name = "nv5Nv4Nv3Seqp", column = @Column(name = "NV5_NV4_NV3_SEQP", nullable = false)),
			@AttributeOverride(name = "nv5Nv4Seqp", column = @Column(name = "NV5_NV4_SEQP", nullable = false)),
			@AttributeOverride(name = "nv5Seqp", column = @Column(name = "NV5_SEQP", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public CtbAgrupamentoBalancoId getId() {
		return this.id;
	}

	public void setId(CtbAgrupamentoBalancoId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "NTP_GNP_TAB_CODIGO", referencedColumnName = "GNP_TAB_CODIGO"),
			@JoinColumn(name = "NTP_GNP_CODIGO", referencedColumnName = "GNP_CODIGO"),
			@JoinColumn(name = "NTP_CODIGO", referencedColumnName = "CODIGO") })
	public CtbNaturezaPlano getCtbNaturezaPlano() {
		return this.ctbNaturezaPlano;
	}

	public void setCtbNaturezaPlano(CtbNaturezaPlano ctbNaturezaPlano) {
		this.ctbNaturezaPlano = ctbNaturezaPlano;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "GNP_TAB_CODIGO", referencedColumnName = "TAB_CODIGO"),
			@JoinColumn(name = "GNP_CODIGO", referencedColumnName = "CODIGO") })
	public CtbGrupoNaturezaPlano getCtbGrupoNaturezaPlano() {
		return this.ctbGrupoNaturezaPlano;
	}

	public void setCtbGrupoNaturezaPlano(CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano) {
		this.ctbGrupoNaturezaPlano = ctbGrupoNaturezaPlano;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NV5_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NV5_NV4_NV3_SEQP", referencedColumnName = "NV4_NV3_SEQP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NV5_NV4_NV3_NV2_SEQP", referencedColumnName = "NV4_NV3_NV2_SEQP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NV5_NV4_NV3_NV2_NV1_SEQ", referencedColumnName = "NV4_NV3_NV2_NV1_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NV5_NV4_SEQP", referencedColumnName = "NV4_SEQP", nullable = false, insertable = false, updatable = false) })
	public CtbNivel5 getCtbNivel5() {
		return this.ctbNivel5;
	}

	public void setCtbNivel5(CtbNivel5 ctbNivel5) {
		this.ctbNivel5 = ctbNivel5;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDE_SEQ", nullable = false, insertable = false, updatable = false)
	public CtbIdentificacao getCtbIdentificacao() {
		return this.ctbIdentificacao;
	}

	public void setCtbIdentificacao(CtbIdentificacao ctbIdentificacao) {
		this.ctbIdentificacao = ctbIdentificacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		CTB_NATUREZA_PLANOS("ctbNaturezaPlano"),
		CTB_GRUPO_NATUREZA_PLANOS("ctbGrupoNaturezaPlano"),
		RAP_SERVIDORES("rapServidores"),
		CTB_NIVEL5("ctbNivel5"),
		CTB_IDENTIFICACOES("ctbIdentificacao"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm");

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
		if (!(obj instanceof CtbAgrupamentoBalanco)) {
			return false;
		}
		CtbAgrupamentoBalanco other = (CtbAgrupamentoBalanco) obj;
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