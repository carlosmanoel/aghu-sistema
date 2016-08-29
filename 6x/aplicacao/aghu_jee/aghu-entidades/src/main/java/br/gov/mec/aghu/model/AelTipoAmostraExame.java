package br.gov.mec.aghu.model;

// Generated 14/03/2011 11:29:37 by Hibernate Tools 3.4.0.CR1

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

import br.gov.mec.aghu.dominio.DominioOrigemAtendimento;
import br.gov.mec.aghu.dominio.DominioResponsavelColetaExames;
import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioUnidadeMedidaAmostra;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelTiposAmostraExames generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})

@Entity
@Table(name = "AEL_TIPOS_AMOSTRA_EXAMES", schema = "AGH")
public class AelTipoAmostraExame extends BaseEntityId<AelTipoAmostraExameId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6764833137238119515L;
	private AelTipoAmostraExameId id;
	private AelExamesMaterialAnalise examesMaterialAnalise;
	private AelMateriaisAnalises materialAnalise;
	private DominioOrigemAtendimento origemAtendimento;
	private AelRecipienteColeta recipienteColeta;
	private DominioUnidadeMedidaAmostra unidadeMedidaAmostra;
	private DominioResponsavelColetaExames responsavelColeta;
	private DominioSimNao indCongela;
	private RapServidores servidor;
	private AelAnticoagulante anticoagulante;
	private AghUnidadesFuncionais unidadeFuncional;
	private Short nroAmostras;
	private RapServidores servidorAlterado;
	private Integer volumeAmostra;
	
	
	public enum Fields {

		ID("id"),
		EMA_EXA_SIGLA("id.emaExaSigla"),
		EMA_MAN_SEQ("id.emaManSeq"),
		MAN_SEQ("materialAnalise.seq"),
		EXAMES_MATERIAL_ANALISE("examesMaterialAnalise"),
		MATERIAL_ANALISE("materialAnalise"),
		ORIGEM_ATENDIMENTO("origemAtendimento"),
		RECIPIENTE_COLETA("recipienteColeta"),
		RCO_SEQ("recipienteColeta.seq"),
		UNIDADE_MEDIDA_AMOSTRA("unidadeMedidaAmostra"),
		RESPONSAVEL_COLETA("responsavelColeta"),
		IND_CONGELA("indCongela"),
		SERVIDOR("servidor"),
		ANTI_COAGULANTE("anticoagulante"),
		ATC_SEQ("anticoagulante.seq"),
		UNIDADE_FUNCIONAL("unidadeFuncional"),
		UNF_SEQ("unidadeFuncional.seq"),
		NRO_AMOSTRAS("nroAmostras"),
		SERVIDOR_ALTERADO("servidorAlterado"),
		VOLUME_AMOSTRA("volumeAmostra");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}

	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "emaExaSigla", column = @Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)),
			@AttributeOverride(name = "emaManSeq", column = @Column(name = "EMA_MAN_SEQ", nullable = false)),
			@AttributeOverride(name = "manSeq", column = @Column(name = "MAN_SEQ", nullable = false)),
			@AttributeOverride(name = "origemAtendimento", column = @Column(name = "ORIGEM_ATENDIMENTO", nullable = false, length = 1)) })
	public AelTipoAmostraExameId getId() {
		return this.id;
	}

	public void setId(AelTipoAmostraExameId id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RCO_SEQ", nullable = false)
	public AelRecipienteColeta getRecipienteColeta() {
		return recipienteColeta;
	}
	
	public void setRecipienteColeta(AelRecipienteColeta recipienteColeta) {
		this.recipienteColeta = recipienteColeta;
	}
	
	@Column(name = "UNID_MEDIDA_AMOSTRA", nullable = false, length = 3)
	@Enumerated(EnumType.STRING)
	public DominioUnidadeMedidaAmostra getUnidadeMedidaAmostra() {
		return unidadeMedidaAmostra;
	}
	
	public void setUnidadeMedidaAmostra(
			DominioUnidadeMedidaAmostra unidadeMedidaAmostra) {
		this.unidadeMedidaAmostra = unidadeMedidaAmostra;
	}
	
	@Column(name = "RESPONSAVEL_COLETA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioResponsavelColetaExames getResponsavelColeta() {
		return responsavelColeta;
	}
	
	public void setResponsavelColeta(
			DominioResponsavelColetaExames responsavelColeta) {
		this.responsavelColeta = responsavelColeta;
	}

	@Column(name = "IND_CONGELA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndCongela() {
		return indCongela;
	}
	
	public void setIndCongela(DominioSimNao indCongela) {
		this.indCongela = indCongela;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATC_SEQ", nullable = true)
	public AelAnticoagulante getAnticoagulante() {
		return anticoagulante;
	}
	
	public void setAnticoagulante(AelAnticoagulante anticoagulante) {
		this.anticoagulante = anticoagulante;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ", nullable = true)
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return unidadeFuncional;
	}

	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}

	@Column(name = "NRO_AMOSTRAS")
	public Short getNroAmostras() {
		return this.nroAmostras;
	}

	public void setNroAmostras(Short nroAmostras) {
		this.nroAmostras = nroAmostras;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAlterado() {
		return servidorAlterado;
	}

	public void setServidorAlterado(RapServidores servidorAlterado) {
		this.servidorAlterado = servidorAlterado;
	}

	@Column(name = "VOLUME_AMOSTRA")
	public Integer getVolumeAmostra() {
		return this.volumeAmostra;
	}

	public void setVolumeAmostra(Integer volumeAmostra) {
		this.volumeAmostra = volumeAmostra;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "EMA_EXA_SIGLA", referencedColumnName = "EXA_SIGLA", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "EMA_MAN_SEQ", referencedColumnName = "MAN_SEQ", insertable = false, updatable = false, nullable = false) })
	public AelExamesMaterialAnalise getExamesMaterialAnalise() {
		return examesMaterialAnalise;
	}

	public void setExamesMaterialAnalise(AelExamesMaterialAnalise examesMaterialAnalise) {
		this.examesMaterialAnalise = examesMaterialAnalise;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAN_SEQ", insertable = false, updatable = false, nullable = false)
	public AelMateriaisAnalises getMaterialAnalise() {
		return materialAnalise;
	}
	
	public void setMaterialAnalise(AelMateriaisAnalises materialAnalise) {
		this.materialAnalise = materialAnalise;
	}
	
	@Column(name = "ORIGEM_ATENDIMENTO", nullable = false, insertable = false, updatable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioOrigemAtendimento getOrigemAtendimento() {
		return origemAtendimento;
	}
	public void setOrigemAtendimento(DominioOrigemAtendimento origemAtendimento) {
		this.origemAtendimento = origemAtendimento;
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
		if (!(obj instanceof AelTipoAmostraExame)) {
			return false;
		}
		AelTipoAmostraExame other = (AelTipoAmostraExame) obj;
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