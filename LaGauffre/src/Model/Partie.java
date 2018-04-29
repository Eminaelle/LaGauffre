/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Stack;

import Model.Data.DonneesPartie;
import Model.Data.PlateauGaufre;
import p.util.CircularListIterator;
import Controller.Controller;

/**
 *
 * @author Thomas
 */
public class Partie
{
    static void executer(DonneesPartie partie)
    {
        CircularListIterator<Joueur> it = new CircularListIterator<>(partie.joueurs);
        TracePartie trace = new TracePartie(new PlateauGaufre(partie.gaufre), new Stack<>());
        while(!partie.gaufre.estMangee())
        {
            Action a;
            a = Controller.getAction();
            switch(a)
            {
            case Jouer:
                Coup c = it.next().jouer();
                trace.coups.push(c);
                OperationGaufre.appliquerCoup(trace.gaufre, c);
                break;
            case AnnulerCoup:
                trace.coups.pop();
                trace.gaufre = new PlateauGaufre(partie.gaufre);
                OperationGaufre.appliquerCoups(trace.gaufre, trace.coups);
            }
        }
    }
}