package br.org.laramara.usse.dominio;

import br.org.laramara.usse.utilitarios.DataHoraUtils;
import br.org.laramara.usse.utilitarios.LocalDateTimeConverter;
import br.org.laramara.usse.utilitarios.NumeroUtils;
import br.org.laramara.usse.utilitarios.TextoUtils;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "servidor")
public class Servidor extends Equipamento implements Serializable {

    @Column(length = 35, nullable = true)
    private Integer memoriaInstalada;

    @Column(length = 35, nullable = true)
    private Integer capacidadeMemoria;

    @Column(length = 35, nullable = true)
    private String modeloProcessador;

    @Column(length = 35, nullable = true)
    private Integer quantidadeNucleosProcessador;

    @Column(length = 35, nullable = true)
    private String serviceTag;

    @Column(length = 35, nullable = true)
    private Long expressServiceTag;

    @Column(length = 35, nullable = true)
    private Integer raid;

    @Column(length = 35, nullable = true)
    private String tipoServidor;

    @Column(length = 35, nullable = true)
    private Integer quantidadeFonte;

    @Column(length = 35, nullable = true)
    private Integer slotsRede;

    @Column(length = 35, nullable = true)
    private Integer quantidadeHD;

    @Column(length = 35, nullable = true)
    private String versaoBios;

    @Column(length = 3, nullable = true)
    private Integer quantidadeVMs;

    @Column(length = 35, nullable = true)
    private Integer espacoArmazenamento;

    @Column
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime ultimaManutencao;

    @Column(length = 30, nullable = true)
    private String sistemaOperacional;

    @Column(length = 30, nullable = true)
    private String versaoSistemaOperacional;

    @Column(length = 30, nullable = true)
    private String situacaoServidor;

    @Column(length = 30, nullable = true)
    private String statusServidor;

    @Column(length = 6, nullable = true)
    private Integer tempoGarantia;

    public Servidor() {
    }

    public Servidor(LocalDateTime dataCadastro, LocalDateTime dataCompra, String nomeServidor, String marca, String modelo, String enderecoIP, String tipoEquipamento, String usuario, String senha, String empresa) {
        super(dataCadastro, dataCompra, nomeServidor, marca, modelo, enderecoIP, tipoEquipamento, usuario, senha, empresa);
    }

