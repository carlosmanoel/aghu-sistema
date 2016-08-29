package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelKitItemMatPatologia generated by hbm2java
 */
@Entity
@Table(name = "AEL_KIT_ITEM_MAT_PATOLOGIAS", schema = "AGH")
public class AelKitItemMatPatologia extends BaseEntityId<AelKitItemMatPatologiaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8669641318966634477L;
	private AelKitItemMatPatologiaId id;
	private Integer version;
	private RapServidores rapServidores;
	private AelKitMatPatologia aelKitMatPatologia;
	private String descricao;
	private DominioSituacao indSituacao;
	private Date criadoEm;

	public AelKitItemMatPatologia() {
	}

	public AelKitItemMatPatologia(AelKitItemMatPatologiaId id, RapServidores rapServidores, AelKitMatPatologia aelKitMatPatologia,
			String descricao, DominioSituacao indSituacao, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.aelKitMatPatologia = aelKitMatPatologia;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "lukSeq", column = @Column(name = "LUK_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AelKitItemMatPatologiaId getId() {
		return this.id;
	}

	public void setId(AelKitItemMatPatologiaId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LUK_SEQ", nullable = false, insertable = false, updatable = false)
	public AelKitMatPatologia getAelKitMatPatologia() {
		return this.aelKitMatPatologia;
	}

	public void setAelKitMatPatologia(AelKitMatPatologia aelKitMatPatologia) {
		this.aelKitMatPatologia = aelKitMatPatologia;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 500)
	@Length(max = 500)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Column(name = "IND_SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
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
		AEL_KIT_MAT_PATOLOGIAS("aelKitMatPatologia"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"), 
		SEQP("id.seqp"),
		LUK_SEQ("id.lukSeq");


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
		if (!(obj instanceof AelKitItemMatPatologia)) {
			return false;
		}
		AelKitItemMatPatologia other = (AelKitItemMatPatologia) obj;
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