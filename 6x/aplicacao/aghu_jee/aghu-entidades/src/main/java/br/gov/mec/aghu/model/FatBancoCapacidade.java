package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatBancoCapacidades generated by hbm2java
 */
@Entity
@Table(name = "FAT_BANCO_CAPACIDADES", schema = "AGH")
public class FatBancoCapacidade extends BaseEntityId<FatBancoCapacidadeId> implements java.io.Serializable {
	private static final long serialVersionUID = -5422546671699628046L;
	
	private FatBancoCapacidadeId id;
	private Integer nroLeitos;
	private Integer capacidade;
	private Integer utilizado;
	private Date criadoEm;
	private RapServidores servidor;
	private Date alteradoEm;
	private RapServidores servidorAltera;
	private AghClinicas clinica;
	
	private Integer version;

	public FatBancoCapacidade() {
	}

	public FatBancoCapacidade(FatBancoCapacidadeId id, Integer nroLeitos,
			Date criadoEm, RapServidores servidor) {
		this.id = id;
		this.nroLeitos = nroLeitos;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	public FatBancoCapacidade(FatBancoCapacidadeId id, Integer nroLeitos,
			Integer capacidade, Integer utilizado, Date criadoEm,
			RapServidores servidor, Date alteradoEm,
			RapServidores servidorAltera) {
		this.id = id;
		this.nroLeitos = nroLeitos;
		this.capacidade = capacidade;
		this.utilizado = utilizado;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
		this.alteradoEm = alteradoEm;
		this.servidorAltera = servidorAltera;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "ano", column = @Column(name = "ANO", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "mes", column = @Column(name = "MES", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "clinica", column = @Column(name = "CLINICA", nullable = false, precision = 2, scale = 0)) })
	public FatBancoCapacidadeId getId() {
		return this.id;
	}

	public void setId(FatBancoCapacidadeId id) {
		this.id = id;
	}

	@Column(name = "NRO_LEITOS", nullable = false, precision = 4, scale = 0)
	public Integer getNroLeitos() {
		return this.nroLeitos;
	}

	public void setNroLeitos(Integer nroLeitos) {
		this.nroLeitos = nroLeitos;
	}

	@Column(name = "CAPACIDADE", precision = 6, scale = 0)
	public Integer getCapacidade() {
		return this.capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	@Column(name = "UTILIZADO", precision = 6, scale = 0)
	public Integer getUtilizado() {
		return this.utilizado;
	}

	public void setUtilizado(Integer utilizado) {
		this.utilizado = utilizado;
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
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(
			RapServidores servidor) {
		this.servidor = servidor;
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
			@JoinColumn(name = "SER_MATRICULA_ALTERA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAltera() {
		return this.servidorAltera;
	}

	public void setServidorAltera(
			RapServidores servidorAltera) {
		this.servidorAltera = servidorAltera;
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
	@JoinColumn(name = "CLINICA", nullable = false, insertable = false, updatable = false)
	public AghClinicas getClinica() {
		return this.clinica;
	}
	public void setClinica(AghClinicas clinica) {
		this.clinica = clinica;
	}

	@Override
	public int hashCode() {
	  	HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
        umHashCodeBuilder.append(this.getId().getMes());
        umHashCodeBuilder.append(this.getId().getAno());
        umHashCodeBuilder.append(this.getId().getClinica());
        umHashCodeBuilder.append(this.getNroLeitos());
        umHashCodeBuilder.append(this.getCapacidade());
        umHashCodeBuilder.append(this.getUtilizado());
        umHashCodeBuilder.append(this.getCriadoEm());
        umHashCodeBuilder.append(this.getAlteradoEm());
        umHashCodeBuilder.append(this.getServidor());
        umHashCodeBuilder.append(this.getServidorAltera());
        return umHashCodeBuilder.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
	 	if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof FatBancoCapacidade)) {
            return false;
        }
        FatBancoCapacidade other = (FatBancoCapacidade) obj;
        EqualsBuilder umEqualsBuilder = new EqualsBuilder();
        umEqualsBuilder.append(this.getId(), other.getId());
        umEqualsBuilder.append(this.getNroLeitos(), other.getNroLeitos());
        umEqualsBuilder.append(this.getCapacidade(), other.getCapacidade());
        umEqualsBuilder.append(this.getUtilizado(), other.getUtilizado());
        umEqualsBuilder.append(this.getCriadoEm(), other.getCriadoEm());
        umEqualsBuilder.append(this.getAlteradoEm(), other.getAlteradoEm());
        umEqualsBuilder.append(this.getServidor(), other.getServidor());
        umEqualsBuilder.append(this.getServidorAltera(), other.getServidorAltera());
        return umEqualsBuilder.isEquals();
	}
	
	

	public enum Fields {

		ID("id"),
		MES("id.mes"),
		ANO("id.ano"),
		CLINICA_ID("id.clinica"),
		NRO_LEITOS("nroLeitos"),
		CAPACIDADE("capacidade"),
		UTILIZADO("utilizado"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		ALTERADO_EM("alteradoEm"),
		SER_MATRICULA_ALTERA("serMatriculaAltera"),
		SER_VIN_CODIGO_ALTERA("serVinCodigoAltera"),
		CLINICA("clinica"),
		CLINICA_DESCRICAO("clinica.descricao"),
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

}
