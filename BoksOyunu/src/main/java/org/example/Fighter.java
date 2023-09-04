package org.example;

import javax.print.DocFlavor;

public class Fighter
{
    String name;
    int damage;
    int health;
    int weight;
    int dodge;// bloklama şansını hesaplayan yüzdelik için oluşturdum. için
    Fighter(String name,int damage,int health,int weight,int dodge)
    {
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if (dodge>=0 && dodge<=100) {
            this.dodge = dodge;
        }
        else {
            this.dodge=0;
        }
    }

    int hit(Fighter foe)//Fighter sınıfından oluşturulmuş bir nesne atadım.
    {
        System.out.println(this.name + " ===> " + foe.name+"'e" + " " + this.damage + " hasar vurdu.");
        if (foe.isDodge())
        {
            System.out.println(foe.name + " GELEN HASARI BLOKLADI");
            System.out.println("------------");
            return foe.health;
        }
        if (foe.health-this.damage<=0)
        {
            System.out.print("RAKİBİN CANI BİTTİ -----> " );
            return 0;
        }
        return foe.health - this.damage;

    }

    boolean isDodge()
    {
        double randomNumber=Math.random() * 100; // rastgele sayı üretiyor.
        return randomNumber<=this.dodge;

    }
}
