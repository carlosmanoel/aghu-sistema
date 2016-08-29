package br.gov.mec.aghu.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioDiasMes;
import br.gov.mec.aghu.dominio.DominioFatoGerador;
import br.gov.mec.aghu.dominio.DominioMesVencimento;
import br.gov.mec.aghu.dominio.DominioTipoTributo;
import br.gov.mec.aghu.dominio.DominioVencimentoDiaNaoUtil;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * FcpTitulos generated by hbm2java
 */
@Entity
@SequenceGenerator(name="fcpClvSq1", sequenceName="AGH.FCP_CLV_SQ1", allocationSize = 1)
@Table(name = "FCP_CALENDARIO_VENCIMENTO", schema = "AGH")
public class FcpCalendarioVencimentoTributos extends BaseEntitySeq<Integer> implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1671835554449648222L;
	private Integer seq;
	private Integer version;
	private DominioTipoTributo tipoTributo;
	private Date inicioVigencia;
	private DominioFatoGerador fatoGerador;
	private DominioVencimentoDiaNaoUtil vencimentoDiaNaoUtil;
	private DominioDiasMes inicioPeriodo;
	private DominioDiasMes fimPeriodo;
	private DominioDiasMes diaVencimento;
	private DominioMesVencimento mesVencimento;
	private String observacao;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fcpClvSq1")
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

	@Column(name = "TIPO_TRIBUTO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoTributo getTipoTributo() {
		return tipoTributo;
	}

	public void setTipoTributo(DominioTipoTributo tipoTributo) {
		this.tipoTributo = tipoTributo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INICIO_VIGENCIA", nullable = false, length = 29)
	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	@Column(name = "FATO_GERADOR", length = 3)
	@Enumerated(EnumType.STRING)
	public DominioFatoGerador getFatoGerador() {
		return fatoGerador;
	}

	public void setFatoGerador(DominioFatoGerador fatoGerador) {
		this.fatoGerador = fatoGerador;
	}

	@Column(name = "VENCIMENTO_DIA_NAO_UTIL", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioVencimentoDiaNaoUtil getVencimentoDiaNaoUtil() {
		return vencimentoDiaNaoUtil;
	}

	public void setVencimentoDiaNaoUtil(
			DominioVencimentoDiaNaoUtil vencimentoDiaNaoUtil) {
		this.vencimentoDiaNaoUtil = vencimentoDiaNaoUtil;
	}

	@Column(name = "INICIO_PERIODO")
	@Enumerated(EnumType.ORDINAL)
	public DominioDiasMes getInicioPeriodo() {
		return inicioPeriodo;
	}

	public void setInicioPeriodo(DominioDiasMes inicioPeriodo) {
		this.inicioPeriodo = inicioPeriodo;
	}

	@Column(name = "FIM_PERIODO")
	@Enumerated(EnumType.ORDINAL)
	public DominioDiasMes getFimPeriodo() {
		return fimPeriodo;
	}

	public void setFimPeriodo(DominioDiasMes fimPeriodo) {
		this.fimPeriodo = fimPeriodo;
	}

	@Column(name = "DIA_VENCIMENTO")
	@Enumerated(EnumType.ORDINAL)
	public DominioDiasMes getDiaVencimento() {
		return diaVencimento;
	}

	public void setDiaVencimento(DominioDiasMes diaVencimento) {
		this.diaVencimento = diaVencimento;
	}

	@Column(name = "N_MES_VENCIMENTO")
	@Enumerated(EnumType.ORDINAL)
	public DominioMesVencimento getMesVencimento() {
		return mesVencimento;
	}

	public void setMesVencimento(DominioMesVencimento mesVencimento) {
		this.mesVencimento = mesVencimento;
	}

	@Column(name = "OBSERVACAO", length = 240)
	@Length(max = 240)
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public enum Fields {
		SEQ("seq"), 
		TIPO_TRIBUTO("tipoTributo"), 
		INICIO_VIGENCIA("inicioVigencia"), 
		FATO_GERADOR("fatoGerador"), 
		VCTO_DIA_NAO_UTIL("vencimentoDiaNaoUtil"),
		INICIO_PERIODO("inicioPeriodo"),
		FIM_PERIODO("fimPeriodo"),
		DIA_VCTO("diaVencimento"),
		MES_VCTO("mesVencimento"),
		OBSERVACAO("observacao");
		
		private String field;

		private Fields(String field) {
			this.field = field;
		}

		@Override
		public String toString() {
			return this.field;
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
		if (!(obj instanceof FcpCalendarioVencimentoTributos)) {
			return false;
		}
		FcpCalendarioVencimentoTributos other = (FcpCalendarioVencimentoTributos) obj;
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