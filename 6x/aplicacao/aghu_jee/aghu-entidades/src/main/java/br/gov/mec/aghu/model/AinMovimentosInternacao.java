package br.gov.mec.aghu.model;

// Generated 15/04/2010 14:52:47 by Hibernate Tools 3.2.5.Beta

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


import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AinMovimentosInternacao generated by hbm2java
 */
@Entity
@Table(name = "AIN_MOVIMENTOS_INTERNACAO", schema = "AGH")
@SequenceGenerator(name="ainMviSq1", sequenceName="AGH.AIN_MVI_SQ1", allocationSize = 1)

public class AinMovimentosInternacao extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1147221031663047638L;
	private Integer seq;
	private Date criadoEm;
	private AinTiposMvtoInternacao tipoMovimentoInternacao;
	private Date dthrLancamento;
	private AghEspecialidades especialidade;
	private RapServidores servidorGerado;
	private RapServidores servidor;
	private AinLeitos leito;
	private AinQuartos quarto;
	private AghUnidadesFuncionais unidadeFuncional;
	private AinInternacao internacao;
	
	private Integer intSeq;
	private Byte tmiSeq;
	private Short qrtNumero;
	private Short unfSeq;
	private String ltoLtoId;
	private Short espSeq;

	public AinMovimentosInternacao() {
	}
	
	public AinMovimentosInternacao(Integer seq) {
		this.seq = seq;
	}
	
	public AinMovimentosInternacao(Integer seq, Date criadoEm, AinTiposMvtoInternacao tipoMovimentoInternacao,
			Date dthrLancamento, AghEspecialidades especialidade,
			RapServidores servidorGerado, RapServidores servidor,
			AinLeitos leito, AinQuartos quarto,
			AghUnidadesFuncionais unidadeFuncional, AinInternacao internacao) {
		super();
		this.seq = seq;
		this.criadoEm = criadoEm;
		this.tipoMovimentoInternacao = tipoMovimentoInternacao;
		this.dthrLancamento = dthrLancamento;
		this.especialidade = especialidade;
		this.servidorGerado = servidorGerado;
		this.servidor = servidor;
		this.leito = leito;
		this.quarto = quarto;
		this.unidadeFuncional = unidadeFuncional;
		this.internacao = internacao;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ainMviSq1")
	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TMI_SEQ")
	public AinTiposMvtoInternacao getTipoMovimentoInternacao() {
		return tipoMovimentoInternacao;
	}

	public void setTipoMovimentoInternacao(
			AinTiposMvtoInternacao tipoMovimentoInternacao) {
		this.tipoMovimentoInternacao = tipoMovimentoInternacao;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_LANCAMENTO", nullable = false, length = 7)
	public Date getDthrLancamento() {
		return this.dthrLancamento;
	}

	public void setDthrLancamento(Date dthrLancamento) {
		this.dthrLancamento = dthrLancamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ")
	public AghEspecialidades getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(AghEspecialidades especialidade) {
		this.especialidade = especialidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_GERADO", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_GERADO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidorGerado() {
		return this.servidorGerado;
	}

	public void setServidorGerado(RapServidores servidorGerado) {
		this.servidorGerado = servidorGerado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LTO_LTO_ID")
	public AinLeitos getLeito() {
		return this.leito;
	}

	public void setLeito(AinLeitos leito) {
		this.leito = leito;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QRT_NUMERO")
	public AinQuartos getQuarto() {
		return this.quarto;
	}

	public void setQuarto(AinQuartos quarto) {
		this.quarto = quarto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ")
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return this.unidadeFuncional;
	}

	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INT_SEQ", nullable = false)
	public AinInternacao getInternacao() {
		return this.internacao;
	}

	public void setInternacao(AinInternacao internacao) {
		this.internacao = internacao;
	}
	
	@Column(name = "INT_SEQ", nullable = false, precision = 8, scale = 0, insertable = false, updatable = false)
	public Integer getIntSeq() {
		return intSeq;
	}

	public void setIntSeq(Integer intSeq) {
		this.intSeq = intSeq;
	}

	@Column(name = "TMI_SEQ", nullable = false, precision = 2, scale = 0, insertable = false, updatable = false)
	public Byte getTmiSeq() {
		return tmiSeq;
	}

	public void setTmiSeq(Byte tmiSeq) {
		this.tmiSeq = tmiSeq;
	}
	
	@Column(name = "QRT_NUMERO", precision = 4, scale = 0, insertable = false, updatable = false)
	public Short getQrtNumero() {
		return qrtNumero;
	}

	public void setQrtNumero(Short qrtNumero) {
		this.qrtNumero = qrtNumero;
	}
	@Column(name = "UNF_SEQ", precision = 4, scale = 0, insertable = false, updatable = false)
	public Short getUnfSeq() {
		return unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "LTO_LTO_ID", length = 14, insertable = false, updatable = false)
	public String getLtoLtoId() {
		return ltoLtoId;
	}
	
	public void setLtoLtoId(String ltoLtoId) {
		this.ltoLtoId = ltoLtoId;
	}

	@Column(name = "ESP_SEQ", precision = 4, scale = 0, insertable = false, updatable = false)
	public Short getEspSeq() {
		return espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}

	public enum Fields {
		
		INTERNACAO("internacao"), 
		INTERNACAO_SEQ("internacao.seq"), 
		LEITO("leito"),
		QUARTO("quarto"),
		TIPO_MVTO_INTERNACAO("tipoMovimentoInternacao.codigo"),
		TIPO_MVTO_INTERNACAO_OBJ("tipoMovimentoInternacao"),
		CRIADO_EM("criadoEm"),
		DATA_HORA_LANCAMENTO("dthrLancamento"),
		ESPECIALIDADE("especialidade"),
		UNIDADE_FUNCIONAL("unidadeFuncional"),
		UNIDADE_FUNCIONAL_SEQ("unidadeFuncional.seq"),
		UNF_SEQ("unfSeq"),
		SERVIDOR("servidor"),
		SERVIDOR_VINCODIGO("servidor.id.vinCodigo"),
		SERVIDOR_MATRICULA("servidor.id.matricula"),
		SERVIDOR_GERADO("servidorGerado"),
		ESP_SEQ("espSeq"),
		SEQ("seq"),
		LTO_LTO_ID("ltoLtoId"),
		QRT_NUMERO("qrtNumero"),
		INT_SEQ("intSeq"),
		TMI_SEQ("tmiSeq");
		
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
		result = prime * result + ((this.seq == null) ? 0 : this.seq.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		AinMovimentosInternacao other = (AinMovimentosInternacao) obj;
		if (this.seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!this.seq.equals(other.seq)) {
			return false;
		}
		return true;
	}

}
