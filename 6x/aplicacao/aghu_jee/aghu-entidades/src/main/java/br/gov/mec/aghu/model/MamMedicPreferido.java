package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamMedicPreferido generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamMdpSq1", sequenceName="AGH.MAM_MDP_SQ1", allocationSize = 1)
@Table(name = "MAM_MEDIC_PREFERIDOS", schema = "AGH")
public class MamMedicPreferido extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5818471622632134641L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidores;
	private String descricao;
	private String formaUso;
	private String quantidade;
	private String indInterno;
	private String indUsoContinuo;
	private String tipoPrescricao;
	private String tipoReceita;
	private String indSituacao;
	private Date criadoEm;
	private String categoria;
	private String indUsoInternacao;
	private String indUsoAmbulatorio;
	private String indUsoEmergencia;

	public MamMedicPreferido() {
	}

	public MamMedicPreferido(Integer seq, RapServidores rapServidores, String descricao, String indInterno, String indUsoContinuo,
			String tipoPrescricao, String indSituacao, Date criadoEm, String indUsoInternacao, String indUsoAmbulatorio,
			String indUsoEmergencia) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.indInterno = indInterno;
		this.indUsoContinuo = indUsoContinuo;
		this.tipoPrescricao = tipoPrescricao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.indUsoInternacao = indUsoInternacao;
		this.indUsoAmbulatorio = indUsoAmbulatorio;
		this.indUsoEmergencia = indUsoEmergencia;
	}

	public MamMedicPreferido(Integer seq, RapServidores rapServidores, String descricao, String formaUso, String quantidade,
			String indInterno, String indUsoContinuo, String tipoPrescricao, String tipoReceita, String indSituacao, Date criadoEm,
			String categoria, String indUsoInternacao, String indUsoAmbulatorio, String indUsoEmergencia) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.formaUso = formaUso;
		this.quantidade = quantidade;
		this.indInterno = indInterno;
		this.indUsoContinuo = indUsoContinuo;
		this.tipoPrescricao = tipoPrescricao;
		this.tipoReceita = tipoReceita;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.categoria = categoria;
		this.indUsoInternacao = indUsoInternacao;
		this.indUsoAmbulatorio = indUsoAmbulatorio;
		this.indUsoEmergencia = indUsoEmergencia;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamMdpSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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

	@Column(name = "DESCRICAO", nullable = false, length = 120)
	@Length(max = 120)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "FORMA_USO", length = 500)
	@Length(max = 500)
	public String getFormaUso() {
		return this.formaUso;
	}

	public void setFormaUso(String formaUso) {
		this.formaUso = formaUso;
	}

	@Column(name = "QUANTIDADE", length = 10)
	@Length(max = 10)
	public String getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "IND_INTERNO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndInterno() {
		return this.indInterno;
	}

	public void setIndInterno(String indInterno) {
		this.indInterno = indInterno;
	}

	@Column(name = "IND_USO_CONTINUO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndUsoContinuo() {
		return this.indUsoContinuo;
	}

	public void setIndUsoContinuo(String indUsoContinuo) {
		this.indUsoContinuo = indUsoContinuo;
	}

	@Column(name = "TIPO_PRESCRICAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getTipoPrescricao() {
		return this.tipoPrescricao;
	}

	public void setTipoPrescricao(String tipoPrescricao) {
		this.tipoPrescricao = tipoPrescricao;
	}

	@Column(name = "TIPO_RECEITA", length = 2)
	@Length(max = 2)
	public String getTipoReceita() {
		return this.tipoReceita;
	}

	public void setTipoReceita(String tipoReceita) {
		this.tipoReceita = tipoReceita;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
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

	@Column(name = "CATEGORIA", length = 30)
	@Length(max = 30)
	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Column(name = "IND_USO_INTERNACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndUsoInternacao() {
		return this.indUsoInternacao;
	}

	public void setIndUsoInternacao(String indUsoInternacao) {
		this.indUsoInternacao = indUsoInternacao;
	}

	@Column(name = "IND_USO_AMBULATORIO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndUsoAmbulatorio() {
		return this.indUsoAmbulatorio;
	}

	public void setIndUsoAmbulatorio(String indUsoAmbulatorio) {
		this.indUsoAmbulatorio = indUsoAmbulatorio;
	}

	@Column(name = "IND_USO_EMERGENCIA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndUsoEmergencia() {
		return this.indUsoEmergencia;
	}

	public void setIndUsoEmergencia(String indUsoEmergencia) {
		this.indUsoEmergencia = indUsoEmergencia;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		FORMA_USO("formaUso"),
		QUANTIDADE("quantidade"),
		IND_INTERNO("indInterno"),
		IND_USO_CONTINUO("indUsoContinuo"),
		TIPO_PRESCRICAO("tipoPrescricao"),
		TIPO_RECEITA("tipoReceita"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		CATEGORIA("categoria"),
		IND_USO_INTERNACAO("indUsoInternacao"),
		IND_USO_AMBULATORIO("indUsoAmbulatorio"),
		IND_USO_EMERGENCIA("indUsoEmergencia");

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
		if (!(obj instanceof MamMedicPreferido)) {
			return false;
		}
		MamMedicPreferido other = (MamMedicPreferido) obj;
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