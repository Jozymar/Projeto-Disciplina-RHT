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
public class Formacao implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(length = 80)
    private String resposta1;
    
    @Column(length = 80)
    private String resposta2;
    
    @Column(length = 80)
    private String resposta3;
    
    @Column(length = 80)
    private String resposta4;
    
    @Column(length = 80)
    private String resposta5;
    
    @Column(length = 80)
    private String resposta6;
    
    @OneToOne
    private Usuario usuario;

    public Formacao() {
    }

    public Formacao(int id, String resposta1, String resposta2, String resposta3, String resposta4, String resposta5, String resposta6, Usuario usuario) {
        this.id = id;
        this.resposta1 = resposta1;
        this.resposta2 = resposta2;
        this.resposta3 = resposta3;
        this.resposta4 = resposta4;
        this.resposta5 = resposta5;
        this.resposta6 = resposta6;
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

    public String getResposta3() {
        return resposta3;
    }

    public void setResposta3(String resposta3) {
        this.resposta3 = resposta3;
    }

    public String getResposta4() {
        return resposta4;
    }

    public void setResposta4(String resposta4) {
        this.resposta4 = resposta4;
    }

    public String getResposta5() {
        return resposta5;
    }

    public void setResposta5(String resposta5) {
        this.resposta5 = resposta5;
    }

    public String getResposta6() {
        return resposta6;
    }

    public void setResposta6(String resposta6) {
        this.resposta6 = resposta6;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Formacao{" + "id=" + id + ", resposta1=" + resposta1 + ", resposta2=" + resposta2 + ", resposta3=" + resposta3 + ", resposta4=" + resposta4 + ", resposta5=" + resposta5 + ", resposta6=" + resposta6 + ", usuario=" + usuario + '}';
    }
}
