package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioLocalSoma;
import br.gov.mec.aghu.dominio.DominioModoCobranca;
import br.gov.mec.aghu.dominio.DominioTipoItemEspelhoContaHospitalar;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatEspelhosItensContaHosp generated by hbm2java
 */
@Entity
@Table(name = "FAT_ESPELHO_ITEM_CONT_HOSP_TMP", schema = "AGH")
@SuppressWarnings({"PMD.CyclomaticComplexity"})
public class FatEspelhoItemContaHosp extends BaseEntityId<FatEspelhoItemContaHospId> implements java.io.Serializable {
	private static final long serialVersionUID = 3686534653858963506L;

	private FatEspelhoItemContaHospId id;
	private Short ichSeq;
	private Byte tivSeq;
	private Byte taoSeq;
	private Short quantidade;
	private Integer notaFiscal;
	private Integer pontosAnestesista;
	private Integer pontosCirurgiao;
	private Integer pontosSadt;
	private Long procedimentoHospitalarSus;
	private Boolean indConsistente;
	private DominioModoCobranca indModoCobranca;
	private BigDecimal valorAnestesista;
	private BigDecimal valorProcedimento;
	private BigDecimal valorSadt;
	private BigDecimal valorServHosp;
	private BigDecimal valorServProf;
	private Date dataPrevia;
	private DominioTipoItemEspelhoContaHospitalar indTipoItem;
	private Boolean indGeradoEncerramento;
	private DominioLocalSoma indLocalSoma;
	private Long cgc;
	private String competenciaUti;
	private Short indEquipe;
	private Long cpfCns;
	private String serieOpm;
	private String loteOpm;
	private String regAnvisaOpm;
	private Long cnpjRegAnvisa;
	private String cbo;
	private FatItensProcedHospitalar itemProcedimentoHospitalar;
	private Integer version;

	public FatEspelhoItemContaHosp() {
	}

