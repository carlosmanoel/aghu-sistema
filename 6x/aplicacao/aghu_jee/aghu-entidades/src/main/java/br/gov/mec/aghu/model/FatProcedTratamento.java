package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatProcedTratamentos generated by hbm2java
 */
@Entity
@Table(name = "FAT_PROCED_TRATAMENTOS", schema = "AGH")
public class FatProcedTratamento extends BaseEntityId<FatProcedTratamentoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -694956938872101632L;
	private FatProcedTratamentoId id;
	private FatProcedHospInternos procedimentoHospitalarInterno;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String indCancela;
	private String indTipoUso;
	private FatTipoTratamentos tipoTratamento;

	public FatProcedTratamento() {
	}

	public FatProcedTratamento(FatProcedTratamentoId id, FatProcedHospInternos procedimentoHospitalarInterno, Date criadoEm,
			String indTipoUso) {
		this.id = id;
		this.procedimentoHospitalarInterno = procedimentoHospitalarInterno;
		this.criadoEm = criadoEm;
		this.indTipoUso = indTipoUso;
	}

	public FatProcedTratamento(FatProcedTratamentoId id, FatProcedHospInternos procedimentoHospitalarInterno, Date criadoEm,
			Integer serMatricula, Short serVinCodigo, String indCancela,
			String indTipoUso) {
		this.id = id;
		this.procedimentoHospitalarInterno = procedimentoHospitalarInterno;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.indCancela = indCancela;
		this.indTipoUso = indTipoUso;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "tptSeq", column = @Column(name = "TPT_SEQ", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "phiSeq", column = @Column(name = "PHI_SEQ", nullable = false, precision = 6, scale = 0)) })
	public FatProcedTratamentoId getId() {
		return this.id;
	}

	public void setId(FatProcedTratamentoId id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA", precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "IND_CANCELA", length = 1)
	@Length(max = 1)
	public String getIndCancela() {
		return this.indCancela;
	}

	public void setIndCancela(String indCancela) {
		this.indCancela = indCancela;
	}

	@Column(name = "IND_TIPO_USO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndTipoUso() {
		return this.indTipoUso;
	}

	public void setIndTipoUso(String indTipoUso) {
		this.indTipoUso = indTipoUso;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PHI_SEQ", nullable = false, insertable = false, updatable = false)
	public FatProcedHospInternos getProcedimentoHospitalarInterno() {
		return procedimentoHospitalarInterno;
	}

	public void setProcedimentoHospitalarInterno(
			FatProcedHospInternos procedimentoHospitalarInterno) {
		this.procedimentoHospitalarInterno = procedimentoHospitalarInterno;
	}	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TPT_SEQ", nullable = false, insertable = false, updatable = false)
	public FatTipoTratamentos getTipoTratamento() {
		return tipoTratamento;
	}

	public void setTipoTratamento(
			FatTipoTratamentos tipoTratamento) {
		this.tipoTratamento = tipoTratamento;
	}
	
	
	public enum Fields {
				PHI_SEQ("id.phiSeq"),
				TPT_SEQ("id.tptSeq"),
				TIPO_TRATAMENTO("tipoTratamento");

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
		if (!(obj instanceof FatProcedTratamento)) {
			return false;
		}
		FatProcedTratamento other = (FatProcedTratamento) obj;
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
