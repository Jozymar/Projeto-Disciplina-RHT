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
public class Lideranca implements Serializable {
 
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
    
    @Column(length = 80)
    private String resposta7;
    
    @Column(length = 80)
    private String resposta8;
    
    @Column(length = 80)
    private String resposta9;
    
    @Column(length = 80)
    private String resposta10;
    
    @OneToOne
    private Usuario usuario;

    public Lideranca() {
    }

    public Lideranca(int id, String resposta1, String resposta2, String resposta3, String resposta4, String resposta5, String resposta6, String resposta7, String resposta8, String resposta9, String resposta10, Usuario usuario) {
        this.id = id;
        this.resposta1 = resposta1;
        this.resposta2 = resposta2;
        this.resposta3 = resposta3;
        this.resposta4 = resposta4;
        this.resposta5 = resposta5;
        this.resposta6 = resposta6;
        this.resposta7 = resposta7;
        this.resposta8 = resposta8;
        this.resposta9 = resposta9;
        this.resposta10 = resposta10;
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

    public String getResposta7() {
        return resposta7;
    }

    public void setResposta7(String resposta7) {
        this.resposta7 = resposta7;
    }

    public String getResposta8() {
        return resposta8;
    }

    public void setResposta8(String resposta8) {
        this.resposta8 = resposta8;
    }

    public String getResposta9() {
        return resposta9;
    }

    public void setResposta9(String resposta9) {
        this.resposta9 = resposta9;
    }

    public String getResposta10() {
        return resposta10;
    }

    public void setResposta10(String resposta10) {
        this.resposta10 = resposta10;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Lideranca{" + "id=" + id + ", resposta1=" + resposta1 + ", resposta2=" + resposta2 + ", resposta3=" + resposta3 + ", resposta4=" + resposta4 + ", resposta5=" + resposta5 + ", resposta6=" + resposta6 + ", resposta7=" + resposta7 + ", resposta8=" + resposta8 + ", resposta9=" + resposta9 + ", resposta10=" + resposta10 + ", usuario=" + usuario + '}';
    }
}
