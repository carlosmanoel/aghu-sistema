package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
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
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioEcog;
import br.gov.mec.aghu.dominio.DominioInfecProcInvasivo;
import br.gov.mec.aghu.dominio.DominioInicioInfeccao;
import br.gov.mec.aghu.dominio.DominioIntencaoTratamento;
import br.gov.mec.aghu.dominio.DominioInternacaoPrevia;
import br.gov.mec.aghu.dominio.DominioLinhaTratamento;
import br.gov.mec.aghu.dominio.DominioSitAntibiograma;
import br.gov.mec.aghu.dominio.DominioSituacaoSolicitacaoMedicamento;
import br.gov.mec.aghu.dominio.DominioTipoInfeccao;
import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpmJustificativaUsoMdto generated by hbm2java
 */

@Entity
@SequenceGenerator(name="mpmJumSq1", sequenceName="AGH.MPM_JUM_SQ1", allocationSize = 1)
@Table(name = "MPM_JUSTIFICATIVA_USO_MDTOS", schema = "AGH")
public class MpmJustificativaUsoMdto extends BaseEntitySeq<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3176622327529496567L;
	
	private Integer seq;
	private AghAtendimentos atendimento;
	private Short gupSeq;
	private AfaGrupoUsoMedicamento grupoUsoMedicamento;
	private RapServidores servidor;
	private String justificativa;
	private DominioSituacaoSolicitacaoMedicamento situacao;
	private Boolean candAprovLote;
	private Date criadoEm;
	private Boolean orientacaoAvaliador;
	private Byte cspSeq;
	private Short cspCnvCodigo;
	private Boolean gestante;
	private DominioTipoInfeccao tipoInfeccao;
	private String nomeGerme;
	private DominioSitAntibiograma sitAntibiograma;
	private String sensibilidadeAntibiotico;
	private Boolean funcRenalComprometida;
	private Boolean pacImunodeprimido;
	private String observacao;
	private RapServidores servidorValida;
	private Date alteradoEm;
	private RapServidores servidorConhecimento;
	private String indicacao;
	private String infeccaoTratar;
	private String tratAntimicrobAnt;
	private DominioInternacaoPrevia internacaoPrevia;
	private DominioInicioInfeccao inicioInfeccao;
	private DominioInfecProcInvasivo infecRelProcedInvasivo;
	private Boolean sondaVesicalDemora;
	private BigDecimal pesoEstimado;
	private Boolean condutaBaseProtAssist;
	private Boolean insufHepatica;
	private String vantagemNsPadronizacao;
	private Boolean usoCronicoPrevInt;
	private BigDecimal custoDiarioEstReal;
	private String refBibliograficas;
	private String diagnostico;
	private DominioEcog ecog;
	private DominioIntencaoTratamento intencaoTrat;
	private DominioLinhaTratamento linhaTrat;
	private String tratAntCirurgia;
	private String tratAntRadio;
	private String tratAntQuimio;
	private Date mesAnoUltCiclo;
	private String tratAntHormonio;
	private String tratAntOutros;
	private MpmTrocaEsquemaTb trocaEsquemaTb;
	private Set<MpmItemPrescricaoMdto> itemPrescricaoMdtos = new HashSet<MpmItemPrescricaoMdto>(
			0);

	public MpmJustificativaUsoMdto() {
	}

	public MpmJustificativaUsoMdto(Integer seq, AghAtendimentos atendimento, Short gupSeq,
			RapServidores servidor, String justificativa,
			DominioSituacaoSolicitacaoMedicamento situacao, Boolean candAprovLote, Date criadoEm,
			Boolean orientacaoAvaliador) {
		this.seq = seq;
		this.atendimento = atendimento;
		this.gupSeq = gupSeq;
		this.servidor = servidor;
		this.justificativa = justificativa;
		this.situacao = situacao;
		this.candAprovLote = candAprovLote;
		this.criadoEm = criadoEm;
		this.orientacaoAvaliador = orientacaoAvaliador;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public MpmJustificativaUsoMdto(Integer seq, AghAtendimentos atendimento, Short gupSeq,
			RapServidores servidor, String justificativa,
			DominioSituacaoSolicitacaoMedicamento situacao, Boolean candAprovLote, Date criadoEm,
			Boolean orientacaoAvaliador, Byte cspSeq, Short cspCnvCodigo,
			Boolean gestante, DominioTipoInfeccao tipoInfeccao, String nomeGerme,
			DominioSitAntibiograma sitAntibiograma, String sensibilidadeAntibiotico,
			Boolean funcRenalComprometida, Boolean pacImunodeprimido,
			String observacao, RapServidores servidorValida, Date alteradoEm,
			RapServidores servidorConhecimento,
			String indicacao, String infeccaoTratar, String tratAntimicrobAnt,
			DominioInternacaoPrevia internacaoPrevia, DominioInicioInfeccao inicioInfeccao,
			DominioInfecProcInvasivo infecRelProcedInvasivo, Boolean sondaVesicalDemora,
			BigDecimal pesoEstimado, Boolean condutaBaseProtAssist,
			Boolean insufHepatica, String vantagemNsPadronizacao,
			Boolean usoCronicoPrevInt, BigDecimal custoDiarioEstReal,
			String refBibliograficas, String diagnostico, DominioEcog ecog,
			DominioIntencaoTratamento intencaoTrat, DominioLinhaTratamento linhaTrat, String tratAntCirurgia,
			String tratAntRadio, String tratAntQuimio, Date mesAnoUltCiclo,
			String tratAntHormonio, String tratAntOutros,
			MpmTrocaEsquemaTb trocaEsquemaTb,
			Set<MpmItemPrescricaoMdto> itemPrescricaoMdtos) {
		this.seq = seq;
		this.atendimento = atendimento;
		this.gupSeq = gupSeq;
		this.servidor = servidor;
		this.justificativa = justificativa;
		this.situacao = situacao;
		this.candAprovLote = candAprovLote;
		this.criadoEm = criadoEm;
		this.orientacaoAvaliador = orientacaoAvaliador;
		this.cspSeq = cspSeq;
		this.cspCnvCodigo = cspCnvCodigo;
		this.gestante = gestante;
		this.tipoInfeccao = tipoInfeccao;
		this.nomeGerme = nomeGerme;
		this.sitAntibiograma = sitAntibiograma;
		this.sensibilidadeAntibiotico = sensibilidadeAntibiotico;
		this.funcRenalComprometida = funcRenalComprometida;
		this.pacImunodeprimido = pacImunodeprimido;
		this.observacao = observacao;
		this.servidorValida = servidorValida;
		this.alteradoEm = alteradoEm;
		this.servidorConhecimento = servidorConhecimento;
		this.indicacao = indicacao;
		this.infeccaoTratar = infeccaoTratar;
		this.tratAntimicrobAnt = tratAntimicrobAnt;
		this.internacaoPrevia = internacaoPrevia;
		this.inicioInfeccao = inicioInfeccao;
		this.infecRelProcedInvasivo = infecRelProcedInvasivo;
		this.sondaVesicalDemora = sondaVesicalDemora;
		this.pesoEstimado = pesoEstimado;
		this.condutaBaseProtAssist = condutaBaseProtAssist;
		this.insufHepatica = insufHepatica;
		this.vantagemNsPadronizacao = vantagemNsPadronizacao;
		this.usoCronicoPrevInt = usoCronicoPrevInt;
		this.custoDiarioEstReal = custoDiarioEstReal;
		this.refBibliograficas = refBibliograficas;
		this.diagnostico = diagnostico;
		this.ecog = ecog;
		this.intencaoTrat = intencaoTrat;
		this.linhaTrat = linhaTrat;
		this.tratAntCirurgia = tratAntCirurgia;
		this.tratAntRadio = tratAntRadio;
		this.tratAntQuimio = tratAntQuimio;
		this.mesAnoUltCiclo = mesAnoUltCiclo;
		this.tratAntHormonio = tratAntHormonio;
		this.tratAntOutros = tratAntOutros;
		this.trocaEsquemaTb = trocaEsquemaTb;
		this.itemPrescricaoMdtos = itemPrescricaoMdtos;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpmJumSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ", nullable = false)
	public AghAtendimentos getAtendimento() {
		return this.atendimento;
	}

	public void setAtendimento(AghAtendimentos atendimento) {
		this.atendimento = atendimento;
	}
	
	@Column(name = "GUP_SEQ", nullable = false, precision = 3, scale = 0)
	/**
	 * TODO Tabela não mapeada. AFA_GRUPO_USO_MDTOS
	 */
	public Short getGupSeq() {
		return this.gupSeq;
	}

	public void setGupSeq(Short gupSeq) {
		this.gupSeq = gupSeq;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GUP_SEQ", insertable = false, updatable = false)
	public AfaGrupoUsoMedicamento getGrupoUsoMedicamento() {
		return this.grupoUsoMedicamento;
	}

	public void setGrupoUsoMedicamento(AfaGrupoUsoMedicamento grupoUsoMedicamento) {
		this.grupoUsoMedicamento = grupoUsoMedicamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable=false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable=false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "JUSTIFICATIVA", nullable = false, length = 500)
	@Length(max = 500)
	public String getJustificativa() {
		return this.justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoSolicitacaoMedicamento getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacaoSolicitacaoMedicamento situacao) {
		this.situacao = situacao;
	}

	@Column(name = "IND_CAND_APROV_LOTE", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getCandAprovLote() {
		return this.candAprovLote;
	}

	public void setCandAprovLote(Boolean candAprovLote) {
		this.candAprovLote = candAprovLote;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_ORIENTACAO_AVALIADOR", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getOrientacaoAvaliador() {
		return this.orientacaoAvaliador;
	}

	public void setOrientacaoAvaliador(Boolean orientacaoAvaliador) {
		this.orientacaoAvaliador = orientacaoAvaliador;
	}

	@Column(name = "CSP_SEQ", precision = 2, scale = 0)
	public Byte getCspSeq() {
		return this.cspSeq;
	}

	public void setCspSeq(Byte cspSeq) {
		this.cspSeq = cspSeq;
	}

	@Column(name = "CSP_CNV_CODIGO", precision = 3, scale = 0)
	public Short getCspCnvCodigo() {
		return this.cspCnvCodigo;
	}

	public void setCspCnvCodigo(Short cspCnvCodigo) {
		this.cspCnvCodigo = cspCnvCodigo;
	}

	@Column(name = "IND_GESTANTE", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getGestante() {
		return this.gestante;
	}

	public void setGestante(Boolean gestante) {
		this.gestante = gestante;
	}

	@Column(name = "TIPO_INFECCAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoInfeccao getTipoInfeccao() {
		return this.tipoInfeccao;
	}

	public void setTipoInfeccao(DominioTipoInfeccao tipoInfeccao) {
		this.tipoInfeccao = tipoInfeccao;
	}

	@Column(name = "NOME_GERME", length = 60)
	@Length(max = 60)
	public String getNomeGerme() {
		return this.nomeGerme;
	}

	public void setNomeGerme(String nomeGerme) {
		this.nomeGerme = nomeGerme;
	}

	@Column(name = "SIT_ANTIBIOGRAMA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSitAntibiograma getSitAntibiograma() {
		return this.sitAntibiograma;
	}

	public void setSitAntibiograma(DominioSitAntibiograma sitAntibiograma) {
		this.sitAntibiograma = sitAntibiograma;
	}

	@Column(name = "SENSIBILIDADE_ANTIBIOTICO", length = 120)
	@Length(max = 120)
	public String getSensibilidadeAntibiotico() {
		return this.sensibilidadeAntibiotico;
	}

	public void setSensibilidadeAntibiotico(String sensibilidadeAntibiotico) {
		this.sensibilidadeAntibiotico = sensibilidadeAntibiotico;
	}

	@Column(name = "IND_FUNC_RENAL_COMPROMETIDA", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getFuncRenalComprometida() {
		return this.funcRenalComprometida;
	}

	public void setFuncRenalComprometida(Boolean funcRenalComprometida) {
		this.funcRenalComprometida = funcRenalComprometida;
	}

	@Column(name = "IND_PAC_IMUNODEPRIMIDO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPacImunodeprimido() {
		return this.pacImunodeprimido;
	}

	public void setPacImunodeprimido(Boolean pacImunodeprimido) {
		this.pacImunodeprimido = pacImunodeprimido;
	}

	@Column(name = "OBSERVACAO", length = 500)
	@Length(max = 500)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_VALIDA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_VALIDA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorValida() {
		return this.servidorValida;
	}

	public void setServidorValida(RapServidores servidorValida) {
		this.servidorValida = servidorValida;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_CONHECIMENTO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_CONHECIMENTO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorConhecimento() {
		return this.servidorConhecimento;
	}

	public void setServidorConhecimento(RapServidores servidorConhecimento) {
		this.servidorConhecimento = servidorConhecimento;
	}
	
	@Column(name = "INDICACAO", length = 500)
	@Length(max = 500)
	public String getIndicacao() {
		return this.indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	@Column(name = "INFECCAO_TRATAR", length = 120)
	@Length(max = 120)
	public String getInfeccaoTratar() {
		return this.infeccaoTratar;
	}

	public void setInfeccaoTratar(String infeccaoTratar) {
		this.infeccaoTratar = infeccaoTratar;
	}

	@Column(name = "TRAT_ANTIMICROB_ANT", length = 500)
	@Length(max = 500)
	public String getTratAntimicrobAnt() {
		return this.tratAntimicrobAnt;
	}

	public void setTratAntimicrobAnt(String tratAntimicrobAnt) {
		this.tratAntimicrobAnt = tratAntimicrobAnt;
	}

	@Column(name = "INTERNACAO_PREVIA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioInternacaoPrevia getInternacaoPrevia() {
		return this.internacaoPrevia;
	}

	public void setInternacaoPrevia(DominioInternacaoPrevia internacaoPrevia) {
		this.internacaoPrevia = internacaoPrevia;
	}

	@Column(name = "INICIO_INFECCAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioInicioInfeccao getInicioInfeccao() {
		return this.inicioInfeccao;
	}

	public void setInicioInfeccao(DominioInicioInfeccao inicioInfeccao) {
		this.inicioInfeccao = inicioInfeccao;
	}

	@Column(name = "INFEC_REL_PROCED_INVASIVO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioInfecProcInvasivo getInfecRelProcedInvasivo() {
		return this.infecRelProcedInvasivo;
	}

	public void setInfecRelProcedInvasivo(DominioInfecProcInvasivo infecRelProcedInvasivo) {
		this.infecRelProcedInvasivo = infecRelProcedInvasivo;
	}

	@Column(name = "IND_SONDA_VESICAL_DEMORA", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getSondaVesicalDemora() {
		return this.sondaVesicalDemora;
	}

	public void setSondaVesicalDemora(Boolean sondaVesicalDemora) {
		this.sondaVesicalDemora = sondaVesicalDemora;
	}

	@Column(name = "PESO_ESTIMADO", precision = 6, scale = 3)
	public BigDecimal getPesoEstimado() {
		return this.pesoEstimado;
	}

	public void setPesoEstimado(BigDecimal pesoEstimado) {
		this.pesoEstimado = pesoEstimado;
	}

	@Column(name = "CONDUTA_BASE_PROT_ASSIST", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getCondutaBaseProtAssist() {
		return this.condutaBaseProtAssist;
	}

	public void setCondutaBaseProtAssist(Boolean condutaBaseProtAssist) {
		this.condutaBaseProtAssist = condutaBaseProtAssist;
	}

	@Column(name = "INSUF_HEPATICA", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getInsufHepatica() {
		return this.insufHepatica;
	}

	public void setInsufHepatica(Boolean insufHepatica) {
		this.insufHepatica = insufHepatica;
	}

	@Column(name = "VANTAGEM_NS_PADRONIZACAO", length = 500)
	@Length(max = 500)
	public String getVantagemNsPadronizacao() {
		return this.vantagemNsPadronizacao;
	}

	public void setVantagemNsPadronizacao(String vantagemNsPadronizacao) {
		this.vantagemNsPadronizacao = vantagemNsPadronizacao;
	}

	@Column(name = "USO_CRONICO_PREV_INT", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getUsoCronicoPrevInt() {
		return this.usoCronicoPrevInt;
	}

	public void setUsoCronicoPrevInt(Boolean usoCronicoPrevInt) {
		this.usoCronicoPrevInt = usoCronicoPrevInt;
	}

	@Column(name = "CUSTO_DIARIO_EST_REAL", precision = 10)
	public BigDecimal getCustoDiarioEstReal() {
		return this.custoDiarioEstReal;
	}

	public void setCustoDiarioEstReal(BigDecimal custoDiarioEstReal) {
		this.custoDiarioEstReal = custoDiarioEstReal;
	}

	@Column(name = "REF_BIBLIOGRAFICAS", length = 500)
	@Length(max = 500)
	public String getRefBibliograficas() {
		return this.refBibliograficas;
	}

	public void setRefBibliograficas(String refBibliograficas) {
		this.refBibliograficas = refBibliograficas;
	}

	@Column(name = "DIAGNOSTICO", length = 120)
	@Length(max = 120)
	public String getDiagnostico() {
		return this.diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	@Column(name = "ECOG", length = 1)
	@org.hibernate.annotations.Type( type = "br.gov.mec.aghu.core.model.jpa.DominioStringUserType" , parameters = @Parameter(name="enumClassName", value="br.gov.mec.aghu.dominio.DominioEcog"))
	public DominioEcog getEcog() {
		return this.ecog;
	}

	public void setEcog(DominioEcog ecog) {
		this.ecog = ecog;
	}

	@Column(name = "INTENCAO_TRAT", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioIntencaoTratamento getIntencaoTrat() {
		return this.intencaoTrat;
	}

	public void setIntencaoTrat(DominioIntencaoTratamento intencaoTrat) {
		this.intencaoTrat = intencaoTrat;
	}

	@Column(name = "LINHA_TRAT", length = 1)
	@org.hibernate.annotations.Type( type = "br.gov.mec.aghu.core.model.jpa.DominioStringUserType" , parameters = @Parameter(name="enumClassName", value="br.gov.mec.aghu.dominio.DominioLinhaTratamento"))
	public DominioLinhaTratamento getLinhaTrat() {
		return this.linhaTrat;
	}

	public void setLinhaTrat(DominioLinhaTratamento linhaTrat) {
		this.linhaTrat = linhaTrat;
	}

	@Column(name = "TRAT_ANT_CIRURGIA", length = 120)
	@Length(max = 120)
	public String getTratAntCirurgia() {
		return this.tratAntCirurgia;
	}

	public void setTratAntCirurgia(String tratAntCirurgia) {
		this.tratAntCirurgia = tratAntCirurgia;
	}

	@Column(name = "TRAT_ANT_RADIO", length = 120)
	@Length(max = 120)
	public String getTratAntRadio() {
		return this.tratAntRadio;
	}

	public void setTratAntRadio(String tratAntRadio) {
		this.tratAntRadio = tratAntRadio;
	}

	@Column(name = "TRAT_ANT_QUIMIO", length = 500)
	@Length(max = 500)
	public String getTratAntQuimio() {
		return this.tratAntQuimio;
	}

	public void setTratAntQuimio(String tratAntQuimio) {
		this.tratAntQuimio = tratAntQuimio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MES_ANO_ULT_CICLO", length = 7)
	public Date getMesAnoUltCiclo() {
		return this.mesAnoUltCiclo;
	}

	public void setMesAnoUltCiclo(Date mesAnoUltCiclo) {
		this.mesAnoUltCiclo = mesAnoUltCiclo;
	}

	@Column(name = "TRAT_ANT_HORMONIO", length = 120)
	@Length(max = 120)
	public String getTratAntHormonio() {
		return this.tratAntHormonio;
	}

	public void setTratAntHormonio(String tratAntHormonio) {
		this.tratAntHormonio = tratAntHormonio;
	}

	@Column(name = "TRAT_ANT_OUTROS", length = 120)
	@Length(max = 120)
	public String getTratAntOutros() {
		return this.tratAntOutros;
	}

	public void setTratAntOutros(String tratAntOutros) {
		this.tratAntOutros = tratAntOutros;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "mpmJustificativaUsoMdtos")
	public MpmTrocaEsquemaTb getTrocaEsquemaTb() {
		return this.trocaEsquemaTb;
	}

	public void setTrocaEsquemaTb(MpmTrocaEsquemaTb trocaEsquemaTb) {
		this.trocaEsquemaTb = trocaEsquemaTb;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "justificativaUsoMedicamento")
	public Set<MpmItemPrescricaoMdto> getItemPrescricaoMdtos() {
		return this.itemPrescricaoMdtos;
	}

	public void setItemPrescricaoMdtos(
			Set<MpmItemPrescricaoMdto> itemPrescricaoMdtos) {
		this.itemPrescricaoMdtos = itemPrescricaoMdtos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MpmJustificativaUsoMdto other = (MpmJustificativaUsoMdto) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}
	
	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validarConstraints() {

		/* MPM_JUM_CK20 */
		boolean condicao1 = this.tratAntQuimio != null && this.mesAnoUltCiclo != null;
		boolean condicao2 = this.tratAntQuimio == null && this.mesAnoUltCiclo == null;
		if (!(condicao1 || condicao2)) {
			throw new BaseRuntimeException(JustificativaUsoMdtosExceptionCode.MPM_JUM_CK20);
		}
		
		/* MPM_JUM_CK8 */
		boolean condicao3 = this.candAprovLote == false;
		boolean condicao4 = this.candAprovLote == true && (this.situacao!=null && this.situacao.equals(DominioSituacaoSolicitacaoMedicamento.T));
		if (!(condicao3 || condicao4)) {
			throw new BaseRuntimeException(JustificativaUsoMdtosExceptionCode.MPM_JUM_CK8);
		}
	}
	
	private enum JustificativaUsoMdtosExceptionCode implements BusinessExceptionCode {
		MPM_JUM_CK20, MPM_JUM_CK8
	}

	public enum Fields {

		SEQ("seq"),
		ATENDIMENTO("atendimento"),
		ATD_SEQ("atendimento.seq"),
		GUP_SEQ("gupSeq"),
		SERVIDOR("servidor"),
		JUSTIFICATIVA("justificativa"),
		SITUACAO("situacao"),
		CAND_APROV_LOTE("candAprovLote"),
		CRIADO_EM("criadoEm"),
		ORIENTACAO_AVALIADOR("orientacaoAvaliador"),
		CSP_SEQ("cspSeq"),
		CSP_CNV_CODIGO("cspCnvCodigo"),
		GESTANTE("gestante"),
		TIPO_INFECCAO("tipoInfeccao"),
		NOME_GERME("nomeGerme"),
		SIT_ANTIBIOGRAMA("sitAntibiograma"),
		SENSIBILIDADE_ANTIBIOTICO("sensibilidadeAntibiotico"),
		FUNC_RENAL_COMPROMETIDA("funcRenalComprometida"),
		PAC_IMUNODEPRIMIDO("pacImunodeprimido"),
		OBSERVACAO("observacao"),
		SERVIDOR_VALIDA("servidorValida"),
		SERVIDOR_VALIDA_ID_MATRICULA("servidorValida.id.matricula"),
		SERVIDOR_VALIDA_ID_VINCODIGO("servidorValida.id.vinCodigo"),
		ALTERADO_EM("alteradoEm"),
		SERVIDOR_CONHECIMENTO("servidorConhecimento"),
		SER_MATRICULA_CONHECIMENTO("servidorConhecimento.id.matricula"),
		SER_VIN_CODIGO_CONHECIMENTO("servidorConhecimento.id.vinCodigo"),
		INDICACAO("indicacao"),
		INFECCAO_TRATAR("infeccaoTratar"),
		TRAT_ANTIMICROB_ANT("tratAntimicrobAnt"),
		INTERNACAO_PREVIA("internacaoPrevia"),
		INICIO_INFECCAO("inicioInfeccao"),
		INFEC_REL_PROCED_INVASIVO("infecRelProcedInvasivo"),
		SONDA_VESICAL_DEMORA("sondaVesicalDemora"),
		PESO_ESTIMADO("pesoEstimado"),
		CONDUTA_BASE_PROT_ASSIST("condutaBaseProtAssist"),
		INSUF_HEPATICA("insufHepatica"),
		VANTAGEM_NS_PADRONIZACAO("vantagemNsPadronizacao"),
		USO_CRONICO_PREV_INT("usoCronicoPrevInt"),
		CUSTO_DIARIO_EST_REAL("custoDiarioEstReal"),
		REF_BIBLIOGRAFICAS("refBibliograficas"),
		DIAGNOSTICO("diagnostico"),
		ECOG("ecog"),
		INTENCAO_TRAT("intencaoTrat"),
		LINHA_TRAT("linhaTrat"),
		TRAT_ANT_CIRURGIA("tratAntCirurgia"),
		TRAT_ANT_RADIO("tratAntRadio"),
		TRAT_ANT_QUIMIO("tratAntQuimio"),
		MES_ANO_ULT_CICLO("mesAnoUltCiclo"),
		TRAT_ANT_HORMONIO("tratAntHormonio"),
		TRAT_ANT_OUTROS("tratAntOutros"),
		TROCA_ESQUEMA_TB("trocaEsquemaTb"),
		ITEM_PRESCRICAO_MDTOS("itemPrescricaoMdtos"),
		GRUPO_USO_MEDICAMENTO("grupoUsoMedicamento");

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