package br.gov.mec.aghu.model;

// Generated 18/04/2011 13:15:07 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioCor;
import br.gov.mec.aghu.dominio.DominioGrupoSanguineoAtendimentoDiverso;
import br.gov.mec.aghu.core.model.BaseJournal;

@Entity
@SequenceGenerator(name="aelDdvJnSeq", sequenceName="AGH.AEL_DDV_JN_SEQ", allocationSize = 1)
@Table(name = "AEL_DADOS_CADAVERES_JN", schema = "AGH")
@Immutable
public class AelDadosCadaveresJn extends BaseJournal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6105638202358751856L;

	private Integer seq;
	private String nome;
	private Date dthrRemocao;
	private Date dtNascimento;
	private DominioCor raca;
	private DominioGrupoSanguineoAtendimentoDiverso grupoSanguineo;
	private String causaObito;
	private String realizadoPor;
	private String lidoPor;
	private Date criadoEm;
	private String observacoes;
	
	private AghInstituicoesHospitalares instituicaoHospitalarProcedencia;
	private AghInstituicoesHospitalares instituicaoHospitalarRetirada;
	private RapServidores servidor;
	private FatConvenioSaudePlano convenioSaudePlano;
	private FatConvenioSaude convenioSaude;

	public AelDadosCadaveresJn() {
	}

	public AelDadosCadaveresJn(Integer seq, String nome, Date dthrRemocao,
			Date dtNascimento, DominioCor raca,
			DominioGrupoSanguineoAtendimentoDiverso grupoSanguineo, String causaObito,
			String realizadoPor, String lidoPor, Date criadoEm,
			String observacoes,
			AghInstituicoesHospitalares instituicaoHospitalarProcedencia,
			AghInstituicoesHospitalares instituicaoHospitalarRetirada,
			RapServidores servidor, FatConvenioSaudePlano convenioSaudePlano,
			FatConvenioSaude convenioSaude) {
		super();
		this.seq = seq;
		this.nome = nome;
		this.dthrRemocao = dthrRemocao;
		this.dtNascimento = dtNascimento;
		this.raca = raca;
		this.grupoSanguineo = grupoSanguineo;
		this.causaObito = causaObito;
		this.realizadoPor = realizadoPor;
		this.lidoPor = lidoPor;
		this.criadoEm = criadoEm;
		this.observacoes = observacoes;
		this.instituicaoHospitalarProcedencia = instituicaoHospitalarProcedencia;
		this.instituicaoHospitalarRetirada = instituicaoHospitalarRetirada;
		this.servidor = servidor;
		this.convenioSaudePlano = convenioSaudePlano;
		this.convenioSaude = convenioSaude;
	}




	// ATUALIZADOR JOURNALS - ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelDdvJnSeq")
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "NOME", length = 100)
	@Length(max = 100)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_REMOCAO", length = 29)
	public Date getDthrRemocao() {
		return this.dthrRemocao;
	}

	public void setDthrRemocao(Date dthrRemocao) {
		this.dthrRemocao = dthrRemocao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_NASCIMENTO", length = 29)
	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Column(name = "RACA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioCor getRaca() {
		return this.raca;
	}

	public void setRaca(DominioCor raca) {
		this.raca = raca;
	}

	@Column(name = "GRUPO_SANGUINEO", length = 2)
	@Enumerated(EnumType.STRING)
	public DominioGrupoSanguineoAtendimentoDiverso getGrupoSanguineo() {
		return this.grupoSanguineo;
	}

	public void setGrupoSanguineo(DominioGrupoSanguineoAtendimentoDiverso grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	@Column(name = "CAUSA_OBITO", length = 240)
	@Length(max = 240)
	public String getCausaObito() {
		return this.causaObito;
	}

	public void setCausaObito(String causaObito) {
		this.causaObito = causaObito;
	}

	@Column(name = "REALIZADO_POR", length = 60)
	@Length(max = 60)
	public String getRealizadoPor() {
		return this.realizadoPor;
	}

	public void setRealizadoPor(String realizadoPor) {
		this.realizadoPor = realizadoPor;
	}

	@Column(name = "LIDO_POR", length = 60)
	@Length(max = 60)
	public String getLidoPor() {
		return this.lidoPor;
	}

	public void setLidoPor(String lidoPor) {
		this.lidoPor = lidoPor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "OBSERVACOES", length = 500)
	@Length(max = 500)
	public String getObservacoes() {
		return this.observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IHO_SEQ")
	public AghInstituicoesHospitalares getInstituicaoHospitalarProcedencia() {
		return instituicaoHospitalarProcedencia;
	}

	public void setInstituicaoHospitalarProcedencia(
			AghInstituicoesHospitalares instituicaoHospitalarProcedencia) {
		this.instituicaoHospitalarProcedencia = instituicaoHospitalarProcedencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IHO_SEQ_RETIRADO")
	public AghInstituicoesHospitalares getInstituicaoHospitalarRetirada() {
		return instituicaoHospitalarRetirada;
	}

	public void setInstituicaoHospitalarRetirada(
			AghInstituicoesHospitalares instituicaoHospitalarRetirada) {
		this.instituicaoHospitalarRetirada = instituicaoHospitalarRetirada;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CSP_CNV_CODIGO", referencedColumnName = "CNV_CODIGO", nullable = false),
			@JoinColumn(name = "CSP_SEQ", referencedColumnName = "SEQ", nullable = false) })
	public FatConvenioSaudePlano getConvenioSaudePlano() {
		return convenioSaudePlano;
	}

	public void setConvenioSaudePlano(FatConvenioSaudePlano convenioSaudePlano) {
		this.convenioSaudePlano = convenioSaudePlano;
	}
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CSP_CNV_CODIGO", insertable = false, updatable = false)
	public FatConvenioSaude getConvenioSaude() {
		return this.convenioSaude;
	}

	public void setConvenioSaude(FatConvenioSaude convenioSaude) {
		this.convenioSaude = convenioSaude;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false)})
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	
	
	
	
	public enum Fields {
		SEQ("seq"),		
		CONVENIO_SAUDE_PLANO("convenioSaudePlano"),
		CONVENIO_SAUDE("convenioSaude"),
		DT_NASCIMENTO("dtNascimento"),
		DTHR_REMOCAO("dthrRemocao"),
		CAUSA_OBITO("causaObito"),
		NOME("nome");

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
