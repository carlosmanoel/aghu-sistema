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
 * Equipamento generated by hbm2java
 */
@Entity
@Table(name = "EQUIPAMENTO", schema = "AGH")
public class Equipamento extends BaseEntityId<EquipamentoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 693666720857208874L;
	private EquipamentoId id;

	public Equipamento() {
	}

	public Equipamento(EquipamentoId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "codEqu", column = @Column(name = "COD_EQU", precision = 17, scale = 17)),
			@AttributeOverride(name = "codLeq", column = @Column(name = "COD_LEQ", precision = 17, scale = 17)),
			@AttributeOverride(name = "codEst", column = @Column(name = "COD_EST", precision = 17, scale = 17)),
			@AttributeOverride(name = "codAss", column = @Column(name = "COD_ASS", precision = 17, scale = 17)),
			@AttributeOverride(name = "equipamento", column = @Column(name = "EQUIPAMENTO", length = 30)),
			@AttributeOverride(name = "tipo", column = @Column(name = "TIPO", length = 30)),
			@AttributeOverride(name = "modelo", column = @Column(name = "MODELO", length = 30)),
			@AttributeOverride(name = "fabricante", column = @Column(name = "FABRICANTE", length = 30)),
			@AttributeOverride(name = "serie", column = @Column(name = "SERIE", length = 30)),
			@AttributeOverride(name = "status", column = @Column(name = "STATUS", length = 1)),
			@AttributeOverride(name = "dataAquisicao", column = @Column(name = "DATA_AQUISICAO", length = 29)),
			@AttributeOverride(name = "notaFiscal", column = @Column(name = "NOTA_FISCAL", length = 20)),
			@AttributeOverride(name = "fornecedor", column = @Column(name = "FORNECEDOR", length = 30)),
			@AttributeOverride(name = "dataGarantia", column = @Column(name = "DATA_GARANTIA", length = 29)),
			@AttributeOverride(name = "obs", column = @Column(name = "OBS", length = 220)),
			@AttributeOverride(name = "motivo", column = @Column(name = "MOTIVO", length = 220)),
			@AttributeOverride(name = "retornar", column = @Column(name = "RETORNAR", length = 1)),
			@AttributeOverride(name = "ativo", column = @Column(name = "ATIVO", length = 1)),
			@AttributeOverride(name = "data", column = @Column(name = "DATA", length = 29)),
			@AttributeOverride(name = "patrimonio", column = @Column(name = "PATRIMONIO", length = 30)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public EquipamentoId getId() {
		return this.id;
	}

	public void setId(EquipamentoId id) {
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
		if (!(obj instanceof Equipamento)) {
			return false;
		}
		Equipamento other = (Equipamento) obj;
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