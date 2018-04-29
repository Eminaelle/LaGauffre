/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Thomas
 */
public enum Action
{
  //Objets directement construits
    Jouer(0),
    AnnulerCoup(1);

  private int code;
   
  //Constructeur
  Action(int code)
  {
      this.code = code;
  }
}
