package model;

import java.util.List;

/**
 *
 * @author Mező Gábor 1995.mg@gmail.com
 */
public class Kerdes {

    private int id;
    private String szoveg;
    private List<String> valaszok;
    private int helyesValasz;

    public Kerdes(String szoveg, List<String> valaszok, int helyesValasz) {
        this.szoveg = szoveg;
        this.valaszok = valaszok;
        this.helyesValasz = helyesValasz;
    }

    public Kerdes(int id, String szoveg, List<String> valaszok, int helyesValasz) {
        this.id = id;
        this.szoveg = szoveg;
        this.valaszok = valaszok;
        this.helyesValasz = helyesValasz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHelyesValasz() {
        return helyesValasz;
    }

    public void setHelyesValasz(int helyesValasz) {
        this.helyesValasz = helyesValasz;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }

    public List<String> getValaszok() {
        return valaszok;
    }

    public void setValaszok(List<String> valaszok) {
        this.valaszok = valaszok;
    }

}
