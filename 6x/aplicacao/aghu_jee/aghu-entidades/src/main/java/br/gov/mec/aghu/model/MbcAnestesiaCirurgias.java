package br.gov.mec.aghu.model;

// Generated 22/03/2010 14:12:27 by Hibernate Tools 3.2.5.Beta

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


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MbcAnestesiaCirurgias generated by hbm2java
 */

@Entity
@Table(name = "MBC_ANESTESIA_CIRURGIAS", schema = "AGH")
public class MbcAnestesiaCirurgias extends BaseEntityId<MbcAnestesiaCirurgiasId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4547916289686444201L;
	private MbcAnestesiaCirurgiasId id;
	private MbcTipoAnestesias mbcTipoAnestesias;
	private Date criadoEm;
	private RapServidores servidor;
	private MbcCirurgias cirurgia;

	public MbcAnestesiaCirurgias() {
	}

	public MbcAnestesiaCirurgias(MbcAnestesiaCirurgiasId id,
			MbcTipoAnestesias mbcTipoAnestesias, Date criadoEm) {
		this.id = id;
		this.mbcTipoAnestesias = mbcTipoAnestesias;
		this.criadoEm = criadoEm;
	}

	public MbcAnestesiaCirurgias(MbcAnestesiaCirurgiasId id,
			MbcTipoAnestesias mbcTipoAnestesias, Date criadoEm,
			RapServidores servidor) {
		this.id = id;
		this.mbcTipoAnestesias = mbcTipoAnestesias;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "tanSeq", column = @Column(name = "TAN_SEQ", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "crgSeq", column = @Column(name = "CRG_SEQ", nullable = false, precision = 8, scale = 0)) })
	public MbcAnestesiaCirurgiasId getId() {
		return this.id;
	}

	public void setId(MbcAnestesiaCirurgiasId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TAN_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcTipoAnestesias getMbcTipoAnestesias() {
		return this.mbcTipoAnestesias;
	}

	public void setMbcTipoAnestesias(MbcTipoAnestesias mbcTipoAnestesias) {
		this.mbcTipoAnestesias = mbcTipoAnestesias;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CRG_SEQ", updatable=false, insertable=false)
	public MbcCirurgias getCirurgia() {
		return cirurgia;
	}

	public void setCirurgia(MbcCirurgias cirurgia) {
		this.cirurgia = cirurgia;
	}	
	
	public enum Fields {
		SEQ("id.crgSeq"),
		CRG_SEQ("id.crgSeq"),
		TIPO_ANESTESIA("mbcTipoAnestesias"),
		TIPO_ANESTESIA_NESS_ANEST("mbcTipoAnestesias.indNessAnest"),
		CIRURGIA("cirurgia"),
		;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
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
		if (!(obj instanceof MbcAnestesiaCirurgias)) {
			return false;
		}
		MbcAnestesiaCirurgias other = (MbcAnestesiaCirurgias) obj;
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