package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LOGTESTE
 * @generated
 */
@Entity
@Table(name = "\"LOGTESTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.LogTeste")
public class LogTeste implements Serializable {

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
  @Column(name = "teste", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String teste;

  /**
  * @generated
  */
  @Column(name = "attribute_02", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_02;

  /**
  * @generated
  */
  @Column(name = "attribute_03", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_03;

  /**
  * @generated
  */
  @Column(name = "attribute_04", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_04;

  /**
  * @generated
  */
  @Column(name = "attribute_05", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_05;

  /**
  * @generated
  */
  @Column(name = "attribute_06", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_06;

  /**
  * @generated
  */
  @Column(name = "attribute_07", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_07;

  /**
  * @generated
  */
  @Column(name = "attribute_08", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_08;

  /**
  * @generated
  */
  @Column(name = "attribute_09", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_09;

  /**
  * @generated
  */
  @Column(name = "attribute_10", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_10;

  /**
  * @generated
  */
  @Column(name = "attribute_11", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_11;

  /**
  * @generated
  */
  @Column(name = "attribute_12", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_12;

  /**
  * @generated
  */
  @Column(name = "attribute_13", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_13;

  /**
  * @generated
  */
  @Column(name = "attribute_14", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_14;

  /**
  * @generated
  */
  @Column(name = "attribute_15", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_15;

  /**
  * @generated
  */
  @Column(name = "attribute_16", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_16;

  /**
  * @generated
  */
  @Column(name = "attribute_17", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_17;

  /**
  * @generated
  */
  @Column(name = "attribute_18", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_18;

  /**
  * @generated
  */
  @Column(name = "attribute_19", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_19;

  /**
  * @generated
  */
  @Column(name = "attribute_20", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_20;

  /**
  * @generated
  */
  @Column(name = "attribute_21", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_21;

  /**
  * @generated
  */
  @Column(name = "attribute_22", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_22;

  /**
  * @generated
  */
  @Column(name = "attribute_23", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_23;

  /**
  * @generated
  */
  @Column(name = "attribute_24", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_24;

  /**
  * @generated
  */
  @Column(name = "attribute_25", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_25;

  /**
  * @generated
  */
  @Column(name = "attribute_26", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_26;

  /**
  * @generated
  */
  @Column(name = "attribute_27", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_27;

  /**
  * @generated
  */
  @Column(name = "attribute_28", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_28;

  /**
  * @generated
  */
  @Column(name = "attribute_29", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_29;

  /**
  * @generated
  */
  @Column(name = "attribute_30", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_30;

  /**
  * @generated
  */
  @Column(name = "attribute_31", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_31;

  /**
   * Construtor
   * @generated
   */
  public LogTeste(){
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
  public LogTeste setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém teste
   * return teste
   * @generated
   */
  
  public java.lang.String getTeste(){
    return this.teste;
  }

  /**
   * Define teste
   * @param teste teste
   * @generated
   */
  public LogTeste setTeste(java.lang.String teste){
    this.teste = teste;
    return this;
  }

  /**
   * Obtém attribute_02
   * return attribute_02
   * @generated
   */
  
  public java.lang.String getAttribute_02(){
    return this.attribute_02;
  }

  /**
   * Define attribute_02
   * @param attribute_02 attribute_02
   * @generated
   */
  public LogTeste setAttribute_02(java.lang.String attribute_02){
    this.attribute_02 = attribute_02;
    return this;
  }

  /**
   * Obtém attribute_03
   * return attribute_03
   * @generated
   */
  
  public java.lang.String getAttribute_03(){
    return this.attribute_03;
  }

  /**
   * Define attribute_03
   * @param attribute_03 attribute_03
   * @generated
   */
  public LogTeste setAttribute_03(java.lang.String attribute_03){
    this.attribute_03 = attribute_03;
    return this;
  }

  /**
   * Obtém attribute_04
   * return attribute_04
   * @generated
   */
  
  public java.lang.String getAttribute_04(){
    return this.attribute_04;
  }

  /**
   * Define attribute_04
   * @param attribute_04 attribute_04
   * @generated
   */
  public LogTeste setAttribute_04(java.lang.String attribute_04){
    this.attribute_04 = attribute_04;
    return this;
  }

  /**
   * Obtém attribute_05
   * return attribute_05
   * @generated
   */
  
  public java.lang.String getAttribute_05(){
    return this.attribute_05;
  }

  /**
   * Define attribute_05
   * @param attribute_05 attribute_05
   * @generated
   */
  public LogTeste setAttribute_05(java.lang.String attribute_05){
    this.attribute_05 = attribute_05;
    return this;
  }

  /**
   * Obtém attribute_06
   * return attribute_06
   * @generated
   */
  
  public java.lang.String getAttribute_06(){
    return this.attribute_06;
  }

  /**
   * Define attribute_06
   * @param attribute_06 attribute_06
   * @generated
   */
  public LogTeste setAttribute_06(java.lang.String attribute_06){
    this.attribute_06 = attribute_06;
    return this;
  }

  /**
   * Obtém attribute_07
   * return attribute_07
   * @generated
   */
  
  public java.lang.String getAttribute_07(){
    return this.attribute_07;
  }

  /**
   * Define attribute_07
   * @param attribute_07 attribute_07
   * @generated
   */
  public LogTeste setAttribute_07(java.lang.String attribute_07){
    this.attribute_07 = attribute_07;
    return this;
  }

  /**
   * Obtém attribute_08
   * return attribute_08
   * @generated
   */
  
  public java.lang.String getAttribute_08(){
    return this.attribute_08;
  }

  /**
   * Define attribute_08
   * @param attribute_08 attribute_08
   * @generated
   */
  public LogTeste setAttribute_08(java.lang.String attribute_08){
    this.attribute_08 = attribute_08;
    return this;
  }

  /**
   * Obtém attribute_09
   * return attribute_09
   * @generated
   */
  
  public java.lang.String getAttribute_09(){
    return this.attribute_09;
  }

  /**
   * Define attribute_09
   * @param attribute_09 attribute_09
   * @generated
   */
  public LogTeste setAttribute_09(java.lang.String attribute_09){
    this.attribute_09 = attribute_09;
    return this;
  }

  /**
   * Obtém attribute_10
   * return attribute_10
   * @generated
   */
  
  public java.lang.String getAttribute_10(){
    return this.attribute_10;
  }

  /**
   * Define attribute_10
   * @param attribute_10 attribute_10
   * @generated
   */
  public LogTeste setAttribute_10(java.lang.String attribute_10){
    this.attribute_10 = attribute_10;
    return this;
  }

  /**
   * Obtém attribute_11
   * return attribute_11
   * @generated
   */
  
  public java.lang.String getAttribute_11(){
    return this.attribute_11;
  }

  /**
   * Define attribute_11
   * @param attribute_11 attribute_11
   * @generated
   */
  public LogTeste setAttribute_11(java.lang.String attribute_11){
    this.attribute_11 = attribute_11;
    return this;
  }

  /**
   * Obtém attribute_12
   * return attribute_12
   * @generated
   */
  
  public java.lang.String getAttribute_12(){
    return this.attribute_12;
  }

  /**
   * Define attribute_12
   * @param attribute_12 attribute_12
   * @generated
   */
  public LogTeste setAttribute_12(java.lang.String attribute_12){
    this.attribute_12 = attribute_12;
    return this;
  }

  /**
   * Obtém attribute_13
   * return attribute_13
   * @generated
   */
  
  public java.lang.String getAttribute_13(){
    return this.attribute_13;
  }

  /**
   * Define attribute_13
   * @param attribute_13 attribute_13
   * @generated
   */
  public LogTeste setAttribute_13(java.lang.String attribute_13){
    this.attribute_13 = attribute_13;
    return this;
  }

  /**
   * Obtém attribute_14
   * return attribute_14
   * @generated
   */
  
  public java.lang.String getAttribute_14(){
    return this.attribute_14;
  }

  /**
   * Define attribute_14
   * @param attribute_14 attribute_14
   * @generated
   */
  public LogTeste setAttribute_14(java.lang.String attribute_14){
    this.attribute_14 = attribute_14;
    return this;
  }

  /**
   * Obtém attribute_15
   * return attribute_15
   * @generated
   */
  
  public java.lang.String getAttribute_15(){
    return this.attribute_15;
  }

  /**
   * Define attribute_15
   * @param attribute_15 attribute_15
   * @generated
   */
  public LogTeste setAttribute_15(java.lang.String attribute_15){
    this.attribute_15 = attribute_15;
    return this;
  }

  /**
   * Obtém attribute_16
   * return attribute_16
   * @generated
   */
  
  public java.lang.String getAttribute_16(){
    return this.attribute_16;
  }

  /**
   * Define attribute_16
   * @param attribute_16 attribute_16
   * @generated
   */
  public LogTeste setAttribute_16(java.lang.String attribute_16){
    this.attribute_16 = attribute_16;
    return this;
  }

  /**
   * Obtém attribute_17
   * return attribute_17
   * @generated
   */
  
  public java.lang.String getAttribute_17(){
    return this.attribute_17;
  }

  /**
   * Define attribute_17
   * @param attribute_17 attribute_17
   * @generated
   */
  public LogTeste setAttribute_17(java.lang.String attribute_17){
    this.attribute_17 = attribute_17;
    return this;
  }

  /**
   * Obtém attribute_18
   * return attribute_18
   * @generated
   */
  
  public java.lang.String getAttribute_18(){
    return this.attribute_18;
  }

  /**
   * Define attribute_18
   * @param attribute_18 attribute_18
   * @generated
   */
  public LogTeste setAttribute_18(java.lang.String attribute_18){
    this.attribute_18 = attribute_18;
    return this;
  }

  /**
   * Obtém attribute_19
   * return attribute_19
   * @generated
   */
  
  public java.lang.String getAttribute_19(){
    return this.attribute_19;
  }

  /**
   * Define attribute_19
   * @param attribute_19 attribute_19
   * @generated
   */
  public LogTeste setAttribute_19(java.lang.String attribute_19){
    this.attribute_19 = attribute_19;
    return this;
  }

  /**
   * Obtém attribute_20
   * return attribute_20
   * @generated
   */
  
  public java.lang.String getAttribute_20(){
    return this.attribute_20;
  }

  /**
   * Define attribute_20
   * @param attribute_20 attribute_20
   * @generated
   */
  public LogTeste setAttribute_20(java.lang.String attribute_20){
    this.attribute_20 = attribute_20;
    return this;
  }

  /**
   * Obtém attribute_21
   * return attribute_21
   * @generated
   */
  
  public java.lang.String getAttribute_21(){
    return this.attribute_21;
  }

  /**
   * Define attribute_21
   * @param attribute_21 attribute_21
   * @generated
   */
  public LogTeste setAttribute_21(java.lang.String attribute_21){
    this.attribute_21 = attribute_21;
    return this;
  }

  /**
   * Obtém attribute_22
   * return attribute_22
   * @generated
   */
  
  public java.lang.String getAttribute_22(){
    return this.attribute_22;
  }

  /**
   * Define attribute_22
   * @param attribute_22 attribute_22
   * @generated
   */
  public LogTeste setAttribute_22(java.lang.String attribute_22){
    this.attribute_22 = attribute_22;
    return this;
  }

  /**
   * Obtém attribute_23
   * return attribute_23
   * @generated
   */
  
  public java.lang.String getAttribute_23(){
    return this.attribute_23;
  }

  /**
   * Define attribute_23
   * @param attribute_23 attribute_23
   * @generated
   */
  public LogTeste setAttribute_23(java.lang.String attribute_23){
    this.attribute_23 = attribute_23;
    return this;
  }

  /**
   * Obtém attribute_24
   * return attribute_24
   * @generated
   */
  
  public java.lang.String getAttribute_24(){
    return this.attribute_24;
  }

  /**
   * Define attribute_24
   * @param attribute_24 attribute_24
   * @generated
   */
  public LogTeste setAttribute_24(java.lang.String attribute_24){
    this.attribute_24 = attribute_24;
    return this;
  }

  /**
   * Obtém attribute_25
   * return attribute_25
   * @generated
   */
  
  public java.lang.String getAttribute_25(){
    return this.attribute_25;
  }

  /**
   * Define attribute_25
   * @param attribute_25 attribute_25
   * @generated
   */
  public LogTeste setAttribute_25(java.lang.String attribute_25){
    this.attribute_25 = attribute_25;
    return this;
  }

  /**
   * Obtém attribute_26
   * return attribute_26
   * @generated
   */
  
  public java.lang.String getAttribute_26(){
    return this.attribute_26;
  }

  /**
   * Define attribute_26
   * @param attribute_26 attribute_26
   * @generated
   */
  public LogTeste setAttribute_26(java.lang.String attribute_26){
    this.attribute_26 = attribute_26;
    return this;
  }

  /**
   * Obtém attribute_27
   * return attribute_27
   * @generated
   */
  
  public java.lang.String getAttribute_27(){
    return this.attribute_27;
  }

  /**
   * Define attribute_27
   * @param attribute_27 attribute_27
   * @generated
   */
  public LogTeste setAttribute_27(java.lang.String attribute_27){
    this.attribute_27 = attribute_27;
    return this;
  }

  /**
   * Obtém attribute_28
   * return attribute_28
   * @generated
   */
  
  public java.lang.String getAttribute_28(){
    return this.attribute_28;
  }

  /**
   * Define attribute_28
   * @param attribute_28 attribute_28
   * @generated
   */
  public LogTeste setAttribute_28(java.lang.String attribute_28){
    this.attribute_28 = attribute_28;
    return this;
  }

  /**
   * Obtém attribute_29
   * return attribute_29
   * @generated
   */
  
  public java.lang.String getAttribute_29(){
    return this.attribute_29;
  }

  /**
   * Define attribute_29
   * @param attribute_29 attribute_29
   * @generated
   */
  public LogTeste setAttribute_29(java.lang.String attribute_29){
    this.attribute_29 = attribute_29;
    return this;
  }

  /**
   * Obtém attribute_30
   * return attribute_30
   * @generated
   */
  
  public java.lang.String getAttribute_30(){
    return this.attribute_30;
  }

  /**
   * Define attribute_30
   * @param attribute_30 attribute_30
   * @generated
   */
  public LogTeste setAttribute_30(java.lang.String attribute_30){
    this.attribute_30 = attribute_30;
    return this;
  }

  /**
   * Obtém attribute_31
   * return attribute_31
   * @generated
   */
  
  public java.lang.String getAttribute_31(){
    return this.attribute_31;
  }

  /**
   * Define attribute_31
   * @param attribute_31 attribute_31
   * @generated
   */
  public LogTeste setAttribute_31(java.lang.String attribute_31){
    this.attribute_31 = attribute_31;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    LogTeste object = (LogTeste)obj;
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
