/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 *
 * @author dancye, 2019
 */
public class CardDealer
{
   public static void main (String[] args)
   {
      Card nineClubs = new Card("Clbs", 9);
      nineClubs.setSuit("diamonds");

      //code from netBeans
      Card fourHearts = new Card("Heart", 4);
      fourHearts.setSuit("hearts");

      //from github
      Card twoDiamonds = new Card("diamond", 2);
      System.out.println(twoDiamonds.getSuit());

   }
}
