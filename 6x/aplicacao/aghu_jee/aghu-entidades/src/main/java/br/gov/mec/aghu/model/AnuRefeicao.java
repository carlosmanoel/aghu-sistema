package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
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

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AnuRefeicao generated by hbm2java
 */
@Entity
@SequenceGenerator(name="anuRefSq1", sequenceName="AGH.ANU_REF_SQ1", allocationSize = 1)
@Table(name = "ANU_REFEICOES", schema = "AGH")
public class AnuRefeicao extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8083756915223619189L;
	private Short seq;
	private Integer version;
	private RapServidores rapServidores;
	private Date criadoEm;
	private String descricao;
	private String indSituacao;
	private Date horaInicio;
	private Date horaFim;
	private Date horaPrepAdulto;
	private Date horaPrepPediatria;
	private Date horaPrepNeonatologia;
	private Set<AnuItemGrupoQuadroDieta> anuItemGrupoQuadroDietaes = new HashSet<AnuItemGrupoQuadroDieta>(0);
	private Set<AnuEtiquetaPadrao> anuEtiquetaPadraoes = new HashSet<AnuEtiquetaPadrao>(0);
	private Set<AnuItemPadraoSnd> anuItemPadraoSnds = new HashSet<AnuItemPadraoSnd>(0);

	// FIXME Implementar este relacionamento
//	private Set<AnuHabitoAlimAtendimento> anuHabitoAlimAtendimentoes = new HashSet<AnuHabitoAlimAtendimento>(0);

	public AnuRefeicao() {
	}

	public AnuRefeicao(Short seq, RapServidores rapServidores, Date criadoEm, String descricao, String indSituacao, Date horaInicio,
			Date horaFim, Date horaPrepAdulto, Date horaPrepPediatria, Date horaPrepNeonatologia) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.horaPrepAdulto = horaPrepAdulto;
		this.horaPrepPediatria = horaPrepPediatria;
		this.horaPrepNeonatologia = horaPrepNeonatologia;
	}

	public AnuRefeicao(Short seq, RapServidores rapServidores, Date criadoEm, String descricao, String indSituacao, Date horaInicio,
			Date horaFim, Date horaPrepAdulto, Date horaPrepPediatria, Date horaPrepNeonatologia,
//			Set<AnuHabitoAlimAtendimento> anuHabitoAlimAtendimentoes, 
			Set<AnuItemGrupoQuadroDieta> anuItemGrupoQuadroDietaes,
			Set<AnuEtiquetaPadrao> anuEtiquetaPadraoes, Set<AnuItemPadraoSnd> anuItemPadraoSnds) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.horaPrepAdulto = horaPrepAdulto;
		this.horaPrepPediatria = horaPrepPediatria;
		this.horaPrepNeonatologia = horaPrepNeonatologia;
//		this.anuHabitoAlimAtendimentoes = anuHabitoAlimAtendimentoes;
		this.anuItemGrupoQuadroDietaes = anuItemGrupoQuadroDietaes;
		this.anuEtiquetaPadraoes = anuEtiquetaPadraoes;
		this.anuItemPadraoSnds = anuItemPadraoSnds;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "anuRefSq1")
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
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 45)
	@Length(max = 45)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	@Column(name = "HORA_INICIO", nullable = false, length = 29)
	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HORA_FIM", nullable = false, length = 29)
	public Date getHoraFim() {
		return this.horaFim;
	}

	public void setHoraFim(Date horaFim) {
		this.horaFim = horaFim;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HORA_PREP_ADULTO", nullable = false, length = 29)
	public Date getHoraPrepAdulto() {
		return this.horaPrepAdulto;
	}

	public void setHoraPrepAdulto(Date horaPrepAdulto) {
		this.horaPrepAdulto = horaPrepAdulto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HORA_PREP_PEDIATRIA", nullable = false, length = 29)
	public Date getHoraPrepPediatria() {
		return this.horaPrepPediatria;
	}

	public void setHoraPrepPediatria(Date horaPrepPediatria) {
		this.horaPrepPediatria = horaPrepPediatria;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HORA_PREP_NEONATOLOGIA", nullable = false, length = 29)
	public Date getHoraPrepNeonatologia() {
		return this.horaPrepNeonatologia;
	}

	public void setHoraPrepNeonatologia(Date horaPrepNeonatologia) {
		this.horaPrepNeonatologia = horaPrepNeonatologia;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "anuRefeicao")
//	public Set<AnuHabitoAlimAtendimento> getAnuHabitoAlimAtendimentoes() {
//		return this.anuHabitoAlimAtendimentoes;
//	}
//
//	public void setAnuHabitoAlimAtendimentoes(Set<AnuHabitoAlimAtendimento> anuHabitoAlimAtendimentoes) {
//		this.anuHabitoAlimAtendimentoes = anuHabitoAlimAtendimentoes;
//	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "anuRefeicao")
	public Set<AnuItemGrupoQuadroDieta> getAnuItemGrupoQuadroDietaes() {
		return this.anuItemGrupoQuadroDietaes;
	}

	public void setAnuItemGrupoQuadroDietaes(Set<AnuItemGrupoQuadroDieta> anuItemGrupoQuadroDietaes) {
		this.anuItemGrupoQuadroDietaes = anuItemGrupoQuadroDietaes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "anuRefeicao")
	public Set<AnuEtiquetaPadrao> getAnuEtiquetaPadraoes() {
		return this.anuEtiquetaPadraoes;
	}

	public void setAnuEtiquetaPadraoes(Set<AnuEtiquetaPadrao> anuEtiquetaPadraoes) {
		this.anuEtiquetaPadraoes = anuEtiquetaPadraoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "anuRefeicao")
	public Set<AnuItemPadraoSnd> getAnuItemPadraoSnds() {
		return this.anuItemPadraoSnds;
	}

	public void setAnuItemPadraoSnds(Set<AnuItemPadraoSnd> anuItemPadraoSnds) {
		this.anuItemPadraoSnds = anuItemPadraoSnds;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		CRIADO_EM("criadoEm"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		HORA_INICIO("horaInicio"),
		HORA_FIM("horaFim"),
		HORA_PREP_ADULTO("horaPrepAdulto"),
		HORA_PREP_PEDIATRIA("horaPrepPediatria"),
		HORA_PREP_NEONATOLOGIA("horaPrepNeonatologia"),
//		ANU_HABITO_ALIM_ATENDIMENTOES("anuHabitoAlimAtendimentoes"),
		ANU_ITEM_GRUPO_QUADRO_DIETAES("anuItemGrupoQuadroDietaes"),
		ANU_ETIQUETA_PADRAOES("anuEtiquetaPadraoes"),
		ANU_ITEM_PADRAO_SNDS("anuItemPadraoSnds");

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
		if (!(obj instanceof AnuRefeicao)) {
			return false;
		}
		AnuRefeicao other = (AnuRefeicao) obj;
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
