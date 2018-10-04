package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PEDIDOPRODUTO
 * @generated
 */
@Entity
@Table(name = "\"PEDIDOPRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PedidoProduto")
public class PedidoProduto implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_pedido", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Pedido pedido;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_produto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Produto produto;

  /**
   * Construtor
   * @generated
   */
  public PedidoProduto(){
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
  public PedidoProduto setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém pedido
   * return pedido
   * @generated
   */
  
  public Pedido getPedido(){
    return this.pedido;
  }

  /**
   * Define pedido
   * @param pedido pedido
   * @generated
   */
  public PedidoProduto setPedido(Pedido pedido){
    this.pedido = pedido;
    return this;
  }

  /**
   * Obtém produto
   * return produto
   * @generated
   */
  
  public Produto getProduto(){
    return this.produto;
  }

  /**
   * Define produto
   * @param produto produto
   * @generated
   */
  public PedidoProduto setProduto(Produto produto){
    this.produto = produto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PedidoProduto object = (PedidoProduto)obj;
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
