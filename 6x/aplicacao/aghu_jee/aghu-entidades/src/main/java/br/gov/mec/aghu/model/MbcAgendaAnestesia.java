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
 * MbcAgendaAnestesia generated by hbm2java
 */
@Entity
@Table(name = "MBC_AGENDA_ANESTESIAS", schema = "AGH")
public class MbcAgendaAnestesia extends BaseEntityId<MbcAgendaAnestesiaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5773476209738468209L;
	private MbcAgendaAnestesiaId id;
	private Integer version;
	private MbcAgendas mbcAgendas;
	private RapServidores rapServidores;
	private MbcTipoAnestesias mbcTipoAnestesias;
	private Date criadoEm;

	public MbcAgendaAnestesia() {
	}

	public MbcAgendaAnestesia(MbcAgendaAnestesiaId id, MbcAgendas mbcAgendas, RapServidores rapServidores,
			MbcTipoAnestesias mbcTipoAnestesias, Date criadoEm) {
		this.id = id;
		this.mbcAgendas = mbcAgendas;
		this.rapServidores = rapServidores;
		this.mbcTipoAnestesias = mbcTipoAnestesias;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "agdSeq", column = @Column(name = "AGD_SEQ", nullable = false)),
			@AttributeOverride(name = "tanSeq", column = @Column(name = "TAN_SEQ", nullable = false)) })
	public MbcAgendaAnestesiaId getId() {
		return this.id;
	}

	public void setId(MbcAgendaAnestesiaId id) {
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
	@JoinColumn(name = "AGD_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcAgendas getMbcAgendas() {
		return this.mbcAgendas;
	}

	public void setMbcAgendas(MbcAgendas mbcAgendas) {
		this.mbcAgendas = mbcAgendas;
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
	@JoinColumn(name = "TAN_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcTipoAnestesias getMbcTipoAnestesias() {
		return this.mbcTipoAnestesias;
	}

	public void setMbcTipoAnestesias(MbcTipoAnestesias mbcTipoAnestesias) {
		this.mbcTipoAnestesias = mbcTipoAnestesias;
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
		ID_AGD_SEQ("id.agdSeq"),
		VERSION("version"),
		MBC_AGENDAS("mbcAgendas"),
		RAP_SERVIDORES("rapServidores"),
		MBC_TIPO_ANESTESIAS("mbcTipoAnestesias"),
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
		if (!(obj instanceof MbcAgendaAnestesia)) {
			return false;
		}
		MbcAgendaAnestesia other = (MbcAgendaAnestesia) obj;
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