    public String getServiceTag() {
        return serviceTag;
    }

    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
    }

    public Integer getMemoriaInstalada() {
        return memoriaInstalada;
    }

    public void setMemoriaInstalada(String memoriaInstalada) {
        this.memoriaInstalada = NumeroUtils.retornaInteiroOuInvalido(memoriaInstalada);
    }

    public Integer getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(String capacidadeMemoria) {
        this.capacidadeMemoria = NumeroUtils.retornaInteiroOuInvalido(capacidadeMemoria);
    }

    public String getModeloProcessador() {
        return modeloProcessador;
    }

    public void setModeloProcessador(String modeloProcessador) {
        this.modeloProcessador = modeloProcessador;
    }

    public Integer getQuantidadeNucleosProcessador() {
        return quantidadeNucleosProcessador;
    }

    public void setQuantidadeNucleosProcessador(String qtdeNucleosProcessador) {
        this.quantidadeNucleosProcessador = NumeroUtils.retornaInteiroOuInvalido(qtdeNucleosProcessador);
    }

    public Long getExpressServiceTag() {
        return expressServiceTag;
    }

    public void setExpressServiceTag(String exServiceTag) {
        this.expressServiceTag = NumeroUtils.retornaLongOuInvalido(exServiceTag);
    }

    public Integer getRaid() {
        return raid;
    }

    public void setRaid(String raid) {
        this.raid = NumeroUtils.retornaInteiroOuInvalido(raid);

    }

    public String getTipoServidor() {
        return tipoServidor;
    }

    public void setTipoServidor(String tipoServidor) {
        this.tipoServidor = TextoUtils.removerCaracteresInvalidosEAnularVazio(tipoServidor);
    }

    public Integer getQuantidadeFonte() {
        return quantidadeFonte;
    }

    public void setQuantidadeFonte(String qtdeFonte) {
        this.quantidadeFonte = NumeroUtils.retornaInteiroOuInvalido(qtdeFonte);
    }

    public Integer getSlotsRede() {
        return slotsRede;
    }

    public void setSlotsRede(String sRede) {
        this.slotsRede = NumeroUtils.retornaInteiroOuInvalido(sRede);
    }

    public Integer getQuantidadeHD() {
        return quantidadeHD;
    }

    public void setQuantidadeHD(String qtdeHD) {
        this.quantidadeHD = NumeroUtils.retornaInteiroOuInvalido(qtdeHD);
    }

    public String getVersaoBios() {
        return versaoBios;
    }

    public void setVersaoBios(String versaoBios) {
        this.versaoBios = versaoBios;
    }

    public Integer getQuantidadeVMs() {
        return quantidadeVMs;
    }

    public void setQuantidadeVMs(String qtdeVMs) {
        this.quantidadeVMs = NumeroUtils.retornaInteiroOuInvalido(qtdeVMs);
    }

    public LocalDateTime getUltimaManutencao() {
        return ultimaManutencao;
    }

    public void setUltimaManutencao(String data) {
        this.ultimaManutencao = DataHoraUtils.obterDataHoraValidaInvalidaOuNulo(data);
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public Integer getEspacoArmazenamento() {
        return espacoArmazenamento;
    }

    public void setEspacoArmazenamento(String espacoArmazenamento) {
        this.espacoArmazenamento = NumeroUtils.retornaInteiroOuInvalido(espacoArmazenamento);
    }

    public String getVersaoSistemaOperacional() {
        return versaoSistemaOperacional;
    }

    public void setVersaoSistemaOperacional(String versaoSistemaOperacional) {
        this.versaoSistemaOperacional = versaoSistemaOperacional;
    }

    public Integer getTempoGarantia() {
        return tempoGarantia;
    }

    public void setTempoGarantia(String tGarantia) {
        this.tempoGarantia = NumeroUtils.retornaInteiroOuInvalido(tGarantia);
    }

    public String getSituacaoServidor() {
        return situacaoServidor;
    }

    public void setSituacaoServidor(String situacaoServidor) {
        this.situacaoServidor = situacaoServidor;
    }

    public String getStatusServidor() {
        return statusServidor;
    }

    public void setStatusServidor(String statusServidor) {
        this.statusServidor = statusServidor;
    }

    @Override
    public String toString() {
        return "Servidor{" + "memoriaInstalada=" + memoriaInstalada + ", capacidadeMemoria=" + capacidadeMemoria + ", modeloProcessador=" + modeloProcessador + ", quantidadeNucleosProcessador=" + quantidadeNucleosProcessador + ", serviceTag=" + serviceTag + ", expressServiceTag=" + expressServiceTag + ", raid=" + raid + ", tipoServidor=" + tipoServidor + ", quantidadeFonte=" + quantidadeFonte + ", slotsRede=" + slotsRede + ", quantidadeHD=" + quantidadeHD + ", versaoBios=" + versaoBios + ", quantidadeVMs=" + quantidadeVMs + ", espacoArmazenamento=" + espacoArmazenamento + ", ultimaManutencao=" + ultimaManutencao + ", sistemaOperacional=" + sistemaOperacional + ", versaoSistemaOperacional=" + versaoSistemaOperacional + ", situacaoServidor=" + situacaoServidor + ", statusServidor=" + statusServidor + ", tempoGarantia=" + tempoGarantia + '}';
    }

    public void validarServidor() {

        if (getTipoEquipamento().equals("Servidor - Virtual")) {
            validarDadosObrigatoriosServidorVirtual();
            validarInconsistenciaServidor();
            validarViolacaoTamanho();
        } else {
            validarDadosObrigatoriosServidor();
            validarInconsistenciaServidor();
            validarViolacaoTamanho();
        }
    }

    public void validarDadosObrigatoriosServidorVirtual() {

        if (memoriaInstalada == null || memoriaInstalada.equals("")) {
            adicionarErro("Memória Instalada não foi preenchida!");
        }

        if (espacoArmazenamento == null || espacoArmazenamento.equals("")) {
            adicionarErro("Espaço de Armazenamento não foi preenchido!");
        }

        if (quantidadeNucleosProcessador == null || quantidadeNucleosProcessador == 0) {
            adicionarErro("Quantidade de Núcleos não preenchida!");
        }

        if (sistemaOperacional == null || sistemaOperacional.equals("")) {
            adicionarErro("Sistema operacional não foi preenchido!");
        }

        if (versaoSistemaOperacional == null || versaoSistemaOperacional.equals("")) {
            adicionarErro("Versão de Sistema Operacional não foi preenchido");
        }

        if (tipoServidor.equals("")) {
            adicionarErro("Nenhum tipo de Servidor selecionado!");
        }

        if (getNome().equals("")) {
            adicionarErro("Nome não foi preenchido");
        }

        if (getEnderecoIP() == null || getEnderecoIP().equals("   .   .   .   ") || getEnderecoIP().equals("")) {
            adicionarErro("Endereço de IP não foi preenchido");
        }

        if (getTipoEquipamento().equals("")) {
            adicionarErro("O tipo de equipamento não foi selecionado");
        }

        if (getUsuario().equals("")) {
            adicionarErro("Usuario não foi preenchido");
        }

        if (getSenha().equals("")) {
            adicionarErro("Senha não foi preenchido");
        }

        if (getEmpresa().equals("")) {
            adicionarErro("Empresa não foi preenchido");
        }

        if (getStatusServidor() == null || getStatusServidor().equals("")) {
            adicionarErro("Status do Servidor não foi selecionado");
        }

        if (getSituacaoServidor() == null || getSituacaoServidor().equals("")) {
            adicionarErro("Situação Servidor não foi selecionada");
        }

        if (getSlotsRede() == null) {
            adicionarErro("Slots de Rede não foi preenchido");
        }
    }

    public void validarDadosObrigatoriosServidor() {

        if (memoriaInstalada == null || memoriaInstalada.equals("")) {
            adicionarErro("Memória Instalada não foi preenchida");
        }

        if (capacidadeMemoria == null || capacidadeMemoria.equals("")) {
            adicionarErro("Capacidade de Memória não foi preenchida");
        }

        if (modeloProcessador == null || modeloProcessador.equals("")) {
            adicionarErro("Modelo de Processador não foi preenchido");
        }

        if (espacoArmazenamento == null || espacoArmazenamento.equals("")) {
            adicionarErro("Espaço de Armazenamento não foi preenchido");
        }

        if (quantidadeNucleosProcessador == null || quantidadeNucleosProcessador == 0) {
            adicionarErro("Quantidade de Núcleos não preenchida");
        }

        if (sistemaOperacional == null || sistemaOperacional.equals("")) {
            adicionarErro("Sistema operacional não foi preenchido");
        }

        if (versaoSistemaOperacional == null || versaoSistemaOperacional.equals("")) {
            adicionarErro("Versão de Sistema Operacional não foi preenchido");
        }

        if (tipoServidor.equals("")) {
            adicionarErro("Nenhum tipo de Servidor selecionado");
        }

        if (slotsRede == null || slotsRede.equals("")) {
            adicionarErro("Slots de Rede não foi preenchido");
        }

        if (quantidadeFonte == null || quantidadeFonte.equals("")) {
            adicionarErro("Quantidade de Fontes não foi preenchida");
        }

        if (quantidadeHD == null || quantidadeHD.equals("")) {
            adicionarErro("Quantidade de HDs não foi preenchido");
        }

        if (versaoBios == null || versaoBios.equals("")) {
            adicionarErro("Versão da BIOS não foi preenchida");
        }

        if (situacaoServidor == null || situacaoServidor.equals("")) {
            adicionarErro("Situação Servidor não foi selecionada");
        }

        if (statusServidor == null || statusServidor.equals("")) {
            adicionarErro("Status Servidor não foi selecionado");
        }

        if (getNome() == null || getNome().equals("")) {
            adicionarErro("Nome não foi preenchido");
        }

        if (getEnderecoIP() == null || getEnderecoIP().equals("   .   .   .   ") || getEnderecoIP().equals("")) {
            adicionarErro("Endereço de IP não foi preenchido");
        }

        if (getTipoEquipamento().equals("")) {
            adicionarErro("O tipo de equipamento não foi selecionado");
        }

        if (getUsuario().equals("")) {
            adicionarErro("Usuario não foi preenchido");
        }

        if (getSenha().equals("")) {
            adicionarErro("Senha não foi preenchido");
        }

        if (getEmpresa().equals("")) {
            adicionarErro("Empresa não foi preenchido");
        }

        if (getMarca().equals("")) {
            adicionarErro("Marca não foi preenchido");
        }

        if (getModelo().equals("")) {
            adicionarErro("Modelo não foi preenchido");
        }

    }

    public void validarInconsistenciaServidor() {

        if (ultimaManutencao != null && ultimaManutencao.equals(DataHoraUtils.obterDataInvalida())) {
            adicionarErro("Ultima Manutenção foi preenchida de forma incorreta!");
        }
        if (getDataCompra() != null && getDataCompra().equals(DataHoraUtils.obterDataInvalida())) {
            adicionarErro("Data Compra foi preenchido de forma incorreta");
        }
        if (raid != null && raid.equals(NumeroUtils.obterNumeroInteiroInvalido())) {
            adicionarErro("Raid não foi preenchido corretamente");
        }
        if (quantidadeNucleosProcessador != null && quantidadeNucleosProcessador.equals(NumeroUtils.obterNumeroInteiroInvalido())) {
            adicionarErro("Quantidade de Nucleos Processador foi preenchido incorretamente");
        }
        if (quantidadeVMs != null && quantidadeVMs.equals(NumeroUtils.obterNumeroInteiroInvalido())) {
            adicionarErro("Quantidade de VMs foi preenchida de forma incorreta");
        }
        if (quantidadeFonte != null && quantidadeFonte.equals(NumeroUtils.obterNumeroInteiroInvalido())) {
            adicionarErro("Quantidade de Fontes preenchida de forma incorreta");
        }
        if (slotsRede != null && slotsRede.equals(NumeroUtils.obterNumeroInteiroInvalido())) {
            adicionarErro("Slots de Rede foi preenchido de forma incorreta");
        }
        if (quantidadeHD != null && quantidadeHD.equals(NumeroUtils.obterNumeroInteiroInvalido())) {
            adicionarErro("Quantidade de HD foi preenchido de forma incorreta");
        }
        if (tempoGarantia != null && tempoGarantia.equals(NumeroUtils.obterNumeroInteiroInvalido())) {
            adicionarErro("Tempo Garantia foi preenchido de forma incorreta");
        }
        if (expressServiceTag != null && expressServiceTag.equals(NumeroUtils.obterNumeroLongInvalido())) {
            adicionarErro("Express ServiceTag foi preenchido de forma incorreta");
        }
    }

    public void validarViolacaoTamanho() {

        if (expressServiceTag != null && tamanhoMaximoViolado(expressServiceTag, 11)) {
            adicionarErro("Tamanho máximo de Express ServiceTag passou de 11 caracteres");
        }
        if (getNome() != null && tamanhoMaximoViolado(getNome(), 15)) {
            adicionarErro("Tamanho máximo de nome foi violado!(15)");
        }
        if (getModelo() != null && tamanhoMaximoViolado(getModelo(), 15)) {
            adicionarErro("Tamanho máximo de modelo foi violado!(15)");
        }
        if (versaoSistemaOperacional != null && tamanhoMaximoViolado(versaoSistemaOperacional, 15)) {
            adicionarErro("Tamanho máximo de versão de Sistema Operacional foi violado!(15)");
        }
        if (sistemaOperacional != null && tamanhoMaximoViolado(sistemaOperacional, 15)) {
            adicionarErro("Tamanho máximo de Sistema Operacional foi violado!(15)");
        }
    }
}
