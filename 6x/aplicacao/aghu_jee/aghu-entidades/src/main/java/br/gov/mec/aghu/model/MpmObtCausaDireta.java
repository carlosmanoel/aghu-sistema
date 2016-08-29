package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmObtCausaDiretas generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@Table(name = "MPM_OBT_CAUSA_DIRETAS", schema = "AGH")

public class MpmObtCausaDireta extends BaseEntityId<MpmObtCausaDiretaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2298390083684619511L;
	private MpmObtCausaDiretaId id;
	private MpmCidAtendimento mpmCidAtendimentos;
	private MpmAltaSumario mpmAltaSumarios;
	private String descCid;
	private String complCid;

	private DominioSituacao indSituacao;
	private DominioSimNao indCarga;

	private AghCid cid;
	private MamDiagnostico diagnostico;

	public MpmObtCausaDireta() {
	}

	public MpmObtCausaDireta(final MpmAltaSumario mpmAltaSumarios, final String descCid, final DominioSituacao indSituacao,
			final DominioSimNao indCarga, final AghCid c) {
		this.mpmAltaSumarios = mpmAltaSumarios;
		this.descCid = descCid;
		this.indSituacao = indSituacao;
		this.indCarga = indCarga;
		this.cid = c;
	}

	public MpmObtCausaDireta(final MpmCidAtendimento mpmCidAtendimentos, final MpmAltaSumario mpmAltaSumarios, final String descCid,
			final DominioSituacao indSituacao, final DominioSimNao indCarga, final String complCid, final AghCid c, final MamDiagnostico diag) {
		this.mpmCidAtendimentos = mpmCidAtendimentos;
		this.mpmAltaSumarios = mpmAltaSumarios;
		this.descCid = descCid;
		this.indSituacao = indSituacao;
		this.indCarga = indCarga;
		this.complCid = complCid;
		this.cid = c;
		this.diagnostico = diag;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "asuApaAtdSeq", column = @Column(name = "ASU_APA_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "asuApaSeq", column = @Column(name = "ASU_APA_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "asuSeqp", column = @Column(name = "ASU_SEQP", nullable = false, precision = 3, scale = 0)) })
	public MpmObtCausaDiretaId getId() {
		return this.id;
	}

	public void setId(final MpmObtCausaDiretaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CIA_SEQ")
	public MpmCidAtendimento getMpmCidAtendimentos() {
		return this.mpmCidAtendimentos;
	}

	public void setMpmCidAtendimentos(final MpmCidAtendimento mpmCidAtendimentos) {
		this.mpmCidAtendimentos = mpmCidAtendimentos;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "ASU_APA_ATD_SEQ", referencedColumnName = "APA_ATD_SEQ", insertable = false, updatable = false),
			@JoinColumn(name = "ASU_APA_SEQ", referencedColumnName = "APA_SEQ", insertable = false, updatable = false),
			@JoinColumn(name = "ASU_SEQP", referencedColumnName = "SEQP", insertable = false, updatable = false) })
	public MpmAltaSumario getMpmAltaSumarios() {
		return this.mpmAltaSumarios;
	}

	public void setMpmAltaSumarios(final MpmAltaSumario mpmAltaSumarios) {
		this.mpmAltaSumarios = mpmAltaSumarios;
	}

	@Column(name = "DESC_CID", nullable = false, length = 300)
	@Length(max = 300)
	public String getDescCid() {
		return this.descCid;
	}

	public void setDescCid(final String descCid) {
		this.descCid = descCid;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(final DominioSituacao s) {
		this.indSituacao = s;
	}

	@Column(name = "IND_CARGA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndCarga() {
		return this.indCarga;
	}

	public void setIndCarga(final DominioSimNao c) {
		this.indCarga = c;
	}

	@Column(name = "COMPL_CID", length = 45)
	@Length(max = 45)
	public String getComplCid() {
		return this.complCid;
	}

	public void setComplCid(final String complCid) {
		this.complCid = complCid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CID_SEQ")
	public AghCid getCid() {
		return this.cid;
	}

	public void setCid(final AghCid c) {
		this.cid = c;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DIA_SEQ")
	public MamDiagnostico getDiagnostico() {
		return this.diagnostico;
	}

	public void setDiagnostico(final MamDiagnostico d) {
		this.diagnostico = d;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		MpmObtCausaDireta other = (MpmObtCausaDireta) obj;
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		return result;
	}
	
	public enum Fields {
		ID("id"), //
		IND_SITUACAO("indSituacao"), //
		ASU_SEQP("id.asuSeqp"), //
		ASU_APA_SEQ("id.asuApaSeq"), //
		ASU_APA_ATD_SEQ("id.asuApaAtdSeq"), //
		CID("cid"), //
		CID_ATENDIMENTOS("mpmCidAtendimentos"), //
		COMPLEMENTO_CID("complCid");
		
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