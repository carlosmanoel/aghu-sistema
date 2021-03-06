package br.gov.mec.aghu.model;

// Generated 11/03/2011 17:58:28 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.annotations.Parameter;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.dominio.DominioDiaSemana;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AacHorarioGradeConsultas generated by hbm2java
 */
@Entity
@Table(name = "AAC_HORARIO_GRADE_CONSULTAS", schema = "AGH")
public class AacHorarioGradeConsulta extends BaseEntityId<AacHorarioGradeConsultaId> implements java.io.Serializable {

	private static final long serialVersionUID = -4150965028951798281L;
	private AacHorarioGradeConsultaId id;
	private DominioDiaSemana diaSemana;
	private Date horaInicio;
	private DominioSituacao situacao;
	private Date criadoEm;
	private String tpsTipo;
	private Date duracao;
	private Short numHorario;
	private Date horaFim;
	private Date alteradoEm;
	private RapServidores servidor;
	private RapServidores servidorAlterado;
	private Date dtUltimaGeracao;
	private AacFormaAgendamento formaAgendamento;
	private Integer version;
	
	private AacGradeAgendamenConsultas gradeAgendamentoConsulta;

	public AacHorarioGradeConsulta() {
	}

	public AacHorarioGradeConsulta(AacHorarioGradeConsultaId id,
			DominioDiaSemana diaSemana, Date horaInicio,
			DominioSituacao situacao, Date criadoEm, String tpsTipo,
			Date duracao, Short numHorario, Date horaFim, Date alteradoEm,
			RapServidores servidor, RapServidores servidorAlterado,
			Date dtUltimaGeracao, AacFormaAgendamento formaAgendamento, 
			AacGradeAgendamenConsultas gradeAgendamentoConsulta) {
		super();
		this.id = id;
		this.diaSemana = diaSemana;
		this.horaInicio = horaInicio;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.tpsTipo = tpsTipo;
		this.duracao = duracao;
		this.numHorario = numHorario;
		this.horaFim = horaFim;
		this.alteradoEm = alteradoEm;
		this.servidor = servidor;
		this.servidorAlterado = servidorAlterado;
		this.dtUltimaGeracao = dtUltimaGeracao;
		this.formaAgendamento = formaAgendamento;
		this.gradeAgendamentoConsulta = gradeAgendamentoConsulta;
	}


	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "grdSeq", column = @Column(name = "GRD_SEQ", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 5, scale = 0)) })
	public AacHorarioGradeConsultaId getId() {
		return this.id;
	}

	public void setId(AacHorarioGradeConsultaId id) {
		this.id = id;
	}

	@Column(name = "DIA_SEMANA", nullable = false)
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.core.dominio.DominioDiaSemana") }, type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioDiaSemana getDiaSemana() {
		return this.diaSemana;
	}

	public void setDiaSemana(DominioDiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HORA_INICIO", nullable = false, length = 7)
	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "TPS_TIPO", length = 2)
	public String getTpsTipo() {
		return this.tpsTipo;
	}

	public void setTpsTipo(String tpsTipo) {
		this.tpsTipo = tpsTipo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DURACAO", nullable = false, length = 7)
	public Date getDuracao() {
		return this.duracao;
	}

	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}

	@Column(name = "NUM_HORARIO", precision = 4, length=4, scale = 0)
	public Short getNumHorario() {
		return this.numHorario;
	}

	public void setNumHorario(Short numHorario) {
		this.numHorario = numHorario;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HORA_FIM", length = 7)
	public Date getHoraFim() {
		return this.horaFim;
	}

	public void setHoraFim(Date horaFim) {
		this.horaFim = horaFim;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULTIMA_GERACAO", length = 7)
	public Date getDtUltimaGeracao() {
		return this.dtUltimaGeracao;
	}

	public void setDtUltimaGeracao(Date dtUltimaGeracao) {
		this.dtUltimaGeracao = dtUltimaGeracao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "FAG_CAA_SEQ", referencedColumnName = "CAA_SEQ", nullable = false),
			@JoinColumn(name = "FAG_TAG_SEQ", referencedColumnName = "TAG_SEQ", nullable = false),
			@JoinColumn(name = "FAG_PGD_SEQ", referencedColumnName = "PGD_SEQ", nullable = false)})
	public AacFormaAgendamento getFormaAgendamento() {
		return this.formaAgendamento;
	}

	public void setFormaAgendamento(
			AacFormaAgendamento formaAgendamento) {
		this.formaAgendamento = formaAgendamento;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAlterado() {
		return this.servidorAlterado;
	}
	
	public void setServidorAlterado(RapServidores servidorAlterado) {
		this.servidorAlterado = servidorAlterado;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="GRD_SEQ", insertable=false, updatable=false)
	public AacGradeAgendamenConsultas getGradeAgendamentoConsulta() {
		return gradeAgendamentoConsulta;
	}

	public void setGradeAgendamentoConsulta(AacGradeAgendamenConsultas gradeAgendamentoConsulta) {
		this.gradeAgendamentoConsulta = gradeAgendamentoConsulta;
	}
	
	public enum Fields {
		GRADE_AGENDAMENTO("gradeAgendamentoConsulta"), GRD_SEQ(
				"gradeAgendamentoConsulta.seq"), SEQP("id.seqp"), ID_GRD_SEQ("id.grdSeq"), DIA_SEMANA(
				"diaSemana"), IND_SITUACAO("situacao"), HORA_INICIO(
				"horaInicio"), DT_ULTIMA_GERACAO("dtUltimaGeracao"), TPS_TIPO(
				"tpsTipo"), DURACAO("duracao"), NUM_HORARIO("numHorario"), HORA_FIM(
				"horaFim"), CONDICAO_ATENDIMENTO(
				"formaAgendamento.condicaoAtendimento"), TIPO_AGENDAMENTO(
				"formaAgendamento.tipoAgendamento"), PAGADOR(
				"formaAgendamento.pagador"), FORMA_AGENDAMENTO("formaAgendamento");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}	
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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
		if (!(obj instanceof AacHorarioGradeConsulta)) {
			return false;
		}
		AacHorarioGradeConsulta other = (AacHorarioGradeConsulta) obj;
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
