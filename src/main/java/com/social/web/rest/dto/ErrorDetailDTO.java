package com.social.web.rest.dto;

/**
 * Objeto para retornar como body na response ao ser gerado um erro
 * 
 * @author Leonardo Cardena
 *
 */
public class ErrorDetailDTO {
	
	private String titulo;
	private Long status;
	private Long timestamp;
	private String mensagem;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Long getStatus() {
		return status;
	}
	
	public void setStatus(Long status) {
		this.status = status;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
