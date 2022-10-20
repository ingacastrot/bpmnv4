package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Tramite implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Fuente Tramite")
	private java.lang.String fuente;
	@org.kie.api.definition.type.Label("Tipo de Tramite")
	private java.lang.String tipoTramite;
	@org.kie.api.definition.type.Label("Identificador Tramites Asociados")
	private java.lang.Integer asociadoTramiteID;
	@org.kie.api.definition.type.Label("Numero de Radicacion")
	private java.lang.String numeroRadicacion;
	@org.kie.api.definition.type.Label("Fecha Radicacion")
	private java.util.Date fechaRadicacion;
	@org.kie.api.definition.type.Label("Clase de Mutacion")
	private java.lang.String claseMutacion;
	@org.kie.api.definition.type.Label("Subtipo")
	private java.lang.String subtipo;
	@org.kie.api.definition.type.Label("Clasificacion de Tramites")
	private java.lang.String clasificacion;
	@org.kie.api.definition.type.Label("Fecha de Inscripcion Catastral")
	private java.util.Date fechaInscripcionCatastral;
	@org.kie.api.definition.type.Label("Nuevo o Omitido")
	private java.lang.String omitidoNuevo;

	@org.kie.api.definition.type.Label("Forma de Peticion")
	private java.lang.String formaPeticion;

	@org.kie.api.definition.type.Label("Informacion Ingreso Usuario")
	private java.lang.String usuarioLog;

	@org.kie.api.definition.type.Label("Control de Fecha de Ingreso")
	private java.util.Date fechaLog;

	@org.kie.api.definition.type.Label("Tramites")
	private java.lang.Integer ID;

	@org.kie.api.definition.type.Label(value = "Origen")
	private java.lang.String origen;

	@org.kie.api.definition.type.Label(value = "Motivo de la solicitud")
	private java.lang.String motivoSolicitud;

	public Tramite() {
	}

	public java.lang.String getFuente() {
		return this.fuente;
	}

	public void setFuente(java.lang.String fuente) {
		this.fuente = fuente;
	}

	public java.lang.String getTipoTramite() {
		return this.tipoTramite;
	}

	public void setTipoTramite(java.lang.String tipoTramite) {
		this.tipoTramite = tipoTramite;
	}

	public java.lang.Integer getAsociadoTramiteID() {
		return this.asociadoTramiteID;
	}

	public void setAsociadoTramiteID(java.lang.Integer asociadoTramiteID) {
		this.asociadoTramiteID = asociadoTramiteID;
	}

	public java.lang.String getNumeroRadicacion() {
		return this.numeroRadicacion;
	}

	public void setNumeroRadicacion(java.lang.String numeroRadicacion) {
		this.numeroRadicacion = numeroRadicacion;
	}

	public java.util.Date getFechaRadicacion() {
		return this.fechaRadicacion;
	}

	public void setFechaRadicacion(java.util.Date fechaRadicacion) {
		this.fechaRadicacion = fechaRadicacion;
	}

	public java.lang.String getClaseMutacion() {
		return this.claseMutacion;
	}

	public void setClaseMutacion(java.lang.String claseMutacion) {
		this.claseMutacion = claseMutacion;
	}

	public java.lang.String getSubtipo() {
		return this.subtipo;
	}

	public void setSubtipo(java.lang.String subtipo) {
		this.subtipo = subtipo;
	}

	public java.lang.String getClasificacion() {
		return this.clasificacion;
	}

	public void setClasificacion(java.lang.String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public java.util.Date getFechaInscripcionCatastral() {
		return this.fechaInscripcionCatastral;
	}

	public void setFechaInscripcionCatastral(
			java.util.Date fechaInscripcionCatastral) {
		this.fechaInscripcionCatastral = fechaInscripcionCatastral;
	}

	public java.lang.String getOmitidoNuevo() {
		return this.omitidoNuevo;
	}

	public void setOmitidoNuevo(java.lang.String omitidoNuevo) {
		this.omitidoNuevo = omitidoNuevo;
	}

	public java.lang.String getFormaPeticion() {
		return this.formaPeticion;
	}

	public void setFormaPeticion(java.lang.String formaPeticion) {
		this.formaPeticion = formaPeticion;
	}

	public java.lang.String getUsuarioLog() {
		return this.usuarioLog;
	}

	public void setUsuarioLog(java.lang.String usuarioLog) {
		this.usuarioLog = usuarioLog;
	}

	public java.util.Date getFechaLog() {
		return this.fechaLog;
	}

	public void setFechaLog(java.util.Date fechaLog) {
		this.fechaLog = fechaLog;
	}

	public java.lang.Integer getID() {
		return this.ID;
	}

	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	public java.lang.String getOrigen() {
		return this.origen;
	}

	public void setOrigen(java.lang.String origen) {
		this.origen = origen;
	}

	public java.lang.String getMotivoSolicitud() {
		return this.motivoSolicitud;
	}

	public void setMotivoSolicitud(java.lang.String motivoSolicitud) {
		this.motivoSolicitud = motivoSolicitud;
	}

	public Tramite(java.lang.String fuente, java.lang.String tipoTramite,
			java.lang.Integer asociadoTramiteID,
			java.lang.String numeroRadicacion, java.util.Date fechaRadicacion,
			java.lang.String claseMutacion, java.lang.String subtipo,
			java.lang.String clasificacion,
			java.util.Date fechaInscripcionCatastral,
			java.lang.String omitidoNuevo, java.lang.String formaPeticion,
			java.lang.String usuarioLog, java.util.Date fechaLog,
			java.lang.Integer ID, java.lang.String origen,
			java.lang.String motivoSolicitud) {
		this.fuente = fuente;
		this.tipoTramite = tipoTramite;
		this.asociadoTramiteID = asociadoTramiteID;
		this.numeroRadicacion = numeroRadicacion;
		this.fechaRadicacion = fechaRadicacion;
		this.claseMutacion = claseMutacion;
		this.subtipo = subtipo;
		this.clasificacion = clasificacion;
		this.fechaInscripcionCatastral = fechaInscripcionCatastral;
		this.omitidoNuevo = omitidoNuevo;
		this.formaPeticion = formaPeticion;
		this.usuarioLog = usuarioLog;
		this.fechaLog = fechaLog;
		this.ID = ID;
		this.origen = origen;
		this.motivoSolicitud = motivoSolicitud;
	}

}