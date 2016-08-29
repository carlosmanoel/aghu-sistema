package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapTmpMatricula generated by hbm2java
 */
@Entity
@Table(name = "RAP_TMP_MATRICULAS", schema = "AGH")
public class RapTmpMatricula extends BaseEntityId<RapTmpMatriculaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1467303413339803707L;
	private RapTmpMatriculaId id;

	public RapTmpMatricula() {
	}

	public RapTmpMatricula(RapTmpMatriculaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "matrSiape", column = @Column(name = "MATR_SIAPE")),
			@AttributeOverride(name = "matrHcpa", column = @Column(name = "MATR_HCPA")),
			@AttributeOverride(name = "nome", column = @Column(name = "NOME", length = 60)),
			@AttributeOverride(name = "digito", column = @Column(name = "DIGITO")),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public RapTmpMatriculaId getId() {
		return this.id;
	}

	public void setId(RapTmpMatriculaId id) {
		this.id = id;
	}

	public enum Fields {

		ID("id");

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