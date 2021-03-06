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
 * MbcAreaTricProcCirg generated by hbm2java
 */
@Entity
@Table(name = "MBC_AREA_TRIC_PROC_CIRGS", schema = "AGH")
public class MbcAreaTricProcCirg extends BaseEntityId<MbcAreaTricProcCirgId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8762155600234087950L;
	private MbcAreaTricProcCirgId id;
	private Integer version;
	private MbcAreaTricotomia mbcAreaTricotomia;
	private RapServidores rapServidores;
	private MbcProcedimentoCirurgicos mbcProcedimentoCirurgicos;
	private Date criadoEm;

	public MbcAreaTricProcCirg() {
	}

	public MbcAreaTricProcCirg(MbcAreaTricProcCirgId id, MbcAreaTricotomia mbcAreaTricotomia,
			MbcProcedimentoCirurgicos mbcProcedimentoCirurgicos) {
		this.id = id;
		this.mbcAreaTricotomia = mbcAreaTricotomia;
		this.mbcProcedimentoCirurgicos = mbcProcedimentoCirurgicos;
	}

	public MbcAreaTricProcCirg(MbcAreaTricProcCirgId id, MbcAreaTricotomia mbcAreaTricotomia, RapServidores rapServidores,
			MbcProcedimentoCirurgicos mbcProcedimentoCirurgicos, Date criadoEm) {
		this.id = id;
		this.mbcAreaTricotomia = mbcAreaTricotomia;
		this.rapServidores = rapServidores;
		this.mbcProcedimentoCirurgicos = mbcProcedimentoCirurgicos;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pciSeq", column = @Column(name = "PCI_SEQ", nullable = false)),
			@AttributeOverride(name = "atrSeq", column = @Column(name = "ATR_SEQ", nullable = false)) })
	public MbcAreaTricProcCirgId getId() {
		return this.id;
	}

	public void setId(MbcAreaTricProcCirgId id) {
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
	@JoinColumn(name = "ATR_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcAreaTricotomia getMbcAreaTricotomia() {
		return this.mbcAreaTricotomia;
	}

	public void setMbcAreaTricotomia(MbcAreaTricotomia mbcAreaTricotomia) {
		this.mbcAreaTricotomia = mbcAreaTricotomia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PCI_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcProcedimentoCirurgicos getMbcProcedimentoCirurgicos() {
		return this.mbcProcedimentoCirurgicos;
	}

	public void setMbcProcedimentoCirurgicos(MbcProcedimentoCirurgicos mbcProcedimentoCirurgicos) {
		this.mbcProcedimentoCirurgicos = mbcProcedimentoCirurgicos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		ID("id"),
		PCI_SEQ("id.pciSeq"),
		ATR_SEQ("id.atrSeq"),
		VERSION("version"),
		MBC_AREA_TRICOTOMIAS("mbcAreaTricotomia"),
		RAP_SERVIDORES("rapServidores"),
		MBC_PROCEDIMENTO_CIRURGICOS("mbcProcedimentoCirurgicos"),
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
		if (!(obj instanceof MbcAreaTricProcCirg)) {
			return false;
		}
		MbcAreaTricProcCirg other = (MbcAreaTricProcCirg) obj;
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
