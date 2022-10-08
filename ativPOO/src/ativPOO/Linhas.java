package ativPOO;

public class Linhas {
	private String numFone;
	private String nmUser;
	private String dataInstall;
	private String endereco;
	private String internet;
	private String tipoLinha;
	private Integer qntdOco;
	private String ramo;

	public Linhas(String numFone, String nmUser, String dataInstall, String endereco,  String tipoLinha) {
		this.setNumFone(numFone);
		this.setNmUser(nmUser);
		this.setDataInstall(dataInstall);
		this.setEndereco(endereco);
		this.setTipoLinha(tipoLinha);
	}
	
	public String getTipoLinha() {
		return tipoLinha;
	}
	public void setTipoLinha(String tipoLinha) {
		this.tipoLinha = tipoLinha;
	}
	public String getNumFone() {
		return numFone;
	}
	public void setNumFone(String numFone) {
		this.numFone = numFone;
	}
	public String getNmUser() {
		return nmUser;
	}
	public void setNmUser(String nmUser) {
		this.nmUser = nmUser;
	}
	public String getDataInstall() {
		return dataInstall;
	}
	public void setDataInstall(String dataInstall) {
		this.dataInstall = dataInstall;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getInternet() {
		return internet;
	}
	public void setInternet(String internet) {
		this.internet = internet;
	}
	
	public Integer getQntdOco() {
		return qntdOco;
	}

	public void setQntdOco(Integer qntdOco) {
		this.qntdOco = qntdOco;
	}
	
	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
}