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
 * RapUniValor generated by hbm2java
 */
@Entity
@Table(name = "RAP_UNI_VALORES", schema = "AGH")
public class RapUniValor extends BaseEntityId<RapUniValorId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4033678946702858606L;
	private RapUniValorId id;
	private Integer version;
	private RapUniServAdesao rapUniServAdesao;
	private RapUniCompetencia rapUniCompetencia;
	private Double valor;
	private Date criadoEm;

	public RapUniValor() {
	}

	public RapUniValor(RapUniValorId id, RapUniServAdesao rapUniServAdesao, RapUniCompetencia rapUniCompetencia, Double valor,
			Date criadoEm) {
		this.id = id;
		this.rapUniServAdesao = rapUniServAdesao;
		this.rapUniCompetencia = rapUniCompetencia;
		this.valor = valor;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "sadSerMatricula", column = @Column(name = "SAD_SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "sadSerVinCodigo", column = @Column(name = "SAD_SER_VIN_CODIGO", nullable = false)),
			@AttributeOverride(name = "sadSeqp", column = @Column(name = "SAD_SEQP", nullable = false)),
			@AttributeOverride(name = "cunDtInicio", column = @Column(name = "CUN_DT_INICIO", nullable = false, length = 29)) })
	public RapUniValorId getId() {
		return this.id;
	}

	public void setId(RapUniValorId id) {
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
	@JoinColumns({
			@JoinColumn(name = "SAD_SER_MATRICULA", referencedColumnName = "SER_MATRICULA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SAD_SER_VIN_CODIGO", referencedColumnName = "SER_VIN_CODIGO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SAD_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public RapUniServAdesao getRapUniServAdesao() {
		return this.rapUniServAdesao;
	}

	public void setRapUniServAdesao(RapUniServAdesao rapUniServAdesao) {
		this.rapUniServAdesao = rapUniServAdesao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUN_DT_INICIO", nullable = false, insertable = false, updatable = false)
	public RapUniCompetencia getRapUniCompetencia() {
		return this.rapUniCompetencia;
	}

	public void setRapUniCompetencia(RapUniCompetencia rapUniCompetencia) {
		this.rapUniCompetencia = rapUniCompetencia;
	}

	@Column(name = "VALOR", nullable = false, precision = 17, scale = 17)
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_UNI_SERV_ADESOES("rapUniServAdesao"),
		RAP_UNI_COMPETENCIAS("rapUniCompetencia"),
		VALOR("valor"),
		CRIADO_EM("criadoEm");

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
		if (!(obj instanceof RapUniValor)) {
			return false;
		}
		RapUniValor other = (RapUniValor) obj;
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
