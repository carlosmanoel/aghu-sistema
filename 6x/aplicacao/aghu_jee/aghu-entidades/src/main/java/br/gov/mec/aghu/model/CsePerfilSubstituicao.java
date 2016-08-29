package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * CsePerfilSubstituicao generated by hbm2java
 */
@Entity
@Table(name = "CSE_PERFIL_SUBSTITUICOES", schema = "AGH")
public class CsePerfilSubstituicao extends BaseEntityId<CsePerfilSubstituicaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1176890602026379322L;
	private CsePerfilSubstituicaoId id;
	private Integer version;

	public CsePerfilSubstituicao() {
	}

	public CsePerfilSubstituicao(CsePerfilSubstituicaoId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "perNome", column = @Column(name = "PER_NOME", nullable = false, length = 30)),
			@AttributeOverride(name = "perNomeSubstituido", column = @Column(name = "PER_NOME_SUBSTITUIDO", nullable = false, length = 30)) })
	public CsePerfilSubstituicaoId getId() {
		return this.id;
	}

	public void setId(CsePerfilSubstituicaoId id) {
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

	public enum Fields {

		ID("id"),
		VERSION("version");

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
		if (!(obj instanceof CsePerfilSubstituicao)) {
			return false;
		}
		CsePerfilSubstituicao other = (CsePerfilSubstituicao) obj;
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