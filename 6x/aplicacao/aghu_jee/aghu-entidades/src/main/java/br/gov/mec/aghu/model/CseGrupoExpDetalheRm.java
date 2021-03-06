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
 * CseGrupoExpDetalheRm generated by hbm2java
 */
@Entity
@Table(name = "CSE_GRUPO_EXP_DETALHES_RM", schema = "AGH")
public class CseGrupoExpDetalheRm extends BaseEntityId<CseGrupoExpDetalheRmId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8044237201105303045L;
	private CseGrupoExpDetalheRmId id;

	public CseGrupoExpDetalheRm() {
	}

	public CseGrupoExpDetalheRm(CseGrupoExpDetalheRmId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "gueSeq", column = @Column(name = "GUE_SEQ", nullable = false)),
			@AttributeOverride(name = "dias", column = @Column(name = "DIAS", nullable = false)),
			@AttributeOverride(name = "indAvisoRede", column = @Column(name = "IND_AVISO_REDE", nullable = false, length = 1)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public CseGrupoExpDetalheRmId getId() {
		return this.id;
	}

	public void setId(CseGrupoExpDetalheRmId id) {
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
