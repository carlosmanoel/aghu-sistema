package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

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
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatEspecGruposAtendimento generated by hbm2java
 */
@Entity
@Table(name = "FAT_ESPEC_GRUPOS_ATENDIMENTO", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = {
		"ESP_SEQ", "GRA_CNV_CODIGO" }))
public class FatEspecGrupoAtendimento extends BaseEntityId<FatEspecGrupoAtendimentoId> implements java.io.Serializable {
	private static final long serialVersionUID = 1091808337711367593L;
	
	private FatEspecGrupoAtendimentoId id;
	private FatGrupoAtendimento fatGrupoAtendimento;
	private Integer version;

	private AghEspecialidades especialidade;
	
	public FatEspecGrupoAtendimento() {
	}

	public FatEspecGrupoAtendimento(FatEspecGrupoAtendimentoId id,
			FatGrupoAtendimento fatGrupoAtendimento) {
		this.id = id;
		this.fatGrupoAtendimento = fatGrupoAtendimento;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "espSeq", column = @Column(name = "ESP_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "graCnvCodigo", column = @Column(name = "GRA_CNV_CODIGO", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "graSeqp", column = @Column(name = "GRA_SEQP", nullable = false, precision = 2, scale = 0)) })
	public FatEspecGrupoAtendimentoId getId() {
		return this.id;
	}

	public void setId(FatEspecGrupoAtendimentoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "GRA_CNV_CODIGO", referencedColumnName = "CNV_CODIGO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "GRA_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public FatGrupoAtendimento getFatGrupoAtendimento() {
		return this.fatGrupoAtendimento;
	}

	public void setFatGrupoAtendimento(
			FatGrupoAtendimento fatGrupoAtendimento) {
		this.fatGrupoAtendimento = fatGrupoAtendimento;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		FatEspecGrupoAtendimento other = (FatEspecGrupoAtendimento) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	
	public void setEspecialidade(AghEspecialidades especialidade) {
		this.especialidade = especialidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ", nullable = false, insertable = false, updatable = false)
	public AghEspecialidades getEspecialidade() {
		return especialidade;
	}

	public enum Fields {

		ESP_SEQ("id.espSeq"),
		;

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