	public FatEspelhoItemContaHosp(FatEspelhoItemContaHospId id) {
		this.id = id;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public FatEspelhoItemContaHosp(FatEspelhoItemContaHospId id, Short ichSeq,
			Byte tivSeq, Byte taoSeq, Short quantidade, Integer notaFiscal,
			Integer pontosAnestesista, Integer pontosCirurgiao,
			Integer pontosSadt, Long procedimentoHospitalarSus,
			Boolean indConsistente, DominioModoCobranca indModoCobranca,
			BigDecimal valorAnestesista, BigDecimal valorProcedimento,
			BigDecimal valorSadt, BigDecimal valorServHosp,
			BigDecimal valorServProf, Date dataPrevia,
			DominioTipoItemEspelhoContaHospitalar indTipoItem,
			Boolean indGeradoEncerramento, DominioLocalSoma indLocalSoma,
			Long cgc, String competenciaUti, Short indEquipe, Long cpfCns,
			String serieOpm, String loteOpm, String regAnvisaOpm,
			Long cnpjRegAnvisa, String cbo) {
		this.id = id;
		this.ichSeq = ichSeq;
		this.tivSeq = tivSeq;
		this.taoSeq = taoSeq;
		this.quantidade = quantidade;
		this.notaFiscal = notaFiscal;
		this.pontosAnestesista = pontosAnestesista;
		this.pontosCirurgiao = pontosCirurgiao;
		this.pontosSadt = pontosSadt;
		this.procedimentoHospitalarSus = procedimentoHospitalarSus;
		this.indConsistente = indConsistente;
		this.indModoCobranca = indModoCobranca;
		this.valorAnestesista = valorAnestesista;
		this.valorProcedimento = valorProcedimento;
		this.valorSadt = valorSadt;
		this.valorServHosp = valorServHosp;
		this.valorServProf = valorServProf;
		this.dataPrevia = dataPrevia;
		this.indTipoItem = indTipoItem;
		this.indGeradoEncerramento = indGeradoEncerramento;
		this.indLocalSoma = indLocalSoma;
		this.cgc = cgc;
		this.competenciaUti = competenciaUti;
		this.indEquipe = indEquipe;
		this.cpfCns = cpfCns;
		this.serieOpm = serieOpm;
		this.loteOpm = loteOpm;
		this.regAnvisaOpm = regAnvisaOpm;
		this.cnpjRegAnvisa = cnpjRegAnvisa;
		this.cbo = cbo;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "ichCthSeq", column = @Column(name = "ICH_CTH_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 3, scale = 0)) })
	public FatEspelhoItemContaHospId getId() {
		return this.id;
	}

	public void setId(FatEspelhoItemContaHospId id) {
		this.id = id;
	}

	@Column(name = "ICH_SEQ", precision = 4, scale = 0)
	public Short getIchSeq() {
		return this.ichSeq;
	}

	public void setIchSeq(Short ichSeq) {
		this.ichSeq = ichSeq;
	}

	@Column(name = "TIV_SEQ", precision = 2, scale = 0)
	public Byte getTivSeq() {
		return this.tivSeq;
	}

	public void setTivSeq(Byte tivSeq) {
		this.tivSeq = tivSeq;
	}

	@Column(name = "TAO_SEQ", precision = 2, scale = 0)
	public Byte getTaoSeq() {
		return this.taoSeq;
	}

	public void setTaoSeq(Byte taoSeq) {
		this.taoSeq = taoSeq;
	}

	@Column(name = "QUANTIDADE", precision = 4, scale = 0)
	public Short getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "NOTA_FISCAL", precision = 6, scale = 0)
	public Integer getNotaFiscal() {
		return this.notaFiscal;
	}

	public void setNotaFiscal(Integer notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	@Column(name = "PONTOS_ANESTESISTA", precision = 5, scale = 0)
	public Integer getPontosAnestesista() {
		return this.pontosAnestesista;
	}

	public void setPontosAnestesista(Integer pontosAnestesista) {
		this.pontosAnestesista = pontosAnestesista;
	}

	@Column(name = "PONTOS_CIRURGIAO", precision = 5, scale = 0)
	public Integer getPontosCirurgiao() {
		return this.pontosCirurgiao;
	}

	public void setPontosCirurgiao(Integer pontosCirurgiao) {
		this.pontosCirurgiao = pontosCirurgiao;
	}

	@Column(name = "PONTOS_SADT", precision = 5, scale = 0)
	public Integer getPontosSadt() {
		return this.pontosSadt;
	}

	public void setPontosSadt(Integer pontosSadt) {
		this.pontosSadt = pontosSadt;
	}

	@Column(name = "PROCEDIMENTO_HOSPITALAR_SUS", precision = 10, scale = 0)
	public Long getProcedimentoHospitalarSus() {
		return this.procedimentoHospitalarSus;
	}

	public void setProcedimentoHospitalarSus(Long procedimentoHospitalarSus) {
		this.procedimentoHospitalarSus = procedimentoHospitalarSus;
	}

	@Column(name = "IND_CONSISTENTE", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndConsistente() {
		return this.indConsistente;
	}

	public void setIndConsistente(Boolean indConsistente) {
		this.indConsistente = indConsistente;
	}

	@Column(name = "IND_MODO_COBRANCA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioModoCobranca getIndModoCobranca() {
		return this.indModoCobranca;
	}

	public void setIndModoCobranca(DominioModoCobranca indModoCobranca) {
		this.indModoCobranca = indModoCobranca;
	}

	@Column(name = "VALOR_ANESTESISTA", precision = 14)
	public BigDecimal getValorAnestesista() {
		return this.valorAnestesista;
	}

	public void setValorAnestesista(BigDecimal valorAnestesista) {
		this.valorAnestesista = valorAnestesista;
	}

	@Column(name = "VALOR_PROCEDIMENTO", precision = 14)
	public BigDecimal getValorProcedimento() {
		return this.valorProcedimento;
	}

	public void setValorProcedimento(BigDecimal valorProcedimento) {
		this.valorProcedimento = valorProcedimento;
	}

	@Column(name = "VALOR_SADT", precision = 14)
	public BigDecimal getValorSadt() {
		return this.valorSadt;
	}

	public void setValorSadt(BigDecimal valorSadt) {
		this.valorSadt = valorSadt;
	}

	@Column(name = "VALOR_SERV_HOSP", precision = 14)
	public BigDecimal getValorServHosp() {
		return this.valorServHosp;
	}

	public void setValorServHosp(BigDecimal valorServHosp) {
		this.valorServHosp = valorServHosp;
	}

	@Column(name = "VALOR_SERV_PROF", precision = 14)
	public BigDecimal getValorServProf() {
		return this.valorServProf;
	}

	public void setValorServProf(BigDecimal valorServProf) {
		this.valorServProf = valorServProf;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_PREVIA", length = 7)
	public Date getDataPrevia() {
		return this.dataPrevia;
	}

	public void setDataPrevia(Date dataPrevia) {
		this.dataPrevia = dataPrevia;
	}

	@Column(name = "IND_TIPO_ITEM", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoItemEspelhoContaHospitalar getIndTipoItem() {
		return this.indTipoItem;
	}

	public void setIndTipoItem(DominioTipoItemEspelhoContaHospitalar indTipoItem) {
		this.indTipoItem = indTipoItem;
	}

	@Column(name = "IND_GERADO_ENCERRAMENTO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndGeradoEncerramento() {
		return this.indGeradoEncerramento;
	}

	public void setIndGeradoEncerramento(Boolean indGeradoEncerramento) {
		this.indGeradoEncerramento = indGeradoEncerramento;
	}

	@Column(name = "IND_LOCAL_SOMA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioLocalSoma getIndLocalSoma() {
		return this.indLocalSoma;
	}

	public void setIndLocalSoma(DominioLocalSoma indLocalSoma) {
		this.indLocalSoma = indLocalSoma;
	}

	@Column(name = "CGC", precision = 14, scale = 0)
	public Long getCgc() {
		return this.cgc;
	}

	public void setCgc(Long cgc) {
		this.cgc = cgc;
	}

	@Column(name = "COMPETENCIA_UTI", length = 6)
	@Length(max = 6)
	public String getCompetenciaUti() {
		return this.competenciaUti;
	}

	public void setCompetenciaUti(String competenciaUti) {
		this.competenciaUti = competenciaUti;
	}

	@Column(name = "IND_EQUIPE", precision = 1, scale = 0)
	public Short getIndEquipe() {
		return this.indEquipe;
	}

	public void setIndEquipe(Short indEquipe) {
		this.indEquipe = indEquipe;
	}

	@Column(name = "CPF_CNS", precision = 15, scale = 0)
	public Long getCpfCns() {
		return this.cpfCns;
	}

	public void setCpfCns(Long cpfCns) {
		this.cpfCns = cpfCns;
	}

	@Column(name = "SERIE_OPM", length = 20)
	@Length(max = 20)
	public String getSerieOpm() {
		return this.serieOpm;
	}

	public void setSerieOpm(String serieOpm) {
		this.serieOpm = serieOpm;
	}

	@Column(name = "LOTE_OPM", length = 20)
	@Length(max = 20)
	public String getLoteOpm() {
		return this.loteOpm;
	}

	public void setLoteOpm(String loteOpm) {
		this.loteOpm = loteOpm;
	}

	@Column(name = "REG_ANVISA_OPM", length = 20)
	@Length(max = 20)
	public String getRegAnvisaOpm() {
		return this.regAnvisaOpm;
	}

	public void setRegAnvisaOpm(String regAnvisaOpm) {
		this.regAnvisaOpm = regAnvisaOpm;
	}

	@Column(name = "CNPJ_REG_ANVISA", precision = 14, scale = 0)
	public Long getCnpjRegAnvisa() {
		return this.cnpjRegAnvisa;
	}

	public void setCnpjRegAnvisa(Long cnpjRegAnvisa) {
		this.cnpjRegAnvisa = cnpjRegAnvisa;
	}

	@Column(name = "CBO", length = 6)
	@Length(max = 6)
	public String getCbo() {
		return this.cbo;
	}

	public void setCbo(String cbo) {
		this.cbo = cbo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "IPH_PHO_SEQ", nullable = false),
			@JoinColumn(name = "IPH_SEQ", nullable = false) })
	public FatItensProcedHospitalar getItemProcedimentoHospitalar() {
		return itemProcedimentoHospitalar;
	}

	public void setItemProcedimentoHospitalar(
			FatItensProcedHospitalar itemProcedimentoHospitalar) {
		this.itemProcedimentoHospitalar = itemProcedimentoHospitalar;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(final Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		FatEspelhoItemContaHosp other = (FatEspelhoItemContaHosp) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public enum Fields {

		SEQP("id.seqp"), ICH_CTH_SEQ("id.ichCthSeq"), DATA_PREVIA("dataPrevia"), ITEM_PROCEDIMENTO_HOSPITALAR(
				"itemProcedimentoHospitalar"), IND_TIPO_ITEM("indTipoItem"), IND_CONSISTENTE(
				"indConsistente"), IND_LOCAL_SOMA("indLocalSoma"), PROCEDIMENTO_HOSPITALAR_SUS(
				"procedimentoHospitalarSus"), IPH_PHO_SEQ(
				"itemProcedimentoHospitalar.id.phoSeq"), IPH_SEQ(
				"itemProcedimentoHospitalar.id.seq"), QUANTIDADE("quantidade"), ICH_SEQ(
				"ichSeq"), IND_MODO_COBRANCA("indModoCobranca"), VALOR_ANESTESISTA(
				"valorAnestesista"), VALOR_PROCEDIMENTO("valorProcedimento"), VALOR_SADT(
				"valorSadt"), VALOR_SERV_HOSP("valorServHosp"), VALOR_SERV_PROF(
				"valorServProf"), PONTOS_ANESTESISTA("pontosAnestesista"), PONTOS_CIRURGIAO(
				"pontosCirurgiao"), PONTOS_SADT("pontosSadt"), TIV_SEQ("tivSeq"), TAO_SEQ(
				"taoSeq"), CGC("cgc"), COMPETENCIA_UTI("competenciaUti"), IND_EQUIPE(
				"indEquipe"), CBO("cbo"), CPF_CNS("cpfCns"), SERIE_OPM(
				"serieOpm"), LOTE_OPM("loteOpm"), REG_ANVISA_OPM("regAnvisaOpm"), CNPJ_REG_ANVISA(
				"cnpjRegAnvisa"), NOTA_FISCAL("notaFiscal"), ;

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
	public String toString() {
		return "FatEspelhoItemContaHosp ["
				+ (id != null ? "id=" + id + ", " : "")
				+ (ichSeq != null ? "ichSeq=" + ichSeq + ", " : "")
				+ (tivSeq != null ? "tivSeq=" + tivSeq + ", " : "")
				+ (taoSeq != null ? "taoSeq=" + taoSeq + ", " : "")
				+ (quantidade != null ? "quantidade=" + quantidade + ", " : "")
				+ (notaFiscal != null ? "notaFiscal=" + notaFiscal + ", " : "")
				+ (pontosAnestesista != null ? "pontosAnestesista="
						+ pontosAnestesista + ", " : "")
				+ (pontosCirurgiao != null ? "pontosCirurgiao="
						+ pontosCirurgiao + ", " : "")
				+ (pontosSadt != null ? "pontosSadt=" + pontosSadt + ", " : "")
				+ (procedimentoHospitalarSus != null ? "procedimentoHospitalarSus="
						+ procedimentoHospitalarSus + ", "
						: "")
				+ (indConsistente != null ? "indConsistente=" + indConsistente
						+ ", " : "")
				+ (indModoCobranca != null ? "indModoCobranca="
						+ indModoCobranca + ", " : "")
				+ (valorAnestesista != null ? "valorAnestesista="
						+ valorAnestesista + ", " : "")
				+ (valorProcedimento != null ? "valorProcedimento="
						+ valorProcedimento + ", " : "")
				+ (valorSadt != null ? "valorSadt=" + valorSadt + ", " : "")
				+ (valorServHosp != null ? "valorServHosp=" + valorServHosp
						+ ", " : "")
				+ (valorServProf != null ? "valorServProf=" + valorServProf
						+ ", " : "")
				+ (dataPrevia != null ? "dataPrevia=" + dataPrevia + ", " : "")
				+ (indTipoItem != null ? "indTipoItem=" + indTipoItem + ", "
						: "")
				+ (indGeradoEncerramento != null ? "indGeradoEncerramento="
						+ indGeradoEncerramento + ", " : "")
				+ (indLocalSoma != null ? "indLocalSoma=" + indLocalSoma + ", "
						: "")
				+ (cgc != null ? "cgc=" + cgc + ", " : "")
				+ (competenciaUti != null ? "competenciaUti=" + competenciaUti
						+ ", " : "")
				+ (indEquipe != null ? "indEquipe=" + indEquipe + ", " : "")
				+ (cpfCns != null ? "cpfCns=" + cpfCns + ", " : "")
				+ (serieOpm != null ? "serieOpm=" + serieOpm + ", " : "")
				+ (loteOpm != null ? "loteOpm=" + loteOpm + ", " : "")
				+ (regAnvisaOpm != null ? "regAnvisaOpm=" + regAnvisaOpm + ", "
						: "")
				+ (cnpjRegAnvisa != null ? "cnpjRegAnvisa=" + cnpjRegAnvisa
						+ ", " : "")
				+ (cbo != null ? "cbo=" + cbo + ", " : "")
				+ (itemProcedimentoHospitalar != null ? "itemProcedimentoHospitalar="
						+ itemProcedimentoHospitalar + ", "
						: "") + (version != null ? "version=" + version : "")
				+ "]";
	}
}
