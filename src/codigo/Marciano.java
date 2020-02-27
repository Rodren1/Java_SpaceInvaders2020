/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Angel Esquinas
 */
public class Marciano {

    public Image imagen1 = null;//creo imagenes
    public Image imagen2 = null;

    public int posX = 0;
    public int posY = 0;
    public int velocidad = 1;

    private int anchoPantalla;

    public int vida = 50;
    Clip sonidoDisparo;

    public Marciano(int _anchoPantalla) {
        anchoPantalla = _anchoPantalla;

    }

    //método para mover a la nave 
    public void mueve(boolean direccion) {
        if (direccion) {
            posX -= velocidad;
        } else {
            posX += velocidad;
        }
    }
}
