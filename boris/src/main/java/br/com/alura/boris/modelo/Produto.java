package br.com.alura.boris.modelo;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
@Id
	private int codigoProduto;
	private String nomeProduto;
	private int quantidadeProduto;
	private double valorCompraProduto;
	private double valorVendaProduto;
	private String tamanhoProduto;
	private List<Cor> corProduto = new ArrayList<>();
	private int codigoFornecedor;
	private String nomeFornecedor;
	private StatusProduto status = StatusProduto.INDISPONIVEL;
	private LocalProduto local = LocalProduto.RECEBIMENTO;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoProduto;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigoProduto != other.codigoProduto)
			return false;
		return true;
	}
	public Produto(int codigoProduto, int quantidadeProduto, int codigoFornecedor,
			StatusProduto status, LocalProduto local) {
	
		this.codigoProduto = codigoProduto;
		this.quantidadeProduto = quantidadeProduto;
		this.codigoFornecedor = codigoFornecedor;
		this.status = status;
		this.local = local;
		
		
	}
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public double getValorCompraProduto() {
		return valorCompraProduto;
	}
	public void setValorCompraProduto(double valorCompraProduto) {
		this.valorCompraProduto = valorCompraProduto;
	}
	public double getValorVendaProduto() {
		return valorVendaProduto;
	}
	public void setValorVendaProduto(double valorVendaProduto) {
		this.valorVendaProduto = valorVendaProduto;
	}
	public String getTamanhoProduto() {
		return tamanhoProduto;
	}
	public void setTamanhoProduto(String tamanhoProduto) {
		this.tamanhoProduto = tamanhoProduto;
	}
	public List<Cor> getCorProduto() {
		return corProduto;
	}
	public void setCorProduto(List<Cor> corProduto) {
		this.corProduto = corProduto;
	}
	public int getCodigoFornecedor() {
		return codigoFornecedor;
	}
	public void setCodigoFornecedor(int codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	public StatusProduto getStatus() {
		return status;
	}
	public void setStatus(StatusProduto status) {
		this.status = status;
	}
	public LocalProduto getLocal() {
		return local;
	}
	public void setLocal(LocalProduto local) {
		this.local = local;
	}
	
	
}
