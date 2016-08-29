package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MciProcedimentoRisco generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mciPorSq1", sequenceName="AGH.MCI_POR_SQ1", allocationSize = 1)
@Table(name = "MCI_PROCEDIMENTO_RISCOS", schema = "AGH")
public class MciProcedimentoRisco extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8790935055806344381L;
	private Short seq;
	private Integer version;
	private RapServidores rapServidoresByMciPorSerFk1;
	private RapServidores rapServidoresByMciPorSerFk2;
	private String descricao;
	private DominioSituacao indSituacao;
	private String indPermSobreposicao;
	private Short grauRisco;
	private Date criadoEm;
	private Date alteradoEm;
	private String indInformacaoHora;
	private Set<MciGrupoProcedRisco> mciGrupoProcedRiscoes = new HashSet<MciGrupoProcedRisco>(0);
	private Set<MciItemCondicaoClinica> mciItemCondicaoClinicaes = new HashSet<MciItemCondicaoClinica>(0);
	private Set<MciParamProcedRisco> mciParamProcedRiscoes = new HashSet<MciParamProcedRisco>(0);
	private Set<MciMapProcedPrescricao> mciMapProcedPrescricaoes = new HashSet<MciMapProcedPrescricao>(0);
	private Set<MciCriterioPortal> mciCriterioPortals = new HashSet<MciCriterioPortal>(0);
	private Set<MciMvtoProcedimentoRiscos> mciMvtoProcedimentoRiscoses = new HashSet<MciMvtoProcedimentoRiscos>(0);

	public MciProcedimentoRisco() {
	}

	public MciProcedimentoRisco(Short seq, RapServidores rapServidoresByMciPorSerFk1, String descricao, DominioSituacao indSituacao,
			String indPermSobreposicao, Short grauRisco, Date criadoEm) {
		this.seq = seq;
		this.rapServidoresByMciPorSerFk1 = rapServidoresByMciPorSerFk1;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.indPermSobreposicao = indPermSobreposicao;
		this.grauRisco = grauRisco;
		this.criadoEm = criadoEm;
	}

	public MciProcedimentoRisco(Short seq, RapServidores rapServidoresByMciPorSerFk1, RapServidores rapServidoresByMciPorSerFk2,
			String descricao, DominioSituacao indSituacao, String indPermSobreposicao, Short grauRisco, Date criadoEm, Date alteradoEm,
			String indInformacaoHora, Set<MciGrupoProcedRisco> mciGrupoProcedRiscoes,
			Set<MciItemCondicaoClinica> mciItemCondicaoClinicaes, Set<MciParamProcedRisco> mciParamProcedRiscoes,
			Set<MciMapProcedPrescricao> mciMapProcedPrescricaoes, Set<MciCriterioPortal> mciCriterioPortals,
			Set<MciMvtoProcedimentoRiscos> mciMvtoProcedimentoRiscoses
			) {
		this.seq = seq;
		this.rapServidoresByMciPorSerFk1 = rapServidoresByMciPorSerFk1;
		this.rapServidoresByMciPorSerFk2 = rapServidoresByMciPorSerFk2;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.indPermSobreposicao = indPermSobreposicao;
		this.grauRisco = grauRisco;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.indInformacaoHora = indInformacaoHora;
		this.mciGrupoProcedRiscoes = mciGrupoProcedRiscoes;
		this.mciItemCondicaoClinicaes = mciItemCondicaoClinicaes;
		this.mciParamProcedRiscoes = mciParamProcedRiscoes;
		this.mciMapProcedPrescricaoes = mciMapProcedPrescricaoes;
		this.mciCriterioPortals = mciCriterioPortals;
		this.mciMvtoProcedimentoRiscoses = mciMvtoProcedimentoRiscoses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mciPorSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
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
	public RapServidores getRapServidoresByMciPorSerFk1() {
		return this.rapServidoresByMciPorSerFk1;
	}

	public void setRapServidoresByMciPorSerFk1(RapServidores rapServidoresByMciPorSerFk1) {
		this.rapServidoresByMciPorSerFk1 = rapServidoresByMciPorSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_MOVIMENTADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_MOVIMENTADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMciPorSerFk2() {
		return this.rapServidoresByMciPorSerFk2;
	}

	public void setRapServidoresByMciPorSerFk2(RapServidores rapServidoresByMciPorSerFk2) {
		this.rapServidoresByMciPorSerFk2 = rapServidoresByMciPorSerFk2;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_PERM_SOBREPOSICAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndPermSobreposicao() {
		return this.indPermSobreposicao;
	}

	public void setIndPermSobreposicao(String indPermSobreposicao) {
		this.indPermSobreposicao = indPermSobreposicao;
	}

	@Column(name = "GRAU_RISCO", nullable = false)
	public Short getGrauRisco() {
		return this.grauRisco;
	}

	public void setGrauRisco(Short grauRisco) {
		this.grauRisco = grauRisco;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "IND_INFORMACAO_HORA", length = 1)
	@Length(max = 1)
	public String getIndInformacaoHora() {
		return this.indInformacaoHora;
	}

	public void setIndInformacaoHora(String indInformacaoHora) {
		this.indInformacaoHora = indInformacaoHora;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciProcedimentoRisco")
	public Set<MciGrupoProcedRisco> getMciGrupoProcedRiscoes() {
		return this.mciGrupoProcedRiscoes;
	}

	public void setMciGrupoProcedRiscoes(Set<MciGrupoProcedRisco> mciGrupoProcedRiscoes) {
		this.mciGrupoProcedRiscoes = mciGrupoProcedRiscoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciProcedimentoRisco")
	public Set<MciItemCondicaoClinica> getMciItemCondicaoClinicaes() {
		return this.mciItemCondicaoClinicaes;
	}

	public void setMciItemCondicaoClinicaes(Set<MciItemCondicaoClinica> mciItemCondicaoClinicaes) {
		this.mciItemCondicaoClinicaes = mciItemCondicaoClinicaes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciProcedimentoRisco")
	public Set<MciParamProcedRisco> getMciParamProcedRiscoes() {
		return this.mciParamProcedRiscoes;
	}

	public void setMciParamProcedRiscoes(Set<MciParamProcedRisco> mciParamProcedRiscoes) {
		this.mciParamProcedRiscoes = mciParamProcedRiscoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciProcedimentoRisco")
	public Set<MciMapProcedPrescricao> getMciMapProcedPrescricaoes() {
		return this.mciMapProcedPrescricaoes;
	}

	public void setMciMapProcedPrescricaoes(Set<MciMapProcedPrescricao> mciMapProcedPrescricaoes) {
		this.mciMapProcedPrescricaoes = mciMapProcedPrescricaoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciProcedimentoRisco")
	public Set<MciCriterioPortal> getMciCriterioPortals() {
		return this.mciCriterioPortals;
	}

	public void setMciCriterioPortals(Set<MciCriterioPortal> mciCriterioPortals) {
		this.mciCriterioPortals = mciCriterioPortals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciProcedimentoRisco")
	public Set<MciMvtoProcedimentoRiscos> getMciMvtoProcedimentoRiscoses() {
		return this.mciMvtoProcedimentoRiscoses;
	}

	public void setMciMvtoProcedimentoRiscoses(Set<MciMvtoProcedimentoRiscos> mciMvtoProcedimentoRiscoses) {
		this.mciMvtoProcedimentoRiscoses = mciMvtoProcedimentoRiscoses;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES_BY_MCI_POR_SER_FK1("rapServidoresByMciPorSerFk1"),
		RAP_SERVIDORES_BY_MCI_POR_SER_FK2("rapServidoresByMciPorSerFk2"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		IND_PERM_SOBREPOSICAO("indPermSobreposicao"),
		GRAU_RISCO("grauRisco"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		IND_INFORMACAO_HORA("indInformacaoHora"),
		MCI_GRUPO_PROCED_RISCOES("mciGrupoProcedRiscoes"),
		MCI_ITEM_CONDICAO_CLINICAES("mciItemCondicaoClinicaes"),
		MCI_PARAM_PROCED_RISCOES("mciParamProcedRiscoes"),
		MCI_MAP_PROCED_PRESCRICAOES("mciMapProcedPrescricaoes"),
		MCI_CRITERIO_PORTALS("mciCriterioPortals"),
		MCI_MVTO_PROCEDIMENTO_RISCOSES("mciMvtoProcedimentoRiscoses")
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
		if (!(obj instanceof MciProcedimentoRisco)) {
			return false;
		}
		MciProcedimentoRisco other = (MciProcedimentoRisco) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}

}