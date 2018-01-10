/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import javax.swing.JOptionPane;
import personal.Persoal;

/**
 *
 * @author pnocedalopez
 */
public class Academica {

    private static int numReferencia = 2018;
    private String nome;
    private float nota;
    private Persoal alum;

    public Academica(String nome, float nota, Persoal alum) {
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", nota=" + nota + ", telefono=" + alum.getTelefono() + ", correo=" + alum.getCorreo();
    }
    
    public float CalcularNota(){
        int noBoletins = 17;
        float probasTeoricas, probaPractica, boletins, notaTotal;
        do {
            float pt1 = Float.parseFloat(JOptionPane.showInputDialog("Nota da proba teorica 1: "));
            float pt2 = Float.parseFloat(JOptionPane.showInputDialog("Nota da proba teorica 2: "));
            probasTeoricas = (float) (((pt1 + pt2) / 2) * 0.4);
            float pp = Float.parseFloat(JOptionPane.showInputDialog("Nota da proba practica: "));
            probaPractica = (float) (pp * 0.4);
            float nBol = Float.parseFloat(JOptionPane.showInputDialog("Boletines Realizados ")) / noBoletins * 10;
            boletins = 0;
            if (nBol > 9) {
                boletins = 2;
            }
            if (nBol <= 9 && nBol >= 7) {
                boletins = 1;
            }
            notaTotal = probasTeoricas + probaPractica + boletins;
            JOptionPane.showMessageDialog(null, "Probas practicas: " + probasTeoricas
                    + "/4\nProba practica: " + probaPractica + "/4\nBoletins: " + boletins
                    + "/2\nNota Final: " + notaTotal);
        } while (JOptionPane.showConfirmDialog(null, "Calcular otra nota?") == JOptionPane.YES_OPTION);
    return notaTotal;
    }

}
