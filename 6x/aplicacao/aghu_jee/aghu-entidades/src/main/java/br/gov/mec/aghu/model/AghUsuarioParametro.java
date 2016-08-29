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
 * AghUsuarioParametro generated by hbm2java
 */
@Entity
@Table(name = "AGH_USUARIO_PARAMETROS", schema = "AGH")
public class AghUsuarioParametro extends BaseEntityId<AghUsuarioParametroId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4829400867719566171L;
	private AghUsuarioParametroId id;
	private Integer version;
	private RapServidores rapServidores;
	private AghParametros aghParametros;
	private Date criadoEm;

	public AghUsuarioParametro() {
	}

	public AghUsuarioParametro(AghUsuarioParametroId id, RapServidores rapServidores, AghParametros aghParametros, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.aghParametros = aghParametros;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "psiSeq", column = @Column(name = "PSI_SEQ", nullable = false)),
			@AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false)) })
	public AghUsuarioParametroId getId() {
		return this.id;
	}

	public void setId(AghUsuarioParametroId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_DIGITA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_DIGITA", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PSI_SEQ", nullable = false, insertable = false, updatable = false)
	public AghParametros getAghParametros() {
		return this.aghParametros;
	}

	public void setAghParametros(AghParametros aghParametros) {
		this.aghParametros = aghParametros;
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
		RAP_SERVIDORES("rapServidores"),
		AGH_PARAMETROS("aghParametros"),
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
		if (!(obj instanceof AghUsuarioParametro)) {
			return false;
		}
		AghUsuarioParametro other = (AghUsuarioParametro) obj;
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