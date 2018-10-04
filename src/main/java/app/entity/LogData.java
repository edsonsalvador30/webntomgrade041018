package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LOGDATA
 * @generated
 */
@Entity
@Table(name = "\"LOGDATA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.LogData")
public class LogData implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "desc", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String desc;

  /**
  * @generated
  */
  @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double valor;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @Column(name = "disp", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean disp;

  /**
  * @generated
  */
  @Column(name = "userName", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String userName;

  /**
  * @generated
  */
  @Column(name = "dataBeforeChange", nullable = true, unique = false, length=999, insertable=true, updatable=true)
  
  private java.lang.String dataBeforeChange;

  /**
  * @generated
  */
  @Column(name = "dataAfterChange", nullable = false, unique = false, length=999, insertable=true, updatable=true)
  
  private java.lang.String dataAfterChange;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataAdded", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date logDate = new Date();

  /**
  * @generated
  */
  @Column(name = "entityType", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String entityType;

  /**
  * @generated
  */
  @Column(name = "typeOperation", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String typeOperation;

  /**
   * Construtor
   * @generated
   */
  public LogData(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public LogData setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém desc
   * return desc
   * @generated
   */
  
  public java.lang.String getDesc(){
    return this.desc;
  }

  /**
   * Define desc
   * @param desc desc
   * @generated
   */
  public LogData setDesc(java.lang.String desc){
    this.desc = desc;
    return this;
  }

  /**
   * Obtém valor
   * return valor
   * @generated
   */
  
  public java.lang.Double getValor(){
    return this.valor;
  }

  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public LogData setValor(java.lang.Double valor){
    this.valor = valor;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public LogData setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém disp
   * return disp
   * @generated
   */
  
  public java.lang.Boolean getDisp(){
    return this.disp;
  }

  /**
   * Define disp
   * @param disp disp
   * @generated
   */
  public LogData setDisp(java.lang.Boolean disp){
    this.disp = disp;
    return this;
  }

  /**
   * Obtém userName
   * return userName
   * @generated
   */
  
  public java.lang.String getUserName(){
    return this.userName;
  }

  /**
   * Define userName
   * @param userName userName
   * @generated
   */
  public LogData setUserName(java.lang.String userName){
    this.userName = userName;
    return this;
  }

  /**
   * Obtém dataBeforeChange
   * return dataBeforeChange
   * @generated
   */
  
  public java.lang.String getDataBeforeChange(){
    return this.dataBeforeChange;
  }

  /**
   * Define dataBeforeChange
   * @param dataBeforeChange dataBeforeChange
   * @generated
   */
  public LogData setDataBeforeChange(java.lang.String dataBeforeChange){
    this.dataBeforeChange = dataBeforeChange;
    return this;
  }

  /**
   * Obtém dataAfterChange
   * return dataAfterChange
   * @generated
   */
  
  public java.lang.String getDataAfterChange(){
    return this.dataAfterChange;
  }

  /**
   * Define dataAfterChange
   * @param dataAfterChange dataAfterChange
   * @generated
   */
  public LogData setDataAfterChange(java.lang.String dataAfterChange){
    this.dataAfterChange = dataAfterChange;
    return this;
  }

  /**
   * Obtém logDate
   * return logDate
   * @generated
   */
  
  public java.util.Date getLogDate(){
    return this.logDate;
  }

  /**
   * Define logDate
   * @param logDate logDate
   * @generated
   */
  public LogData setLogDate(java.util.Date logDate){
    this.logDate = logDate;
    return this;
  }

  /**
   * Obtém entityType
   * return entityType
   * @generated
   */
  
  public java.lang.String getEntityType(){
    return this.entityType;
  }

  /**
   * Define entityType
   * @param entityType entityType
   * @generated
   */
  public LogData setEntityType(java.lang.String entityType){
    this.entityType = entityType;
    return this;
  }

  /**
   * Obtém typeOperation
   * return typeOperation
   * @generated
   */
  
  public java.lang.String getTypeOperation(){
    return this.typeOperation;
  }

  /**
   * Define typeOperation
   * @param typeOperation typeOperation
   * @generated
   */
  public LogData setTypeOperation(java.lang.String typeOperation){
    this.typeOperation = typeOperation;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    LogData object = (LogData)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
