package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamEmgServEspCoop generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamEscSq1", sequenceName="AGH.MAM_ESC_SQ1", allocationSize = 1)
@Table(name = "MAM_EMG_SERV_ESP_COOPS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = { "tco_seq",
		"esd_ese_seq", "esd_eep_esp_seq" }))
public class MamEmgServEspCoop extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6096891054487001863L;
	private Integer seq;
	private RapServidores rapServidores;
	private MamEmgServEspecialidade mamEmgServEspecialidade;
	private MamTipoCooperacao mamTipoCooperacao;
	private String criadoEm;

	public MamEmgServEspCoop() {
	}

	public MamEmgServEspCoop(Integer seq, RapServidores rapServidores, MamEmgServEspecialidade mamEmgServEspecialidade,
			MamTipoCooperacao mamTipoCooperacao, String criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.mamEmgServEspecialidade = mamEmgServEspecialidade;
		this.mamTipoCooperacao = mamTipoCooperacao;
		this.criadoEm = criadoEm;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamEscSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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
	@JoinColumns({ @JoinColumn(name = "ESD_ESE_SEQ", referencedColumnName = "ESE_SEQ", nullable = false),
			@JoinColumn(name = "ESD_EEP_ESP_SEQ", referencedColumnName = "EEP_ESP_SEQ", nullable = false) })
	@NotNull
	public MamEmgServEspecialidade getMamEmgServEspecialidade() {
		return this.mamEmgServEspecialidade;
	}

	public void setMamEmgServEspecialidade(MamEmgServEspecialidade mamEmgServEspecialidade) {
		this.mamEmgServEspecialidade = mamEmgServEspecialidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TCO_SEQ", nullable = false)
	@NotNull
	public MamTipoCooperacao getMamTipoCooperacao() {
		return this.mamTipoCooperacao;
	}

	public void setMamTipoCooperacao(MamTipoCooperacao mamTipoCooperacao) {
		this.mamTipoCooperacao = mamTipoCooperacao;
	}

	@Column(name = "CRIADO_EM", nullable = false, length = 240)
	@NotNull
	@Length(max = 240)
	public String getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(String criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		SEQ("seq"),
		RAP_SERVIDORES("rapServidores"),
		MAM_EMG_SERV_ESPECIALIDADES("mamEmgServEspecialidade"),
		MAM_TIPO_COOPERACOES("mamTipoCooperacao"),
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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MamEmgServEspCoop)) {
			return false;
		}
		MamEmgServEspCoop other = (MamEmgServEspCoop) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
