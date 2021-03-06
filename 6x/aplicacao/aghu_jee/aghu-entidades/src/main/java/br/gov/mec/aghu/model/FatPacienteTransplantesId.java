package br.gov.mec.aghu.model;

// Generated 24/02/2010 12:38:58 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatPacienteTransplantesId generated by hbm2java
 */
@Embeddable
public class FatPacienteTransplantesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3055411616929580147L;
	private Integer pacCodigo;
	private String ttrCodigo;
	private Date dtInscricaoTransplante;

	public FatPacienteTransplantesId() {
	}

	public FatPacienteTransplantesId(Integer pacCodigo, String ttrCodigo,
			Date dtInscricaoTransplante) {
		this.pacCodigo = pacCodigo;
		this.ttrCodigo = ttrCodigo;
		this.dtInscricaoTransplante = dtInscricaoTransplante;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "TTR_CODIGO", nullable = false, length = 10)
	@Length(max = 10)
	public String getTtrCodigo() {
		return this.ttrCodigo;
	}

	public void setTtrCodigo(String ttrCodigo) {
		this.ttrCodigo = ttrCodigo;
	}

	@Column(name = "DT_INSCRICAO_TRANSPLANTE", nullable = false, length = 7)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDtInscricaoTransplante() {
		return this.dtInscricaoTransplante;
	}

	public void setDtInscricaoTransplante(Date dtInscricaoTransplante) {
		this.dtInscricaoTransplante = dtInscricaoTransplante;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof FatPacienteTransplantesId)) {
			return false;
		}
		FatPacienteTransplantesId castOther = (FatPacienteTransplantesId) other;

		return (this.getPacCodigo() == castOther.getPacCodigo())
				&& ((this.getTtrCodigo() == castOther.getTtrCodigo()) || (this
						.getTtrCodigo() != null
						&& castOther.getTtrCodigo() != null && this
						.getTtrCodigo().equals(castOther.getTtrCodigo())))
				&& ((this.getDtInscricaoTransplante() == castOther
						.getDtInscricaoTransplante()) || (this
						.getDtInscricaoTransplante() != null
						&& castOther.getDtInscricaoTransplante() != null && this
						.getDtInscricaoTransplante().equals(
								castOther.getDtInscricaoTransplante())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPacCodigo();
		result = 37 * result
				+ (getTtrCodigo() == null ? 0 : this.getTtrCodigo().hashCode());
		result = 37
				* result
				+ (getDtInscricaoTransplante() == null ? 0 : this
						.getDtInscricaoTransplante().hashCode());
		return result;
	}

}
