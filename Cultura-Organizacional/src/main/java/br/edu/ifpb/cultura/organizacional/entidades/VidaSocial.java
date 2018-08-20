package br.edu.ifpb.cultura.organizacional.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author jozimar
 */
@Entity
public class VidaSocial implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(length = 80)
    private String resposta1;
    
    @Column(length = 80)
    private String resposta2;
    
    @OneToOne
    private Usuario usuario;

    public VidaSocial() {
    }

    public VidaSocial(int id, String resposta1, String resposta2, Usuario usuario) {
        this.id = id;
        this.resposta1 = resposta1;
        this.resposta2 = resposta2;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResposta1() {
        return resposta1;
    }

    public void setResposta1(String resposta1) {
        this.resposta1 = resposta1;
    }

    public String getResposta2() {
        return resposta2;
    }

    public void setResposta2(String resposta2) {
        this.resposta2 = resposta2;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "VidaSocial{" + "id=" + id + ", resposta1=" + resposta1 + ", resposta2=" + resposta2 + ", usuario=" + usuario + '}';
    }
}
