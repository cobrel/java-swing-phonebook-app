/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intGrafica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cristian
 */
class User {

    private int ID;
    private String Nume;
    private String Prenume;
    private String Data_nasterii;
    private String Numar_de_telefon;
    private String Tip_telefon;

    public User(int ID, String Nume, String Prenume, String Data_nasterii, String Numar_de_telefon, String Tip_telefon) {
        this.ID = ID;
        this.Nume = Nume;
        this.Prenume = Prenume;
        this.Data_nasterii = Data_nasterii;
        this.Numar_de_telefon = Numar_de_telefon;
        this.Tip_telefon = Tip_telefon;

    }

    public int getID() {
        return ID;
    }

    public String getNume() {
        return Nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public String getData_nasterii() throws ParseException {
        Date completionDate = new SimpleDateFormat("yyyy-MM-dd").parse(Data_nasterii);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(completionDate);
        return date;

    }

    public String getNumar_de_telefon() {
        return Numar_de_telefon;
    }

    public String getTip_telefon() {
        return Tip_telefon;
    }

}

